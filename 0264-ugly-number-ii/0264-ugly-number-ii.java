class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> visited = new HashSet<>();

        visited.add(1L);
        pq.add(1L);

        long ugly = 1;

        int factors[] = {2,3,5};

        for(int i = 0 ; i < n ; i++){
            ugly = pq.poll();
            for(long factor : factors){
                if(!visited.contains(factor*ugly)){
                    pq.add(factor*ugly);
                    visited.add(factor*ugly);
                }
            }
        }
        return (int) ugly;
    }
}