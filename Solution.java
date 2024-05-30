class Solution {
    public int maxDistance(int[] colors) {
        int max = 0, n = colors.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[j] != colors[i]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}
