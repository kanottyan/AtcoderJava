import java.util.Scanner;

class B261{

    static int charToInt(char c){
        if(c == 'W') return 1;
        if(c == 'L') return -1;
        if(c == 'D') return 0;
        if(c == '-') return 10;
        return 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] table = new String[N];

        for(int i=0; i<N; ++i){
            table[i] = sc.next();
        }

        boolean f = true;
        for(int i=0; i<N; ++i){
            for(int j=0; j<N; ++j){
                if(i<j) continue;
                    char c1 = table[i].charAt(j);
                    char c2 = table[j].charAt(i);
                    int score = charToInt(c1) + charToInt(c2);
                    if(i == j){
                        if(c1 != '-') f = false;
                        if(c2 != '-') f= false;
                    }else{
                        if(c1 == '-') f = false;
                        if(c2 == '-') f= false;
                        if(score != 0) f = false;
                    }
            }
        }

        if(f == true){
            System.out.println("correct");
        }else {
            System.out.println("incorrect");
        }
    }
}