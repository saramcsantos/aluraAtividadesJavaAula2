public class OperadorIncremento {
    public static void main(String [] args){
        // operador de ++pré-incremento
        int numero = 5;
        int resultado = ++numero; // numero é incrementado para 6 e atribuído a resultado

        System.out.println(numero);
        System.out.println(resultado);

        // operador de pós-incremento++
        int numeroNovo = 7;
        int resultadoNovo = numeroNovo++;

        System.out.println(numeroNovo); // numeroNovo é atribuído primeiro a variável resultado e somente depois é incorementado em 8
        System.out.println(resultadoNovo);

    }
}
