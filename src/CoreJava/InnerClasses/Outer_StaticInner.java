package CoreJava.InnerClasses;

public class Outer_StaticInner {

    //NonStaticInnerClass - Class Inside a class and Outside a method
    public static String OuterClassStaticVar = "OuterClassStaticVar";
    public String OuterClassVar = "OuterClassVar";

    public static void OuterStaticMethod(){
        System.out.println("OuterStaticMethod");
    }

    public void OuterMethod(){
        System.out.println("OuterMethod");
    }

    //This class can be instantiated in other classes as well
    public static class StaticInnerClass {
        public String  StaticInnerClassVar = "StaticInnerClassVar";

        public void StaticInnerClassMethod(){
            System.out.println("StaticInnerClass Method");
        }
    }

}
