import java.util.*;

class DNSEntry{
    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){
        this.ip=ip;
        this.expiry=System.currentTimeMillis()+ttl;
    }
}

public class Problem3{

    static HashMap<String,DNSEntry> cache = new HashMap<>();

    static String resolve(String domain){
        DNSEntry e = cache.get(domain);

        if(e!=null && e.expiry>System.currentTimeMillis())
            return "Cache HIT "+e.ip;

        String ip="172.217."+new Random().nextInt(255)+"."+new Random().nextInt(255);
        cache.put(domain,new DNSEntry(ip,300000));

        return "Cache MISS "+ip;
    }

    public static void main(String[] args){
        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));
    }
}