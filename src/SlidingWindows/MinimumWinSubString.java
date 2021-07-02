package SlidingWindows;

public class MinimumWinSubString {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

    }
    public static void minimumWinSize(String s , String t){
        int freq_s[] = new int[256];
        int freq_t [] = new int[256];
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            freq_t[ch]++;
        }
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            freq_s[ch]++;
            if(freq_s[ch]<=freq_t[ch]){
                count++;
            }
        }
    }
}
