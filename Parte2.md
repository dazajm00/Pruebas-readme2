# Taller de nivelacion

## Parte teórica II.

### 3. Programacion.
15. Tipos de datos primitivos en Java: 
```

  - Enteros: byte, short, int, long.
  
  -Decimales: float, double

  -Caracteres: char

  -Booleanos: boolean

```
16. Estructuras de control de flujo
Condicionales:

  - if / else → ejecutan bloques según condiciones.

  - switch → selecciona entre múltiples opciones.

Bucles:

  - for → repite un bloque un número definido de veces.

 - while → repite mientras la condición sea verdadera.

 - do-while → ejecuta al menos una vez y luego evalúa la condición.

17. Importancia de nombres significativos
- Facilitan la lectura y comprensión del código.

- Ayudan a otros programadores (y a ti mismo en el futuro) a entender qué hace cada variable o método.

  - Ejemplo: usar calcularPromedio() en lugar de cp().
18. ¿Qué es la Programación Orientada a Objetos (POO)?
- Es un paradigma que organiza el software en objetos, que combinan datos (atributos) y comportamientos (métodos). Permite modelar problemas de forma más cercana a la realidad.
19. ¿Cuales son los 4 pilares de la programacion orientada a objetos?. 
- Encapsulación: proteger los datos dentro de clases.

- Abstracción: ocultar detalles y mostrar solo lo esencial.

- Herencia: reutilizar código creando clases que heredan de otras.

- Polimorfismo: permitir que un mismo método se comporte de distintas formas según el contexto.
20. ¿Qué es la herencia POO y como se utiliza en Java?
- Permite que una clase (hija) herede atributos y métodos de otra (padre).

- En Java se usa con la palabra clave extends.
  - Ejemplo: 
```
class Animal { void comer() { } }
class Perro extends Animal { void ladrar() { } }
```
21. Modificadores de acceso en Java

- public: accesible desde cualquier clase.

- private: accesible solo dentro de la misma clase.

- protected: accesible desde la misma clase, subclases y mismo paquete.

- default (sin palabra clave): accesible solo dentro del mismo paquete.
22. Variables de entorno
- Son valores definidos en el sistema operativo que afectan la ejecución de programas.

  - Ejemplo: JAVA_HOME indica dónde está instalado Java.

  - Importancia: permiten configurar rutas, credenciales o parámetros sin tener que escribirlos directamente en el código.