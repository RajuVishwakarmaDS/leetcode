package leet.code.array;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int i = 0;
        int j = 0;
        int size = height.length;
        int trapped = 0;

        while (i < size && j < size - 1) {
            if ((height[i] == 0 || height[i] == height[i + 1])) {
                i++;
                j = i + 1;
            }

            if (height[i] <= height[j++]) {
                if (i == size - 2) {
                    i++;
                }
            } else {
                // get trapped water in the region
                int temp = i + 1;
                while (i < j - 1) {
                    if (height[i] > height[temp]) {
                        temp++;
                    } else {
                        trapped = trapped + Math.abs(height[i + 1] - height[i]);
                        i = temp;
                        j = i + 1;
                    }
                }
            }
        }
        return trapped;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3};
        System.out.println(trap(arr));
    }
}
