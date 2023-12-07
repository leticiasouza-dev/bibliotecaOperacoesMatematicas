public class OperacoesMatematicas {

    //OPERAÇÕES BÁSICAS DA MATEMÁTICA:

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

    // CALCULOS DE ÁREA:

    public static double calculoAreaRetangulo(double comprimento, double largura){
        double areaRetangulo = 0;
        areaRetangulo += comprimento * largura;

        return  areaRetangulo;
    }

    public static double calculoAreaQuadrado(double lado){
        double areaQuadrado = lado * lado;
         return areaQuadrado;
    }


    // CALCULOS DE PERIMETRO:

    public static double calculoPerimetroRetangulo(double comprimento, double largura){
        double perimetroRetangulo = 0;

        perimetroRetangulo += 2 * (comprimento + largura);
        return perimetroRetangulo;
    }

    public static double calculoPerimetroQuadrado(double lado){
        double perimetroQuadrado = 0;

        perimetroQuadrado += 4 * lado;
        return perimetroQuadrado;
    }

    // CALCULOS DE VOLUME:

    public  static  double calculoVolumePrismaRetangular(double comprimento, double largura, double altura){
        double volumePrismaRetangular = 0;

        volumePrismaRetangular += comprimento * largura * altura;
        return volumePrismaRetangular;
    }

    // CALCULOS DE JUROS:

    public static double calculoJurosSimples(double quantiaprincipal, double taxaDeJuros, int tempoEmAnos){
        double montanteDeJuros = 0;
        montanteDeJuros += quantiaprincipal * taxaDeJuros * tempoEmAnos;

        return montanteDeJuros;
    }


    public  static double calcularJurosCompostos(double quantiaprincipal, double taxaDeJuros, int numeroDeCompostosAno, int tempoEmAnos){
        double montanteDeJuros = 0;

        montanteDeJuros += quantiaprincipal * Math.pow(1 + taxaDeJuros / numeroDeCompostosAno, numeroDeCompostosAno * tempoEmAnos);
        return  montanteDeJuros;
    }


}
