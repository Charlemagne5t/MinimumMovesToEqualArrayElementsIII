class Solution {
    public int minMoves(int[] nums) {
        int res = 0;
        int n = nums.length;
        int max = -200;
        for (int x : nums) {
            res += 100 - x;
            max = Math.max(max, x);
        }


        return res - n * (100 - max);
    }
}