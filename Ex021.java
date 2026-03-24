import java.util.Scanner;

public class Ex021{
   public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("----------------MENU DE SALAS----------------");
    System.out.println("Sala 1-- Sala Cientifica");
    System.out.println("Sala 2-- Sala de Organização documental");
    System.out.println("Sala 3-- Sala de tecnologia");
    System.out.println("Sala 4-- Sala de testes quimicos");
    System.out.println("---------------------------------------------");
    System.out.println("Escolha qual sala você quer entrar(Escolha pelo numero): ");
    int opcao = leia.nextInt();
    
    switch (opcao) {
      case 1:
          System.out.println("Sala 1-- Sala Cientifica");

                 int[][] matriz = new int[12][12];



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]" + "   ");
            }
            System.out.println();

        }
        break;
    }


    }

   



    

    

}



