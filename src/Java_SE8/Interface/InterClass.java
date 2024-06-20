package Java_SE8.Interface;

public class InterClass {

    void InterClassMethod(){
        System.out.println("InterfacePackage Class Method");
    }

    public static void main(String Args[]){
        InterClass InterClassObj = new InterClass();
        //The below step is not allowed unless InterClass implements InterfaceOne
        //InterfaceOne InterfaceOneObj = InterClassObj;

        //Typecasting needs to be done, if Class not implements Interface
        InterfaceOne InterfaceOneObj = (InterfaceOne) new InterClass();
    }

}
