package CoreJava.Inheritance;

public class RunnerClass {

    public static void main(String[] args) {
        ChildCarLoan CarLoanObj = new ChildCarLoan();
        double CarLoanAmount = CarLoanObj.calculateEMI();
        System.out.println("Car Loan EMI/Year is: " + CarLoanAmount);

        ChildCarLoan.StaticMethod();  //ChildClass Static Method
        ParentLoan.StaticMethod();   //ParentClass Static Method

        System.out.println(CarLoanObj.LoanMessage());     //Using ParentClass method

        //The below line can be written when ChildCarLoan extends ParentLoan
        //'A SuperClass reference variable can hold reference of SubClass object without typecasting'
        ParentLoan ParentLoanObj = new ChildCarLoan();
        //ParentLoanObj can only access Methods that are overridden in ChildClass and all Methods in ParentClass.
        //In case of variables the ParentClass variable prints below, because OverRidding the parent class is only for Methods but not for Variables.
        System.out.println("Variable Value - "+ParentLoanObj.CommonVariable);
        ParentLoanObj.CommonMethod();

        //ChildClass reference variable cannot hold reference of ParentClass object without typecasting'
        //Even though the below line it was free of Compile error, during Run-Time it will throw 'ClassCastException'
        //ChildCarLoan ChildCarLoanObj = (ChildCarLoan) new ParentLoan();
        //Above line is similar to ChildCarLoan ChildCarLoanObj = new ChildCarLoan(); but throws an error.
    }

}
