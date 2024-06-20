package CoreJava.AccessModifiers;

public interface AMInterface {

    //In Interface all Variables are Public, Static, Final
    String AMDefaultInstVar = "Public Static Final Var";


    //In an interface methods with no implementation are implicitly public and abstract.
    void AMPublicMethod();

    //All methods which are implemented should be either default/private/static
    //From Java 1.8 or JavaSE 8
    default void AMDefaultMethod(){
        System.out.println("Default Method");
    }
    public static void AMPublicStaticMethod(){
        System.out.println("Public Static Method");
    }

    //From Java 1.9 or JavaSE 9
    private void AMPrivateMethod(){
        System.out.println("Private Method");
    }
    private static void AMPrivateStaticMethod(){
        System.out.println("Private Static Method");
    }

}
