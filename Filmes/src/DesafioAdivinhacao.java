import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(10);
        Scanner lerNumero = new Scanner(System.in);
        int numeroUsuario = -1;
        int chances = 5;

        int contador = 0;
        while ( contador < 5) {
            System.out.println("Digite um numero entre 0 e 100, voce tem " + chances + " chances");
            numeroUsuario = lerNumero.nextInt();
            chances--;

            if (numeroUsuario != numeroAleatorio) {
                if(numeroUsuario > numeroAleatorio){
                    System.out.println("Digite um número menor");
                } else {
                    System.out.println("Digite um número maior");
                }
            } else {
                break;
            }

            contador++;
        }
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Muito bom, parabéns você acertou!! O número era " + numeroAleatorio);
        } else {
            System.out.println("Ops, infelizmente você não acertou, o número era: " + numeroAleatorio);
        }
    }
}
