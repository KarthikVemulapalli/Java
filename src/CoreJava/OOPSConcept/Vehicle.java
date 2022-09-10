package CoreJava.OOPSConcept;

public abstract class Vehicle {  //Abstraction - By using Interface/AbstractClass we achieve abstraction

    //Abstraction - we can't instantiate (object creation) AbstractClass/Interface. so we are hiding the coding and showing the functionality through subclasses

    public void VehicleType(){
        System.out.println("There are two types - Commercial & Passenger Vehicles");
    }
    public abstract void VehicleWheels();
    //if a class extending this AbstractClass it should implement all unimplemented methods
}
