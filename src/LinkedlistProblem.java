
public class LinkedlistProblem {

        public static int length(Node head) {
            int cnt = 0;
            //Node temp=a;
            while (head != null) {
                cnt++;
                head = head.next;
            }
            return cnt;
        }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
    }
        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(51);
            Node c = new Node(52);
            Node d = new Node(53);
            Node e = new Node(54);
            Node f = new Node(8);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            b.next = f;
            f.next=c;

            System.out.println(a.next.data);
             Node temp=a;

           System.out.println(length(a));
        }
    }
}











