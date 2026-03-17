import java.util.Scanner;

public class Ex04 {
               public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a temperatura: ");
    int temperatura = leia.nextInt();
    String resultado = (temperatura < 15) ? "Frio": (temperatura >= 15 && temperatura <= 25) ? "Agradavel": "Quente";
    System.out.println("Hoje está "+resultado);
    leia.close();
         }
}
