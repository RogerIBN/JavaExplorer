package duck.choice;

/**
 * Clothing
 */
public class Clothing implements Comparable<Clothing> {

    public final static Double MIN_PRICE = 10.0; // Minimum price of a clothing item
    public final static Double TAX_RATE = 0.2; // 20% tax of clothing items

    private String description;
    private String size;
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
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price * (1 + TAX_RATE);
    }

    public void setPrice(Double price) {
        this.price = Math.max(price, MIN_PRICE);
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format(
                "Clothing -> Description=%s, Size=%s, Price=$%.2f",
                getDescription(),
                getSize(),
                getPrice());
    }

    @Override
    public int compareTo(Clothing clothing) {
        return this.getDescription().compareTo(clothing.getDescription());
    }
}