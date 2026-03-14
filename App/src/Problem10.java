import java.util.*;

public class Problem10 {

    static LinkedHashMap<String,String> L1 =
            new LinkedHashMap<>(10000,0.75f,true){
                protected boolean removeEldestEntry(Map.Entry e){
                    return size()>10000;
                }
            };

    static HashMap<String,String> L2 = new HashMap<>();

    static String getVideo(String id){

        if(L1.containsKey(id))
            return "L1 HIT";

        if(L2.containsKey(id)){
            L1.put(id,L2.get(id));
            return "L2 HIT";
        }

        String data="VideoData";
        L2.put(id,data);
        return "DB HIT";
    }

    public static void main(String[] args){

        System.out.println(getVideo("video123"));
        System.out.println(getVideo("video123"));
    }
}