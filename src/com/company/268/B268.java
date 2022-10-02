import java.util.Scanner;

class B268{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        if(S.length() > T.length()){
            System.out.println("No");
            return;
        }

        for(int i=0; i<S.length(); ++i){
            if(S.charAt(i) != T.charAt(i)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }
}