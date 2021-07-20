package PracticeArraylist_Linkedlist;

import java.util.Comparator;

public class SortDown implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost()>o2.getCost())
            return -1;
        else if (o1.getCost()<o2.getCost())
            return 1;
        else
            return 0;
    }
}
