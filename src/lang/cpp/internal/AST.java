// This code was generated by lang::cpp::ASTgen
package lang.cpp.internal;

import org.rascalmpl.value.type.Type;
import org.rascalmpl.value.type.TypeFactory;
import org.rascalmpl.value.type.TypeStore;
import org.rascalmpl.value.*;

@SuppressWarnings("deprecation")
public class AST {
  private static TypeStore typestore = new TypeStore();
  private static TypeFactory tf = TypeFactory.getInstance();
  private IValueFactory vf;

  public AST (IValueFactory vf) {
    this.vf = vf;
  }

  private static final Type _Declaration = tf.abstractDataType(typestore, "Declaration");
  private static final Type _Expression = tf.abstractDataType(typestore, "Expression");
  private static final Type _Type = tf.abstractDataType(typestore, "Type");
  private static final Type _Statement = tf.abstractDataType(typestore, "Statement");
  private static final Type _Modifier = tf.abstractDataType(typestore, "Modifier");
   
  
  
  private static final Type _Declaration_constructor_4 
    = tf.constructor(typestore,_Declaration,"constructor",tf.stringType(),"name",tf.listType(_Declaration),"parameters",tf.listType(_Expression),"exceptions",_Statement,"impl");
  private static final Type _Declaration_method_5 
    = tf.constructor(typestore,_Declaration,"method",_Type,"return",tf.stringType(),"name",tf.listType(_Declaration),"parameters",tf.listType(_Expression),"exceptions",_Statement,"impl");
  private static final Type _Declaration_compilationUnit_3 
    = tf.constructor(typestore,_Declaration,"compilationUnit",_Declaration,"package",tf.listType(_Declaration),"imports",tf.listType(_Declaration),"types");
  private static final Type _Declaration_annotationTypeMember_2 
    = tf.constructor(typestore,_Declaration,"annotationTypeMember",_Type,"type",tf.stringType(),"name");
  private static final Type _Declaration_method_4 
    = tf.constructor(typestore,_Declaration,"method",_Type,"return",tf.stringType(),"name",tf.listType(_Declaration),"parameters",tf.listType(_Expression),"exceptions");
  private static final Type _Declaration_package_1 
    = tf.constructor(typestore,_Declaration,"package",tf.stringType(),"name");
  private static final Type _Declaration_variables_2 
    = tf.constructor(typestore,_Declaration,"variables",_Type,"type",tf.listType(_Expression),"fragments");
  private static final Type _Declaration_class_1 
    = tf.constructor(typestore,_Declaration,"class",tf.listType(_Declaration),"body");
  private static final Type _Declaration_package_2 
    = tf.constructor(typestore,_Declaration,"package",_Declaration,"parentPackage",tf.stringType(),"name");
  private static final Type _Declaration_declaration_3 
    = tf.constructor(typestore,_Declaration,"declaration",tf.stringType(),"name",tf.stringType(),"declarator",tf.listType(_Statement),"arg2");
  private static final Type _Declaration_interface_4 
    = tf.constructor(typestore,_Declaration,"interface",tf.stringType(),"name",tf.listType(_Type),"extends",tf.listType(_Type),"implements",tf.listType(_Declaration),"body");
  private static final Type _Declaration_class_4 
    = tf.constructor(typestore,_Declaration,"class",tf.stringType(),"name",tf.listType(_Type),"extends",tf.listType(_Type),"implements",tf.listType(_Declaration),"body");
  private static final Type _Declaration_field_2 
    = tf.constructor(typestore,_Declaration,"field",_Type,"type",tf.listType(_Expression),"fragments");
  private static final Type _Declaration_enum_4 
    = tf.constructor(typestore,_Declaration,"enum",tf.stringType(),"name",tf.listType(_Type),"implements",tf.listType(_Declaration),"constants",tf.listType(_Declaration),"body");
  private static final Type _Declaration_vararg_2 
    = tf.constructor(typestore,_Declaration,"vararg",_Type,"type",tf.stringType(),"name");
  private static final Type _Declaration_enumConstant_2 
    = tf.constructor(typestore,_Declaration,"enumConstant",tf.stringType(),"name",tf.listType(_Expression),"arguments");
  private static final Type _Declaration_initializer_1 
    = tf.constructor(typestore,_Declaration,"initializer",_Statement,"initializerBody");
  private static final Type _Declaration_annotationTypeMember_3 
    = tf.constructor(typestore,_Declaration,"annotationTypeMember",_Type,"type",tf.stringType(),"name",_Expression,"defaultBlock");
  private static final Type _Declaration_translationUnit_1 
    = tf.constructor(typestore,_Declaration,"translationUnit",tf.listType(_Declaration),"declarations");
  private static final Type _Declaration_annotationType_2 
    = tf.constructor(typestore,_Declaration,"annotationType",tf.stringType(),"name",tf.listType(_Declaration),"body");
  private static final Type _Declaration_import_1 
    = tf.constructor(typestore,_Declaration,"import",tf.stringType(),"name");
  private static final Type _Declaration_amb_1 
    = tf.constructor(typestore,_Declaration,"amb",tf.setType(_Declaration),"alternatives");
  private static final Type _Declaration_parameter_3 
    = tf.constructor(typestore,_Declaration,"parameter",_Type,"type",tf.stringType(),"name",tf.integerType(),"extraDimensions");
  private static final Type _Declaration_typeParameter_2 
    = tf.constructor(typestore,_Declaration,"typeParameter",tf.stringType(),"name",tf.listType(_Type),"extendsList");
  private static final Type _Declaration_enumConstant_3 
    = tf.constructor(typestore,_Declaration,"enumConstant",tf.stringType(),"name",tf.listType(_Expression),"arguments",_Declaration,"class");
  
  
  private static final Type _Expression_assignment_3 
    = tf.constructor(typestore,_Expression,"assignment",_Expression,"lhs",tf.stringType(),"operator",_Expression,"rhs");
  private static final Type _Expression_characterLiteral_1 
    = tf.constructor(typestore,_Expression,"characterLiteral",tf.stringType(),"charValue");
  private static final Type _Expression_qualifiedName_2 
    = tf.constructor(typestore,_Expression,"qualifiedName",_Expression,"qualifier",_Expression,"expression");
  private static final Type _Expression_declarationExpression_1 
    = tf.constructor(typestore,_Expression,"declarationExpression",_Declaration,"declaration");
  private static final Type _Expression_number_1 
    = tf.constructor(typestore,_Expression,"number",tf.stringType(),"numberValue");
  private static final Type _Expression_markerAnnotation_1 
    = tf.constructor(typestore,_Expression,"markerAnnotation",tf.stringType(),"typeName");
  private static final Type _Expression_bracket_1 
    = tf.constructor(typestore,_Expression,"bracket",_Expression,"expression");
  private static final Type _Expression_instanceof_2 
    = tf.constructor(typestore,_Expression,"instanceof",_Expression,"leftSide",_Type,"rightSide");
  private static final Type _Expression_methodCall_4 
    = tf.constructor(typestore,_Expression,"methodCall",tf.boolType(),"isSuper",_Expression,"receiver",tf.stringType(),"name",tf.listType(_Expression),"arguments");
  private static final Type _Expression_newArray_2 
    = tf.constructor(typestore,_Expression,"newArray",_Type,"type",tf.listType(_Expression),"dimensions");
  private static final Type _Expression_newObject_2 
    = tf.constructor(typestore,_Expression,"newObject",_Type,"type",tf.listType(_Expression),"args");
  private static final Type _Expression_memberValuePair_2 
    = tf.constructor(typestore,_Expression,"memberValuePair",tf.stringType(),"name",_Expression,"value");
  private static final Type _Expression_singleMemberAnnotation_2 
    = tf.constructor(typestore,_Expression,"singleMemberAnnotation",tf.stringType(),"typeName",_Expression,"value");
  private static final Type _Expression_variable_2 
    = tf.constructor(typestore,_Expression,"variable",tf.stringType(),"name",tf.integerType(),"extraDimensions");
  private static final Type _Expression_null_0 
    = tf.constructor(typestore,_Expression,"null");
  private static final Type _Expression_normalAnnotation_2 
    = tf.constructor(typestore,_Expression,"normalAnnotation",tf.stringType(),"typeName",tf.listType(_Expression),"memberValuePairs");
  private static final Type _Expression_arrayInitializer_1 
    = tf.constructor(typestore,_Expression,"arrayInitializer",tf.listType(_Expression),"elements");
  private static final Type _Expression_arrayAccess_2 
    = tf.constructor(typestore,_Expression,"arrayAccess",_Expression,"array",_Expression,"index");
  private static final Type _Expression_this_1 
    = tf.constructor(typestore,_Expression,"this",_Expression,"thisExpression");
  private static final Type _Expression_prefix_2 
    = tf.constructor(typestore,_Expression,"prefix",tf.stringType(),"operator",_Expression,"operand");
  private static final Type _Expression_simpleName_1 
    = tf.constructor(typestore,_Expression,"simpleName",tf.stringType(),"name");
  private static final Type _Expression_booleanLiteral_1 
    = tf.constructor(typestore,_Expression,"booleanLiteral",tf.boolType(),"boolValue");
  private static final Type _Expression_type_1 
    = tf.constructor(typestore,_Expression,"type",_Type,"type");
  private static final Type _Expression_newArray_3 
    = tf.constructor(typestore,_Expression,"newArray",_Type,"type",tf.listType(_Expression),"dimensions",_Expression,"init");
  private static final Type _Expression_variable_3 
    = tf.constructor(typestore,_Expression,"variable",tf.stringType(),"name",tf.integerType(),"extraDimensions",_Expression,"initializer");
  private static final Type _Expression_fieldAccess_2 
    = tf.constructor(typestore,_Expression,"fieldAccess",tf.boolType(),"isSuper",tf.stringType(),"name");
  private static final Type _Expression_conditional_3 
    = tf.constructor(typestore,_Expression,"conditional",_Expression,"expression",_Expression,"thenBranch",_Expression,"elseBranch");
  private static final Type _Expression_super_0 
    = tf.constructor(typestore,_Expression,"super");
  private static final Type _Expression_infix_3 
    = tf.constructor(typestore,_Expression,"infix",_Expression,"lhs",tf.stringType(),"operator",_Expression,"rhs");
  private static final Type _Expression_postfix_2 
    = tf.constructor(typestore,_Expression,"postfix",_Expression,"operand",tf.stringType(),"operator");
  private static final Type _Expression_stringLiteral_1 
    = tf.constructor(typestore,_Expression,"stringLiteral",tf.stringType(),"stringValue");
  private static final Type _Expression_newObject_4 
    = tf.constructor(typestore,_Expression,"newObject",_Expression,"expr",_Type,"type",tf.listType(_Expression),"args",_Declaration,"class");
  private static final Type _Expression_cast_2 
    = tf.constructor(typestore,_Expression,"cast",_Type,"type",_Expression,"expression");
  private static final Type _Expression_this_0 
    = tf.constructor(typestore,_Expression,"this");
  private static final Type _Expression_methodCall_3 
    = tf.constructor(typestore,_Expression,"methodCall",tf.boolType(),"isSuper",tf.stringType(),"name",tf.listType(_Expression),"arguments");
  private static final Type _Expression_fieldAccess_3 
    = tf.constructor(typestore,_Expression,"fieldAccess",tf.boolType(),"isSuper",_Expression,"expression",tf.stringType(),"name");
  
  
  private static final Type _Type_int_0 
    = tf.constructor(typestore,_Type,"int");
  private static final Type _Type_simpleType_1 
    = tf.constructor(typestore,_Type,"simpleType",_Expression,"typeName");
  private static final Type _Type_qualifiedType_2 
    = tf.constructor(typestore,_Type,"qualifiedType",_Type,"qualifier",_Expression,"simpleName");
  private static final Type _Type_wildcard_0 
    = tf.constructor(typestore,_Type,"wildcard");
  private static final Type _Type_char_0 
    = tf.constructor(typestore,_Type,"char");
  private static final Type _Type_void_0 
    = tf.constructor(typestore,_Type,"void");
  private static final Type _Type_lowerbound_1 
    = tf.constructor(typestore,_Type,"lowerbound",_Type,"type");
  private static final Type _Type_byte_0 
    = tf.constructor(typestore,_Type,"byte");
  private static final Type _Type_boolean_0 
    = tf.constructor(typestore,_Type,"boolean");
  private static final Type _Type_arrayType_1 
    = tf.constructor(typestore,_Type,"arrayType",_Type,"type");
  private static final Type _Type_parameterizedType_1 
    = tf.constructor(typestore,_Type,"parameterizedType",_Type,"type");
  private static final Type _Type_long_0 
    = tf.constructor(typestore,_Type,"long");
  private static final Type _Type_float_0 
    = tf.constructor(typestore,_Type,"float");
  private static final Type _Type_short_0 
    = tf.constructor(typestore,_Type,"short");
  private static final Type _Type_double_0 
    = tf.constructor(typestore,_Type,"double");
  private static final Type _Type_upperbound_1 
    = tf.constructor(typestore,_Type,"upperbound",_Type,"type");
  private static final Type _Type_unionType_1 
    = tf.constructor(typestore,_Type,"unionType",tf.listType(_Type),"types");
  private static final Type _Type_string_0 
    = tf.constructor(typestore,_Type,"string");
  
  
  private static final Type _Statement_constructorCall_2 
    = tf.constructor(typestore,_Statement,"constructorCall",tf.boolType(),"isSuper",tf.listType(_Expression),"arguments");
  private static final Type _Statement_do_2 
    = tf.constructor(typestore,_Statement,"do",_Statement,"body",_Expression,"condition");
  private static final Type _Statement_catch_2 
    = tf.constructor(typestore,_Statement,"catch",_Declaration,"exception",_Statement,"body");
  private static final Type _Statement_defaultCase_0 
    = tf.constructor(typestore,_Statement,"defaultCase");
  private static final Type _Statement_return_0 
    = tf.constructor(typestore,_Statement,"return");
  private static final Type _Statement_constructorCall_3 
    = tf.constructor(typestore,_Statement,"constructorCall",tf.boolType(),"isSuper",_Expression,"expr",tf.listType(_Expression),"arguments");
  private static final Type _Statement_switch_2 
    = tf.constructor(typestore,_Statement,"switch",_Expression,"expression",tf.listType(_Statement),"statements");
  private static final Type _Statement_if_3 
    = tf.constructor(typestore,_Statement,"if",_Expression,"condition",_Statement,"thenBranch",_Statement,"elseBranch");
  private static final Type _Statement_continue_0 
    = tf.constructor(typestore,_Statement,"continue");
  private static final Type _Statement_expressionStatement_1 
    = tf.constructor(typestore,_Statement,"expressionStatement",_Expression,"stmt");
  private static final Type _Statement_if_2 
    = tf.constructor(typestore,_Statement,"if",_Expression,"condition",_Statement,"thenBranch");
  private static final Type _Statement_block_1 
    = tf.constructor(typestore,_Statement,"block",tf.listType(_Statement),"statements");
  private static final Type _Statement_for_4 
    = tf.constructor(typestore,_Statement,"for",tf.listType(_Expression),"initializers",_Expression,"condition",tf.listType(_Expression),"updaters",_Statement,"body");
  private static final Type _Statement_break_0 
    = tf.constructor(typestore,_Statement,"break");
  private static final Type _Statement_assert_2 
    = tf.constructor(typestore,_Statement,"assert",_Expression,"expression",_Expression,"message");
  private static final Type _Statement_throw_1 
    = tf.constructor(typestore,_Statement,"throw",_Expression,"expression");
  private static final Type _Statement_assert_1 
    = tf.constructor(typestore,_Statement,"assert",_Expression,"expression");
  private static final Type _Statement_synchronizedStatement_2 
    = tf.constructor(typestore,_Statement,"synchronizedStatement",_Expression,"lock",_Statement,"body");
  private static final Type _Statement_break_1 
    = tf.constructor(typestore,_Statement,"break",tf.stringType(),"label");
  private static final Type _Statement_for_3 
    = tf.constructor(typestore,_Statement,"for",tf.listType(_Expression),"initializers",tf.listType(_Expression),"updaters",_Statement,"body");
  private static final Type _Statement_while_2 
    = tf.constructor(typestore,_Statement,"while",_Expression,"condition",_Statement,"body");
  private static final Type _Statement_try_3 
    = tf.constructor(typestore,_Statement,"try",_Statement,"body",tf.listType(_Statement),"catchClauses",_Statement,"finally");
  private static final Type _Statement_foreach_3 
    = tf.constructor(typestore,_Statement,"foreach",_Declaration,"parameter",_Expression,"collection",_Statement,"body");
  private static final Type _Statement_continue_1 
    = tf.constructor(typestore,_Statement,"continue",tf.stringType(),"label");
  private static final Type _Statement_empty_0 
    = tf.constructor(typestore,_Statement,"empty");
  private static final Type _Statement_declarationStatement_1 
    = tf.constructor(typestore,_Statement,"declarationStatement",_Declaration,"declaration");
  private static final Type _Statement_case_1 
    = tf.constructor(typestore,_Statement,"case",_Expression,"expression");
  private static final Type _Statement_return_1 
    = tf.constructor(typestore,_Statement,"return",_Expression,"expression");
  private static final Type _Statement_try_2 
    = tf.constructor(typestore,_Statement,"try",_Statement,"body",tf.listType(_Statement),"catchClauses");
  private static final Type _Statement_label_2 
    = tf.constructor(typestore,_Statement,"label",tf.stringType(),"name",_Statement,"body");
  
  
  private static final Type _Modifier_abstract_0 
    = tf.constructor(typestore,_Modifier,"abstract");
  private static final Type _Modifier_private_0 
    = tf.constructor(typestore,_Modifier,"private");
  private static final Type _Modifier_default_0 
    = tf.constructor(typestore,_Modifier,"default");
  private static final Type _Modifier_friendly_0 
    = tf.constructor(typestore,_Modifier,"friendly");
  private static final Type _Modifier_public_0 
    = tf.constructor(typestore,_Modifier,"public");
  private static final Type _Modifier_strictfp_0 
    = tf.constructor(typestore,_Modifier,"strictfp");
  private static final Type _Modifier_final_0 
    = tf.constructor(typestore,_Modifier,"final");
  private static final Type _Modifier_native_0 
    = tf.constructor(typestore,_Modifier,"native");
  private static final Type _Modifier_synchronized_0 
    = tf.constructor(typestore,_Modifier,"synchronized");
  private static final Type _Modifier_annotation_1 
    = tf.constructor(typestore,_Modifier,"annotation",_Expression,"anno");
  private static final Type _Modifier_volatile_0 
    = tf.constructor(typestore,_Modifier,"volatile");
  private static final Type _Modifier_onDemand_0 
    = tf.constructor(typestore,_Modifier,"onDemand");
  private static final Type _Modifier_transient_0 
    = tf.constructor(typestore,_Modifier,"transient");
  private static final Type _Modifier_static_0 
    = tf.constructor(typestore,_Modifier,"static");
  private static final Type _Modifier_protected_0 
    = tf.constructor(typestore,_Modifier,"protected");
  
   
  
