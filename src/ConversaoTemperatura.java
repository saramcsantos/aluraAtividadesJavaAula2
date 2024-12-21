public class ConversaoTemperatura {
    public static void main (String [] args){
        double temperaturaCelsius = 28.3;
        double conversaoTemperatura = (temperaturaCelsius * 1.8) + 32;

        String resultadoConversao = """
                A temperatura em graus celsius é %.1f,
                convertendo a temperatura para graus Fahrenheit
                o resultado será %d
                """.formatted(temperaturaCelsius, (int) conversaoTemperatura);
        System.out.println(resultadoConversao);
    }
}
