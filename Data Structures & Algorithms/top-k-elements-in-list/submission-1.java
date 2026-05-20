class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        // Result array size is k
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}