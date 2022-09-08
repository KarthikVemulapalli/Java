package JavaSE8Features.Interface;

public class Runner {

    public static void main(String Args[]){
        //IntClassObj can access methods from InterfaceOne, InterfaceTwo, IntClass
        InterChildClass InterChildClassObj = new InterChildClass();

        //Child Object accessing InterfaceOne Methods
        //The below methods are OverRidden
        InterChildClassObj.InterOneAbstractMethod();
        InterChildClassObj.InterOneDefaultMethod();
        //The below methods are not Overridden
        InterChildClassObj.InterOneDefaultMethodNotOverridden();
        //Using below way we can InterfaceMethod which is alreadyOverridden using ChildObject
        InterChildClassObj.InterOneDefaultMethodUsingChildObj();

        //ChildObject accessing InterfaceTwo methods
        InterChildClassObj.InterTwoAbstractMethod();
        InterChildClassObj.InterTwoDefaultMethodNotOverridden();

        //ChildObject accessing ChildClass specific methods
        InterChildClassObj.ChildMethod();

        //Calling Common Methods
        InterChildClassObj.InterfacesAbstractCommonMethod();
        InterChildClassObj.InterfacesCommonDefaultMethod();

        //Interface StaticMethods are called
        InterfaceOne.InterOneStaticMethod();
        InterfaceTwo.InterTwoStaticMethod();

    }

}
