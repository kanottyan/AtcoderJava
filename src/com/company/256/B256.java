import java.util.Scanner;

class B256{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] nums = {0, 0, 0, 0};

        for(int i=0; i<N; ++i){
            int elem = sc.nextInt();
            arr[i] = elem;
        }

        int sum = 0;

        for(int i=0; i<N; ++i){
            nums[0] = 1;
            for(int j=3; j>=0; --j){
                if( j + arr[i] >= 4){
                    if(nums[j] == 0) continue;
                    sum += nums[j];
                    nums[j]= 0;
                }else {
                    nums[j + arr[i]] += nums[j];
                    nums[j] = 0;
                }
            }
        }

        System.out.println(sum);

    }
}