package Solid.OCP;

import java.util.Arrays;
import java.util.List;

public class ArteEstudiante extends Estudiante{

    List<String> arts= Arrays.asList("Historia","Literatura");
    public ArteEstudiante(String name, String regNumber, double score, String department) {
        super(name, regNumber, score);
        if (arts.contains(department))
            this.department = department;

    }
}

