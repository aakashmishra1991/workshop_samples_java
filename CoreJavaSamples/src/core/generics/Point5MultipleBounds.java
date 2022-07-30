package core.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point5MultipleBounds {
    public static void main(String[] args) {
        List<Integer> salaryOfEmployeeList1 = Arrays.asList(10000, 20000, 20000);

        List<Double> salaryOfEmployeeList2 = Arrays.asList(10000.10, 30000.30, 40000.50);

        List<Float> salaryOfEmployeeList3 = Arrays.asList(10000.10F, 30000.30F, 40000.50F);

        List<Number> allSalaryListTo1 = new ArrayList<>();
        allSalaryListTo1.addAll(salaryOfEmployeeList1);
        allSalaryListTo1.addAll(salaryOfEmployeeList2);
        allSalaryListTo1.addAll(salaryOfEmployeeList3);


    }

    public <T extends Number & Comparable<? super T>> int compareNumbers(T t1, T t2) {
        return t1.compareTo(t2);
    }


}
