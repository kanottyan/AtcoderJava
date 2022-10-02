import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class A268{
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        s.add(sc.nextInt());
        s.add(sc.nextInt());
        s.add(sc.nextInt());
        s.add(sc.nextInt());
        s.add(sc.nextInt());

        System.out.println(s.size());
    }
}