package Java_SE8.Interface;

public interface SuperInterface {

    void SuperInterAbstarctMethod();

    default void SuperInterDefaultMethod() {
        System.out.println("SuperInterface Default Method");
    }

    default void SuperInterDefaultMethodNotOverridden() {
        System.out.println("SuperInterface Default Method Not Overridden");
    }

}
