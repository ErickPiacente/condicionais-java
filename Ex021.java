import java.util.Scanner;
import java.util.Arrays;
public class Ex021{
   public static void main(String[] args){
    
    Scanner leia = new Scanner(System.in);
        System.out.println("----------------MENU DE SALAS----------------");
    System.out.println("Sala 1-- Sala Cientifica");
    System.out.println("Sala 2-- Sala de TCC");
    System.out.println("Sala 3-- Sala de apresentações");
    System.out.println("Sala 4-- Sala de monitoria educacional");
    System.out.println("Sala 5-- Sala facultativa");
    System.out.println("Sala 6-- Sala de debate politico");
    System.out.println("Sala 7-- Sala Devisate");
    System.out.println("Sala 8-- Sala de provas");
    System.out.println("---------------------------------------------");
    System.out.println("Escolha qual sala você quer entrar(Escolha pelo numero): ");
    int opcao = leia.nextInt();
    char[][][] matriz = new char[8][12][12];
    switch (opcao) {
      case 1:
int enquanto;
int opcao2;
do{ 

          System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
  for(int m = 0; m < 1; m++){

        for (int i = 0; i < matriz[m].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[m][i].length; j++) {
                matriz[m][i][j] = 'L';
                System.out.println("\t MENU DE CADEIRAS");
                System.out.println("\t  1--Reservar uma cadeira");
                System.out.println("\t  2--Comprar uma cadeira");
                System.out.println("Escolha entre 1 e 2");
                opcao2 = leia.nextInt();
                switch(opcao2){
                    case 1:
                        System.out.println("Mostre");
                }
                
                System.out.print("["+matriz[m][i][j]+"]" + "   ");

            }
            System.out.println();
            



        }
    }
           System.out.println("Quer continuar o programa? digite 1 se quiser continuar;\nSe quiser sair digite qualquer numero: ");
        enquanto = leia.nextInt();
    }while(enquanto == 1);
    break;
              case 2:
        

          System.out.println("Sala 2-- Sala de TCC");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
          case 3:
        

          System.out.println("Sala 3-- Sala de apresentações");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
          case 4:
        

          System.out.println("Sala 4-- Sala de monitoria educacional");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
          case 5:
        

          System.out.println("Sala 5-- Sala facultativa");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
              case 6:
        

          System.out.println("Sala 6-- Sala de debate politico");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
          case 7:
        

          System.out.println("Sala 7-- Sala Devisate");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
          case 8:
        

          System.out.println("Sala 8-- Sala de provas");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");
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
    break;
    default:
        System.out.println("Você digitou uma sala que não existe, digite dentre as opcões do menu.");
    }


                 





    }

   



    

    

}



