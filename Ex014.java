import java.util.Scanner;
public class Ex014 {
                 public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o primeiro numero: ");
    int numero1 = leia.nextInt();
     System.out.println("Informe o segundo numero: ");
    int numero2 = leia.nextInt();
     System.out.println("Informe o terceiro numero: ");
    int numero3 = leia.nextInt();
    String resultado = (numero1 >= numero2 && numero1 > numero3) ? "O numero 1 é o maior":
     (numero2 > numero1 && numero2 > numero3) ? "O numero 2 é o maior":
      (numero3 > numero1 && numero3 > numero2)?"O numero 3 é o maior": "Os numeros são todos iguais ";
    System.out.println(resultado);
    leia.close();
         }
}
