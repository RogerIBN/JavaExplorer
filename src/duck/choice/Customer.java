package duck.choice;

/**
 * Customer
 */
public class Customer {
    private String name;
    private String size;

    private Clothing[] items;

    /**
     * @param name
     * @param measurement
     */
    public Customer(String name, Integer measurement) {
        setName(name);
        setSize(measurement);
    }

    public Clothing[] getItems() {
        return this.items;
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Double getTotalClothingCost() {
        Double total = 0.0;
        for (Clothing item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return this.size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @param measurement
     */
    public void setSize(Integer measurement) {
        setSize(switch (measurement) {
            case 1, 2, 3 -> "S";
            case 4, 5, 6 -> "M";
            case 7, 8, 9 -> "L";
            default -> "XL";
        });
    }
}