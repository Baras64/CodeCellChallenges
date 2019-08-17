public class IndecisiveRyan {
    public static void main(String args[]){
        System.out.println(computeCount(13,45,3)+computeCount(1,123456,13)+computeCount(123,456789,189)+computeCount(1,2000000,23047885));
    }
    public static int computeCount(int start,int end,int p){
        int count=0;
        for(int i=start;i<end;i++){
            if(Math.abs(i-computeReverse(i))%p==0)
                count++;
        }

        return count;
    }
    public static int computeReverse(int n){
        int rev_num=0;
        while(n>0)
        {
            rev_num=rev_num*10+n%10;
            n/=10;
        }
        return rev_num;
    }
}