  public IConstructor Declaration_constructor( String $name, IList $parameters, IList $exceptions, IConstructor $impl) {
    return vf.constructor(_Declaration_constructor_4 , vf.string($name), $parameters, $exceptions, $impl);
  }
  
  public IConstructor Declaration_method( IConstructor $return, String $name, IList $parameters, IList $exceptions, IConstructor $impl) {
    return vf.constructor(_Declaration_method_5 , $return, vf.string($name), $parameters, $exceptions, $impl);
  }
  
  public IConstructor Declaration_compilationUnit( IConstructor $package, IList $imports, IList $types) {
    return vf.constructor(_Declaration_compilationUnit_3 , $package, $imports, $types);
  }
  
  public IConstructor Declaration_annotationTypeMember( IConstructor $type, String $name) {
    return vf.constructor(_Declaration_annotationTypeMember_2 , $type, vf.string($name));
  }
  
  public IConstructor Declaration_method( IConstructor $return, String $name, IList $parameters, IList $exceptions) {
    return vf.constructor(_Declaration_method_4 , $return, vf.string($name), $parameters, $exceptions);
  }
  
  public IConstructor Declaration_package( String $name) {
    return vf.constructor(_Declaration_package_1 , vf.string($name));
  }
  
  public IConstructor Declaration_variables( IConstructor $type, IList $fragments) {
    return vf.constructor(_Declaration_variables_2 , $type, $fragments);
  }
  
