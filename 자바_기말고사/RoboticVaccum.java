package MachineDemo;

import java.util.List;

public class RoboticVaccum extends Machine implements Computer,HomeAppliance {
    private String brandName;
    private int capacity;
    private int runningTime;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }
    public List<String> getPrograms() {
        return null;
    }

    public void setPrograms(List<String> programs) {
    }

    public void addPrograms(String programs) {
    }

    public RoboticVaccum(String name, int productYear, int price, String brandName,int capacity,int runningTime) {
        super(name, productYear, price);
        this.brandName = brandName;
        this.capacity = capacity;
        this.runningTime = runningTime;
    }
}
