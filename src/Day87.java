
import java.util.LinkedList;
import java.util.Queue;

public class Day87 {
    public static void main(String[] args) {
        Queue antrian = new LinkedList();
        System.out.println(antrian.poll());
        antrian.offer(12);
        antrian.offer(13);
        antrian.offer(14);
        antrian.offer(15);
        antrian.offer(16);
        antrian.offer(17);
        antrian.offer(18);
        antrian.offer(19);
        antrian.offer(20);
        antrian.offer(21);
        antrian.offer(22);
        antrian.offer(23);
        antrian.offer(24);
        System.out.println(antrian);
        
        int peek_value = (Integer) antrian.peek();
        System.out.println("PEEK: "+peek_value);
        System.out.println(antrian);
        
        int out = (Integer)antrian.poll();
        System.out.println("POLL: "+out);
        System.out.println(antrian);
        
        while(!antrian.isEmpty()){
            out = (Integer)antrian.poll();
            System.out.println("POLL: "+out);
            System.out.println(antrian);
        }
    }
}
