import java.util.Scanner;

class C256{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        int w1 = sc.nextInt();
        int w2 = sc.nextInt();
        int w3 = sc.nextInt();
        long ans = 0;

        for(int a=1; a<=30; ++a){
            for(int b=1; b<=30; ++b){
                for(int d=1; d<=30; ++d){
                    for(int e=1; e<=30; ++e){
                        boolean flag = true;
                        int c = h1 - a - b;
                        int f = h2 - d - e;
                        int g = w1 - a - d;
                        int h = w2 - e - b;
                        if( c <= 0 || c > 28 ) flag = false;
                        if( f <= 0 || f > 28 ) flag = false;
                        if( g <= 0 || g > 28 ) flag = false;
                        if( h <= 0 || h > 28 ) flag = false;

                        int i1 = w3 - c - f;
                        int i2 = h3 - g - h;
                        if( i1 <= 0 || i1 > 28 ) flag = false;
                        if( i2 <= 0 || i2 > 28 ) flag = false;
                        if( i1 != i2 ) flag = false;

                        if(flag) ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}