package Solid.DIP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");
        InterfazUsuario usuario;

        // Usando Oracle
        usuario = new InterfazUsuario(new OracleDatabase());
        usuario.saveEmployeeId("E001");

        // Usando Mysql
        usuario.setBaseDatos(new MySQLDatabase());
        usuario.saveEmployeeId("E001");

        // Cambiando la base de datos objetivo
        usuario.setBaseDatos(new OracleDatabase());
        usuario.saveEmployeeId("E001");
    }
}
