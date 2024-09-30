import java.util.Scanner;

public class Ex03_15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 38;

        for (int i = 1; i < 38; i++) {
        	System.out.print("(" + (n-1) + "*" + n + ")/" + i + "; ");
        	n--; 
        }
            

        
        leia.close();
    }
}
