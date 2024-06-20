package CoreJava.AccessModifiers;

public class AccessModifiers {

    //Access modifiers in Java - public, private, protected, Package-Private (default considered if no access modifier is mentioned)
    //Package-Private is not a keyword, this kind access is considered if no specifier is mentioned

    //Outside Package refer - AMChildClassOtherPackage & AMClassOutsidePackage
    //Inside Same Package refer - AMChildClass & AMClass

    String AMDefaultInstVar = "Default InstanceVar";
    public String AMPublicInstVar = "Public InstanceVar";
    private String AMPrivateInstVar = "Private InstanceVar";
    protected String AMProtectedInstVar = "Protected InstanceVar";

    static String AMDefaultStaticVar = "Default StaticVar";
    public static String AMPublicStaticVar = "Public StaticVar";
    private static String AMPrivateStaticVar = "Private StaticVar";
    protected static String AMProtectedStaticVar = "Protected StaticVar";


    void AMDefaultMethod(){
        System.out.println("Default Method");
    }
    public void AMPublicMethod(){
        System.out.println("Public Method");
    }
    private void AMPrivateMethod(){
        System.out.println("Private Method");
    }
    protected void AMProtectedMethod(){
        System.out.println("Protected Method");
    }

    static void AMDefaultStaticMethod(){
        System.out.println("Default Static Method");
    }
    public static void AMPublicStaticMethod(){
        System.out.println("Public Static Method");
    }
    private static void AMPrivateStaticMethod(){
        System.out.println("Private Static Method");
    }
    protected static void AMProtectedStaticMethod(){
        System.out.println("Protected Static Method");
    }


    public void AMNonStaticMethod(){
        System.out.println("******************** NonStatic Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside NonStatic Method of Same Class: Can Directly Access - "+AMDefaultInstVar+", "+AMPublicInstVar+", "+ AMPrivateInstVar +", "+ AMProtectedInstVar);
        System.out.println("StaticVariable Accessing inside NonStatic Method of Same Class: Can Directly Access - "+ AMDefaultStaticVar +", "+AMPublicStaticVar+", "+ AMPrivateStaticVar+", "+AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside NonStatic Method of Same Class - Can Directly Access");
        AMDefaultMethod(); AMPublicMethod(); AMPrivateMethod(); AMProtectedMethod();
        System.out.println("StaticMethod Accessing inside NonStatic Method of Same Class - Can Directly Access");
        AMDefaultStaticMethod(); AMPublicStaticMethod(); AMPrivateStaticMethod(); AMProtectedStaticMethod();
        System.out.println("******************** NonStatic Method End ********************");
    }

    public static void AMStaticMethod(){
        System.out.println("******************** Static Method Start ********************");
        System.out.println("NonStaticVariable Accessing inside Static Method of Same Class: Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticVariable Accessing inside Static Method of Same Class: Can Directly Access - "+ AMDefaultStaticVar +", "+AMPublicStaticVar+", "+ AMPrivateStaticVar+", "+AMProtectedStaticVar);

        System.out.println("NonStaticMethod Accessing inside Static Method of Same Class: Cannot Directly Access, Can only be accessed using ClassObject");
        System.out.println("StaticMethod Accessing inside Static Method of Same Class: Can Directly Access - ");
        AMDefaultStaticMethod(); AMPublicStaticMethod(); AMPrivateStaticMethod(); AMProtectedStaticMethod();

        //Private variables/methods can be only accessed using class object inside ststic method
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.AMPrivateInstVar = "Private InstanceVar";
        System.out.println("******************** Static Method End ********************");
    }

    public static void main(String Args[]){
        AccessModifiers AccessModifiersObj = new AccessModifiers();
        AccessModifiersObj.AMNonStaticMethod();
        AMStaticMethod();
    }

}
