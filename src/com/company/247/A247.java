import java.util.Scanner;

class A247{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        sb.append('0');

        for(int i=0; i<s.length()-1; ++i){
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}