public class exercise5_6 {
    public static void main(String args[]) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for (int i:coinUnit) {
            System.out.println(i
                    +": "+money/i);
            money-=money/i*i;
        }
    }
}