  public IConstructor Declaration_class( IList $body) {
    return vf.constructor(_Declaration_class_1 , $body);
  }
  
  public IConstructor Declaration_package( IConstructor $parentPackage, String $name) {
    return vf.constructor(_Declaration_package_2 , $parentPackage, vf.string($name));
  }
  
  public IConstructor Declaration_declaration( String $name, String $declarator, IList $arg2) {
    return vf.constructor(_Declaration_declaration_3 , vf.string($name), vf.string($declarator), $arg2);
  }
  
  public IConstructor Declaration_interface( String $name, IList $extends, IList $implements, IList $body) {
    return vf.constructor(_Declaration_interface_4 , vf.string($name), $extends, $implements, $body);
  }
  
  public IConstructor Declaration_class( String $name, IList $extends, IList $implements, IList $body) {
    return vf.constructor(_Declaration_class_4 , vf.string($name), $extends, $implements, $body);
  }
  
  public IConstructor Declaration_field( IConstructor $type, IList $fragments) {
    return vf.constructor(_Declaration_field_2 , $type, $fragments);
  }
  
  public IConstructor Declaration_enum( String $name, IList $implements, IList $constants, IList $body) {
    return vf.constructor(_Declaration_enum_4 , vf.string($name), $implements, $constants, $body);
  }
  
