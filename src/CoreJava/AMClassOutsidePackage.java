package CoreJava;

import CoreJava.AccessModifiers.AccessModifiers;

public class AMClassOutsidePackage {

    public void AMNonStaticClassMethod(){
        AccessModifiers AccessModifiersObj = new AccessModifiers();
        System.out.println("******************** NonStatic Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside NonStatic Method of Different Class: Can Access using ClassObject - "+ AccessModifiersObj.AMPublicInstVar);
        System.out.println("StaticVariable Accessing inside NonStatic Method of Different Class: Can Access using ClassName - "+ AccessModifiers.AMPublicStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Different Class - Can Access using ClassObject");
        AccessModifiersObj.AMPublicMethod();
        System.out.println("StaticMethod Accessing inside NonStatic Method of Different Class - Can Access using ClassName");
        AccessModifiers.AMPublicStaticMethod();
        System.out.println("******************** NonStatic Method End ********************");
    }

    public static void AMStaticClassMethod(){
        System.out.println("******************** Static Method Start ********************");
        AccessModifiers AccessModifiersObj = new AccessModifiers();
        System.out.println("NonStaticVariable Accessing inside Static Method of Different Class: Can Access using ClassObject - "+AccessModifiersObj.AMPublicInstVar);
        System.out.println("StaticVariable Accessing inside Static Method of Different Class: Can Directly Access - "+ AccessModifiers.AMPublicStaticVar);

        System.out.println("NonStaticMethod Accessing inside Static Method of Different Class: Can Access using ClassObject");
        AccessModifiersObj.AMPublicMethod();
        System.out.println("StaticMethod Accessing inside Static Method of Different Class: Can Access Using ClassName - ");
        AccessModifiers.AMPublicStaticMethod();
        System.out.println("******************** Static Method End ********************");
    }

}
