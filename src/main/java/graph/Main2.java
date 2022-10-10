package graph;

public class Main2 {
    public static void main(String[] args) {
        WeightGraph<Integer, Double> weightGraph = new WeightGraph<>(true);

        weightGraph.addEdge(0,4,20.0);
        weightGraph.addEdge(0,1,10.0);
        weightGraph.addEdge(1,4,50.1);
        weightGraph.addEdge(4,3,70.3);
        weightGraph.addEdge(1,3,40.0);
        weightGraph.addEdge(1,2,30.3);
        weightGraph.addEdge(2,3,60.4);

        System.out.println(weightGraph.toString());

    }
}
