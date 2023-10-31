
import java.util.HashMap;
import java.util.HashSet;

public class day23 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("r");
        hs.add("5");
        int a = 45;
        System.out.println();
        
        HashMap hm = new HashMap();
        hm.put("D0222336","Fajrin");
        hm.put(2,"Fadil");
        hm.put("D0222338","Firman");
        System.out.println(hm.get(2));
        System.out.println(hm);
        System.out.println(hm.remove("D0222338"));
        System.out.println(hm);
        
    }
}
