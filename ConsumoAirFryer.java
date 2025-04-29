import java.util.Scanner;

public class ConsumoAirFryer {

    //No global variables were used in the code.

    public static void main(String[] args) {
        System.out.println("\nLet's calculate your monthly Air Fryer spending.");

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nHow many times do you use your Air Fryer per day?");
        String dailyUses = entrada.nextLine();
        float dailyTime = Float.parseFloat(dailyUses);

        System.out.println("\nWhat is your average usage, in minutes?");
        String usageMinutes = entrada.nextLine();
        float totalMinutes = Float.parseFloat(usageMinutes);
        float splitTime = totalMinutes / 60;

        //The code below only receives converted values, for example:
        //DOES NOT RECEIVE 1500Wh
        //RECEIVES 1.5kWh

        System.out.println("\nWhat is the power of the Air Fryer?");
        String power = entrada.nextLine();
        power = power.replace(",", ".");
        float force = Float.parseFloat(power);
        float kwDay = splitTime * force;

        System.out.println("\nWhat is your kWh rate??");
        String kwFare = entrada.nextLine();
        kwFare = kwFare.replace(",", ".");

        float electricity = Float.parseFloat(kwFare);
        float dailyCost = kwDay * electricity;

        float dailyPrice = dailyCost * dailyTime;
        float monthlyPrice = dailyPrice * 30;

        System.out.println("\nYour monthly expense is R$" + monthlyPrice);

        entrada.close();

    }
}