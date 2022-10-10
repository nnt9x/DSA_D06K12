package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightGraph<T, W extends Double> {
    private boolean bidirection;

    public WeightGraph() {
        bidirection = false;
    }

    public WeightGraph(boolean bidirection) {
        this.bidirection = bidirection;
    }

    private Map<T, Map<T, W>> map = new HashMap<>();

    // Thêm đỉnh
    public void addVertex(T s) {
        map.put(s, new HashMap<>());
    }

    // Thêm cạnh
    public void addEdge(T source, T destination, W weight) {
        if (!map.containsKey(source)) {
            addVertex(source);
        }

        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        map.get(source).put(destination, weight);

        if (this.bidirection == true) {
            map.get(destination).put(source, weight);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");

            for (T w : map.get(v).keySet()) {
                builder.append(w.toString()+" ("+map.get(v).get(w).toString()+") \t");

            }

            builder.append("\n");
        }

        return (builder.toString());
    }

}
