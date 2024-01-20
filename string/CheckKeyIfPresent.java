package leet.code.string;

import java.util.HashMap;
import java.util.Scanner;

public class CheckKeyIfPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.nextLine());
        }

        int key = sc.nextInt();
        System.out.println(map.getOrDefault(key, "-1").trim());
        sc.close();
    }
}
