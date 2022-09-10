package CoreJava.ObjectCreation;

import CoreJava.AccessModifiers.AMAbstractClass;
import CoreJava.Inheritance.ChildCarLoan;
import CoreJava.Inheritance.ParentLoan;
import CoreJava.Interface.BankInterface;
import CoreJava.Interface.SubBranchClass;

public class OCClass {

    public void OCClassMethod(){
        System.out.println("OCClass Method");
    }

    public static void main(String Args[]){
        OCClass OCClassObj = new OCClass();
        OCClassObj.OCClassMethod();

        /* The below is only allowed when ClassObject extends OCClass (or viceversa) because 'A SuperClass reference variable can hold reference of SubClass object without typecasting'
        OCClass OtherClassObject = new ClassObject();
        ClassObject ClassObjectObj = new OCClass(); */

        //This can be done if SubBranchClass implements BankInterface
        BankInterface BankInterObj = new SubBranchClass();
        //The below will throw error in BankInterface, because Interface cannot be instantiated.
        //SubBranchClass SubBranchClassObj = new BankInterface();

    }

}
