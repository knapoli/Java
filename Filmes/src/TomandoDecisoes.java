public class TomandoDecisoes {
    public static void main(String[] args) {
        int anoLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "normal";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
