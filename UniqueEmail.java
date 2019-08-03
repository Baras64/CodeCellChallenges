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
        Set<String> set = new HashSet<>();

        for(String email : arr){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0 ; i < email.length(); i++){
                char ch = email.charAt(i);
                if(ch == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    stringBuilder.append(email.substring(i));
                    break;
                }
                else if(ch == '.'){
                    continue;
                }
                else if(ch == '@') {
                    stringBuilder.append(email.substring(i));
                    break;
                }
                else{
                    stringBuilder.append(ch);
                }
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}

