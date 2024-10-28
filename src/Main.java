import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    new Main();
    }

    public Main(){

    double a,b,c,x;

    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##"); // Formatar resultados com duas casas decimais

    System.out.println("Vamos calcular o baskhara!!!");

    System.out.println("Por favor digite o valor de a: ");
    a = entrada.nextDouble();
    System.out.println("Por favor digite o valor de b: ");
    b = entrada.nextDouble();
    System.out.println("Por favor digite o valor de c: ");
    c = entrada.nextDouble();

        double valorDelta = getDelta(a,b,c);
        System.out.println("O Valor de delta é: " + valorDelta);

        if(valorDelta == 0){
            x= -b/(2*a);
            System.out.println("Como o delta é 0 existe apenas uma UNICA RAIZ REAL ou seja, uma solução repetida o valor é: " + x);
        } else if (valorDelta > 0) {
            System.out.println("O resultado do X1 é: " + df.format(getX1(a,b,c)));
            System.out.println("O resultado do X2 é: " + df.format(getX2(a,b,c)));
        }else {
            System.out.println("Como o delta é negativo não possui raizes Reais");
        }

    }

    //                               ***************COMEÇO DAS FUNÇÕES**************

    //CALCULANDO O DELTA
    public double getDelta(double deltaA, double deltaB,double deltaC){
        return( (deltaB*deltaB) - 4*deltaA*deltaC);
    }

    //CALCULANDO O X1
    public double getX1(double deltaA, double deltaB, double deltaC){

    double resultadoDelta = getDelta(deltaA,deltaB,deltaC);
    double x1 = ( (-deltaB + (Math.sqrt(resultadoDelta))) / (2*deltaA) );

    return x1;
    }

    //CALCULANDO O X2
    public  double getX2(double deltaA, double deltaB, double deltaC){

    double resultadoDelta = getDelta(deltaA,deltaB,deltaC);
    double x2 = ( (-deltaB - (Math.sqrt(resultadoDelta))) / (2*deltaA) );

    return x2;
    }


}