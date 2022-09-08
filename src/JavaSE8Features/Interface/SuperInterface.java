package JavaSE8Features.Interface;

public interface SuperInterface {

    void SuperInterAbstarctMethod();

    default void SuperInterDefaultMethod() {
        System.out.println("SuperInterface Default Method");
    }

    default void SuperInterDefaultMethodNotOverridden() {
        System.out.println("SuperInterface Default Method Not Overridden");
    }

}
