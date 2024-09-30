import java.util.Scanner;

public class Ex03_28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double temp, maior, menor, soma, media;
        int cont;
        
        maior = -9999;
        menor = 9999;
        soma = 0;
        cont = 0;
        
        while (true) {
            System.out.print("Informe uma Temperatura (999 para Sair): ");
            temp = leia.nextDouble();
            if (temp == 999) {
            	break;
            }
            
            soma += temp;
            cont++;
            
            if (temp > maior) {
            	maior = temp;
            }
            if (temp < menor) { 
            	menor = temp;
            
            }
        }
        
        if (cont > 0) {
            media = soma / cont;
            System.out.println("\nMaior Temperatura: " + maior);
            System.out.println("Menor Temperatura: " + menor);
            System.out.println("Média das Temperaturas: " + media);
        } else {
            System.out.println("\nNenhuma temperatura foi registrada");
        }
        
        leia.close();
    }
}
