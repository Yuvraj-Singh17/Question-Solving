
class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        
        for (int[] e : invocations) {
            graph.get(e[0]).add(e[1]);
        }

        boolean[] suspicious = new boolean[n];
        dfs(k, graph, suspicious);

        for (int[] e : invocations) {
            int u = e[0], v = e[1];
            if (!suspicious[u] && suspicious[v]) {
                List<Integer> all = new ArrayList<>();
                for (int i = 0; i < n; i++) all.add(i);
                return all;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) ans.add(i);
        }

        return ans;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] suspicious) {
        suspicious[node] = true;
        for (int nei : graph.get(node)) {
            if (!suspicious[nei]) {
                dfs(nei, graph, suspicious);
            }
        }
    }
}