
import java.util.Scanner;

void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura em Celsius (°C): ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9/5) + 32;
            double kelvin = celsius + 273.15;
            
            System.out.println("\nTemperatura em Celsius: " + celsius + " °C");
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
            System.out.println("Temperatura em Kelvin: " + kelvin + " K");

            sc.close();

}