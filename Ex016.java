import java.util.Scanner;
public class Ex016 {
                public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o seu numero: ");
    int numero = leia.nextInt();
    String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "Seu numero é multiplo de 3 e de 5": 
    (numero % 3 == 0 && numero % 5 !=0) ? "Seu numero é multilpo somente do 3":
    (numero % 5 == 0 && numero % 3 != 0)? "Seu numero é multiplo apenas de 5":
    "Seu numero não é multiplo de nenhum dos dois";
    System.out.println(resultado);
    leia.close();
         }
}
