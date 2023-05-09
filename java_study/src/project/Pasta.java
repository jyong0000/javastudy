package project;

class Pasta extends Menu {
    private String sauce;
    public Pasta(String name, int price, String sauce) {
        super(name, price);
        this.sauce = sauce;
    }
    public String getSauce() {
        return sauce;
    }
    @Override
    public void printInfo() {
        System.out.println(getName() + "(" + sauce + ") - " + getPrice() + "원");
    }
}
