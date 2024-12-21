public class ComparacaoStrings {
    public static void main(String [] args){
        String escola = "Alura";

        // metodo equalsIgnoreCase não considera maiúsculas e minúsculas na verificação de string, logo o resultado será true
        if (escola.equalsIgnoreCase("alura")){
            System.out.println("O nome da escola está correto!");
        }else{
            System.out.println("O nome da escola não é esse! Verifique o nome e tente novamente!");
        }

        // metodo equals considera maiúsculas e minúsculas na verificação de string, logo o resultado será false
        if (escola.equals("alura")){
            System.out.println("O nome da escola está correto!");
        }else{
            System.out.println("O nome da escola está incorreto! Verifique a digitação.");
        }
    }
}
