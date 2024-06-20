package CoreJava.InnerClasses;

public class Outer_NonStaticInner {

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
    public class NonStaticInnerClass {
        public String  NonStaticInnerClassVar = "NonStaticInnerClassVar";

        public void NonStaticInnerClassMethod(){
            System.out.println("NonStaticInnerClass Method");
        }
    }

}
