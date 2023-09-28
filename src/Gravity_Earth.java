public class Gravity_Earth {
    public static void main(String[] args) {

        double Mass_Earth = 5.972 * Math.pow(10, 24);
        double Gravitational_Constant = 6.67430 * Math.pow(10, -11);

        double gravity = (Gravitational_Constant * Mass_Earth) / Math.pow(6.371 * Math.pow(10, 6), 2); // radius of Earth in meters

        System.out.println("The gravity of Earth is: " + gravity + " m/s²");
    }
}