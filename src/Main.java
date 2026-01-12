import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Valor do dolar: ");
        Conversao.dolar = sc.nextDouble();
        System.out.print("quantos dolar voce que compra: ");
        Conversao.compra = sc.nextDouble();
        System.out.println("o seu valor em reais foi: " + Conversao.calculo());

    }
}