import java.util.*;

public class Problem7{

    static HashMap<String,Integer> freq = new HashMap<>();

    static List<String> search(String prefix){

        PriorityQueue<String> pq =
                new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));

        for(String q:freq.keySet())
            if(q.startsWith(prefix)) pq.add(q);

        List<String> res=new ArrayList<>();

        for(int i=0;i<10 && !pq.isEmpty();i++)
            res.add(pq.poll());

        return res;
    }

    public static void main(String[] args){

        freq.put("java tutorial",100);
        freq.put("javascript",80);
        freq.put("java download",60);

        System.out.println(search("jav"));
    }
}