package main.systems.app;

public class Product {
    private final long id;
    private final String title;
    private final double cost;

    public Product(long id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
