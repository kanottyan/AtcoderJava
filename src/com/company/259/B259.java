import java.util.Scanner;

class B259{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double d = sc.nextDouble();
        double rad = Math.toRadians(d);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);

        double ansa = a * cos - b*sin;
        double ansb = a*sin + b * cos;

        System.out.println(ansa + " " + ansb);


    }
}