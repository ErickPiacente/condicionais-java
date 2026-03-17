import java.util.Scanner;

public class Ex01 {
 public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o numero que deseja verificar se é PAR ou ÍMPAR: ");
    int numero = leia.nextInt();
    numero = numero % 2; 
    String resultado = (numero == 0) ? "O numero é PAR": "O numero é ÍMPAR";
    System.out.println(resultado);
    leia.close();
 }   
}
