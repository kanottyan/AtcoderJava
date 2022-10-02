import java.util.Scanner;

class A266{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);

        int len = s.length();
        int half = (len+1)/2;

        System.out.println(sb.charAt(half-1));

    }
}