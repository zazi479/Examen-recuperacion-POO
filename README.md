# Examen-recuperacion-POO

5. Explica brevemente como replantearías tu código si hubiera varios tipos de personas de
naturaleza similar con pequeñas variaciones entre ellas, por ejemplo: estudiante y
profesor. En relación a esto, ¿en qué caso o casos podríamos utilizar la palabra
reservada super?

Mantendria la clase Persona como una clase abstracta y no crear objetos directamente y así poder usar la herencia para crear clases hijas que se extiendan de la clase Persona y que se añaden los atributos y métodos específicos de Persona.
En las clases hijas,podríamos utilizar la palabra clave “super” para hacer referencia a los constructores y métodos de la clase padre(Persona).


6. ¿Son realmente neceserios los getters y los setters en este enunciado? Justifica tu
respuesta.