  public IConstructor Declaration_vararg( IConstructor $type, String $name) {
    return vf.constructor(_Declaration_vararg_2 , $type, vf.string($name));
  }
  
  public IConstructor Declaration_enumConstant( String $name, IList $arguments) {
    return vf.constructor(_Declaration_enumConstant_2 , vf.string($name), $arguments);
  }
  
  public IConstructor Declaration_initializer( IConstructor $initializerBody) {
    return vf.constructor(_Declaration_initializer_1 , $initializerBody);
  }
  
  public IConstructor Declaration_annotationTypeMember( IConstructor $type, String $name, IConstructor $defaultBlock) {
    return vf.constructor(_Declaration_annotationTypeMember_3 , $type, vf.string($name), $defaultBlock);
  }
  
  public IConstructor Declaration_translationUnit( IList $declarations) {
    return vf.constructor(_Declaration_translationUnit_1 , $declarations);
  }
  
  public IConstructor Declaration_annotationType( String $name, IList $body) {
    return vf.constructor(_Declaration_annotationType_2 , vf.string($name), $body);
  }
  
  public IConstructor Declaration_import( String $name) {
    return vf.constructor(_Declaration_import_1 , vf.string($name));
  }
  
  public IConstructor Declaration_amb( ISet $alternatives) {
    return vf.constructor(_Declaration_amb_1 , $alternatives);
  }
  
