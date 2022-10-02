import java.util.Scanner;

class B246{
    public static void main(String[] args) {
        double A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();

        double len = Math.sqrt(A*A + B*B);
        Double x = A/len;
        Double y = B/len;

        System.out.printf( "%.10f", x );
        System.out.println();
        System.out.printf( "%.10f", y );

    }
}