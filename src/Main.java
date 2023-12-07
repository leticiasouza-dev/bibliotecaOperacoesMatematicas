// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // TESTE DE OPERAÇÕES BÁSICAS:
        System.out.println(OperacoesMatematicas.adicao(100,100,150));
        System.out.println(OperacoesMatematicas.subtracao(8,3));
        System.out.println(OperacoesMatematicas.divisao(4,2));
        System.out.println(OperacoesMatematicas.multiplicacao(5, 2));

        //TESTE DE OPERAÇÃO DE CALCULO DE ÁREA:
        System.out.println(OperacoesMatematicas.calculoAreaRetangulo(15, 5));
        System.out.println(OperacoesMatematicas.calculoAreaQuadrado(5));

        //TESTE DE OPERAÇÃO DE CALCULO DE PERIMETRO:
        System.out.println(OperacoesMatematicas.calculoPerimetroRetangulo(5, 8));
        System.out.println(OperacoesMatematicas.calculoPerimetroQuadrado(5));


        //TESTE DE OPERAÇÃO DE CALCULOS DE VOLUME:
        System.out.println(OperacoesMatematicas.calculoVolumePrismaRetangular(5, 5, 5));
    }
}