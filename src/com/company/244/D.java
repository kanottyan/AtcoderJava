import java.util.Scanner;

class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();

        String T1 = sc.next();
        String T2 = sc.next();
        String T3 = sc.next();

        int diff = 0;
        if(S1.equals(T1)) diff++;
        if(S2.equals(T2)) diff++;
        if(S3.equals(T3)) diff++;

        if(diff == 0 || diff == 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}