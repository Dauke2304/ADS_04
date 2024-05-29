public class Main {

    public static void main(String[] args) {
        WeightedGraph<String> weightedGraph = new WeightedGraph<>(true);
        fillGraph(weightedGraph);

        System.out.println("Dijkstra:");
        Search<String> djk = new DS<>(weightedGraph, "New York");
        outputPath(djk, "Miami");

        System.out.println("--------------------------------");

        WeightedGraph<String> graph = new WeightedGraph<>(true);
        fillGraph(graph);

        System.out.println("DFS:");
        Search<String> dfs = new DS<>(graph, "New York");
        outputPath(dfs, "Miami");

        System.out.println("--------------------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BFS<>(graph, "New York");
        outputPath(bfs, "Miami");
    }

    public static void fillGraph(WeightedGraph<String> graph) {
        graph.addEdge("New York", "Los Angeles", 2.1);
        graph.addEdge("Chicago", "Houston", 7.8);
        graph.addEdge("Houston", "Los Angeles", 7.1);
        graph.addEdge("New York", "Chicago", 7.2);
        graph.addEdge("Chicago", "Los Angeles", 3.9);
        graph.addEdge("Los Angeles", "San Francisco", 3.5);
        graph.addEdge("Chicago", "Miami", 5.4);
    }

    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }

        System.out.println();
    }
}
