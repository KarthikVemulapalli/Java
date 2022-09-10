package CoreJava;

public class ExceptionHandling {

    public void ThrowThrowsMethod() throws InterruptedException, ArrayIndexOutOfBoundsException { //Throws Declaration of exceptions may in method
        try{
            Thread.sleep(1000); //InterruptedException
            ArrayIndexOutOfBoundsException ArrayExcep = new ArrayIndexOutOfBoundsException("Demo Exception From ThrowThrowsMethod"); //Exception message
            throw ArrayExcep; //If not handled by try-catch block. Exception will stop the code execution
            //Now exception error with message passed, will be thrown at the last after complete execution
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside ThrowThrowsMethod Catch Block, Exception Using Throw");
            e.printStackTrace(); //This prints the exception in console
        }
    }

    public void TryCatchMethod(){
        try{
            int[] IntArray = new int[2];
            System.out.println(IntArray[2]);
        } catch(Exception e){
            System.out.println("Inside TryCatchMethod Catch Block");
            //e.printStackTrace(); This prints the exception in console
        }
    }

    public void TryFinallyMethod(){
        try{
            System.out.println("Inside TryFinallyMethod Try Block");
        } finally { //This block of code executes even though there is error
            System.out.println("Inside TryFinallyMethod Finally Block");
        }
    }

    public void NestedTryMultiCatchMethod(){
        try{
            try{
                ArrayIndexOutOfBoundsException ArrayExcep = new ArrayIndexOutOfBoundsException();
                throw ArrayExcep;
            } catch(ArrayIndexOutOfBoundsException e){ }
        }
        catch (ArithmeticException e){ }
        catch (ArrayIndexOutOfBoundsException e){ }
        catch (Exception e){ }
        finally {
            //Last Block of Statement
        }
    }

    public static void main(String args[]) throws InterruptedException {
        ExceptionHandling ExcepHandle = new ExceptionHandling();
        ExcepHandle.ThrowThrowsMethod();
        ExcepHandle.TryCatchMethod();
        ExcepHandle.TryFinallyMethod();
    }
}