import java.util.*;

public class Problem5 {

    static HashMap<String,Integer> pageViews = new HashMap<>();
    static HashMap<String,Set<String>> uniqueUsers = new HashMap<>();
    static HashMap<String,Integer> sources = new HashMap<>();

    static void processEvent(String url,String user,String source){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        uniqueUsers.putIfAbsent(url,new HashSet<>());
        uniqueUsers.get(url).add(user);

        sources.put(source,sources.getOrDefault(source,0)+1);
    }

    public static void main(String[] args){

        processEvent("/news","user1","google");
        processEvent("/news","user2","facebook");
        processEvent("/sports","user3","direct");

        System.out.println(pageViews);
        System.out.println(uniqueUsers);
        System.out.println(sources);
    }
}