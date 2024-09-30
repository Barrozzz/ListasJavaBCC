import java.util.Scanner;

public class Ex04_11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite Palavras ';': ");
        String entrada = leia.next();
        
        String[] palavras = entrada.split(";");
        
        System.out.println("\nPalavras Separadas: ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        
        leia.close();
    }
}
