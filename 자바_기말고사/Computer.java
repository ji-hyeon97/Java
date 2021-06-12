package MachineDemo;

import java.util.List;

public interface Computer extends Tool {
    List<String> getPrograms();
    void setPrograms(List<String> programs);
    void addPrograms(String programs);
}
