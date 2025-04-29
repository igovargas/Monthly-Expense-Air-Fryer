import java.util.Scanner;

public class MonthlyExpenseAirFryer {

    //No global variables were used in the code.

    public static void main(String[] args) {
        System.out.println("\nLet's calculate your monthly Air Fryer spending.");

        Scanner entrada = new Scanner(System.in);

        //Number of times used per day
        System.out.println("\nHow many times do you use your Air Fryer per day?");
        float dailyUses = entrada.nextFloat();

        //Time, in minutes, used per day
        System.out.println("\nWhat is your average usage, in minutes?");
        Float usageMinutes = entrada.nextFloat();

        //Power (kW) of Air Fryer
        System.out.println("\nWhat is the power (kW) of the Air Fryer?");
        float airFryerPower = entrada.nextFloat();
        if (airFryerPower > 100) {
            airFryerPower = airFryerPower / 1000f;
            System.out.println("Input interpreted as Wh. Converted to: " + airFryerPower + " kW");
        } else {
            System.out.println("Input interpreted as kWh.");
        }
        
        float kwDay = (usageMinutes / 60f) * airFryerPower;

        //Value of your home's kW (in R$)
        System.out.println("\nWhat is your kWh rate (R$)?");
        float kwhRate = entrada.nextFloat();

        float dailyCost = kwDay * kwhRate;

        float dailyPrice = dailyCost * dailyUses;
        float monthlyPrice = dailyPrice * 30;

        //Final monthly consumption response
        System.out.println("\nYour monthly expense is R$" + monthlyPrice + " with Air Fryer.");

        entrada.close();
    }
}