package Activities;

public class Activity1 extends Car {

    public Activity1(String colour, String transmission, int make, int tyres, int doors) {
        super(colour, transmission, make, tyres, doors);
    }

    public static  void main(String[] args){
        Car test=new Car("Black","Manual",2014,4,4);
        test.displayCharacteristics();
        test.accelarate();
        test.brake();
    }


}
