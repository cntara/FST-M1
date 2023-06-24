package Activities;

public class Car {
    public String colour, transmission;
    public int make, tyres, doors;

    public Car(String colour, String transmission, int make, int tyres, int doors) {
        this.colour = colour;
        this.transmission = transmission;
        this.make = make;
        this.tyres = tyres;
        this.doors = doors;


    }

    public void displayCharacteristics() {
        System.out.println("Displayes value of all variable");
        System.out.println("Color of the car: "+this.colour);
        System.out.println("transmission: "+this.transmission);
        System.out.println("make of the car: "+this.make);
        System.out.println("Number of tyres on the car: "+this.tyres);
        System.out.println("Number of doors on the car: "+this.doors);


    }

    public void accelarate() {
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }

}
