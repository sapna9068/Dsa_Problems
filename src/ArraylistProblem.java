import java.lang.*;
import java.util.HashSet;

class FirstHas{
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<Integer>();
        st.add(12);
        st.add(4);
        st.add(-22);
        st.add(21);
        st.add(27);
        st.add(27);
        //System.out.println(st.contains(94));
        st.add(22);
        st.add(21);
        st.add(27);
        st.add(null);
        for(Integer i : st) {
            System.out.println(i);
        }
        System.out.println(st.size());
        HashSet hs=new HashSet();
        hs.add("m");
        hs.add("a");
        hs.add("l");
        hs.add("a");
        hs.add("y");
        hs.add("a");
        hs.add("m");

    }
}