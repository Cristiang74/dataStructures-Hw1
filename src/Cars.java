import java.util.HashMap;
import java.util.Scanner;

public class Cars {

HashMap<String, String> cars = new HashMap<>();



    public void run(){

    Scanner input = new Scanner(System.in);
    System.out.println("Hello, what model of car are you looking for?");
    String carModel = input.nextLine();
    carModel.toLowerCase();

    cars.put("optima", "kia");
    cars.put("viper", "dodge");
    cars.put("raptor", "ford");
    cars.put("camry", "toyota");
    cars.put("wrangler", "jeep");

    System.out.println(cars.containsKey(input.nextLine()));









    }






}