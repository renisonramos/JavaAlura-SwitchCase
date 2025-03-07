public class Main {
    public static void main(String[] args) {
        System.out.println("Switch Case");
        /*
        Uma alternativa ao if/else é o switch case, que é uma estrutura de controle de fluxo que permite executar diferentes ações com base no valor de uma expressão. É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados. A sintaxe do switch case em Java é a seguinte:
        */

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

        /*Nesse exemplo, a expressão é a variável dia, que contém o valor 3. O switch case verifica o valor da variável dia e executa o código correspondente ao caso em que dia é igual a 3. O resultado será a impressão no console: "O dia 3 é terça-feira".
         Vantagens do switch case:
         Em resumo, o switch case torna o código mais fácil de entender e mais legível, em comparação ao if/else, especialmente quando há várias condições possíveis. */


    }
}