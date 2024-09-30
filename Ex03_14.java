import java.util.Scanner;

public class Ex03_14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int m = 1;

        System.out.print("Digite o Valor de N: ");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
        	System.out.print(i + "/" + m + "; ");
        	m += 2; 
        }
            
        leia.close();
    }
}
