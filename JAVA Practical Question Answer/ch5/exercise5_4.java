public class exercise5_4 {
    public static void main(String[] args) {
        int [][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0.0f;

        for(int arrTmp[]:arr) {
            for(int num:arrTmp) {
                total+=num;
            }
        }
        average=(float)total/20.0f;

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
