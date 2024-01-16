public class GCDProblem {
    public static int igcd(int x, int y){
        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

 public static void main(String[] args) {
        int x=64;
        int y=24;
        System.out.println(igcd(x,y));
    }
}