  public IConstructor Declaration_parameter( IConstructor $type, String $name, IValue $extraDimensions) {
    return vf.constructor(_Declaration_parameter_3 , $type, vf.string($name), $extraDimensions);
  }
  
  public IConstructor Declaration_typeParameter( String $name, IList $extendsList) {
    return vf.constructor(_Declaration_typeParameter_2 , vf.string($name), $extendsList);
  }
  
  public IConstructor Declaration_enumConstant( String $name, IList $arguments, IConstructor $class) {
    return vf.constructor(_Declaration_enumConstant_3 , vf.string($name), $arguments, $class);
  }
    
  
  public IConstructor Expression_assignment( IConstructor $lhs, String $operator, IConstructor $rhs) {
    return vf.constructor(_Expression_assignment_3 , $lhs, vf.string($operator), $rhs);
  }
  
  public IConstructor Expression_characterLiteral( String $charValue) {
    return vf.constructor(_Expression_characterLiteral_1 , vf.string($charValue));
  }
  
  public IConstructor Expression_qualifiedName( IConstructor $qualifier, IConstructor $expression) {
    return vf.constructor(_Expression_qualifiedName_2 , $qualifier, $expression);
  }
  
  public IConstructor Expression_declarationExpression( IConstructor $declaration) {
    return vf.constructor(_Expression_declarationExpression_1 , $declaration);
  }
  
