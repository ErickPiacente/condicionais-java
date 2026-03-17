import java.util.Scanner;
public class Ex02 {
      public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o numero: ");
    int numero = leia.nextInt();
    System.out.println("Informe o numero: ");
    int numero2 = leia.nextInt(); 
    String resultado = (numero > numero2) ? numero+" É o maior numero": (numero2 > numero) ? numero2+" É o maior numero": "Os numeros são iguais";
    System.out.println(resultado);
    leia.close();
 }   
}
