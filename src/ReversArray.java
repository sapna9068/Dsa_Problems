public class ReversArray {

    public static int[] reverse(int number[]){
        int start=0,end=number.length-1;
        while (start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }

       return number;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        reverse(number);
        for (int i=0; i< number.length; i++)
        System.out.print(number[i]);
    }
}