  public IConstructor Expression_number( String $numberValue) {
    return vf.constructor(_Expression_number_1 , vf.string($numberValue));
  }
  
  public IConstructor Expression_markerAnnotation( String $typeName) {
    return vf.constructor(_Expression_markerAnnotation_1 , vf.string($typeName));
  }
  
  public IConstructor Expression_bracket( IConstructor $expression) {
    return vf.constructor(_Expression_bracket_1 , $expression);
  }
  
  public IConstructor Expression_instanceof( IConstructor $leftSide, IConstructor $rightSide) {
    return vf.constructor(_Expression_instanceof_2 , $leftSide, $rightSide);
  }
  
  public IConstructor Expression_methodCall( boolean $isSuper, IConstructor $receiver, String $name, IList $arguments) {
    return vf.constructor(_Expression_methodCall_4 , vf.bool($isSuper), $receiver, vf.string($name), $arguments);
  }
  
  public IConstructor Expression_newArray( IConstructor $type, IList $dimensions) {
    return vf.constructor(_Expression_newArray_2 , $type, $dimensions);
  }
  
  public IConstructor Expression_newObject( IConstructor $type, IList $args) {
    return vf.constructor(_Expression_newObject_2 , $type, $args);
  }
  
  public IConstructor Expression_memberValuePair( String $name, IConstructor $value) {
    return vf.constructor(_Expression_memberValuePair_2 , vf.string($name), $value);
  }
  
  public IConstructor Expression_singleMemberAnnotation( String $typeName, IConstructor $value) {
    return vf.constructor(_Expression_singleMemberAnnotation_2 , vf.string($typeName), $value);
  }
  
  public IConstructor Expression_variable( String $name, IValue $extraDimensions) {
    return vf.constructor(_Expression_variable_2 , vf.string($name), $extraDimensions);
  }
  
  public IConstructor Expression_null() {
    return vf.constructor(_Expression_null_0 );
  }
  
  public IConstructor Expression_normalAnnotation( String $typeName, IList $memberValuePairs) {
    return vf.constructor(_Expression_normalAnnotation_2 , vf.string($typeName), $memberValuePairs);
  }
  
  public IConstructor Expression_arrayInitializer( IList $elements) {
    return vf.constructor(_Expression_arrayInitializer_1 , $elements);
  }
  
  public IConstructor Expression_arrayAccess( IConstructor $array, IConstructor $index) {
    return vf.constructor(_Expression_arrayAccess_2 , $array, $index);
  }
  
  public IConstructor Expression_this( IConstructor $thisExpression) {
    return vf.constructor(_Expression_this_1 , $thisExpression);
  }
  
  public IConstructor Expression_prefix( String $operator, IConstructor $operand) {
    return vf.constructor(_Expression_prefix_2 , vf.string($operator), $operand);
  }
  
  public IConstructor Expression_simpleName( String $name) {
    return vf.constructor(_Expression_simpleName_1 , vf.string($name));
  }
  
  public IConstructor Expression_booleanLiteral( boolean $boolValue) {
    return vf.constructor(_Expression_booleanLiteral_1 , vf.bool($boolValue));
  }
  
  public IConstructor Expression_type( IConstructor $type) {
    return vf.constructor(_Expression_type_1 , $type);
  }
  
  public IConstructor Expression_newArray( IConstructor $type, IList $dimensions, IConstructor $init) {
    return vf.constructor(_Expression_newArray_3 , $type, $dimensions, $init);
  }
  
  public IConstructor Expression_variable( String $name, IValue $extraDimensions, IConstructor $initializer) {
    return vf.constructor(_Expression_variable_3 , vf.string($name), $extraDimensions, $initializer);
  }
  
  public IConstructor Expression_fieldAccess( boolean $isSuper, String $name) {
    return vf.constructor(_Expression_fieldAccess_2 , vf.bool($isSuper), vf.string($name));
  }
  
  public IConstructor Expression_conditional( IConstructor $expression, IConstructor $thenBranch, IConstructor $elseBranch) {
    return vf.constructor(_Expression_conditional_3 , $expression, $thenBranch, $elseBranch);
  }
  
  public IConstructor Expression_super() {
    return vf.constructor(_Expression_super_0 );
  }
  
  public IConstructor Expression_infix( IConstructor $lhs, String $operator, IConstructor $rhs) {
    return vf.constructor(_Expression_infix_3 , $lhs, vf.string($operator), $rhs);
  }
  
