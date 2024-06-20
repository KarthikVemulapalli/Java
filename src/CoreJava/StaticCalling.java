package CoreJava;

public class StaticCalling {

    //Static Methods/Variables are class specific i.e. There are common for all different ClassObjects
    public int NonStaticVar;
    static int StaticVar;

    void MethodCall(int num1, int num2) {
        NonStaticVar+=num1;
        StaticVar+=num2;
    }

    public static void main(String[] args) {
        StaticCalling JCSObj1 = new StaticCalling();
        StaticCalling JCSObj2 = new StaticCalling();
        JCSObj1.NonStaticVar=0;
        JCSObj1.StaticVar=0;
        JCSObj1.MethodCall(1, 2);

        JCSObj2.NonStaticVar=0;
        JCSObj2.MethodCall(2, 3);

        System.out.println("The Values after Execution for Obj1 - NonStaticVar:"+JCSObj1.NonStaticVar+", StaticVar:"+JCSObj1.StaticVar);
        System.out.println("The Values after Execution for Obj1 - NonStaticVar:"+JCSObj2.NonStaticVar+", StaticVar:"+JCSObj2.StaticVar);
    }

}
