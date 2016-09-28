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
   
  
  
  private static final Type _Declaration_enumerator_2 
    = tf.constructor(typestore,_Declaration,"enumerator",tf.stringType(),"name",_Expression,"evalue");
  private static final Type _Declaration_class_2 
    = tf.constructor(typestore,_Declaration,"class",tf.stringType(),"name",tf.listType(_Declaration),"members");
  private static final Type _Declaration_translationUnit_1 
    = tf.constructor(typestore,_Declaration,"translationUnit",tf.listType(_Declaration),"declarations");
  private static final Type _Declaration_declSpecifier_3 
    = tf.constructor(typestore,_Declaration,"declSpecifier",tf.listType(_Modifier),"modifiers",_Type,"type",_Expression,"expression");
  private static final Type _Declaration_parameter_2 
    = tf.constructor(typestore,_Declaration,"parameter",_Declaration,"declSpecifier",_Declaration,"declarator");
  private static final Type _Declaration_union_2 
    = tf.constructor(typestore,_Declaration,"union",tf.stringType(),"name",tf.listType(_Declaration),"members");
  private static final Type _Declaration_declarationEqualsInitializer_2 
    = tf.constructor(typestore,_Declaration,"declarationEqualsInitializer",tf.stringType(),"name",_Expression,"initializer");
  private static final Type _Declaration_usingDirective_1 
    = tf.constructor(typestore,_Declaration,"usingDirective",tf.stringType(),"qualifiedName");
  private static final Type _Declaration_enum_2 
    = tf.constructor(typestore,_Declaration,"enum",tf.stringType(),"name",tf.listType(_Expression),"enumerators");
  private static final Type _Declaration_parameter_1 
    = tf.constructor(typestore,_Declaration,"parameter",_Declaration,"declSpecifier");
  private static final Type _Declaration_declSpecifier_2 
    = tf.constructor(typestore,_Declaration,"declSpecifier",tf.listType(_Modifier),"modifiers",_Type,"type");
  private static final Type _Declaration_simpleDeclaration_2 
    = tf.constructor(typestore,_Declaration,"simpleDeclaration",_Type,"ddeclSpecifier",tf.listType(_Declaration),"declarators");
  private static final Type _Declaration_equalsInitializer_1 
    = tf.constructor(typestore,_Declaration,"equalsInitializer",_Expression,"initializer");
  private static final Type _Declaration_visibilityLabel_1 
    = tf.constructor(typestore,_Declaration,"visibilityLabel",_Modifier,"visibility");
  private static final Type _Declaration_struct_2 
    = tf.constructor(typestore,_Declaration,"struct",tf.stringType(),"name",tf.listType(_Declaration),"members");
  private static final Type _Declaration_enumerator_1 
    = tf.constructor(typestore,_Declaration,"enumerator",tf.stringType(),"name");
  private static final Type _Declaration_asmDeclaration_1 
    = tf.constructor(typestore,_Declaration,"asmDeclaration",tf.stringType(),"assembly");
  private static final Type _Declaration_declarator_2 
    = tf.constructor(typestore,_Declaration,"declarator",_Expression,"nname",_Declaration,"init");
  private static final Type _Declaration_initializerClause_1 
    = tf.constructor(typestore,_Declaration,"initializerClause",_Expression,"expression");
  private static final Type _Declaration_functionDefinition_3 
    = tf.constructor(typestore,_Declaration,"functionDefinition",_Type,"ddeclSpecifier",_Declaration,"ddeclarators",_Statement,"sbody");
  private static final Type _Declaration_declarator_1 
    = tf.constructor(typestore,_Declaration,"declarator",_Expression,"nname");
  private static final Type _Declaration_pointerNYI_0 
    = tf.constructor(typestore,_Declaration,"pointerNYI");
  
  
  private static final Type _Expression_ellipses_2 
    = tf.constructor(typestore,_Expression,"ellipses",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_labelReference_1 
    = tf.constructor(typestore,_Expression,"labelReference",_Expression,"expression");
  private static final Type _Expression_charConstant_1 
    = tf.constructor(typestore,_Expression,"charConstant",tf.stringType(),"vvalue");
  private static final Type _Expression_sizeofParameterPack_1 
    = tf.constructor(typestore,_Expression,"sizeofParameterPack",_Expression,"expression");
  private static final Type _Expression_postfixIncr_1 
    = tf.constructor(typestore,_Expression,"postfixIncr",_Expression,"expression");
  private static final Type _Expression_divideAssign_2 
    = tf.constructor(typestore,_Expression,"divideAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_fieldReference_3 
    = tf.constructor(typestore,_Expression,"fieldReference",_Expression,"fieldOwner",_Expression,"nname",_Type,"fieldType");
  private static final Type _Expression_integerLiteral_1 
    = tf.constructor(typestore,_Expression,"integerLiteral",tf.integerType(),"number");
  private static final Type _Expression_assign_2 
    = tf.constructor(typestore,_Expression,"assign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_nyi_1 
    = tf.constructor(typestore,_Expression,"nyi",tf.stringType(),"raw");
  private static final Type _Expression_namedTypeSpecifier_1 
    = tf.constructor(typestore,_Expression,"namedTypeSpecifier",tf.stringType(),"name");
  private static final Type _Expression_minus_2 
    = tf.constructor(typestore,_Expression,"minus",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_name_1 
    = tf.constructor(typestore,_Expression,"name",tf.stringType(),"name");
  private static final Type _Expression_noexcept_1 
    = tf.constructor(typestore,_Expression,"noexcept",_Expression,"expression");
  private static final Type _Expression_plus_1 
    = tf.constructor(typestore,_Expression,"plus",_Expression,"expression");
  private static final Type _Expression_min_2 
    = tf.constructor(typestore,_Expression,"min",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_notEquals_2 
    = tf.constructor(typestore,_Expression,"notEquals",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_binaryOrAssign_2 
    = tf.constructor(typestore,_Expression,"binaryOrAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_tilde_1 
    = tf.constructor(typestore,_Expression,"tilde",_Expression,"expression");
  private static final Type _Expression_false_0 
    = tf.constructor(typestore,_Expression,"false");
  private static final Type _Expression_functionDeclarator_1 
    = tf.constructor(typestore,_Expression,"functionDeclarator",tf.listType(_Expression),"arguments");
  private static final Type _Expression_sizeof_1 
    = tf.constructor(typestore,_Expression,"sizeof",_Expression,"expression");
  private static final Type _Expression_multiplyAssign_2 
    = tf.constructor(typestore,_Expression,"multiplyAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_binaryAnd_2 
    = tf.constructor(typestore,_Expression,"binaryAnd",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_modulo_2 
    = tf.constructor(typestore,_Expression,"modulo",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_alignOf_1 
    = tf.constructor(typestore,_Expression,"alignOf",_Expression,"expression");
  private static final Type _Expression_nullptr_0 
    = tf.constructor(typestore,_Expression,"nullptr");
  private static final Type _Expression_not_1 
    = tf.constructor(typestore,_Expression,"not",_Expression,"expression");
  private static final Type _Expression_integerConstant_1 
    = tf.constructor(typestore,_Expression,"integerConstant",tf.stringType(),"vvalue");
  private static final Type _Expression_shiftLeftAssign_2 
    = tf.constructor(typestore,_Expression,"shiftLeftAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_star_1 
    = tf.constructor(typestore,_Expression,"star",_Expression,"expression");
  private static final Type _Expression_divide_2 
    = tf.constructor(typestore,_Expression,"divide",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_greaterEqual_2 
    = tf.constructor(typestore,_Expression,"greaterEqual",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_shiftRight_2 
    = tf.constructor(typestore,_Expression,"shiftRight",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_lessThan_2 
    = tf.constructor(typestore,_Expression,"lessThan",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_plus_2 
    = tf.constructor(typestore,_Expression,"plus",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_amper_1 
    = tf.constructor(typestore,_Expression,"amper",_Expression,"expression");
  private static final Type _Expression_binaryXor_2 
    = tf.constructor(typestore,_Expression,"binaryXor",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_floatConstant_1 
    = tf.constructor(typestore,_Expression,"floatConstant",tf.stringType(),"vvalue");
  private static final Type _Expression_functionCall_2 
    = tf.constructor(typestore,_Expression,"functionCall",_Expression,"functionName",tf.listType(_Expression),"arguments");
  private static final Type _Expression_lessEqual_2 
    = tf.constructor(typestore,_Expression,"lessEqual",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_greaterThan_2 
    = tf.constructor(typestore,_Expression,"greaterThan",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_minus_1 
    = tf.constructor(typestore,_Expression,"minus",_Expression,"expression");
  private static final Type _Expression_true_0 
    = tf.constructor(typestore,_Expression,"true");
  private static final Type _Expression_typeid_1 
    = tf.constructor(typestore,_Expression,"typeid",_Expression,"expression");
  private static final Type _Expression_equals_2 
    = tf.constructor(typestore,_Expression,"equals",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_minusAssign_2 
    = tf.constructor(typestore,_Expression,"minusAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_multiply_2 
    = tf.constructor(typestore,_Expression,"multiply",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_max_2 
    = tf.constructor(typestore,_Expression,"max",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_binaryOr_2 
    = tf.constructor(typestore,_Expression,"binaryOr",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_stringLiteral_1 
    = tf.constructor(typestore,_Expression,"stringLiteral",tf.stringType(),"vvalue");
  private static final Type _Expression_moduloAssign_2 
    = tf.constructor(typestore,_Expression,"moduloAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_conditional_3 
    = tf.constructor(typestore,_Expression,"conditional",_Expression,"condition",_Expression,"positive",_Expression,"negative");
  private static final Type _Expression_binaryAndAssign_2 
    = tf.constructor(typestore,_Expression,"binaryAndAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_plusAssign_2 
    = tf.constructor(typestore,_Expression,"plusAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_shiftLeft_2 
    = tf.constructor(typestore,_Expression,"shiftLeft",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_binaryXorAssign_2 
    = tf.constructor(typestore,_Expression,"binaryXorAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_prefixDecr_1 
    = tf.constructor(typestore,_Expression,"prefixDecr",_Expression,"expression");
  private static final Type _Expression_shiftRightAssign_2 
    = tf.constructor(typestore,_Expression,"shiftRightAssign",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_logicalOr_2 
    = tf.constructor(typestore,_Expression,"logicalOr",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_bracketed_1 
    = tf.constructor(typestore,_Expression,"bracketed",_Expression,"expression");
  private static final Type _Expression_pmDot_2 
    = tf.constructor(typestore,_Expression,"pmDot",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_pmArrow_2 
    = tf.constructor(typestore,_Expression,"pmArrow",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_throw_1 
    = tf.constructor(typestore,_Expression,"throw",_Expression,"expression");
  private static final Type _Expression_prefixIncr_1 
    = tf.constructor(typestore,_Expression,"prefixIncr",_Expression,"expression");
  private static final Type _Expression_cast_2 
    = tf.constructor(typestore,_Expression,"cast",_Type,"type",_Expression,"expression");
  private static final Type _Expression_logicalAnd_2 
    = tf.constructor(typestore,_Expression,"logicalAnd",_Expression,"lhs",_Expression,"rhs");
  private static final Type _Expression_this_0 
    = tf.constructor(typestore,_Expression,"this");
  private static final Type _Expression_postfixDecr_1 
    = tf.constructor(typestore,_Expression,"postfixDecr",_Expression,"expression");
  
  
  private static final Type _Type_int128_0 
    = tf.constructor(typestore,_Type,"int128");
  private static final Type _Type_decimal128_0 
    = tf.constructor(typestore,_Type,"decimal128");
  private static final Type _Type_decltype_0 
    = tf.constructor(typestore,_Type,"decltype");
  private static final Type _Type_wchar_t_0 
    = tf.constructor(typestore,_Type,"wchar_t");
  private static final Type _Type_float_0 
    = tf.constructor(typestore,_Type,"float");
  private static final Type _Type_float128_0 
    = tf.constructor(typestore,_Type,"float128");
  private static final Type _Type_unspecified_0 
    = tf.constructor(typestore,_Type,"unspecified");
  private static final Type _Type_char_0 
    = tf.constructor(typestore,_Type,"char");
  private static final Type _Type_void_0 
    = tf.constructor(typestore,_Type,"void");
  private static final Type _Type_int_0 
    = tf.constructor(typestore,_Type,"int");
  private static final Type _Type_auto_0 
    = tf.constructor(typestore,_Type,"auto");
  private static final Type _Type_decimal64_0 
    = tf.constructor(typestore,_Type,"decimal64");
  private static final Type _Type_char32_t_0 
    = tf.constructor(typestore,_Type,"char32_t");
  private static final Type _Type_bool_0 
    = tf.constructor(typestore,_Type,"bool");
  private static final Type _Type_double_0 
    = tf.constructor(typestore,_Type,"double");
  private static final Type _Type_typeof_0 
    = tf.constructor(typestore,_Type,"typeof");
  private static final Type _Type_char16_t_0 
    = tf.constructor(typestore,_Type,"char16_t");
  private static final Type _Type_decimal32_0 
    = tf.constructor(typestore,_Type,"decimal32");
  
  
  private static final Type _Statement_break_0 
    = tf.constructor(typestore,_Statement,"break");
  private static final Type _Statement_switch_2 
    = tf.constructor(typestore,_Statement,"switch",_Expression,"controller",_Statement,"body");
  private static final Type _Statement_label_2 
    = tf.constructor(typestore,_Statement,"label",tf.stringType(),"name",_Statement,"nestedStatement");
  private static final Type _Statement_defaultCase_0 
    = tf.constructor(typestore,_Statement,"defaultCase");
  private static final Type _Statement_return_0 
    = tf.constructor(typestore,_Statement,"return");
  private static final Type _Statement_declarationStatement_1 
    = tf.constructor(typestore,_Statement,"declarationStatement",_Declaration,"declaration");
  private static final Type _Statement_expressionStatement_1 
    = tf.constructor(typestore,_Statement,"expressionStatement",_Expression,"expression");
  private static final Type _Statement_compoundStatement_1 
    = tf.constructor(typestore,_Statement,"compoundStatement",tf.listType(_Statement),"statements");
  private static final Type _Statement_continue_0 
    = tf.constructor(typestore,_Statement,"continue");
  private static final Type _Statement_for_4 
    = tf.constructor(typestore,_Statement,"for",_Statement,"initializer",_Expression,"condition",_Expression,"iteration",_Statement,"body");
  private static final Type _Statement_if_2 
    = tf.constructor(typestore,_Statement,"if",_Expression,"condition",_Statement,"thenClause");
  private static final Type _Statement_do_2 
    = tf.constructor(typestore,_Statement,"do",_Statement,"body",_Expression,"condition");
  private static final Type _Statement_while_2 
    = tf.constructor(typestore,_Statement,"while",_Expression,"condition",_Statement,"body");
  private static final Type _Statement_if_3 
    = tf.constructor(typestore,_Statement,"if",_Expression,"condition",_Statement,"thenClause",_Statement,"elseClause");
  private static final Type _Statement_case_1 
    = tf.constructor(typestore,_Statement,"case",_Expression,"expression");
  private static final Type _Statement_return_1 
    = tf.constructor(typestore,_Statement,"return",_Expression,"expression");
  private static final Type _Statement_goto_1 
    = tf.constructor(typestore,_Statement,"goto",tf.stringType(),"name");
  private static final Type _Statement_nullStatement_0 
    = tf.constructor(typestore,_Statement,"nullStatement");
  
  
  private static final Type _Modifier_extern_0 
    = tf.constructor(typestore,_Modifier,"extern");
  private static final Type _Modifier_mutable_0 
    = tf.constructor(typestore,_Modifier,"mutable");
  private static final Type _Modifier_typedef_0 
    = tf.constructor(typestore,_Modifier,"typedef");
  private static final Type _Modifier_public_0 
    = tf.constructor(typestore,_Modifier,"public");
  private static final Type _Modifier_complex_0 
    = tf.constructor(typestore,_Modifier,"complex");
  private static final Type _Modifier_unsigned_0 
    = tf.constructor(typestore,_Modifier,"unsigned");
  private static final Type _Modifier_longlong_0 
    = tf.constructor(typestore,_Modifier,"longlong");
  private static final Type _Modifier_imaginary_0 
    = tf.constructor(typestore,_Modifier,"imaginary");
  private static final Type _Modifier_private_0 
    = tf.constructor(typestore,_Modifier,"private");
  private static final Type _Modifier_register_0 
    = tf.constructor(typestore,_Modifier,"register");
  private static final Type _Modifier_static_0 
    = tf.constructor(typestore,_Modifier,"static");
  private static final Type _Modifier_protected_0 
    = tf.constructor(typestore,_Modifier,"protected");
  private static final Type _Modifier_short_0 
    = tf.constructor(typestore,_Modifier,"short");
  private static final Type _Modifier_long_0 
    = tf.constructor(typestore,_Modifier,"long");
  private static final Type _Modifier_signed_0 
    = tf.constructor(typestore,_Modifier,"signed");
  
   
  
  public IConstructor Declaration_enumerator( String $name, IConstructor $evalue) {
    return vf.constructor(_Declaration_enumerator_2 , vf.string($name), $evalue);
  }
  
  public IConstructor Declaration_class( String $name, IList $members) {
    return vf.constructor(_Declaration_class_2 , vf.string($name), $members);
  }
  
  public IConstructor Declaration_translationUnit( IList $declarations) {
    return vf.constructor(_Declaration_translationUnit_1 , $declarations);
  }
  
  public IConstructor Declaration_declSpecifier( IList $modifiers, IConstructor $type, IConstructor $expression) {
    return vf.constructor(_Declaration_declSpecifier_3 , $modifiers, $type, $expression);
  }
  
  public IConstructor Declaration_parameter( IConstructor $declSpecifier, IConstructor $declarator) {
    return vf.constructor(_Declaration_parameter_2 , $declSpecifier, $declarator);
  }
  
  public IConstructor Declaration_union( String $name, IList $members) {
    return vf.constructor(_Declaration_union_2 , vf.string($name), $members);
  }
  
  public IConstructor Declaration_declarationEqualsInitializer( String $name, IConstructor $initializer) {
    return vf.constructor(_Declaration_declarationEqualsInitializer_2 , vf.string($name), $initializer);
  }
  
  public IConstructor Declaration_usingDirective( String $qualifiedName) {
    return vf.constructor(_Declaration_usingDirective_1 , vf.string($qualifiedName));
  }
  
  public IConstructor Declaration_enum( String $name, IList $enumerators) {
    return vf.constructor(_Declaration_enum_2 , vf.string($name), $enumerators);
  }
  
  public IConstructor Declaration_parameter( IConstructor $declSpecifier) {
    return vf.constructor(_Declaration_parameter_1 , $declSpecifier);
  }
  
  public IConstructor Declaration_declSpecifier( IList $modifiers, IConstructor $type) {
    return vf.constructor(_Declaration_declSpecifier_2 , $modifiers, $type);
  }
  
  public IConstructor Declaration_simpleDeclaration( IConstructor $ddeclSpecifier, IList $declarators) {
    return vf.constructor(_Declaration_simpleDeclaration_2 , $ddeclSpecifier, $declarators);
  }
  
  public IConstructor Declaration_equalsInitializer( IConstructor $initializer) {
    return vf.constructor(_Declaration_equalsInitializer_1 , $initializer);
  }
  
  public IConstructor Declaration_visibilityLabel( IConstructor $visibility) {
    return vf.constructor(_Declaration_visibilityLabel_1 , $visibility);
  }
  
  public IConstructor Declaration_struct( String $name, IList $members) {
    return vf.constructor(_Declaration_struct_2 , vf.string($name), $members);
  }
  
  public IConstructor Declaration_enumerator( String $name) {
    return vf.constructor(_Declaration_enumerator_1 , vf.string($name));
  }
  
  public IConstructor Declaration_asmDeclaration( String $assembly) {
    return vf.constructor(_Declaration_asmDeclaration_1 , vf.string($assembly));
  }
  
  public IConstructor Declaration_declarator( IConstructor $nname, IConstructor $init) {
    return vf.constructor(_Declaration_declarator_2 , $nname, $init);
  }
  
  public IConstructor Declaration_initializerClause( IConstructor $expression) {
    return vf.constructor(_Declaration_initializerClause_1 , $expression);
  }
  
  public IConstructor Declaration_functionDefinition( IConstructor $ddeclSpecifier, IConstructor $ddeclarators, IConstructor $sbody) {
    return vf.constructor(_Declaration_functionDefinition_3 , $ddeclSpecifier, $ddeclarators, $sbody);
  }
  
  public IConstructor Declaration_declarator( IConstructor $nname) {
    return vf.constructor(_Declaration_declarator_1 , $nname);
  }
  
  public IConstructor Declaration_pointerNYI() {
    return vf.constructor(_Declaration_pointerNYI_0 );
  }
    
  
  public IConstructor Expression_ellipses( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_ellipses_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_labelReference( IConstructor $expression) {
    return vf.constructor(_Expression_labelReference_1 , $expression);
  }
  
  public IConstructor Expression_charConstant( String $vvalue) {
    return vf.constructor(_Expression_charConstant_1 , vf.string($vvalue));
  }
  
  public IConstructor Expression_sizeofParameterPack( IConstructor $expression) {
    return vf.constructor(_Expression_sizeofParameterPack_1 , $expression);
  }
  
  public IConstructor Expression_postfixIncr( IConstructor $expression) {
    return vf.constructor(_Expression_postfixIncr_1 , $expression);
  }
  
  public IConstructor Expression_divideAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_divideAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_fieldReference( IConstructor $fieldOwner, IConstructor $nname, IConstructor $fieldType) {
    return vf.constructor(_Expression_fieldReference_3 , $fieldOwner, $nname, $fieldType);
  }
  
  public IConstructor Expression_integerLiteral( IValue $number) {
    return vf.constructor(_Expression_integerLiteral_1 , $number);
  }
  
  public IConstructor Expression_assign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_assign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_nyi( String $raw) {
    return vf.constructor(_Expression_nyi_1 , vf.string($raw));
  }
  
  public IConstructor Expression_namedTypeSpecifier( String $name) {
    return vf.constructor(_Expression_namedTypeSpecifier_1 , vf.string($name));
  }
  
  public IConstructor Expression_minus( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_minus_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_name( String $name) {
    return vf.constructor(_Expression_name_1 , vf.string($name));
  }
  
  public IConstructor Expression_noexcept( IConstructor $expression) {
    return vf.constructor(_Expression_noexcept_1 , $expression);
  }
  
  public IConstructor Expression_plus( IConstructor $expression) {
    return vf.constructor(_Expression_plus_1 , $expression);
  }
  
  public IConstructor Expression_min( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_min_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_notEquals( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_notEquals_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_binaryOrAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryOrAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_tilde( IConstructor $expression) {
    return vf.constructor(_Expression_tilde_1 , $expression);
  }
  
  public IConstructor Expression_false() {
    return vf.constructor(_Expression_false_0 );
  }
  
  public IConstructor Expression_functionDeclarator( IList $arguments) {
    return vf.constructor(_Expression_functionDeclarator_1 , $arguments);
  }
  
  public IConstructor Expression_sizeof( IConstructor $expression) {
    return vf.constructor(_Expression_sizeof_1 , $expression);
  }
  
  public IConstructor Expression_multiplyAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_multiplyAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_binaryAnd( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryAnd_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_modulo( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_modulo_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_alignOf( IConstructor $expression) {
    return vf.constructor(_Expression_alignOf_1 , $expression);
  }
  
  public IConstructor Expression_nullptr() {
    return vf.constructor(_Expression_nullptr_0 );
  }
  
  public IConstructor Expression_not( IConstructor $expression) {
    return vf.constructor(_Expression_not_1 , $expression);
  }
  
  public IConstructor Expression_integerConstant( String $vvalue) {
    return vf.constructor(_Expression_integerConstant_1 , vf.string($vvalue));
  }
  
  public IConstructor Expression_shiftLeftAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_shiftLeftAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_star( IConstructor $expression) {
    return vf.constructor(_Expression_star_1 , $expression);
  }
  
  public IConstructor Expression_divide( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_divide_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_greaterEqual( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_greaterEqual_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_shiftRight( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_shiftRight_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_lessThan( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_lessThan_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_plus( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_plus_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_amper( IConstructor $expression) {
    return vf.constructor(_Expression_amper_1 , $expression);
  }
  
  public IConstructor Expression_binaryXor( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryXor_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_floatConstant( String $vvalue) {
    return vf.constructor(_Expression_floatConstant_1 , vf.string($vvalue));
  }
  
  public IConstructor Expression_functionCall( IConstructor $functionName, IList $arguments) {
    return vf.constructor(_Expression_functionCall_2 , $functionName, $arguments);
  }
  
  public IConstructor Expression_lessEqual( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_lessEqual_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_greaterThan( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_greaterThan_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_minus( IConstructor $expression) {
    return vf.constructor(_Expression_minus_1 , $expression);
  }
  
  public IConstructor Expression_true() {
    return vf.constructor(_Expression_true_0 );
  }
  
  public IConstructor Expression_typeid( IConstructor $expression) {
    return vf.constructor(_Expression_typeid_1 , $expression);
  }
  
  public IConstructor Expression_equals( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_equals_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_minusAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_minusAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_multiply( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_multiply_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_max( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_max_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_binaryOr( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryOr_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_stringLiteral( String $vvalue) {
    return vf.constructor(_Expression_stringLiteral_1 , vf.string($vvalue));
  }
  
  public IConstructor Expression_moduloAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_moduloAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_conditional( IConstructor $condition, IConstructor $positive, IConstructor $negative) {
    return vf.constructor(_Expression_conditional_3 , $condition, $positive, $negative);
  }
  
  public IConstructor Expression_binaryAndAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryAndAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_plusAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_plusAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_shiftLeft( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_shiftLeft_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_binaryXorAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_binaryXorAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_prefixDecr( IConstructor $expression) {
    return vf.constructor(_Expression_prefixDecr_1 , $expression);
  }
  
  public IConstructor Expression_shiftRightAssign( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_shiftRightAssign_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_logicalOr( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_logicalOr_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_bracketed( IConstructor $expression) {
    return vf.constructor(_Expression_bracketed_1 , $expression);
  }
  
  public IConstructor Expression_pmDot( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_pmDot_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_pmArrow( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_pmArrow_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_throw( IConstructor $expression) {
    return vf.constructor(_Expression_throw_1 , $expression);
  }
  
  public IConstructor Expression_prefixIncr( IConstructor $expression) {
    return vf.constructor(_Expression_prefixIncr_1 , $expression);
  }
  
  public IConstructor Expression_cast( IConstructor $type, IConstructor $expression) {
    return vf.constructor(_Expression_cast_2 , $type, $expression);
  }
  
  public IConstructor Expression_logicalAnd( IConstructor $lhs, IConstructor $rhs) {
    return vf.constructor(_Expression_logicalAnd_2 , $lhs, $rhs);
  }
  
  public IConstructor Expression_this() {
    return vf.constructor(_Expression_this_0 );
  }
  
  public IConstructor Expression_postfixDecr( IConstructor $expression) {
    return vf.constructor(_Expression_postfixDecr_1 , $expression);
  }
    
  
  public IConstructor Type_int128() {
    return vf.constructor(_Type_int128_0 );
  }
  
  public IConstructor Type_decimal128() {
    return vf.constructor(_Type_decimal128_0 );
  }
  
  public IConstructor Type_decltype() {
    return vf.constructor(_Type_decltype_0 );
  }
  
  public IConstructor Type_wchar_t() {
    return vf.constructor(_Type_wchar_t_0 );
  }
  
  public IConstructor Type_float() {
    return vf.constructor(_Type_float_0 );
  }
  
  public IConstructor Type_float128() {
    return vf.constructor(_Type_float128_0 );
  }
  
  public IConstructor Type_unspecified() {
    return vf.constructor(_Type_unspecified_0 );
  }
  
  public IConstructor Type_char() {
    return vf.constructor(_Type_char_0 );
  }
  
  public IConstructor Type_void() {
    return vf.constructor(_Type_void_0 );
  }
  
  public IConstructor Type_int() {
    return vf.constructor(_Type_int_0 );
  }
  
  public IConstructor Type_auto() {
    return vf.constructor(_Type_auto_0 );
  }
  
  public IConstructor Type_decimal64() {
    return vf.constructor(_Type_decimal64_0 );
  }
  
  public IConstructor Type_char32_t() {
    return vf.constructor(_Type_char32_t_0 );
  }
  
  public IConstructor Type_bool() {
    return vf.constructor(_Type_bool_0 );
  }
  
  public IConstructor Type_double() {
    return vf.constructor(_Type_double_0 );
  }
  
  public IConstructor Type_typeof() {
    return vf.constructor(_Type_typeof_0 );
  }
  
  public IConstructor Type_char16_t() {
    return vf.constructor(_Type_char16_t_0 );
  }
  
  public IConstructor Type_decimal32() {
    return vf.constructor(_Type_decimal32_0 );
  }
    
  
  public IConstructor Statement_break() {
    return vf.constructor(_Statement_break_0 );
  }
  
  public IConstructor Statement_switch( IConstructor $controller, IConstructor $body) {
    return vf.constructor(_Statement_switch_2 , $controller, $body);
  }
  
  public IConstructor Statement_label( String $name, IConstructor $nestedStatement) {
    return vf.constructor(_Statement_label_2 , vf.string($name), $nestedStatement);
  }
  
  public IConstructor Statement_defaultCase() {
    return vf.constructor(_Statement_defaultCase_0 );
  }
  
  public IConstructor Statement_return() {
    return vf.constructor(_Statement_return_0 );
  }
  
  public IConstructor Statement_declarationStatement( IConstructor $declaration) {
    return vf.constructor(_Statement_declarationStatement_1 , $declaration);
  }
  
  public IConstructor Statement_expressionStatement( IConstructor $expression) {
    return vf.constructor(_Statement_expressionStatement_1 , $expression);
  }
  
  public IConstructor Statement_compoundStatement( IList $statements) {
    return vf.constructor(_Statement_compoundStatement_1 , $statements);
  }
  
  public IConstructor Statement_continue() {
    return vf.constructor(_Statement_continue_0 );
  }
  
  public IConstructor Statement_for( IConstructor $initializer, IConstructor $condition, IConstructor $iteration, IConstructor $body) {
    return vf.constructor(_Statement_for_4 , $initializer, $condition, $iteration, $body);
  }
  
  public IConstructor Statement_if( IConstructor $condition, IConstructor $thenClause) {
    return vf.constructor(_Statement_if_2 , $condition, $thenClause);
  }
  
  public IConstructor Statement_do( IConstructor $body, IConstructor $condition) {
    return vf.constructor(_Statement_do_2 , $body, $condition);
  }
  
  public IConstructor Statement_while( IConstructor $condition, IConstructor $body) {
    return vf.constructor(_Statement_while_2 , $condition, $body);
  }
  
  public IConstructor Statement_if( IConstructor $condition, IConstructor $thenClause, IConstructor $elseClause) {
    return vf.constructor(_Statement_if_3 , $condition, $thenClause, $elseClause);
  }
  
  public IConstructor Statement_case( IConstructor $expression) {
    return vf.constructor(_Statement_case_1 , $expression);
  }
  
  public IConstructor Statement_return( IConstructor $expression) {
    return vf.constructor(_Statement_return_1 , $expression);
  }
  
  public IConstructor Statement_goto( String $name) {
    return vf.constructor(_Statement_goto_1 , vf.string($name));
  }
  
  public IConstructor Statement_nullStatement() {
    return vf.constructor(_Statement_nullStatement_0 );
  }
    
  
  public IConstructor Modifier_extern() {
    return vf.constructor(_Modifier_extern_0 );
  }
  
  public IConstructor Modifier_mutable() {
    return vf.constructor(_Modifier_mutable_0 );
  }
  
  public IConstructor Modifier_typedef() {
    return vf.constructor(_Modifier_typedef_0 );
  }
  
  public IConstructor Modifier_public() {
    return vf.constructor(_Modifier_public_0 );
  }
  
  public IConstructor Modifier_complex() {
    return vf.constructor(_Modifier_complex_0 );
  }
  
  public IConstructor Modifier_unsigned() {
    return vf.constructor(_Modifier_unsigned_0 );
  }
  
  public IConstructor Modifier_longlong() {
    return vf.constructor(_Modifier_longlong_0 );
  }
  
  public IConstructor Modifier_imaginary() {
    return vf.constructor(_Modifier_imaginary_0 );
  }
  
  public IConstructor Modifier_private() {
    return vf.constructor(_Modifier_private_0 );
  }
  
  public IConstructor Modifier_register() {
    return vf.constructor(_Modifier_register_0 );
  }
  
  public IConstructor Modifier_static() {
    return vf.constructor(_Modifier_static_0 );
  }
  
  public IConstructor Modifier_protected() {
    return vf.constructor(_Modifier_protected_0 );
  }
  
  public IConstructor Modifier_short() {
    return vf.constructor(_Modifier_short_0 );
  }
  
  public IConstructor Modifier_long() {
    return vf.constructor(_Modifier_long_0 );
  }
  
  public IConstructor Modifier_signed() {
    return vf.constructor(_Modifier_signed_0 );
  }
   
  
}