import java.util.Scanner;
public class Ex03 {
         public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a sua nota: ");
    int numero = leia.nextInt();
    String resultado = (numero >= 7) ? "Aprovado": (numero >= 5) ? "Está de recuperação": "Reprovado";
    System.out.println(resultado);
    leia.close();
         }
}
