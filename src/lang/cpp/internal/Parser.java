package lang.cpp.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTArrayModifier;
import org.eclipse.cdt.core.dom.ast.IASTAttribute;
import org.eclipse.cdt.core.dom.ast.IASTAttributeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTEnumerationSpecifier.IASTEnumerator;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTInitializer;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTParameterDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTPointerOperator;
import org.eclipse.cdt.core.dom.ast.IASTProblem;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTToken;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.IASTTypeId;
import org.eclipse.cdt.core.dom.ast.c.ICASTDesignator;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCapture;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTClassVirtSpecifier;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTCompositeTypeSpecifier.ICPPASTBaseSpecifier;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTDecltypeSpecifier;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTDesignator;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTNamespaceDefinition;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTTemplateParameter;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTVirtSpecifier;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.index.IIndex;
import org.eclipse.cdt.core.model.ILanguage;
import org.eclipse.cdt.core.parser.DefaultLogService;
import org.eclipse.cdt.core.parser.FileContent;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.core.parser.IncludeFileContentProvider;
import org.eclipse.cdt.core.parser.ScannerInfo;
import org.eclipse.cdt.internal.core.dom.parser.ASTAmbiguousNode;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.CoreException;
import org.rascalmpl.interpreter.IEvaluatorContext;
import org.rascalmpl.interpreter.utils.RuntimeExceptionFactory;
import org.rascalmpl.library.Prelude;
import org.rascalmpl.value.ISourceLocation;
import org.rascalmpl.value.IString;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.IValueFactory;

public class Parser {
	private IValueFactory vf;
	private AST builder;

	 public Parser(IValueFactory vf) {
		 this.vf = vf;
		 this.builder = new AST(vf);
	 }

	public IValue parseCpp(ISourceLocation file, IEvaluatorContext ctx) {
		ctx.getStdErr().println("error! no, just kidding..");
		try {
			String input = ((IString) new Prelude(vf).readFile(file)).getValue();
			IValue result = parse(file.getPath(), input.toCharArray());
			
			if (result == null) {
				throw RuntimeExceptionFactory.parseError(file, null, null);
			}
			
			return result;
		} catch (CoreException e) {
			throw RuntimeExceptionFactory.io(vf.string(e.getMessage()), null, null);
		}
	}

	private IValue parse(String path, char[] code) throws CoreException {
		FileContent fc = FileContent.create(path, code);
		Map<String, String> macroDefinitions = new HashMap<String, String>();
		String[] includeSearchPaths = new String[0];
		IScannerInfo si = new ScannerInfo(macroDefinitions, includeSearchPaths);
		IncludeFileContentProvider ifcp = IncludeFileContentProvider.getEmptyFilesProvider();
		IIndex idx = null;
		int options = ILanguage.OPTION_IS_SOURCE_UNIT;
		IParserLogService log = new DefaultLogService();
		IASTTranslationUnit tu = GPPLanguage.getDefault().getASTTranslationUnit(fc, si, ifcp, idx, options, log);

		return convertCdtToRascal(tu);
	}

	public IValue convertCdtToRascal(IASTTranslationUnit translationUnit) throws CoreException {
		IValue root = null;

		ASTVisitor visitor = new ASTVisitor(true) {

			@Override
			public int visit(IASTTranslationUnit tu) {
				System.out.println("TranslationUnit: " + tu.getRawSignature());
				System.out.println(tu.getParent());
				System.out.println(tu.getChildren().length + " children");
				Stream.of(tu.getChildren()).forEach(it -> System.out.println(it.getRawSignature()));
				System.out.println("Done");
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTName name) {
				System.out.println("Name: " + name.getLastName().getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTDeclaration declaration) {
				System.out.println("Declaration: " + declaration.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTInitializer initializer) {
				System.out.println("Initializer: " + initializer.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTParameterDeclaration parameterDeclaration) {
				System.out.println("ParameterDeclaration: " + parameterDeclaration.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTDeclarator declarator) {
				System.out.println("Declarator: " + declarator.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTDeclSpecifier declSpec) {
				System.out.println("DeclSpecifier: " + declSpec.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTArrayModifier arrayModifier) {
				System.out.println("ArrayModifier: " + arrayModifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTPointerOperator ptrOperator) {
				System.out.println("PtrOperator: " + ptrOperator.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTAttribute attribute) {
				System.out.println("Attribute: " + attribute.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTAttributeSpecifier specifier) {
				System.out.println("Specifier: " + specifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTToken token) {
				System.out.println("Token: " + new String(token.getTokenCharImage()));
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTExpression expression) {
				System.out.println("Expression: " + expression.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTStatement statement) {
				System.out.println("Statement: " + statement.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTTypeId typeId) {
				System.out.println("TypeId: " + typeId.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTEnumerator enumerator) {
				System.out.println("Enumerator: " + enumerator.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(IASTProblem problem) {
				System.out.println("Problem: " + problem.getMessage());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTBaseSpecifier baseSpecifier) {
				System.out.println("BaseSpecifier: " + baseSpecifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTNamespaceDefinition namespaceDefinition) {
				System.out.println("NamespaceDefinition: " + namespaceDefinition.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTTemplateParameter templateParameter) {
				System.out.println("TemplateParameter: " + templateParameter.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTCapture capture) {
				System.out.println("Capture: " + capture.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICASTDesignator designator) {
				System.out.println("Designator: " + designator.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTDesignator designator) {
				System.out.println("DesignatorCPP: " + designator.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTVirtSpecifier virtSpecifier) {
				System.out.println("VirtSpecifier: " + virtSpecifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ICPPASTClassVirtSpecifier classVirtSpecifier) {
				System.out.println("ClassVirtSpecifier: " + classVirtSpecifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}
 
			@Override
			public int visit(ICPPASTDecltypeSpecifier decltypeSpecifier) {
				System.out.println("DecltypeSpecifier: " + decltypeSpecifier.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

			@Override
			public int visit(ASTAmbiguousNode astAmbiguousNode) {
				System.out.println("AstAmbiguousNode: " + astAmbiguousNode.getRawSignature());
				return ASTVisitor.PROCESS_CONTINUE;
			}

		};
		System.out.println("Accept");
		translationUnit.accept(visitor);
		System.out.println("Done");
		return root;
	}
}
