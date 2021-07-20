package PracticeArraylist_Linkedlist;

public class Product implements Comparable<Product> {
    private int id;
    private int cost;
    private String name;

    public Product() {
    }

    public Product(int id, int cost, String name) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        if (this.cost > o.getCost())
            return 1;
        else if (this.cost < o.getCost())
            return -1;
        else
            return 0;
    }
    @Override
    public String toString(){
        return "id: "+this.getId()+ " name: "+ this.getName() + " cost: "+this.getCost();
    }
}
