package CoreJava.InnerClasses;

public class OuterClass_AnonymousInner {

    public void OuterClassMethod(){
        System.out.println("OuterClass Method");
    }
    public void OuterClassOverriddenMethod(){
        System.out.println("Inside OuterClass");
    }

    public static void main(String args[]){

        /* Anonymous classes can be used only once
        They are like LocalClass except that they do not have a name. Use them if you need to use a local class only once.
        The name of Anonymous Class is decided by Compiler

        Use of AnonymousClass here is, if you want to override a particular method only once. We need to create subclass and overwrite the desired method, this cause usage of more memory. So Anonymous class is used to make memory efficient */
        OuterClass_AnonymousInner OCAIObj = new OuterClass_AnonymousInner() {
            /*This is Anonymous class
            This method is only applicable here, nowhere else we can access/use this below method logic*/
            public void OuterClassOverriddenMethod() {
                System.out.println("Inside AnonymousClass");
            }
        };
        //The above method is written to override the method present inside OuterClass
        OCAIObj.OuterClassOverriddenMethod();
    }

}

