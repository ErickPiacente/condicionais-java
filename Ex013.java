import java.util.Scanner;
public class Ex013 {
       public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

          System.out.println("Digite o numero do mês: ");
            int mes = leia.nextInt();

            switch (mes) {
                case 1, 2, 3 :
                    System.out.println("A estação é verão");
                    break;

                case 4, 5, 6 :
                    System.out.println("A estação é outono");
                    
                    break;
                case 7,8,9 :
                    System.out.println("A estação é inverno");
                    
                    break;
                case 10, 11, 13 :
                    System.out.println("A estação é primavera(a melhor)");
                    
                    break;
                    default:
                        System.out.println("O numero do mês informado é invalido, digite numeros netre 1 e 12");
                        break;
                        
            }
        leia.close();
        }
    }
