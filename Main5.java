public class Main5 {

    public static boolean isPrimeNumber(int test) {
        for (int i=2; i<=(test-1); i++){
            if (test % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int counters = 0;
        int target = 60;
        int i = 2;
        do {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                counters++;
            }
            i++;
        } while(counters != target);
    }
}
