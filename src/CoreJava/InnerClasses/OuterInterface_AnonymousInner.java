package CoreJava.InnerClasses;

public interface OuterInterface_AnonymousInner {

    public void OuterClassOverriddenMethod();

    public static void main(String args[]){

        /* Anonymous classes can be used only once
        They are like LocalClass except that they do not have a name. Use them if you need to use a local class only once.
        The name of Anonymous Class is decided by Compiler

        Use of AnonymousClass in Interface is, if you want to implement this interface only once. We need to create class which implements Interface, this cause usage of more memory. So Anonymous class is used to make memory efficient */
        OuterInterface_AnonymousInner OIAIObj = new OuterInterface_AnonymousInner() {
            /*This is Anonymous class
            This method is only applicable here, nowhere else we can access/use this below method logic*/

            //Rare Scenario: We can create object of Interface using AnonymousClass
            public void OuterClassOverriddenMethod() {
                System.out.println("Inside AnonymousClass");
            }
        };
        //The above method is written to override the method present inside OuterClass
        OIAIObj.OuterClassOverriddenMethod();
    }

}
