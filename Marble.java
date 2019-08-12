public class Marble {
    public static void main(String args[]){
        System.out.println(computeWinner(22)+computeWinner(45)+computeWinner(26)+computeWinner(75));

    }
    public static int computeWinner(int n) {
        if(n%3==0)
            return 2;
        else
            return 1;
    }
}
