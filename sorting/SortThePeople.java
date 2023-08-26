package leet.code.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class People {
    String name;
    int height;

    public People(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        ArrayList<People> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(new People(names[i], heights[i]));
        }

        Comparator<People> comp = (p1, p2) -> {
            if (p1.height == p2.height) {
                return 0;
            } else if (p1.height < p2.height) {
                return 1;
            } else {
                return -1;
            }
        };
        lst.sort(comp);
        String[] ans = new String[n];
        int i = 0;
        for (People p : lst) {
            ans[i] = p.name;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        Arrays.stream(sortPeople(names, heights)).forEach(x -> System.out.print(x + " "));
    }
}