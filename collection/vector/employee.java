package vector;

import java.util.Vector;

public class employee {
    public static void main(String[] args) {
        Vector<Integer> V = new Vector<>();
        V.add(12);
        V.add(23);
        V.add(45);
        V.add(67);
        V.add(12);
        V.add(null);
        System.out.println(V);
    }

}
