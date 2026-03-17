import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("1---SOMA");
        System.out.println("2---SUBTRAÇÃO");
        System.out.println("3---MULTIPLICAÇÃO");
        System.out.println("4---DIVISÃO");
          System.out.println("Escolha uma opção de 1 a 4: ");
            int opcao = leia.nextInt();
            System.out.println("Informe o numero: ");
            int numero = leia.nextInt();
            switch (opcao) {
                case 1 :
                    numero = numero + numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 2 :
                    numero = numero - numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 3 :
                    numero = numero * numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 4 :
                    if(numero == 0){
                        System.out.println("Não é possivel dividir por 0");
                    }
                    else{
                    numero = numero / numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    }
                    break;
                    default:
                        System.out.println("O numero informado não é uma opção");
                        break;


            }
            leia.close();
    }
}
