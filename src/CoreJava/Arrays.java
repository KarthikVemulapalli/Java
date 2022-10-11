package CoreJava;

import java.util.*;
import java.io.*;

public class Arrays {

    public void arrayMethod(){
        /*Array Declaration & Initialization
        Array index starts with '0'
        An Array is a container which stores multiple values of same datatype
        Arrays are stored in contagious memory [consecutive memory locations]
        The size of an array must be specified by int/short value and not long
        We face 'ArrayIndexOutOfBoundsException', if tried accessing elements outside array index */
        //Type1 Initialization of Array
        String[] StringArray = {"Hello", "Array"};
        //Type2 Initialization of Array
        String[] StringArrayAlt = new String[]{"Hello", "Array", "Declaration"};
        System.out.println("Length of StringArrayAlt- "+StringArrayAlt.length);


        //Array length is fixed, after creating an array we cannot add/insert elements
        //Type3 Initialization of Array
        int[] intArray = new int[3];
        intArray[0] = 5;
        intArray[2] = 10;
        //If no value is assigned, the default value will be stored in index i.e. '0'
        System.out.println(intArray[1]);

        boolean[] booleanArray = {1==3, false, "Yes".equals("Yes")};
        System.out.println("BooleanArray length is - "+booleanArray.length);

        //Display the array in single String format with elements separating with ',' & inside SquareBrackets
        System.out.println("Array in String format - "+java.util.Arrays.toString(intArray));
        //Able to use Arrays.toString() in Eclipse without error

        //An array can store primitive & non-primitive
        Object[] ObjectArray = {new Constructors(), new ScannerInput()};

        //OneDimensional Array
        int[] int1DArray = {1,2,3,4};
        //MultiDimensional Array
        int[][] int2DArray = {{1,2}, {3,4,5,6}, {7}};
        //Below statement throw 'ArrayIndexOutOfBoundsException', accessing element outside index
        System.out.println(int2DArray[0][2]);
    }

    public static void main(String Args[]){
        Arrays ArraysObj = new Arrays();
        ArraysObj.arrayMethod();
    }

}