import java.util.*;

public class Problem2 {

    static HashMap<String,Integer> stock = new HashMap<>();
    static HashMap<String,Queue<Integer>> waiting = new HashMap<>();

    static int checkStock(String product){
        return stock.getOrDefault(product,0);
    }

    static synchronized String purchaseItem(String product,int userId){
        int s = stock.getOrDefault(product,0);
        if(s>0){
            stock.put(product,s-1);
            return "Success, "+(s-1)+" remaining";
        }else{
            waiting.putIfAbsent(product,new LinkedList<>());
            waiting.get(product).add(userId);
            return "Added to waiting list";
        }
    }

    public static void main(String[] args){
        stock.put("IPHONE15_256GB",100);

        System.out.println(checkStock("IPHONE15_256GB"));
        System.out.println(purchaseItem("IPHONE15_256GB",12345));
        System.out.println(purchaseItem("IPHONE15_256GB",67890));
    }
}