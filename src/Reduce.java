public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int n = 100;

        while(n>0){
            boolean isEven = n % 2 == 0;
            if (isEven){
                n /= 2;
            }
            else{
                n -= 1;
            }
            step++;
        }

        System.out.println(step);
    }
}
