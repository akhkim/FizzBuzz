public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int ans = 0;
        while (i > 0) {
            boolean divisibleBy2 = i % 2 == 0;

            if (divisibleBy2) {
                i = i / 2;
                ans++;
            } else {
                i--;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
