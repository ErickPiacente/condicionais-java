import java.util.Scanner;

public class Ex07 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o primeiro lado: ");
    int lado1 = leia.nextInt();
     System.out.println("Informe o segundo lado: ");
    int lado2 = leia.nextInt();
     System.out.println("Informe o terceiro lado: ");
    int lado3 = leia.nextInt();
    String resultado = (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) ? "Seu triangulo é equilatero":
     (lado1 != lado2 && lado1 == lado3) || (lado2 != lado3 && lado2 == lado1) || (lado1 != lado3 && lado3 == lado2) ? "Seu triangulo é isosceles":
      "Seu triangulo é escaleno";
    System.out.println(resultado);
    leia.close();
         }
}
