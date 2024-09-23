import java.util.Scanner;

public class Ex02_21 {
    public static void main(String[] args) {
        int dia, mes, ano;
        boolean valido = true;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma Data (dd/mm/aaaa): \n");
        dia = leia.nextInt();
        System.out.print("/\r\n");
        mes = leia.nextInt();
        System.out.print("/\r\n");
        ano = leia.nextInt();

        

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        	valido = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        	valido = false;
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia > 29) {
                	valido = false;
                }
            } else if (dia > 28) {
            	valido = false;
            }
        }
        if(ano > 2024) {
        	valido = false;
        }

        if (valido) {
            System.out.println("\nA Data " + dia + "/" + mes + "/" + ano  + " é Válida");
        } else {
            System.out.println("\nA Data " + dia + "/" + mes + "/" + ano  + " é Inválida");
        }

        leia.close();
    }
}
