package CodeForces;

import java.io.*;
import java.util.*;

//public class A{
//
//    public static void main(String args[])throws Exception
//    {
//        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb=new StringBuilder();
//        int t=Integer.parseInt(bu.readLine());
//        while(t-->0)
//        {
//            char p[]=bu.readLine().toCharArray();
//            int i,c[]=new int[26];
//            for(i=0;i<26;i++) c[p[i]-'a']=i;
//
//            char s[]=bu.readLine().toCharArray();
//            int ans=0,n=s.length;
//            for(i=1;i<n;i++) ans+=Math.abs(c[s[i]-'a']-c[s[i-1]-'a']);
//            sb.append(ans+"\n");
//        }
//        System.out.print(sb);
//    }
//}
 public class A{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  = new String();
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t > 0){
            char p1[] = bufferedReader.readLine().toCharArray();
            int c1[] = new int[26];

            for(int i =0;i<26;i++){
                c1[p1[i] - 'a'] = i;
                char s1[] = bufferedReader.readLine().toCharArray();
                int answer = 0;
                int n = s1.length;

                for(int j =1;j<n;j++){
                    answer+=Math.abs(c1[s1[i] - 'a'] - c1[s1[j-1] - 'a']);
                    s.concat(answer+"\n");
                }
            }

            t--;
        }
        System.out.print(s);
    }

}
//abcdefghijklmnopqrstuvwxyz
//hello   h =8,e=5 , l = 12 , o = 15
//5-8,
//|5−8|+|12−5|+|12−12|+|15−12|=13
