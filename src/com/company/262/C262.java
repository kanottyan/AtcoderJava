import java.util.Scanner;

class C262{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; ++i){
            a[i] = (sc.nextInt()-1);
        }

        long interchangeGroupCount = 0;
        long sameIdxGroupCount = 0;
        long ans = 0;

        for(int i=0; i<N; ++i){
            if(i == a[i]) {
                sameIdxGroupCount++;
            }else {
                if( i == a[a[i]] && i < a[i]){
                    interchangeGroupCount++;
                }
            }
        }

        ans += sameIdxGroupCount*(sameIdxGroupCount-1)/2;

        ans += interchangeGroupCount;
        System.out.println(ans);
    }
}