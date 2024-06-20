package Java_SE8.Interface;

public class InterChildClass implements InterfaceTwo, InterfaceOne {

    String CommonVariable = "InterChildClass Var";

    //All Abstract methods should be implemented
    @Override
    public String InterOneAbstractMethod() {
        System.out.println("Overridden InterOneAbstractMethod by Child");
        return "Implemented";
    }
    @Override
    public String InterTwoAbstractMethod() {
        System.out.println("Overridden InterTwoAbstractMethod by Child");
        return "Implemented";
    }
    //Implementing SuperInterface Methods
    @Override
    public void SuperInterAbstarctMethod() {
        System.out.println("Overridden SuperInterface Abstract Method");
    }

    public void InterOneDefaultMethod(){
        System.out.println("Overridden InterfaceOne Default Method by Child");
    }
    //ChildClass Method
    public void ChildMethod(){
        System.out.println("Child Method");
    }
    //This is how you can call ParentClass method is called in ChildClass, if Overridden is done
    public void InterOneDefaultMethodUsingChildObj(){
        InterfaceOne.super.InterOneDefaultMethod();
    }


    //Common methods in Both Interfaces, we just need to Override them
    public void InterfacesAbstractCommonMethod(){
        //System.out.println("Implemented CommonMethod in Both Interfaces");
    }
    public void InterfacesCommonDefaultMethod(){
        //By below line we can call particular Interface default method
        InterfaceOne.super.InterfacesCommonDefaultMethod();
    }

    //Overridden SuperInterface Default Method
    public void SuperInterDefaultMethod() {
        System.out.println("Overridden SuperInterface Default Method");
    }
    public void SuperInterDefaultMethodUsingChildObj(){
        InterfaceTwo.super.SuperInterDefaultMethod();
    }


    public static void main(String Arguments[]){
        InterChildClass ChildClassObj = new InterChildClass();
        //InterOneObj cannot access methods belongs to ChildClass & InterfaceTwo
        //By stating below, the InterOneObj can only access InterfaceOne methods & InterfaceOne Implemented methods in ChildClass
        InterfaceOne InterOneObj = ChildClassObj;
        //The above also states that, 'I have created an object of ChildClass to implement methods present in ParentInterface'

        //we can state the below line, it is similar to 'InterChildClass ChildClassObj = new InterChildClass()'. We are typecasting Interface type reference variable to ChildClass type.
        InterChildClass InterChildClassObj = (InterChildClass) InterOneObj;

        //Only can access below methods (InterfaceOne methods & InterfaceOne Implemented methods in ChildClass)
        InterOneObj.InterOneAbstractMethod();
        InterOneObj.InterOneDefaultMethod();
        InterOneObj.InterOneDefaultMethodNotOverridden();
        InterOneObj.InterfacesCommonDefaultMethod();
        InterOneObj.InterfacesAbstractCommonMethod();
    }

}
