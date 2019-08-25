public class MrStark {
    public static void main(String[] args){
        //System.out.println(computeMax(10,5,5));
        double average=(computeMax(500,1000,100)+computeMax(200,100,125)+computeMax(3000,1000,1000)+computeMax(25000,10000,12000)+computeMax(12345,2120,1111))/5.0;
        //int number=(int)average;
        //double decimal=average-number;
        System.out.println(average);
    }
    public static int computeMax(int X, int Y, int Z){
        int maxDistance=Math.round(X/Y);
        int sum=0;
        for(int i=1;i<=maxDistance;i++){
            sum+=Math.round(Y/(2*i-1));
        }
        sum+=Math.round((X%Y)/(2*maxDistance+1));
        return sum-Z+1;
    }
}
