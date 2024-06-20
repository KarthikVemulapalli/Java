package Java_SE8.Interface;

public interface InterfaceTwo extends SuperInterface{

    String InterTwoAbstractMethod();

    String CommonVariable = "InterTwo Var";

    static void InterTwoStaticMethod(){
        System.out.println("InterfaceTwo Static Method");
    }
    public default void InterTwoDefaultMethodNotOverridden(){
        System.out.println("InterfaceTwo Default Method not Overridden");
    }

    default void InterfacesCommonDefaultMethod(){
        System.out.println("CommonDefaultMethod in Both Interfaces");
    }
    void InterfacesAbstractCommonMethod();

}
