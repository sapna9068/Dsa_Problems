import java.util.*;

public class HashmapProblem {
    public static void main(String[] args) {
        HashSet<Integer> hm = new HashSet<>();
        hm.add(3);
        hm.add(4);
        hm.add(5);
        hm.add(3);

        System.out.println(hm.contains(3));
    }
}
//        int val=0;
//        int[] A={1,2,4,5,7,8,9,4,4,5};
//        Map<Integer,Integer> mp=new HashMap<>();
//        for(int el:A){
//            if(!mp.containsKey(el)) {
//                mp.put(el,1);
//            }
//            else{
//             mp.put(el, mp.get(el)+1);
//            }
//        }
//        System.out.println(mp.entrySet());
//        int max=-1;
//        int ansKey=-1;
//        for(var e:mp.entrySet()) {
//            if (e.getValue()>max){
//                max=e.getValue();
//                ansKey=e.getKey();
//            }
//        }
//        System.out.println(max+","+ansKey);
//    }

