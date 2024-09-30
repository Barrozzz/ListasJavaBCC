import java.util.Scanner;

public class Ex04_10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] data = new int[3]; 

        System.out.print("Digite uma Data (dd/mm/aaaa): ");
        String dataTexto = leia.next();

        String[] partes = dataTexto.split("/");
        data[0] = Integer.parseInt(partes[0]);
        data[1] = Integer.parseInt(partes[1]);
        data[2] = Integer.parseInt(partes[2]); 

        if (data[0] > 31 || data[0] < 1 || data[1] > 12 || data[1] < 1 || data[2] < 1) {
            System.out.println("Data Inválida");
        } else {
            System.out.println("Data Válida: " + data[0] + "/" + data[1] + "/" + data[2]);
        }

        leia.close();
    }
}
