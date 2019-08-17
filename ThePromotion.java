import java.lang.reflect.Array;
import java.util.Arrays;

public class ThePromotion {
    public static void main(String args[]){
        int n1=computeSum(6,new int[]{1,2,3,4,5,6});
        String s[]="0 1 1 1 1 1 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 1 1 1 1 1 1 1 1 1 0 0 1 0 1 0 1 1 0 0 0 0 0 0 1 0 1 0 1 0 1 1 1 0 0 0 0 0 0 0 0 0 1 0 1 0 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0".split(" ");
        int arr1[]= Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int n2=computeSum(120,arr1);
        String s1[]="1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 29 40 41 42 43 44 45 46 47 48 49 50".split(" ");
        int arr2[]= Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int n3=computeSum(50,arr2);
        System.out.println(n1+n2+n3);
    }
    public static int computeSum(int n, int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum+=(arr[i]&arr[j]);
            }
        }
        return sum%101;
    }
}
