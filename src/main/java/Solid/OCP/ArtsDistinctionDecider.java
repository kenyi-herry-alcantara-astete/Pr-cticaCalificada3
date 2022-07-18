ackage Solid.OCP;

public class ArtsDistinctionDecider implements DistinctionDecider{

    @Override
    public void EvaluationDistinction(Estudiante estudiante) {
            if (estudiante.score > 70) {
                System.out.println(estudiante.regNumber+" ha recibido una distincion en artes.");
            }
    }

}
