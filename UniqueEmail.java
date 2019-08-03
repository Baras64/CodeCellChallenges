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
    public static int countEmail(String[] arr) {
        HashSet<String> count=new HashSet<>();
        for(String email:arr){
            String firstPart=email.substring(0,email.indexOf('@'));
            String secondPart=email.substring(email.indexOf('@'));
            if(firstPart.contains("+")){
                firstPart=firstPart.substring(0,firstPart.indexOf("+"));
            }
            if(firstPart.contains(".")){
                firstPart=firstPart.replaceAll(".","");
            }
            count.add(firstPart+secondPart);
        }
        return count.size();
    }
}

