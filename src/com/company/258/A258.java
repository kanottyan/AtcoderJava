import java.util.Scanner;

class A258{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int minutes = 21 + K/60;
        int seconds = K%60;

        if(seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        }else {
            System.out.println(minutes + ":" + seconds);
        }

    }
}