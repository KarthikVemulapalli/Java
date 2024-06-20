package Java_SE8.Interface;

public interface InterfaceOne {

    //All Variables in Interface are Public, Static, Final
    int IntVar = 20;
    int IntPrivateVar = 40;

    String CommonVariable = "InterOne Var";

    //All non-implemented methods will be public, abstract implicitly
    //Below method should be implemented in all classes which implements this interface
    String InterOneAbstractMethod();  //public, abstract

    //From Java SE8 - Interface can have default & static methods but should have implementation
    //default method usage - Can add extra method without disturbing the classes that implements this interface. This method can be overridden in ChildClasses
    public default void InterOneDefaultMethod(){
        System.out.println("InterfaceOne Public Default Method");
    }
    //static method usage - We cannot override static methods in Java. So child class can also have same method name, but this doesn't mean Interface Static method is overridden.
    public static void InterOneStaticMethod(){
        System.out.println("InterfaceOne Public Static Method");
    }

    //From Java SE9, Interface can have private methods either static/non-static methods
    //private method usage - code reusability within Interface without being accessed by other classes.
    private static void InterOnePrivateStaticMethod() {
        System.out.println("InterfaceOne Private Static Method");
    }
    private void InterOnePrivateMethod(){
        System.out.println("InterfaceOne Private NonStatic Method");
    }

    default void InterOneDefaultMethodNotOverridden(){
        System.out.println("InterfaceOne Default Method Not Overridden");
    }

    default void InterfacesCommonDefaultMethod(){
        System.out.println("CommonDefaultMethod in Both Interfaces");
    }
    void InterfacesAbstractCommonMethod();

}