  public IConstructor Expression_postfix( IConstructor $operand, String $operator) {
    return vf.constructor(_Expression_postfix_2 , $operand, vf.string($operator));
  }
  
  public IConstructor Expression_stringLiteral( String $stringValue) {
    return vf.constructor(_Expression_stringLiteral_1 , vf.string($stringValue));
  }
  
  public IConstructor Expression_newObject( IConstructor $expr, IConstructor $type, IList $args, IConstructor $class) {
    return vf.constructor(_Expression_newObject_4 , $expr, $type, $args, $class);
  }
  
  public IConstructor Expression_cast( IConstructor $type, IConstructor $expression) {
    return vf.constructor(_Expression_cast_2 , $type, $expression);
  }
  
  public IConstructor Expression_this() {
    return vf.constructor(_Expression_this_0 );
  }
  
  public IConstructor Expression_methodCall( boolean $isSuper, String $name, IList $arguments) {
    return vf.constructor(_Expression_methodCall_3 , vf.bool($isSuper), vf.string($name), $arguments);
  }
  
  public IConstructor Expression_fieldAccess( boolean $isSuper, IConstructor $expression, String $name) {
    return vf.constructor(_Expression_fieldAccess_3 , vf.bool($isSuper), $expression, vf.string($name));
  }
    
  
  public IConstructor Type_int() {
    return vf.constructor(_Type_int_0 );
  }
  
  public IConstructor Type_simpleType( IConstructor $typeName) {
    return vf.constructor(_Type_simpleType_1 , $typeName);
  }
  
  public IConstructor Type_qualifiedType( IConstructor $qualifier, IConstructor $simpleName) {
    return vf.constructor(_Type_qualifiedType_2 , $qualifier, $simpleName);
  }
  
  public IConstructor Type_wildcard() {
    return vf.constructor(_Type_wildcard_0 );
  }
  
  public IConstructor Type_char() {
    return vf.constructor(_Type_char_0 );
  }
  
  public IConstructor Type_void() {
    return vf.constructor(_Type_void_0 );
  }
  
  public IConstructor Type_lowerbound( IConstructor $type) {
    return vf.constructor(_Type_lowerbound_1 , $type);
  }
  
  public IConstructor Type_byte() {
    return vf.constructor(_Type_byte_0 );
  }
  
  public IConstructor Type_boolean() {
    return vf.constructor(_Type_boolean_0 );
  }
  
  public IConstructor Type_arrayType( IConstructor $type) {
    return vf.constructor(_Type_arrayType_1 , $type);
  }
  
  public IConstructor Type_parameterizedType( IConstructor $type) {
    return vf.constructor(_Type_parameterizedType_1 , $type);
  }
  
  public IConstructor Type_long() {
    return vf.constructor(_Type_long_0 );
  }
  
  public IConstructor Type_float() {
    return vf.constructor(_Type_float_0 );
  }
  
  public IConstructor Type_short() {
    return vf.constructor(_Type_short_0 );
  }
  
  public IConstructor Type_double() {
    return vf.constructor(_Type_double_0 );
  }
  
  public IConstructor Type_upperbound( IConstructor $type) {
    return vf.constructor(_Type_upperbound_1 , $type);
  }
  
  public IConstructor Type_unionType( IList $types) {
    return vf.constructor(_Type_unionType_1 , $types);
  }
  
  public IConstructor Type_string() {
    return vf.constructor(_Type_string_0 );
  }
    
  
  public IConstructor Statement_constructorCall( boolean $isSuper, IList $arguments) {
    return vf.constructor(_Statement_constructorCall_2 , vf.bool($isSuper), $arguments);
  }
  
  public IConstructor Statement_do( IConstructor $body, IConstructor $condition) {
    return vf.constructor(_Statement_do_2 , $body, $condition);
  }
  
  public IConstructor Statement_catch( IConstructor $exception, IConstructor $body) {
    return vf.constructor(_Statement_catch_2 , $exception, $body);
  }
  
  public IConstructor Statement_defaultCase() {
    return vf.constructor(_Statement_defaultCase_0 );
  }
  
  public IConstructor Statement_return() {
    return vf.constructor(_Statement_return_0 );
  }
  
  public IConstructor Statement_constructorCall( boolean $isSuper, IConstructor $expr, IList $arguments) {
    return vf.constructor(_Statement_constructorCall_3 , vf.bool($isSuper), $expr, $arguments);
  }
  
  public IConstructor Statement_switch( IConstructor $expression, IList $statements) {
    return vf.constructor(_Statement_switch_2 , $expression, $statements);
  }
  
  public IConstructor Statement_if( IConstructor $condition, IConstructor $thenBranch, IConstructor $elseBranch) {
    return vf.constructor(_Statement_if_3 , $condition, $thenBranch, $elseBranch);
  }
  
  public IConstructor Statement_continue() {
    return vf.constructor(_Statement_continue_0 );
  }
  
  public IConstructor Statement_expressionStatement( IConstructor $stmt) {
    return vf.constructor(_Statement_expressionStatement_1 , $stmt);
  }
  
