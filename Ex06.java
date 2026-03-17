import java.util.Scanner;

public class Ex06 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o seu ano: ");
    int ano = leia.nextInt();
    String resultado = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "Seu ano é bissexto": "Seu ano não é bissexto";
    System.out.println(resultado);
    leia.close();
         }
}
