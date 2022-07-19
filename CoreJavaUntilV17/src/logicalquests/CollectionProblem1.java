package logicalquests;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PS 1 Set<Employee{id,name,salary}>,  sort list without using a loop.
// PS 2
public class CollectionProblem1 {

    class Employee{
         Employee(int id, String name){
             id = id;
             name =name;
         }

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        CollectionProblem1 collectionProblem1 = new CollectionProblem1();
        CollectionProblem1.Employee employee = collectionProblem1.new Employee(1,"test1");
        CollectionProblem1.Employee employee2 = collectionProblem1.new Employee(2, "test2");
        CollectionProblem1.Employee employee3 = collectionProblem1.new Employee(3, "test3");
        final List<CollectionProblem1.Employee > list = new ArrayList<>(3);
        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        final Map<Integer, Employee> map = new HashMap<>();
        for (CollectionProblem1.Employee emp: list) {
            map.put(emp.getId(), emp);
        }
        for (Map.Entry<Integer, Employee> entry : map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
