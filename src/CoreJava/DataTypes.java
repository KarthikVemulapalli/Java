package CoreJava;

public class DataTypes {

    //Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
    //Non-primitive data types: The non-primitive data types include Classes, String, Interfaces, and Arrays

    /* Datatypes Order: For type casting,
       boolean (1 bit)
       byte(1 byte) -> short(2 byte) -> char(2byte) -> int(4 byte) -> long(8 byte) -> float(4byte) -> double(8 byte) */

    /* Type Casting: Java is a strongly-typed language, where type-checking is strictly enforced at runtime.
	1. Widening conversion / Implicit type casting: Converting a variable of smaller datatype to the larger datatype, without data loss is known as widening conversion.
	2. Narrowing conversion / Explicit type casting: Converting a variable of larger datatype to the smaller datatype, with some data loss is known as narrowing conversion. */

    public void DTMethod(){

        short shortVar = 22;
        int intVar = 23;
        /*
        shortVar = (short) intVar; Narrowing Conversion, here we are trying to save integer type (large space) into short type (less space). So we face error, to rectify that we explicitly changed integer to short.
        intVar = shortVar; Widening Conversion, here we are trying to save short type (less space) into integer type (large space). So we don't face any error, java implicitly converts.
        */

        //'l' is used because, implicitly java recognizes all numbers as integers. So we mention the value as long by using l.
        long longVar = 111111111111111111l;
        //'f' is used because, implicitly java recognizes all decimal numbers as double. So we mention the value as float by using f.
        float floatVar = 1.2f;
        double doubleVar = 100.000;

        boolean booleanVar = true;
        char charVar = 'a'; //we need to specify with only single quotes

        //All primitive data types, String are immutable in java
        //Please find below example for immutable;
        String StringVar = "Mahendra Singh";
        StringVar.concat(" Dhoni");  //Concat method adds at end of text
        /*As String is Immutable the value of StringVar does not change
          Because the StringVar (reference variable) is still pointing to the object of "Mahendra Singh", but due to performing concat operation a new object is created in 'String Constant Pool (memory inside heap)' */
        System.out.println("Immutable Example: TextBefore is - "+StringVar);
        //to make the change happen, we need to point StringVar to the new object created
        StringVar = StringVar.concat(" Dhoni");
        System.out.println("Immutable Example: TextAfter is - "+StringVar);

        //Conversion of DataTypes
        String StringInt = "3";
        int IntVarFromString = Integer.parseInt(StringInt);
        int IntString = 222;
        String StringVarFromInt = String.valueOf(IntString);
        System.out.println("IntVarFromString - "+IntVarFromString+"; "+"StringVarFromInt - "+StringVarFromInt);
    }

    public static void main(String Args[]){
        DataTypes DataTypesObj = new DataTypes();
        DataTypesObj.DTMethod();
    }

}
