package Solid.SRP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin SRP");

        Empleado jessica = new Empleado("Jessica", "Abejita", 7.5);
        showEmpDetail(jessica);

        System.out.println("\n----\n");

        Empleado chalo  = new Empleado("Chalito", "Smart", 3.2);
        showEmpDetail(chalo );

    }

    private static void showEmpDetail(Empleado emp) {
        GeneradorIDEmpleado id = new GeneradorIDEmpleado();
        SeniorityChecker se= new SeniorityChecker();
        emp.displayEmpDetail();
        System.out.println("El ID del empleado es: "+ id.generateEmpId(emp.firstName));
        System.out.println("Este empleado es un" + " empleado " + se.checkSeniority(emp.experienceInYears));
    }
}
