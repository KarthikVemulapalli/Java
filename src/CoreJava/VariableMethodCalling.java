package CoreJava;

public class VariableMethodCalling {

    final String ClassName ="JavaConcept_MethodCalling";
    static String Message = "Welcome";
    String GlobalVariable = "Global";

    VariableMethodCalling() {
        System.out.println("JavaConcept_MethodCalling - Default Constructor");
        System.out.println(ClassName + " : "+Message + " : "+ GlobalVariable);
    }

    public static void OtherClassMethod() {
        Constructors JCCObj = new Constructors();   //Calling methods from other Class by that ClassObject
        JCCObj.getDisplayDetails();
    }

    public void ClassMethod1() {
        String GlobalVariable = "Local";
        System.out.println("JavaConcept_MethodCalling Class - ClassMethod1");

        System.out.println(this.GlobalVariable);
        this.GlobalVariable = GlobalVariable;		//Non-Static Class Variable value can be modified inside a class
        System.out.println(this.GlobalVariable+" ; "+GlobalVariable);		//'this' is used to differentiate Class and Local variable if they have same name
    }

    public void ClassMethod2() {
        System.out.println("JavaConcept_MethodCalling Class - ClassMethod2");
        OtherClassMethod();

        ClassMethod1();		//Non-Static methods of same class can be directly called in other Non-Static methods without Object creation
        Message = "Welcome All";
        System.out.println(Message);    //Static variable can be modified inside a class
    }

    public static void main(String[] args) {
        OtherClassMethod();   //Static method do not require Object to call

        VariableMethodCalling JCMCObj = new VariableMethodCalling();   //Non-Static methods require Object to call inside Static main method
        JCMCObj.ClassMethod1();
        JCMCObj.ClassMethod2();
    }

}
