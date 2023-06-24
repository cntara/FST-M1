package Activities;

public class Activity3 {

    public  static void main(String[] args){
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        double earthAge=seconds / EarthSeconds;
        System.out.println("Age on Earth: " + earthAge);
        System.out.println("Age on Mercury: " + earthAge / MercurySeconds);
        System.out.println("Age on Venus: " + earthAge / VenusSeconds);
        System.out.println("Age on Mars: " + earthAge / MarsSeconds);
        System.out.println("Age on Jupiter: " + earthAge / JupiterSeconds);
        System.out.println("Age on Saturn: " + earthAge / SaturnSeconds);
        System.out.println("Age on Uranus: " + earthAge / UranusSeconds);
        System.out.println("Age on Neptune: " + earthAge / NeptuneSeconds);

    }

}
