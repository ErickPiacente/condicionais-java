import java.util.Scanner;
public class Ex020 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
        System.out.println("1--Pedra");
        System.out.println("2--Papel ");
        System.out.println("3--Tesoura ");
            System.out.println("Informe sua escolha jogador 1: ");
    int escolha = leia.nextInt();
            System.out.println("Informe sua escolha jogador 2: ");
    int escolha2 = leia.nextInt();
    String resultado = (escolha == 1 && escolha2 == 2)? "O jogador 2 ganhou":
     (escolha == 2 && escolha2 == 1)? "O jogador 1 ganhou":
     (escolha == 1 && escolha2 == 3)? "O jogador 1 ganhou":
     (escolha == 3 && escolha2 == 1)? "O jogador 2 ganhou":
     (escolha == 2 && escolha2 == 3)? "O jogador 2 ganhou":
     (escolha == 3 && escolha2 == 2)?"O jogador 1 ganhou":"Valor invalido";


     System.out.println(resultado);

    leia.close();
         }
}
