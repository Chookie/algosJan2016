import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * http://rosettacode.org/wiki/Dijkstra%27s_algorithm#Java
 * Dijkstra used to find path from source to all nodes
 * or just shortest path between 2 nodes
 */
public class Graph {

    public static class Edge {
        private final String vertex1Name;
        private final String vertex2Name;
        private final int weight;

        public Edge(String vertex1, String vertex2, int weight) {
            this.vertex1Name = vertex1;
            this.vertex2Name = vertex2;
            this.weight = weight;
        }

        public String getVertex1Name() {
            return vertex1Name;
        }

        public int getWeight() {
            return weight;
        }

        public String getVertex2Name() {
            return vertex2Name;
        }
    }

    public static class Vertex implements Comparable<Vertex{
        private final String name;
        private final Map<Vertex,Integer> neighbours = new HashMap<>();
        private int weightFromSource = Integer.MAX_VALUE; // Infinity
        private Vertex previousToSource = null;

        public Vertex(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Map<Vertex, Integer> getNeighbours() {
            return neighbours;
        }

        public int getWeightFromSource() {
            return weightFromSource;
        }

        public void setWeightFromSource(int weightFromSource) {
            this.weightFromSource = weightFromSource;
        }

        public Vertex getPreviousToSource() {
            return previousToSource;
        }

        public void setPreviousToSource(Vertex previousToSource) {
            this.previousToSource = previousToSource;
        }

        @Override
        // Used for NavigableSet
        public int compareTo(Vertex otherVertix) {
            return Integer.compare(this.getWeightFromSource(), otherVertix.getWeightFromSource() );
        }
    }

    private final Map<String, Vertex> graph;

    /**
     * Create a graph from Edges
     */
    public Graph(Edge[] edges) {
        this.graph = new HashMap<>(edges.length);

        // Add all vertex's to graph
        for(Edge e : edges) {
            Vertex v1 = graph.putIfAbsent(e.getVertex1Name(), new Vertex(e.getVertex2Name());
            Vertex v2 = graph.putIfAbsent(e.getVertex1Name(), new Vertex(e.getVertex1Name());
            v1.getNeighbours().put(v2,e.getWeight());
            // v2.getNeighbours().put(v1,e.getWeight()); // If bi-directional
        }
    }

    public void dijkstra(String sourceVertexName){

        if(!graph.containsKey(sourceVertexName))){
            System.err.println("Graph does not contain Vertex " + sourceVertexName);
            return;
        }

        Vertex source = graph.get(sourceVertexName);
        NavigableSet<Vertex> connections = new TreeSet<Vertex>;

        // Set initial state of connections
        for(Vertex v : graph.values()){
            v.setPreviousToSource(source == v ? source : null);
            v.setWeightFromSource(source == v ? 0 : Integer.MAX_VALUE);
            connections.add(v);
        }

        dijkstra(connections);
    }

    private void dijkstra(NavigableSet<Vertex> connections) {
        while(!connections.isEmpty()){

            // Pop the lowest value from the set
            Vertex fromVertex = connections.pollFirst();

            if(fromVertex.getWeightFromSource() == Integer.MAX_VALUE){
                // If the minimum in the connections is infinity then we must have found all reachable vertex's
                break;
            }


        }
    }
}
