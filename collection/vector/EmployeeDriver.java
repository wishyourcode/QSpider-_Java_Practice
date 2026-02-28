package vector;

import java.util.ListIterator;
import java.util.Vector;

public class EmployeeDriver {
    public static void main(String[] args) {
        Vector<employee> ev = new Vector<>();
        ev.add(new employee(20, "Vishal Mishra"));
        ev.add(new employee(22, "Piyush Mishra"));
        ev.add(new employee(23, "Vishal Mishra"));
        ev.add(new employee(25, "Vishal Mishra"));

        ListIterator<employee> i = ev.listIterator();
        while (i.hasNext()) {
            employee temp = i.next();
            System.out.println(temp);
            System.out.println("============");
        }
    }
}
