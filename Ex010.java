import java.util.Scanner;
public class Ex010 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe um numero: ");
    int numero = leia.nextInt();

    String resultado = (numero > 0) ? "Positivo": (numero < 5) ? "Negativo": "Nulo";
    System.out.println("Seu numero é "+resultado);
    leia.close();
         }
}
