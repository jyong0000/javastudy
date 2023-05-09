package project;

class Salad extends Menu {
    private String dressing;
    public Salad(String name, int price, String dressing) {
        super(name, price);
        this.dressing = dressing;
    }
    public String getDressing() {
        return dressing;
    }
    @Override
    public void printInfo() {
        System.out.println(getName() + "(" + dressing + ") - " + getPrice() + "원");
    }
}
