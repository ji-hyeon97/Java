package MachineDemo;
public class MachineDemo {
    public static void main(String[] args) {
        Laptop lap = new Laptop("LG gram",10,20,"LG전자",5);
        RoboticVaccum robot = new RoboticVaccum("좋은 청소기",15,30,"삼성전자",100,180);
        System.out.println("Laptop name: "+lap.getName());
        System.out.println("Laptop Productive year: "+lap.getProductYear());
        System.out.println("Laptop price: "+lap.getPrice());
        System.out.println("Laptop brandName: "+lap.getBrandName());
        System.out.println("Laptop weight: "+lap.getWeight());
        System.out.println("");
        System.out.println("RoboticVaccum name: "+robot.getName());
        System.out.println("RoboticVaccum Productive year: "+robot.getProductYear());
        System.out.println("RoboticVaccum price: "+robot.getPrice());
        System.out.println("RoboticVaccum brandName: "+robot.getBrandName());
        System.out.println("RoboticVaccum capacity: "+robot.getCapacity());
        System.out.println("RoboticVaccum runningTime: "+robot.getRunningTime());
    }
}
