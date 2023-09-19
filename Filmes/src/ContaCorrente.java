import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 150;
        boolean controle = true;

        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:        " + nome);
        System.out.println("Tipo Conta:  " + tipoConta);
        System.out.printf("Saldo:       %.2f", saldo);
        System.out.println("");
        System.out.println("******************************");

        System.out.println("");
        System.out.println("");

        while(controle == true) {
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1 Consultar saldos");
            System.out.println("2 Receber valor");
            System.out.println("3 Transferir ");
            System.out.println("4 Sair");
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            Scanner entrada = new Scanner(System.in);
            int numero = entrada.nextInt();

            switch (numero) {
                case 1:
                    System.out.printf("O Saldo atual é: %.2f", saldo);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double recebeValor = entrada.nextDouble();
                    while (recebeValor <= 0) {
                        System.out.println("O valor deve ser maior que zero:");
                        recebeValor = entrada.nextDouble();
                    }
                    saldo =+ recebeValor;
                    System.out.printf("Saldo atualizado: %.2f", saldo);
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("Informe o valor que deseja transferir: ");
                    double retiraValor = entrada.nextDouble();
                    while (retiraValor <= 0) {
                        System.out.println("O valor deve ser maior que zero:");
                        retiraValor = entrada.nextDouble();
                    }
                    if (retiraValor > saldo){
                            System.out.println("Saldo insuficiente para esta transação");
                    } else {
                        saldo = saldo - retiraValor;
                        System.out.printf("Saldo atualizado: %.2f", saldo);
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o banco XYZ");
                    controle = false;
                    break;
                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
            }
        }
    }
}
