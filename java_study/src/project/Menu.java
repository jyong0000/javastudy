package	project;

public class Menu {
    private String name;
    private int price;
    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void printInfo() {
        System.out.println(name + " - " + price + "원");
    }
}