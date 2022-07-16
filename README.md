# PracticaCalificada3

| Integrantes                               |
|-------------------------------------------|
| Alcantara Astete Kenyi Herry  20180343C   |
| Caycho Villalobos José Gabriel 20190584C  |
| Alexander Miller Rojas Sanchez  20190574H |
|                                           |


### Principio de responsabilidad única (Angel)


* Preguntas 1- 4 → 3 puntos


### Principio abierto/cerrado  (Miller)

* Preguntas 5- 11 → 4 puntos

### Principio de sustitución de Liskov  (Kenyi)

* Preguntas 12- 18 → 4 puntos
12. Muestra la salida y explica los resultados en función de los métodos entregados

![Salida de la pregunta 12](./src/main/resources/pregunta12.png)

>Se que observa que primero se muestra las solicitudes anterioes
>luego ..


13. Agregando
14. Dentro del método main(), utilizas una instancia de usuario invitado e intentas
    usar su clase auxiliar de la misma manera,¿ qué tipo de excepción te encuentras?¿Cuál es la
    solución?

Nos resulta:
![Salida de la pregunta 12](./src/main/resources/pregunta14e.png)
> Nos resulta la exepcion java.lang.UnsupportedOperationException, es decir la operación
> que se quiere ejecutar no es compatible.

>Para olucionar debemmos, resultandonos:

![Salida de la pregunta 12](./src/main/resources/pregunta14.png)

### Principio de segregación de interfaz

* Preguntas 19- 30 → 5 puntos

### Principio de inversión de dependencia (José)

* Preguntas 31- 36 → 4 puntos
31. Muestra la salida y explica los resultados en función de los métodos entregados
* La clase **Cliente** instancia un objeto *usuario* de la clase **InterfazUsuario**. 
* El objeto *usuario* llama a su método *saveEmployeeId* que recibe como argumento el ID del *usuario*.
* El método *saveEmployeeId* mediante el objeto *oracleDatabase* instanciado de la clase **OracleDatabase**
llama al método *saveEmpIdInDatabase* que muestra el siguiente mensaje en consola.

![](./src/main/resources/p31.png)

32. El programa es simple, pero ¿qué tipo de problemas presenta?
* Acoplamiento: La clase **InterfazUsuario** depende de la clase OracleDatabase, impidiendo reutilizar la clase 
**InterfazUsuario** con una Base de Datos diferente, reduciendo su flexibilidad.
* Dependencias no claras: El objeto *oracleDatabase* es más difícil de detectar en la clase **InterfazUsuario**, 
tenemos que leer de arriba hacia abajo para detectar su funcionalidad.
* Test más complicado: No se puede realizar tests a la clase **InterfazUsuario** de forma aislada, 
por ello, si el test falla, será difícil de detectar que objeto origina el error.

33-34. Completa todos los archivos siguientes de la sección SOLID
* InterfazUsuario.java
* BaseDatos.java 
* OracleDataBase.java 
* MySQLDatabase.java 
* Cliente.java

**InterfazUsuario**
```java
class InterfazUsuario {
    private final BaseDatos baseDatos;

    public InterfazUsuario(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void saveEmployeeId(String empId) {
        baseDatos.saveEmpIdInDatabase(empId);
    }
}
```

**BaseDatos**
```java
interface BaseDatos {
    void saveEmpIdInDatabase(String empId);
}
```

**OracleDatabase**
```java
class OracleDatabase implements BaseDatos {
    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("El id: " + empId + " es guardado en la base de datos Oracle.");
    }
}
```

**MySQLDatabase**
```java
class MySQLDatabase implements BaseDatos {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("El id: " + empId + " es guardado en la base de datos MySQL.");
    }
}
```

**Cliente**
```java
public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");
        InterfazUsuario usuario;

        // Usando Oracle
        usuario = new InterfazUsuario(new OracleDatabase());
        usuario.saveEmployeeId("E001");

        // Usando Mysql
        usuario = new InterfazUsuario(new MySQLDatabase());
        usuario.saveEmployeeId("E001");

        // Cambiando la base de datos objetivo
        usuario = new InterfazUsuario(new OracleDatabase());
        usuario.saveEmployeeId("E001");
    }
}
```

Explica los resultados. ¿El programa resuelve todos los posibles problemas del programa que no usa DIP?.
El principio DIP resuelve los problemas anteriormente mencionados:

* Disminuye el Acoplamiento: La clase **InterfazUsuario** no depende de la clase OracleDatabase, pudiendo reutilizar la clase
  **InterfazUsuario** con una Base de Datos diferente, por ejemplo una Base de Datos MySQL, aumentando su flexibilidad.
* Quedan claro las dependencias: Podemos saber que Base de Datos utiliza la Interfaz Usuario debido a que la Base de Datos es 
enviada por nosotros. El objeto instanciado con una Base de Datos podemos saber, por lo tanto, es
  más difícil predecir que cambios realiza.
* Realizar los tests son menos complicados: Podemos realizar test de forma aislada, por ello, si un test falla, es más 
fácil ver que objeto es el culpable.

35. Encuentra alguna excepción a esta sugerencia.

>Los módulos de alto nivel simplemente no deberían depender de los módulos de bajo nivel de ninguna manera.


38. El constructor de la clase InterfazUsuario acepta un parámetro de base de datos.
Proporciona una instalación adicional a un usuario cuando utiliza tanto el constructor como el
método setter (setDatabase) dentro de esta clase. ¿Cuál es el beneficio?.