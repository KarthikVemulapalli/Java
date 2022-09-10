package CoreJava.OOPSConcept;

public class Car extends Vehicle{ //Inheritance
    //Only interface can be implements, abstract class should be extends

    private String CarChasisNumber = "CARIND001JAVA"; //Encapsulation
    //The chasis number of car is private, need to protect this confidential data. So this variable is not accessed directly by other classes/methods.

    //we need to access the private variable by using Setter & Getter methods.
    //So to view this chasis number we need to provide password.
    public String getChasisNumber(String Password){
        if (Password.equals("CarOwner")){
            return CarChasisNumber;
        }
        return "InvalidPassword";
    }
    //So set new chasis number we need to provide password.
    public String setChasisNumber(String Password, String NewChasisNumber){
        if (Password.equals("CarManufacturer")){
            this.CarChasisNumber = NewChasisNumber;
            return "Success";
        }
        return "Failure";
    }


    public void VehicleType(){  //Polymorphism - Method Overriding from ParentClass (run-time)
        System.out.println("Passenger Vehicle");
    }

    @Override //Implementing the unimplemented methods in ParentAbstractClass
    public void VehicleWheels() {
        System.out.println("4 wheels");
    }

    public void EngineType(String EngineSpec){
        if(EngineSpec.equals("Petrol")){
            System.out.println("Petrol Car");
        } else if(EngineSpec.equals("Diesel")){
            System.out.println("Diesel Car");
        } else {
            System.out.println("ElectricVehicle Car");
        }
    }

    //Polymorphism - MethodOverriding of same method with different parameters (compile-time)
    public void EngineType(String EngineSpec, int Mileage){
        if(EngineSpec.equals("Petrol")){
            System.out.println("Petrol Car - Mileage "+Mileage+" kmpl");
        } else if(EngineSpec.equals("Diesel")){
            System.out.println("Diesel Car - Mileage "+Mileage+" kmpl");
        } else {
            System.out.println("ElectricVehicle Car - Range "+Mileage+" km");
        }
    }


    public static void main(String args[]){
        Car CarObj = new Car();
        CarObj.EngineType("EV", 300);

        String ChasisNo = CarObj.getChasisNumber("CarOwner");
        System.out.println("Car ChasisNumber - "+ChasisNo);
    }
}
