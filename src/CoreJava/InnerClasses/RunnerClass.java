package CoreJava.InnerClasses;

public class RunnerClass {

    public static void main(String args[]){

        //Accessing LocalInnerClass
        Outer_LocalInner OLIObj = new Outer_LocalInner();
        OLIObj.InnerClassMethod();


        //Accessing NonStaticInnerClass
        //First we need to create object for OuterClass
        Outer_NonStaticInner ONSIObj = new Outer_NonStaticInner();
        //To call InnerClass we need to use OuterClassName.InnerClass
        //To create object of NonStaticInnerClass we require object of OuterClass
        Outer_NonStaticInner.NonStaticInnerClass NSICObj = ONSIObj.new NonStaticInnerClass();
        NSICObj.NonStaticInnerClassMethod();


        //Accessing StaticInnerClass
        //We need not require Object of OuterClass to create object of StaticInnerClass
        Outer_StaticInner.StaticInnerClass SICObj = new Outer_StaticInner.StaticInnerClass();
        SICObj.StaticInnerClassMethod();

    }

}
