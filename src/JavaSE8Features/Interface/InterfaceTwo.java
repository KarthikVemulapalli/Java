package JavaSE8Features.Interface;

public interface InterfaceTwo extends SuperInterface{

    String InterTwoAbstractMethod();

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
