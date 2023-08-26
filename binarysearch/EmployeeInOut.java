package leet.code.binarysearch;

import java.util.HashMap;

public class EmployeeInOut {
    public static void main(String[] args) {
        String s = "4_out 1_in 2_in 3_out 1_out 2_out 5_in";
        String[] logs = s.split("\\s+");
        HashMap<Integer, String> map = new HashMap<>();

        for (String log : logs) {
            int id = Integer.parseInt(log.split("_")[0]);
            String status = log.split("_")[1];
            if (!map.containsKey(id)) {
                if (status.equals("out")) {
                    map.put(id, status);
                } else {
                    map.put(id, status);
                }
            } else {
                if (map.get(id).equals("in") && status.equals("out")) {
                    map.remove(id);
                } else {
                    System.out.println(id);
                }
            }
        }
        System.out.println(map);
    }
}