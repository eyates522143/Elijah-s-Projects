import java.util.Scanner;

public class Methods{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the temperature in Celsius:  ");
        double celsius = in.nextDouble();

        while (in.nextDouble() < 0) {
            System.out.println("Brrrr, it's freezing! ");
        }

        double fahrenheit = celsiusToFahrenheit (celsius);
        System.out.println(celsius + " Celsius equals to " + fahrenheit + " Fahrenheit.");

        double rankine = fahrenheitToRankine (fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit equals to " + rankine + " Rankine.");
    }

    //    Convert from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){

        return ((9.0 / 5.0) * celsius) + 32;
    }

    //Convert from Fahrenheit to Rankine

    public static double fahrenheitToRankine (double fahrenheit) {

        return (fahrenheit + 459.67);
    }

}
