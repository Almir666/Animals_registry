import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Animals {
    private String animal_name;
    private String birthDay;
    private List<String> comands = new ArrayList<>();

    public Animals(String name, String comand[]) {
        this.animal_name = name;
        comands.addAll(Arrays.asList(comand));
    }

    public String getAnimal_name() {
        return animal_name;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public List<String> getComands() {
        return comands;
    }
}

