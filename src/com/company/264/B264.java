import java.util.Scanner;

class B264{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        boolean[][] table = new boolean[15][15];

        int times = 7;
        boolean flag = true;

        while(times >= 0){
            int sx = 7 - times;
            int sy = 7 - times;

            int tx = 14-sx;
            int ty = sy;

            int ux = 14-sx;
            int uy = 14-sy;

            int vx = sx;
            int vy = 14-sy;
            for(int i=sy; i<=vy; ++i){
                table[sx][i] = flag;
            }
            for(int i=sx; i<=tx; ++i){
                table[i][sy] = flag;
            }

            for(int i=ty; i<=uy; ++i){
                table[tx][i] = flag;
            }

            for(int i=vx; i<=ux; ++i){
                table[i][vy] = flag;
            }
            times--;
            flag = !flag;
        }
        R--;
        C--;

        if(table[R][C]){
            System.out.println("black");
        }else {
            System.out.println("white");
        }

    }
}