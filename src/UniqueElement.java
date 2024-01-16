

import java.util.*;
public class UniqueElement {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("India",200);
        hm.put("chaina",800);
        hm.put("delhi",700);
        //hm.put("noide",800);
        hm.put("landon",900);
        hm.put("noide",100);
        System.out.println(hm.entrySet());
        hm.remove("India");
        System.out.println(hm.containsKey("yash"));
        Optional.of(100);
        System.out.println(hm.get("delhi"));


//        System.out.println(hm.containsKey("chaina"));
//        System.out.println(hm.containsKey("chainaa"));
//        System.out.println(hm.keySet());
//for (String st: hm.keySet()){
//    System.out.println(hm.get(st));
//}
//        int arr[]=new int[]{1,2,3,4,1,2,4,8,6};
//        HashSet<Integer> st=new HashSet<Integer>();
//        for(int i=0; i<arr.length; i++){
//
//            st.add(arr[i]);
//        }
//        System.out.print(st);
    }
}
