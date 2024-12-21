public class Variaveis {
    public static void main(String [] args){
        System.out.println("Filme: Top Gun: Maverik");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double notaDoFilme = 8.1;
        System.out.println("O filme Top Gun: Maverik, lançado em: " +anoDeLancamento+ ", teve a nota: " +notaDoFilme);

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        // usando Text Blocks para escrever uma string com mais de uma linha e imprimir tudo em apenas um Sout
        String sinopse = """
                Filme: Top Gun: Maverik.
                Filme de aventura com galã dos anos 80.
                Ano de lançamento:
                """ +anoDeLancamento;
        System.out.println(sinopse);

        /*usando operando casting (conversão de tipo de dados) para converter um dado double para um dado int,
        nesse caso haverá perda de informação, ou seja, o valor double será convertido para inteiro
        excluindo a casa decimal*/
        int classificacao = (int) media / 2;
        System.out.println(String.format("A classificação do filme foi: %d", classificacao));
    }
}
