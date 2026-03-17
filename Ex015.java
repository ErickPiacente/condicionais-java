import java.util.Scanner;
public class Ex015 {
     public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    String usuario = "usuario";
    int senha = 1234;
    System.out.println("Digite seu usuário: ");
    String usuarioLogin = leia.next();
    System.out.println("Digite sua senha: ");
    int senhaLogin = leia.nextInt();
    String resultado = (usuarioLogin.equals(usuario) && senhaLogin == senha)? "Acesso aprovado":"Acesso negado";
    System.out.println(resultado);
    leia.close();
 }   
}
