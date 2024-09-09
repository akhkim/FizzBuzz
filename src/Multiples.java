public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int ans = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                ans++;
            } else if (divisibleBy3) {
                ans++;
            } else if (divisibleBy5) {
                ans++;
            } else {
            }
            i++;
        }
        System.out.println(ans);
    }
}
