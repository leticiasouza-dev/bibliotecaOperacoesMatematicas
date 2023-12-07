public class operacoesMatematicas {

    public static double adicao(double... valores){ // assim o usuário pode adicionar varios numeros
        int soma = 0;
        for (double valor : valores){
            soma += valor;
        }

        return soma;
    }

    public static double subtracao(double valor1, double valor2){
        return  valor1 - valor2;
    }

    public static double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;
    }

    public static double divisao(double dividendo, double divisor){
        return dividendo / divisor;
    }

    // calculos de áreas

    public static double calculoAreaRetangulo(double comprimento, double largura){
        double areaRetangulo = 0;
        areaRetangulo += comprimento * largura;

        return  areaRetangulo;
    }


}
