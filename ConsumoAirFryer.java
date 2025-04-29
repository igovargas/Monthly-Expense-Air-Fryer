import java.util.Scanner;

public class ConsumoAirFryer {

    static int dias = 365;
    static float hora = 60, valorDiario, kwDia, valorMensal;

    public static void main(String[] args) {
        System.out.println("Olá, vamos calcular o quanto você gasta com a sua AirFryer!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Agora digite quantas vezes você utiliza suas Air Fryer por dia:");
        String usoDiario = entrada.nextLine();
        float tempoDiario = Float.parseFloat(usoDiario);

        System.out.println("Agora digite em minutos quanto tempo em média sua Air Fryer fica funcionado toda vez que você utiliza ela:");
        String usoMinutos = entrada.nextLine();
        float totalMinutos = Integer.parseInt(usoMinutos);
        float horaDividida = totalMinutos / hora;

        //O código abaixo recebe somente valores convertidos, por exemplo:
        //NÃO RECEBE 1500Wh
        //RECEBE 1,5kWh
        System.out.println("Digite a potência da sua Air Fryer:");
        String potenciaAirFryer = entrada.nextLine();
        potenciaAirFryer = potenciaAirFryer.replace(",", ".");
        float potenciaAir = Float.parseFloat(potenciaAirFryer);

        float kwDia = horaDividida * potenciaAir;
        System.out.println("O valor total do kW por dia é:" + kwDia);

        System.out.println("Digite a tarifa do seu kWh:");
        String tarifaKw = entrada.nextLine();
        tarifaKw = tarifaKw.replace(",", ".");

        float tarifaLuz = Float.parseFloat(tarifaKw);
        float custoDiario = kwDia * tarifaLuz;
        System.out.println(custoDiario);

        valorDiario = custoDiario * tempoDiario;
        valorMensal = valorDiario * 30;

        System.out.println("Seu gasto mensal é de R$" + valorMensal);

        entrada.close();

    }
}