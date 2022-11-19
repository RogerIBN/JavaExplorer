package duck.choice;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 14);

        System.out.println("Minimum price: " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {
                item1,
                item2,
                new Clothing("Green Scarf", 5.0, "S"),
                new Clothing("Blue T-Shirt", 10.5, "S")
        };

        c1.addItems(items);

        System.out.println("Hello " + c1.getName() + "!");
        System.out.println("Your size is " + c1.getSize());
        for (Clothing item : c1.getItems()) {
            System.out.println(
                    " - Item: "
                            + item.getDescription()
                            + ", Size: "
                            + item.getSize()
                            + ", Price: $"
                            + item.getPrice());
        }
        System.out.println("Your total is $" + c1.getTotalClothingCost());
    }

}
