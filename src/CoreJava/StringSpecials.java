package CoreJava;

import java.util.Locale;

public class StringSpecials {

    public void stringMethod(){
        //Please find below example for immutable;
        String StringVar = "Mahendra Singh";
        StringVar.concat(" Dhoni");  //Concat method adds at end of text
        /*As String is Immutable the value of StringVar does not change
          Because the StringVar (reference variable) is still pointing to the object of "Mahendra Singh", but due to performing concat operation a new object is created in 'String Constant Pool (memory inside heap)' */
        System.out.println("Immutable Example: TextBefore is - "+StringVar);
        //to make the change happen, we need to point StringVar to the new object created
        StringVar = StringVar.concat(" Dhoni");
        System.out.println("Immutable Example: TextAfter is - "+StringVar);

        //Comparing String Variables
        String StringHello = "Hello";
        String StringHelloDup = "Hello";
        System.out.println("String comparing the same address - "+(StringHello==StringHelloDup));  //Statement-1
        String StringVariable = new String("Hello"); //Another way of initializing because it is Non-Primitive Data type
        //Even though both variables store same value, the below statement will be false
        System.out.println("String comparing different address - "+(StringHello==StringVariable));  //Statement-2
        /*
        In statement-2, even though both variables have same text inside it results false. Because String compares address of object created but not value present inside it.
        In statement-1, the two variables pointing to same address of "Hello" in StringConstantPool. So it results in true.
         */
        //by using .equals() method, we are comparing values present in String variables. But not the address of their objects.
        System.out.println("String comparing values - "+(StringHello.equals(StringVariable)));

        //String functions
        String StringFunctions = "Hello String Functions";
        String[] StringSplitArray = StringFunctions.split(" "); //Split returns Array, using space
        System.out.println("String to LowerCase - "+StringFunctions.toLowerCase());
        System.out.println("String to UpperCase - "+StringFunctions.toUpperCase());
        System.out.println("String Length - "+StringFunctions.length());
        System.out.println("Gives IndexOf Character/String - "+StringFunctions.indexOf("String"));
        System.out.println("Gives Character at particular Index - "+StringFunctions.charAt(3));


        //StringBuilder & StringBuffer are Mutable classes
        StringBuilder StringBuilderVar = new StringBuilder("Sachin");
        StringBuilderVar.append(" Tendulkar");
        System.out.println("StringBuilder - "+StringBuilderVar);

        StringBuffer StringBufferVar = new StringBuffer("Sachin");
        StringBufferVar.append(" Tendulkar");
        System.out.println("StringBuffer - "+StringBufferVar);
        /* StringBuilder vs StringBuffer
        StringBuffer is thread-safe and synchronized where StringBuilder is not.
        StringBuffer since Java1.0, StringBuilder since Java1.5
        StringBuilder is faster than StringBuffer
         */
    }

    public static void main(String args[]){
        StringSpecials StringSpecialsObj = new StringSpecials();
        StringSpecialsObj.stringMethod();
    }

}
