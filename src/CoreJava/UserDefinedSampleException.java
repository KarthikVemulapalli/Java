package CoreJava;

public class UserDefinedSampleException extends Exception{
    private String ExceptionMessage;
    UserDefinedSampleException(String Message){
        this.ExceptionMessage = Message;
    }

    public String toString(){ //This will throw exception in Console
        return "UserDefined Sample Exception - "+ExceptionMessage;
    }
}

//When writing two classes in single file, the second class should not have AccessModifier
class Runner {
    public static void main(String args[]){
        try{
            throw new UserDefinedSampleException("Invalid");
        }
        catch(Exception e ){
            System.out.println(e); //Prints Error in Message Format
            e.printStackTrace(); //Print message in error format, provide lineNumber where it is occurred.
        }
    }
}
