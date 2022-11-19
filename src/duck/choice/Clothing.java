package duck.choice;

/**
 * Clothing
 */
public class Clothing {

    public final static Double MIN_PRICE = 10.0; // Minimum price of a clothing item
    public final static Double TAX_RATE = 0.2; // 20% tax of clothing items
    private String description, size;
    private Double price;

    /**
     * @param description
     * @param price
     * @param size
     */
    public Clothing(String description, Double price, String size) {
        setDescription(description);
        setPrice(price);
        setSize(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(Double price) {
        this.price = price > MIN_PRICE ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}