package SlidingWindows;

public class FlipingString {
    public static void main(String[] args) {
        String str = "ababbaab";
        int k = 2;
        int flip_b = KartikBhaiyaString(str, 'a', k);
        int flip_a = KartikBhaiyaString(str, 'b', k);
        System.out.println(Math.max(flip_a,flip_b));

    }

    public static int KartikBhaiyaString(String str, char c, int k) {
        int start = 0;
        int end = 0;
        int flip = 0;
        int maxLen = 0;
        while (end < str.length()) {
            if (str.charAt(end) != c) {
                flip++;
            }
            while (flip > k) {
                if (str.charAt(start) != c) {
                    flip--;
                }
                start++;
            }
            maxLen = Math.max(maxLen, (end - start + 1));
            end++;
        }
        return maxLen;
    }
}
