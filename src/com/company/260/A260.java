import java.util.Scanner;

class
A260{
    public static void main(String[] args) {
        int[] alphabet = new int[26];
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        alphabet[S.charAt(0) - 'a']++;
        alphabet[S.charAt(1) - 'a']++;
        alphabet[S.charAt(2) - 'a']++;

        for(int i=0; i<26; ++i){
            if(alphabet[i] == 1){
                char ans = (char) ((char)i + 'a');
                System.out.println(ans);
                return ;
            }
        }

        System.out.println(-1);
    }
}