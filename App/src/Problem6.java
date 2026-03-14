import java.util.*;

class TokenBucket{
    int tokens;
    long lastRefill;
}

public class Problem6 {

    static HashMap<String,TokenBucket> map = new HashMap<>();
    static int LIMIT=1000;

    static boolean check(String client){

        map.putIfAbsent(client,new TokenBucket());
        TokenBucket b=map.get(client);

        long now=System.currentTimeMillis();

        if(now-b.lastRefill>3600000){
            b.tokens=LIMIT;
            b.lastRefill=now;
        }

        if(b.tokens>0){
            b.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println(check("abc123"));
        System.out.println(check("abc123"));
    }
}