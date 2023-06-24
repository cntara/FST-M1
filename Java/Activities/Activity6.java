package Activities;

public class Activity6 {
    public  static void main(String[] args) throws InterruptedException {
        Plane flyer = new Plane(5);
        flyer.onboard("Tara");
        flyer.onboard("Praneetha");
        flyer.onboard("Vishnumaya");
        flyer.onboard("Nikita");
        System.out.println("Plane took off at: "+ flyer.takeOff());
        System.out.println("People on the plane: " + flyer.getPassengers());
        Thread.sleep(5000);
        flyer.land();
        //Plane lands
        System.out.println("Plane landed at: " + flyer.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + flyer.getPassengers());

    }



}
