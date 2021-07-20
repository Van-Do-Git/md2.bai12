package PracticeArraylist_Linkedlist;

public class Main {
    public static void main(String[] args) {
        Product pd1 = new Product(1,15,"1");
        Product pd2 = new Product(3,18,"2");
        Product pd3 = new Product(5,12,"3");
        Product pd4 = new Product(2,20,"4");
        Product pd5 = new Product(4,17,"5");
        ProductManager vanDx = new ProductManager();
        vanDx.add(pd1);
        vanDx.add(pd2);
        vanDx.add(pd3);
        vanDx.add(pd4);
        vanDx.add(pd5);
//        vanDx.displayList();
//        System.out.println(vanDx.searchByName("3"));
        vanDx.sortDown();
        vanDx.displayList();
        vanDx.sortUp();
        vanDx.displayList();
    }
}
