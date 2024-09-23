import java.util.Scanner;

public class Ex02_29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char resposta;
        int respostasPositivas = 0;

        System.out.println("Telefonou para a Vítima? (s/n)");
        resposta = leia.nextLine().charAt(0);
        if(resposta == 's' || resposta == 'S') {
        	respostasPositivas++; 
        }

        System.out.println("Esteve no Local do Crime? (s/n)");
        resposta = leia.nextLine().charAt(0);
        if(resposta == 's' || resposta == 'S') {
        	respostasPositivas++; 
        }

        System.out.println("Mora Perto da Vítima? (s/n)");
        resposta = leia.nextLine().charAt(0);
        if(resposta == 's' || resposta == 'S') {
        	respostasPositivas++; 
        }

        System.out.println("Devia para a Vítima? (s/n)");
        resposta = leia.nextLine().charAt(0);
        if(resposta == 's' || resposta == 'S') {
        	respostasPositivas++; 
        }

        System.out.println("Já Trabalhou com a Vítima? (s/n)");
        resposta = leia.nextLine().charAt(0);
        if(resposta == 's' || resposta == 'S') {
        	respostasPositivas++; 
        }

        if (respostasPositivas == 2) {
            System.out.print("Classificação: Suspeito");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.print("Classificação: Cúmplice");
        } else if (respostasPositivas >= 5) {
            System.out.print("Classificação: Assassino");
        } else {
            System.out.print("Classificação: Inocente");
        }

        leia.close();
    }
}
