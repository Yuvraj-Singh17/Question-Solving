class Solution {
    public static int[] pse(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    public static int[] nse(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return result;
    }

    public int largestRectangleArea(int[] heights) {
        int[] next = nse(heights, heights.length);
        int[] prev = pse(heights, heights.length);
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = next[i] - prev[i] - 1;
            max = Math.max(max, heights[i] * width);
        }
        return max;
    }
}