import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmail {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String arr[]=s.split(" ");
        int n=countEmail(arr);
        System.out.println("Number of unique emails is= "+n);
    }
    public static int countEmail(String arr[]){
        Set<String> count=new HashSet<>();
        for(String iterator:arr) {
            int index=iterator.indexOf('@');
            String firstPart=iterator.substring(0,index);
            String secondPart=iterator.substring(index);
            if(firstPart.contains("+")){
                int plusIndex=firstPart.indexOf('+');
                firstPart=firstPart.substring(0,plusIndex);
            }
            firstPart.replaceAll(".","");
            count.add(firstPart+secondPart);
        }
        return count.size();
    }
}
