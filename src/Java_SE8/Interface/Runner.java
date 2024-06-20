package Java_SE8.Interface;

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

        //Common Variable present in InterOne, InterTwo, InterChildClass
        //This will call the CommonVariable of ReferenceVariable used for calling. So here we are InterChildClass reference variable, so it calls InterChildClass variable.
        System.out.println(InterChildClassObj.CommonVariable);

    }

}
