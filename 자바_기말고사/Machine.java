package MachineDemo;

public class Machine {
    private String name;
    private int productYear;
    private int price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Machine(String name, int productYear, int price, String brandName, int weight) {
        this.name = name;
        this.productYear = productYear;
        this.price = price;

    }
    public Machine(String name, int productYear, int price) {
        this.name = name;
        this.productYear = productYear;
        this.price = price;
    }
}

