package CoreJava.AccessModifiers;

public class AMClass {

    public void AMNonClassStaticMethod(){
        AccessModifiers AccessModifiersObj = new AccessModifiers();
        System.out.println("******************** NonStatic Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside NonStatic Method of Different Class: Can Access using ClassObject - "+AccessModifiersObj.AMDefaultInstVar+", "+AccessModifiersObj.AMPublicInstVar+", "+ AccessModifiersObj.AMProtectedInstVar);
        System.out.println("StaticVariable Accessing inside NonStatic Method of Different Class: Can Access using ClassName - "+ AccessModifiers.AMDefaultStaticVar +", "+ AccessModifiers.AMPublicStaticVar+", "+ AccessModifiers.AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Different Class - Can Access using ClassObject");
        AccessModifiersObj.AMDefaultMethod(); AccessModifiersObj.AMPublicMethod(); AccessModifiersObj.AMProtectedMethod();
        System.out.println("StaticMethod Accessing inside NonStatic Method of Different Class - Can Access using ClassName");
        AccessModifiers.AMDefaultStaticMethod(); AccessModifiers.AMPublicStaticMethod(); AccessModifiers.AMProtectedStaticMethod();
        System.out.println("******************** NonStatic Method End ********************");
    }

    public static void AMClassStaticMethod(){
        System.out.println("******************** Static Method Start ********************");
        AccessModifiers AccessModifiersObj = new AccessModifiers();
        System.out.println("NonStaticVariable Accessing inside Static Method of Different Class: Can Access using ClassObject - "+AccessModifiersObj.AMPublicInstVar+", "+AccessModifiersObj.AMDefaultInstVar+", "+AccessModifiersObj.AMProtectedInstVar);
        System.out.println("StaticVariable Accessing inside Static Method of Different Class: Can Directly Access - "+ AccessModifiers.AMDefaultStaticVar +", "+AccessModifiers.AMPublicStaticVar+", "+ AccessModifiers.AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside Static Method of Different Class: Can Access using ClassObject");
        AccessModifiersObj.AMPublicMethod(); AccessModifiersObj.AMDefaultMethod(); AccessModifiersObj.AMProtectedMethod();
        System.out.println("StaticMethod Accessing inside Static Method of Different Class: Can Access Using ClassName - ");
        AccessModifiers.AMDefaultStaticMethod(); AccessModifiers.AMPublicStaticMethod(); AccessModifiers.AMProtectedStaticMethod();
        System.out.println("******************** Static Method End ********************");
    }

}
