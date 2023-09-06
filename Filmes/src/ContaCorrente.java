public class ContaCorrente {

    public static void main(String[] args) {
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;
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
            System.out.println("");
            controle = false;
        }
    }
}
