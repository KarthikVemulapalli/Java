package CoreJava.AccessModifiers;
//This class cannot be accessed outside the package
class AMConstructorClass {

    //Classes can only have Package-Private, public
    //Constructors can be public, private, protected & Package-Private
    private AMConstructorClass(){
        System.out.println("Private AMConstructorClass");
    }

    public AMConstructorClass(String Public){
        System.out.println("Public AMConstructorClass");
    }

    protected AMConstructorClass(int Protected){
        System.out.println("Protected AMConstructorClass");
    }

    AMConstructorClass(boolean PackPrivate){
        System.out.println("Package-Private AMConstructorClass");
    }

}
