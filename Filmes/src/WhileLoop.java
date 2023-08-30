import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.printf("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        System.out.println("A media de avaliação do filme é de: " + mediaAvaliacao/totalDeNotas);
    }
}
