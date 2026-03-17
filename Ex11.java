import java.util.Scanner;
public class Ex11 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a sua idade: ");
    int idade = leia.nextInt();
    String resultado = (idade <= 12) ? "Você paga 10,00$": (idade > 12 && idade < 60) ? "Você paga inteira que é 20,00$": "Você paga meia que é 10,00$";
    System.out.println(resultado);
    leia.close();
         }
}
