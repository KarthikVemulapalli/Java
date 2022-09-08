package CoreJava.AccessModifiers;

public abstract class AMAbstractClass {

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

}
