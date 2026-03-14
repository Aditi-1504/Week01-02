import java.util.*;

public class Problem4 {

    static HashMap<String,Set<String>> index = new HashMap<>();

    static List<String> ngrams(String text,int n){
        String[] words=text.split(" ");
        List<String> list=new ArrayList<>();

        for(int i=0;i<=words.length-n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++) sb.append(words[i+j]).append(" ");
            list.add(sb.toString().trim());
        }
        return list;
    }

    static void addDocument(String id,String text){
        for(String g:ngrams(text,5)){
            index.putIfAbsent(g,new HashSet<>());
            index.get(g).add(id);
        }
    }

    static void analyze(String text){
        int matches=0;
        for(String g:ngrams(text,5)){
            if(index.containsKey(g)) matches++;
        }
        System.out.println("Matching ngrams: "+matches);
    }

    public static void main(String[] args){

        addDocument("essay1","this is a sample essay for plagiarism detection system");
        analyze("this is a sample essay for plagiarism test");
    }
}