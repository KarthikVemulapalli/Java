package CoreJava.AccessModifiers;

public class AMChildClass extends AccessModifiers {

    public void AMNonStaticChildMethod(){
        System.out.println("******************** NonStatic Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside NonStatic Method of Child Class: Can Directly Access - "+AMDefaultInstVar+", "+AMPublicInstVar+", "+ AMProtectedInstVar);
        System.out.println("StaticVariable Accessing inside NonStatic ChildMethod of Child Class: Can Directly Access - "+ AMDefaultStaticVar +", "+AMPublicStaticVar+", "+AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Child Class - Can Directly Access");
        AMDefaultMethod(); AMPublicMethod(); AMProtectedMethod();
        System.out.println("StaticMethod Accessing inside NonStatic Method of Child Class - Can Directly Access");
        AMDefaultStaticMethod(); AMPublicStaticMethod(); AMProtectedStaticMethod();
        System.out.println("******************** NonStatic Method End ********************");
    }

    public static void AMStaticChildMethod(){
        System.out.println("******************** Static Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside Static Method of Same Class: Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticVariable Accessing inside Static Method of Same Class: Can Directly Access - "+ AMDefaultStaticVar +", "+AMPublicStaticVar+", "+ AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside Static Method of Same Class: Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticMethod Accessing inside Static Method of Same Class: Can Directly Access - ");
        AMDefaultStaticMethod(); AMPublicStaticMethod(); AMProtectedStaticMethod();
        System.out.println("******************** Static Method End ********************");
    }

}
