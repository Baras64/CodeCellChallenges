public class CubeItUp {
    public static void main(String args[]){
        System.out.println(computeCube(5)*computeCube(500)*computeCube(5000000000L)%1000007);
    }
    public static long computeCube(long n){
        long sum=0;
        for(long i=1;i<=n;i++){
             sum=sum+computeSum((long)Math.pow(i,3));
        }
        return sum%1000007;
    }
    public static long computeSum(long n){
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
}

