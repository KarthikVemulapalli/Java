package CoreJava.InnerClasses;

public class Outer_LocalInner {

    //LocalInnerClass - Class Inside Method
    //We can create class inside a method, but we can instantiate (object creation) only inside this method
    public static String OuterClassStaticVar = "OuterClassStaticVar";
    public String OuterClassVar = "OuterClassVar";

    public static void OuterStaticMethod(){
        System.out.println("OuterStaticMethod");
    }

    public void OuterMethod(){
        System.out.println("OuterMethod");
    }

    public void InnerClassMethod(){
        String LocalMethodVar = "InnerClassMethodVar";

        //This class is only method specific
        class LocalInnerClass {

            //We cannot create Static variables/methods inside any inner classe
            //this class can access OuterClass methods & variables and Method variables also
            public void LocalClassMethod(){
                System.out.println("LocalInnerClass Can Access - ");
                System.out.println(OuterClassStaticVar+", "+OuterClassVar +", "+LocalMethodVar);
                OuterMethod(); OuterStaticMethod();
            }
        }

        LocalInnerClass InnerLocalClassObj = new LocalInnerClass();
        InnerLocalClassObj.LocalClassMethod();
    }

}
