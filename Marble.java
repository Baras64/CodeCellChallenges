public class Marble {
    public static void main(String args[]){
        System.out.println(computeWinner(22)+computeWinner(45)+computeWinner(26)+computeWinner(75));
    }
    public static int computeWinner(int n){
        int winner[]={2,1,1,2,2,2,1,1,1};
        return winner[n%8];
    }
}