  public IConstructor Statement_if( IConstructor $condition, IConstructor $thenBranch) {
    return vf.constructor(_Statement_if_2 , $condition, $thenBranch);
  }
  
  public IConstructor Statement_block( IList $statements) {
    return vf.constructor(_Statement_block_1 , $statements);
  }
  
  public IConstructor Statement_for( IList $initializers, IConstructor $condition, IList $updaters, IConstructor $body) {
    return vf.constructor(_Statement_for_4 , $initializers, $condition, $updaters, $body);
  }
  
  public IConstructor Statement_break() {
    return vf.constructor(_Statement_break_0 );
  }
  
  public IConstructor Statement_assert( IConstructor $expression, IConstructor $message) {
    return vf.constructor(_Statement_assert_2 , $expression, $message);
  }
  
  public IConstructor Statement_throw( IConstructor $expression) {
    return vf.constructor(_Statement_throw_1 , $expression);
  }
  
  public IConstructor Statement_assert( IConstructor $expression) {
    return vf.constructor(_Statement_assert_1 , $expression);
  }
  
  public IConstructor Statement_synchronizedStatement( IConstructor $lock, IConstructor $body) {
    return vf.constructor(_Statement_synchronizedStatement_2 , $lock, $body);
  }
  
  public IConstructor Statement_break( String $label) {
    return vf.constructor(_Statement_break_1 , vf.string($label));
  }
  
  public IConstructor Statement_for( IList $initializers, IList $updaters, IConstructor $body) {
    return vf.constructor(_Statement_for_3 , $initializers, $updaters, $body);
  }
  
  public IConstructor Statement_while( IConstructor $condition, IConstructor $body) {
    return vf.constructor(_Statement_while_2 , $condition, $body);
  }
  
  public IConstructor Statement_try( IConstructor $body, IList $catchClauses, IConstructor $finally) {
    return vf.constructor(_Statement_try_3 , $body, $catchClauses, $finally);
  }
  
  public IConstructor Statement_foreach( IConstructor $parameter, IConstructor $collection, IConstructor $body) {
    return vf.constructor(_Statement_foreach_3 , $parameter, $collection, $body);
  }
  
  public IConstructor Statement_continue( String $label) {
    return vf.constructor(_Statement_continue_1 , vf.string($label));
  }
  
  public IConstructor Statement_empty() {
    return vf.constructor(_Statement_empty_0 );
  }
  
  public IConstructor Statement_declarationStatement( IConstructor $declaration) {
    return vf.constructor(_Statement_declarationStatement_1 , $declaration);
  }
  
  public IConstructor Statement_case( IConstructor $expression) {
    return vf.constructor(_Statement_case_1 , $expression);
  }
  
  public IConstructor Statement_return( IConstructor $expression) {
    return vf.constructor(_Statement_return_1 , $expression);
  }
  
  public IConstructor Statement_try( IConstructor $body, IList $catchClauses) {
    return vf.constructor(_Statement_try_2 , $body, $catchClauses);
  }
  
  public IConstructor Statement_label( String $name, IConstructor $body) {
    return vf.constructor(_Statement_label_2 , vf.string($name), $body);
  }
    
  
  public IConstructor Modifier_abstract() {
    return vf.constructor(_Modifier_abstract_0 );
  }
  
  public IConstructor Modifier_private() {
    return vf.constructor(_Modifier_private_0 );
  }
  
  public IConstructor Modifier_default() {
    return vf.constructor(_Modifier_default_0 );
  }
  
  public IConstructor Modifier_friendly() {
    return vf.constructor(_Modifier_friendly_0 );
  }
  
  public IConstructor Modifier_public() {
    return vf.constructor(_Modifier_public_0 );
  }
  
  public IConstructor Modifier_strictfp() {
    return vf.constructor(_Modifier_strictfp_0 );
  }
  
  public IConstructor Modifier_final() {
    return vf.constructor(_Modifier_final_0 );
  }
  
  public IConstructor Modifier_native() {
    return vf.constructor(_Modifier_native_0 );
  }
  
  public IConstructor Modifier_synchronized() {
    return vf.constructor(_Modifier_synchronized_0 );
  }
  
  public IConstructor Modifier_annotation( IConstructor $anno) {
    return vf.constructor(_Modifier_annotation_1 , $anno);
  }
  
  public IConstructor Modifier_volatile() {
    return vf.constructor(_Modifier_volatile_0 );
  }
  
  public IConstructor Modifier_onDemand() {
    return vf.constructor(_Modifier_onDemand_0 );
  }
  
  public IConstructor Modifier_transient() {
    return vf.constructor(_Modifier_transient_0 );
  }
  
  public IConstructor Modifier_static() {
    return vf.constructor(_Modifier_static_0 );
  }
  
  public IConstructor Modifier_protected() {
    return vf.constructor(_Modifier_protected_0 );
  }
   
  
}