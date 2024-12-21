public class FormatacaoString {
    public static void main(String [] args){
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;

        /*metodo format para inserir valores de variáveis em uma string sem a necessidade do uso excesivo do concatenador (+)
        usando os placeholders (%s, %d, %f)*/
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e ganhei R$ %.2f", nome, idade, valor));

        // metodo formatted  usado para inserir valores de variáveis em uma string text blocks usando os placeholders(%s,%d =, %f)
        String nomeAluno = "João";
        int  aulas = 4;
        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nomeAluno, aulas);
        System.out.println(mensagem);

        // concatenando uma string com um inteiro em uma mensagem final.
        String saudacao = "Olá, meu nome é";
        String nomePessoa = " Alice";
        String continuacaoMensagem = " e tenho ";
        int idadePessoa = 17;

        System.out.println(saudacao + nomePessoa + continuacaoMensagem + idadePessoa);
    }
}
