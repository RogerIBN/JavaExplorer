package duck.choice;

/**
 * Customer
 */
public class Customer {
    private String name, size;
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
        return items;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(Integer measurement) {
        switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }
}