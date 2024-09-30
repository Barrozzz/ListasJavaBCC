import java.util.Scanner;

public class Ex04_09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um Texto: ");
        String texto = leia.nextLine();
        
        char[] c = texto.toCharArray();
        
        System.out.println("\nCaracteres do Texto: ");
        for (char caracter : c){
            System.out.println(caracter);
        }
        
        leia.close();
    }
}
