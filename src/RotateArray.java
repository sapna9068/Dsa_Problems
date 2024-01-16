import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sr=new Scanner(System.in);
        for (int i=0; i< arr.length; i++){
            arr[i]= sr.nextInt();
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
