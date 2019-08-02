public class SumOfNaturalNumbers {
    public static void main(String args[]){
        System.out.println("The sum of 10,100,200 Natural numbers is "+(sumOfNatural(10)+sumOfNatural(100)+sumOfNatural(200)));
    }
    public static int sumOfNatural(int n){
        return n*(n+1)/2;
    }
}
