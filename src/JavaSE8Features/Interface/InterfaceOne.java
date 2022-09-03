package JavaSE8Features.Interface;

public interface InterfaceOne {

    //Private Variables cannot be Created in Interface
    int IntVar = 20;
    int IntPrivateVar = 40;

    //From Java SE8 - Interface can have Implemented methods, but they should be Default
    //From Java SE8 - Default Interface should have a body
    default void DefPublicMethod(){
        System.out.println("Public Default Method 1");
    }

    //From Java SE9 - Interface can have Private Implemented Methods, need not be default
    //From Java SE9 - Private Methods in Interface Should have a Body
    private void PrivateMethod(){
        System.out.println("Private Method 1");
    }

    String PublicMethod1();

}
