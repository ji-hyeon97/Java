package MachineDemo;
import java.util.List;
public class Laptop extends Machine implements Computer {
    private String BrandName;
    private int weight;
    private List<String> programs;

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        this.BrandName = brandName;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Laptop(String name, int productYear, int price,String brandName, int weight) {
       super(name,productYear,price,brandName,weight);
       this.BrandName = brandName;
       this.weight = weight;
    }
    public List<String> getPrograms() {
        return null;
    }
    public void setPrograms(List<String> programs) {
    }
    public void addPrograms(String programs) {
    }
}
