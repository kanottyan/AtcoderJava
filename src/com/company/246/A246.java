import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class A246{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        Set<Integer> x = new HashSet<>();
        x.add(x1);
        if(x.contains(x2)){
            x.remove(x2);
        }else{
            x.add(x2);
        }

        if(x.contains(x3)){
            x.remove(x3);
        }else{
            x.add(x3);
        }

        Set<Integer> y = new HashSet<>();
        y.add(y1);

        if(y.contains(y2)){
            y.remove(y2);
        }else{
            y.add(y2);
        }

        if(y.contains(y3)){
            y.remove(y3);
        }else{
            y.add(y3);
        }

        System.out.println( x.iterator().next() + " " + y.iterator().next() );

    }
}