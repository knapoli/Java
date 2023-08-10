public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Malverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoLancamento;
        System.out.println(sinopse);
    }
}