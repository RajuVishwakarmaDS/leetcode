package leet.code.array;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            max = Math.max(max, area);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1};
        System.out.println(maxArea(heights));
    }
}