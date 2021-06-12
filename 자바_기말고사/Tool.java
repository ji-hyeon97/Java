package MachineDemo;

public interface Tool {
    String getBrandName();
    void setBrandName(String brandName);
    default boolean isCreative() {
        return true;
    }
}
