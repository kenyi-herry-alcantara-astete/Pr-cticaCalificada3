# PracticaCalificada3

| Integrantes                               |
|-------------------------------------------|
| Alcantara Astete Kenyi Herry  20180343C   |
| Caycho Villalobos José Gabriel 20190584C  |
| Alexander Miller Rojas Sanchez  20190574H |
|             Angel Darwing Chauca De La Cruz  20182666D                            |


### Principio de responsabilidad única (Angel)


* Preguntas 1- 4 → 3 puntos

1. Muestra la salida y explica los resultados en función de los métodos entregados

2. ¿Cuál es el problema con este diseño y las razones posibles del problema?


3. Modifica la clase Empleado.
    3.1 Agrega dos clases:
        3.1.1 La clase SeniorityChecker que contiene el método checkSeniority() 
        3.1.2 La clase GeneradorIDEmpleado contiene el método generateEmpId(...) para generar la identificación del empleado.
    3.2 Para mejorar la legibilidad del código y evitar torpezas dentro del método main():
        3.2.1 Utiliza elmétodo estático showEmpDetail(...). Este método llama al método displayEmpDetail() de
              Empleado, al método generateEmpId() de GeneradorIDEmpleado y al método checkSeniority()
              de SeniorityChecker. Tú entiendes que este método no era necesario, pero hace que el código
              del cliente sea simple y fácilmente comprensible.
              
4. Realiza una demostración completa que sigue a SRP. Explica tus resultados              


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


