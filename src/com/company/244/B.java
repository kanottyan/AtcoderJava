import java.util.Scanner;

class B {
    public static void main(String[] args) {
        int[] dir = {0, 1, 2, 3};
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String T = sc.next();

        int x = 0;
        int y = 0;
        int d = 0;

        for(int i=0; i<T.length(); ++i){
            char c = T.charAt(i);
            if(c == 'R'){
                d++;
            }else{
                x += dx[dir[d%4]];
                y += dy[dir[d%4]];
            }
        }
        System.out.println(x + " " + y);
    }
}