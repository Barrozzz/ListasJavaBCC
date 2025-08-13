import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GeradorGraficoGoogleCharts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         System.out.print("Digite a quantidade de números da amostra: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o valor mínimo: ");
        int min = sc.nextInt();

        System.out.print("Digite o valor máximo: ");
        int max = sc.nextInt();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt((max - min) + 1) + min;
        }
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<head>\n");
        html.append("  <meta charset=\"UTF-8\">\n");
        html.append("  <title>Gráfico Google Charts</title>\n");
        html.append("  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
        html.append("  <script type=\"text/javascript\">\n");
        html.append("    google.charts.load('current', {'packages':['corechart']});\n");
        html.append("    google.charts.setOnLoadCallback(drawChart);\n");
        html.append("    function drawChart() {\n");
        html.append("      var data = google.visualization.arrayToDataTable([\n");
        html.append("        ['Índice', 'Valor'],\n");

        for (int i = 0; i < numeros.length; i++) {
            html.append("        [").append(i + 1).append(", ").append(numeros[i]).append("]");
            if (i < numeros.length - 1) {
                html.append(",");
            }
            html.append("\n");
        }

        html.append("      ]);\n");
        html.append("      var options = {\n");
        html.append("        title: 'Gráfico de Linha - Amostra Aleatória',\n");
        html.append("        curveType: 'function',\n");
        html.append("        legend: { position: 'bottom' }\n");
        html.append("      };\n");
        html.append("      var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\n");
        html.append("      chart.draw(data, options);\n");
        html.append("    }\n");
        html.append("  </script>\n");
        html.append("</head>\n");
        html.append("<body>\n");
        html.append("  <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\n");
        html.append("</body>\n");
        html.append("</html>\n");
        try (FileWriter arquivo = new FileWriter("grafico.html")) {
            arquivo.write(html.toString());
            System.out.println("Arquivo 'grafico.html' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
