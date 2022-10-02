import java.util.Scanner;

class A248{
    public static void main(String[] args) {
        int sum = 45;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(char c : s.toCharArray()){
            int i = c - '0';
            sum -= i;
        }
        System.out.println(sum);
    }
}