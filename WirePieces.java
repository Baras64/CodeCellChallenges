import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WirePieces {
    public static void main(String args[]) {
        System.out.println(computePieces(10,5,2,3)+computePieces(16,7,5,3)+computePieces(10000,19,35,37)+computePieces(2501,8,4,6)+computePieces(10520,217,88,129)+computePieces(300001,263,311,179));
    }
    public static int computePieces(int n,int x,int y,int z){
        Set<Integer> count=new HashSet<>();
        count.add(x);
        count.add(y);
        count.add(z);
        int p[]=new int[n+1];
        Arrays.fill(p,-1);
        for(int i=1;i<=n;i++){
            for(int e1:count){
                if(i==e1)
                    p[i]=Math.max(1,p[i]);
                else if(i>e1)
                    if(p[i-e1]>0)
                        p[i]=Math.max(p[i-e1]+1,p[i]);
            }
        }
        return p[n];
    }
}
