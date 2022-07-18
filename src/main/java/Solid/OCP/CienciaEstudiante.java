package Solid.OCP;

import java.util.Arrays;
import java.util.List;

public class CienciaEstudiante extends Estudiante{

    List<String> science= Arrays.asList("Ciencia de la computacion","Fisica");

    public CienciaEstudiante(String name, String regNumber, double score, String department) {
        super(name, regNumber, score);
        if(science.contains(department))
            this.department = department;
    }
}
