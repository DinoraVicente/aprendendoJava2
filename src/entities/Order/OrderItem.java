package entities.Order;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Product name, double price, int quantity) {
        this.product = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subtotal(){
        return quantity * price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getProduct().getName());
        sb.append(", R$").append(String.format("%.2f", price));
        sb.append(", Quantity: ").append(quantity);
        sb.append(", Subtotal: R$").append(String.format("%.2f", subtotal()));
        return sb.toString();
    }
}
