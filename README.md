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
5. ¿Por que no es correcto colocar displayResult() y evaluateDistinction() en la misma
clase, como la siguiente:

```java
    class Estudiante {
        // ….
        public void displayResult() {
        // codigo
        }
        public void evaluateDistinction() {
        // codigo
        }
        // …
    }
```
>Al modificar ya sea displayRessult() agregrando una nueva salida de resultados o mas importante
>aun, al modificar evaluateDistinction() supongamos que queremos agregar nuevos departamentos por ejemplo ingenieria
>tendremos que modificar evaluateDistinction() para evaluar la distinción para el departamento de ingenieria pero este 
>metodo se encuentra dentro de estudiantes por ende estariamos modificando la clase estudiante lo que violaria el 
>principio de abierto y cerrado porque la clase Estudiante debe estar cerrada para cambios pero abierta a extenciones lo 
>adecuado seria aplicar el patron de diseño strategy creando una interfaz que me permita conectar Estudiante con las clases evaluateDistinction()
>y displayResult() de esta manera al modificar cualquiera de las 2 la class Estudiante permanece invariante cumpliento el
>principio SOLID de abierto y cerrado.

6.Muestra la salida y explica los resultados en función de los métodos entregados

![Salida de la pregunta 12](./src/main/resources/pregunta6.png)

>Se crea una lista enrolledStudents del tipo Estudiante en la clase Cliente donde esta el main, se usa el método enrollStudents() para llenar dicha lista con los datos de los estudiantes, estos datos son suministrados por el cliente.
![Salida de la pregunta 12](./src/main/resources/pregunta6.1.png)
>Para poder mostrar los resultados usando un objeto de la clase Estudiante sobreescribimos el método toString() este metodo ya viene
> por defecto en java en el paquete java Object dicho método al imprimir un objeto de una clase te muestra el paquete, el nombre y un codigo hash de la Clase a cual pertenece el objeto impreso, convenientemente se sobrescribe el método para poder mostrar los atributos del estudiante sin hacerlo uno por uno.
![Salida de la pregunta 12](./src/main/resources/pregunta6.2.png)
> Imprimimos
![Salida de la pregunta 12](./src/main/resources/pregunta6.3.png)\
>Por ultimo de la misma manera que estudiantes se muestra las distinciones donde el método evaluateDistinction() es el encargado , mostrando distinciones de acuerdo al score que es una atributo de estudiante, te muestra si as
>recibido una distinción de acuerdo al departamento que pertenezcan.
![Salida de la pregunta 12](./src/main/resources/pregunta6.4.png)
> Imprimimos
> ![Salida de la pregunta 12](./src/main/resources/pregunta6.4.png)

7. ¿Cuál es el problema con este diseño y las razones posibles del problema?

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


