package CoreJava.AbstractClass;

import CoreJava.AccessModifiers.AccessModifiers;

public class AMChildClassOtherPackage extends AccessModifiers {

    public void AMNonStaticChildMethod(){
        //Private & Default Variables/Methods are not accessible
        System.out.println("******************** NonStatic Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside NonStatic Method of Same Class: Can Directly Access - "+AMPublicInstVar+", "+ AMProtectedInstVar);
        System.out.println("StaticVariable Accessing inside NonStatic Method of Same Class: Can Directly Access - "+ AMPublicStaticVar+", "+AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Same Class - Can Directly Access");
        AMPublicMethod(); AMProtectedMethod();
        System.out.println("StaticMethod Accessing inside NonStatic Method of Same Class - Can Directly Access");
        AMPublicStaticMethod(); AMProtectedStaticMethod();
        System.out.println("******************** NonStatic Method End ********************");
    }

    public static void AMStaticChildMethod(){
        System.out.println("******************** Static Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside Static Method of Same Class: Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticVariable Accessing inside Static Method of Same Class: Can Directly Access - "+AMPublicStaticVar+", "+AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Same Class - Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticMethod Accessing inside NonStatic Method of Same Class - ");
        AMPublicStaticMethod(); AMProtectedStaticMethod();
        System.out.println("******************** Static Method End ********************");
    }


}
