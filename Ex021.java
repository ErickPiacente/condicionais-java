import java.util.Scanner;
import java.util.Arrays;
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
    char[][][] matriz = new char[4][12][12];
    switch (opcao) {
      case 1:
        

          System.out.println("Sala 1-- Sala Cientifica");
          System.out.println(" 1     2     3     4     5     6     7     8     9    10    11    12");
  for(int m = 0; m < 1; m++){

        for (int i = 0; i < matriz[m].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[m][i].length; j++) {
                matriz[m][i][j] = 'L';
                
                
                System.out.print("["+matriz[m][i][j]+"]" + "   ");
            }
            System.out.println();

        }
    }
    }


                 





    }

   



    

    

}



