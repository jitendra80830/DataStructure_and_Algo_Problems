package StringPack;

import java.util.Map;
import java.util.TreeMap;

public class SwapWithThird {
    public static void main(String[] args){
       /* String a = "hello";
        String b = "world";
        System.out.println("a = "+a+" and b = "+b);
        String s = "";
        s = s+a;
        a = b;
        b = s;
        System.out.println("a = "+a+" and b = "+b);*/
        int[] start = {1, 6, 2, 8};
        int[] end = {8, 7, 6, 10};

        int earliestMaxTime = getEarliestMaxTrafficTime(start, end);
        System.out.println("Earliest time with maximum clients interacting: " + earliestMaxTime);

    }


        public static int getEarliestMaxTrafficTime(int[] start, int[] end) {
            Map<Integer, Integer> trafficMap = new TreeMap<>();

            // Increment the traffic at start time
            for (int s : start) {
                trafficMap.put(s, trafficMap.getOrDefault(s, 0) + 1);
            }

            // Decrement the traffic just after end time
            for (int e : end) {
                trafficMap.put(e + 1, trafficMap.getOrDefault(e + 1, 0) - 1);
            }

            int maxTraffic = 0;
            int currentTraffic = 0;
            int earliestMaxTime = 0;

            // Traverse through the timeline to find max traffic
            for (Map.Entry<Integer, Integer> entry : trafficMap.entrySet()) {
                currentTraffic += entry.getValue();
                if (currentTraffic > maxTraffic) {
                    maxTraffic = currentTraffic;
                    earliestMaxTime = entry.getKey();
                }
            }

            return earliestMaxTime;
        }

        /*public static void main(String[] args) {
            int[] start = {1, 6, 2, 8};
            int[] end = {8, 7, 6, 10};

            int earliestMaxTime = getEarliestMaxTrafficTime(start, end);
            System.out.println("Earliest time with maximum clients interacting: " + earliestMaxTime);
        }*/


}
