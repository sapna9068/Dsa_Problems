import java.util.Scanner;

public class RecursionProblem {
 static int printIncreasing(int n){

     if(n==0)  return 1;
     int ans=n*printIncreasing(n-1);
     return ans;
 }
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n= sr.nextInt();
        System.out.println( printIncreasing(n));// printIncreasing(n);
    }
}
