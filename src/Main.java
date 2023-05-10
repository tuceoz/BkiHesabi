import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kg, m, bki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lüttfen boyunuzu metre cinsinden girin : ");
        m = input.nextDouble();

        System.out.print("Lüttfen kilonuzu girin : ");
        kg = input.nextDouble();

        bki = kg / (m * m);

        System.out.println("Bki'niz : " + bki);



    }
}