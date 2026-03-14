import java.util.*;

public class Problem8 {

    static String[] table = new String[500];

    static int hash(String plate){
        return Math.abs(plate.hashCode())%table.length;
    }

    static int park(String plate){

        int i=hash(plate);

        while(table[i]!=null)
            i=(i+1)%table.length;

        table[i]=plate;
        return i;
    }

    static void exit(String plate){
        for(int i=0;i<table.length;i++)
            if(plate.equals(table[i]))
                table[i]=null;
    }

    public static void main(String[] args){

        int s=park("ABC1234");
        System.out.println("Spot "+s);

        exit("ABC1234");
    }
}