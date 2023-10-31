# JuegoDados

Evidencia 08: Tienda Online (e-shop)


Integrantes 

Valentina Huenchuñir

Maria Jose Powell

Fernanda Muñoz


Profesor:
Dr. Samuel Sepulveda

Asignatura:
Programación Orientada a Objetos

Fecha:
01 de noviembre de 2023



Caso Juego de Dados y Modelo de Clases


Objetivo: Modelar con UML y VP, para construir una solución basada en el concepto de relaciones entre clases.



Caso Juego de dados y sus consideraciones:
- Se desean modelar los elementos básicos de un dado, que permita solucionar el caso que se plantea a continuación.
- Para simplificar el concepto, consideramos como característica relevante sólo la cara superior de un dado que queda visible al lanzarlo.
- Se requiere que para dicho dado pueda simularse un lanzamiento y obtener un valor entre 1 y 6 de forma aleatoria.
- Considere que para un juego de dados se usan 2 dados. Se lanzan los dados y se calcula la suma de ambas caras superiores, si el resultado de la suma es 7 ganaste!!! sino has perdido!!!...
- Considere que el dado no sabe cómo se suman valores, para lo cual requiere la ayuda de una calculadora que para nuestro caso, al menos sabe cómo retornar la suma de dos cantidades de tipo entero.
- Implemente una prueba unitaria que permita probar su juego de dados y que le permita validar su funcionamiento.




3. Actividades a realizar (30 minutos)
- Identifique TODAS las clases presentes en el dominio problema.
- Establezca los atributos y métodos para c/CLASE.
- Identifique y defina las relaciones entre clases presentes en este caso.
- Modele el caso usando diagrama de casos UML y VP.
- Codifique su solución, considerando el número mínimo de clases y test necesarios para su implementación y pruebas mínimas de funcionamiento.




Clases identificadas:


- class Dado
- class Calculadora
- class JuegoDados
- class Dado

Atributos: 


int caraSuperior


Metodos:


lanzar() // lanza el dado utilizando un random
getCaraSuperior()




class JuegoDeDatos


Atributos:

int dado Dado1
int dado Dado2


Métodos:


JuegoDados()
simularJugar()
resultadosJuego()



class Calculadora


Metodos:

sumaDeCara()


public class Main

Metodos:
main()
// en el menú esta la condicion if y else para decir si la suma e la cara de los dos dados es 7 va a ganar, si no pierde.


- Identifique y defina las relaciones entre clases presentes en este caso.


Clase Dado <- - - - - - - - - - - - - - - - - - - - - - Clase Calculadora (Dependencia)
Clase Calculadora - - - - - - - - - - - - - - - - - - - - > Clase JuegoDados (Dependencia)
Clase Dado —————————————— Clase JuegoDados (Composición)
