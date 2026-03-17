import java.util.Scanner;

public class Ex018 {
            public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

          System.out.println("Informe um numero: ");
            int numero = leia.nextInt();

            switch (numero) {
                case 1 :
                    System.out.println("O numero 1 em romano é I");
                    break;
                case 2 :
                    System.out.println("O numero 2 em romano é II");
                    break;
                case 3 :
                    System.out.println("O numero 3 em romano é III");
                    break;
                case 4 :
                    System.out.println(" O numero 4 em romano é IV");
                    
                    break;
                case 5 :
                    System.out.println(" O numero 5 em romano é V");
                    
                    break;
                case 6 :
                    System.out.println(" O numero 6 em romano é VI");
                    
                    break;
                case 7 :
                    System.out.println(" O numero 7 em romano é VII");
                    
                    break;
                case 8 :
                    System.out.println(" O numero 8 em romano é VIII");
                    
                    break;
                case 9 :
                    System.out.println(" O numero 9 em romano é IX");
                    
                    break;
                case 10 :
                    System.out.println(" O numero 10 em romano é X");
                    
                    break;    

                    default:
                        System.out.println("O seu numero não esta entre 1 e 10");
                        break;


            }
            leia.close();
    }
}
