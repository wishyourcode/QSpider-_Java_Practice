package vector;

import java.util.Vector;

public class employee {
    int rollnumber;
    String name;

    employee(int rollnumber, String name) {
        this.rollnumber = rollnumber;
        this.name = name;
    }

    public static void main(String[] args) {
        Vector<Integer> V = new Vector<>();
        V.add(12);
        V.add(23);
        V.add(45);
        V.add(67);
        V.add(12);
        V.add(null);
        System.out.println(V);
        V.remove(2);
        System.out.println(V.contains(67));
        System.out.println(V);

        Vector<employee> emp = new Vector<>();
        emp.add(new employee(10, "Vishal Mishra"));
        System.out.println(emp);
    }

}
