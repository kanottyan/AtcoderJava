import java.util.Scanner;

class C266{

    static boolean dotTIsInTriangle(double ax, double ay, double bx, double by, double cx, double cy, double tx, double ty){
        double abXat = (bx-ax)*(ty-ay) - (by-ay)*(tx-ax);
        double bcXbt = (cx-bx)*(ty-by) - (cy-by)*(tx-bx);
        double caXct = (ax-cx)*(ty-cy) - (ay-cy)*(tx-cx);

        if(( abXat > 0.0 && bcXbt > 0.0 && caXct > 0.0) || ( abXat < 0.0 && bcXbt < 0.0 && caXct < 0.0) || abXat*bcXbt*caXct == 0.0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ax; double ay; double bx; double by; double cx; double cy; double dx; double dy;
        ax = sc.nextDouble();
        ay = sc.nextDouble();
        bx = sc.nextDouble();
        by = sc.nextDouble();
        cx = sc.nextDouble();
        cy = sc.nextDouble();
        dx = sc.nextDouble();
        dy = sc.nextDouble();

        boolean flag = false;

        flag |= dotTIsInTriangle(ax, ay, bx, by, cx, cy, dx, dy);
        flag |= dotTIsInTriangle(bx, by, cx, cy, dx, dy, ax, ay);
        flag |= dotTIsInTriangle(cx, cy, dx, dy, ax, ay, bx, by);
        flag |= dotTIsInTriangle(dx, dy, ax, ay, bx, by, cx, cy);

        if(flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }


    }
}