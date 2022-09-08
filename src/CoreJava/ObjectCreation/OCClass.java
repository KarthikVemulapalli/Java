package CoreJava.ObjectCreation;

public class OCClass {

    public void OCClassMethod(){
        System.out.println("OCClass Method");
    }

    public static void main(String Args[]){
        OCClass OCClassObj = new OCClass();
        OCClassObj.OCClassMethod();

        //The below is only allowed when ClassObject extends OCClass because 'A SuperClass reference variable can hold reference of SubClass object without typecasting'
        //OCClass OtherClassObject = new ClassObject();

    }

}
