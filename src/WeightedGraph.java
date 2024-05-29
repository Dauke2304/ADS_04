
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeightedGraph<Vertex> {
    private boolean undirected;
    private Map<Vertex,Map<Vertex,Double>> map = new HashMap<>();
    public WeightedGraph() {
        this(true);
    }
    public WeightedGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(Vertex v) {
        map.put(v, new HashMap<>());
    }
}