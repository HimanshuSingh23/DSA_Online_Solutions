class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums2.length; ++i) {
            int num = nums2[i];
            while (!s.isEmpty() && s.peek() < num) {
                map.put(s.pop(), num);
            }
            s.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}

