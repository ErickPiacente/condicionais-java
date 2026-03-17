import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a sua nota: ");
    int numero = leia.nextInt();
    String resultado = (numero <= 10 && numero >= 9) ? "Sua nota é A": (numero <= 8 && numero >= 7) ? "Sua nota é B":(numero <= 6 && numero >= 5) ? "Sua nota é C":(numero <= 4 && numero >= 0)? "Sua nota é D": "Sua nota é invalida";
    System.out.println(resultado);
    leia.close();
         }
}
