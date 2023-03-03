package Calculate;


public class Main {
    public static void main(String[] args) {

        Calculate calculateComplex = new CalculateComplex();
        Complex a = new Complex(1, 4);
        Complex b = new Complex(3, 2);


        System.out.println("Комплексное вычисление чисел:");
        System.out.println(calculateComplex.sum(a,b).toString());
        System.out.println(calculateComplex.dif(a,b).toString());
        System.out.println(calculateComplex.mul(a,b).toString());
        System.out.println(calculateComplex.div(a,b).toString());

        Calculate calculateRatio = new CalculateRatio();
        Ratio c = new Ratio(10);
        Ratio d = new Ratio(5);

        System.out.println("Рациональное вычесление чисел:");
        System.out.println(calculateRatio.sum(c,d).toString());
        System.out.println(calculateRatio.dif(c,d).toString());
        System.out.println(calculateRatio.mul(c,d).toString());
        System.out.println(calculateRatio.div(c,d).toString());


    }
}