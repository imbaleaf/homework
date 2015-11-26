/**
 * Created by HP on 2015/10/16.
 */
class Main {
    public static void main (String args[]) {
        int num = 20150918;
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                num++;
                i = 2;
            }
        }

        System.out.println(num);


    }
}
