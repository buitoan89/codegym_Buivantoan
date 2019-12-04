package models;

import java.util.Comparator;

public class SortId implements Comparator<Customer> {
    public int compare(Customer s1, Customer s2) {
        if (s1.getIdCard() == s2.getIdCard())
            return 0;
        else if (s1.getIdCard() > s2.getIdCard())
            return 1;
        else
            return -1;
    }
}
