import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String s = sc.next();

        System.out.println(s.charAt(s.length() - 1));
    }


}