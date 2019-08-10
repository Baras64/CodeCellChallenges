public class MinimumItem{
    public static void main(String args[]){
        System.out.println(countItem(10)*countItem(256)*countItem(511)*countItem(4097)*countItem(8194));
    }

    public static int countItem(int amount)
    {
        int itemAmount[] ={ 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };
        int items[]= new int[12];

        for (int i = 0; i < 12; i++) {
            if (amount >= itemAmount[i]) {
                items[i] = amount / itemAmount[i];
                amount = amount - items[i] * itemAmount[i];
            }
        }
        int k=0;
        for (int i = 0; i < 12; i++) {
            if (items[i] != 0) {
               k++;
            }
        }
        return k;
    }


}
