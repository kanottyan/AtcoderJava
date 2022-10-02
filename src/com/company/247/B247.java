import java.util.*;

class B247{
    public static void main(String[] args) {
        List<List<String>> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; ++i){
            String a = sc.next();
            String b = sc.next();
            l.add(Arrays.asList(a, b));
        }
        boolean ans = true;
        Set<String> cannotuse = new HashSet<>();

        for(int i=0; i<l.size(); ++i){
            for(int j=0; j<2; ++j){
                String target = l.get(i).get(j);


                for(int k=0; k<l.size(); ++k){
                    // do not add again
                    if(i == k) continue;

                    if(target.equals(l.get(k).get(0))){
                        cannotuse.add(l.get(k).get(1));
                        cannotuse.add(l.get(i).get((j+1)%2));
                    }
                    if(target.equals(l.get(k).get(1))){
                        cannotuse.add(l.get(k).get(0));
                        cannotuse.add(l.get(i).get((j+1)%2));
                    }
                }

            }
        }

        for(int z=0; z<l.size(); ++z){
            if( cannotuse.contains(l.get(z).get(0)) && cannotuse.contains(l.get(z).get(1))){
                ans = false;
                break;
            }
        }


        if(ans){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}