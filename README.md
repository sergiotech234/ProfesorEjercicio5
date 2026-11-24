# Ejercicio 5: Profesor

## 📌 Descripción

Este ejercicio consiste en desarrollar una clase llamada `Profesor` utilizando los conceptos de **Programación Orientada a Objetos (POO)** en Java.

La clase representa a un profesor y almacena información personal y laboral mediante atributos privados.

## ⚙️ Validaciones

Se establecen las siguientes condiciones para garantizar que los datos sean correctos:

- El nombre no puede estar vacío.
- El departamento no puede estar vacío.
- El salario no puede ser negativo.
- El salario puede ser igual a `0`.

Si se intenta establecer un salario negativo, el programa debe rechazar el valor y mantener el salario anterior.

## 🧪 Clase de prueba: TestProfesor

Se crea una clase llamada `TestProfesor` para comprobar el funcionamiento de la clase `Profesor`.

Las pruebas realizadas son:

1. Crear un objeto `Profesor` utilizando el constructor.
2. Mostrar la información inicial del profesor.
3. Consultar los atributos mediante los getters.
4. Modificar el nombre, el salario y el departamento mediante los setters.
5. Intentar establecer un salario negativo para comprobar que se rechaza.
6. Establecer el salario a `0` para comprobar que se acepta.
7. Mostrar la información actualizada utilizando `mostrarInformacion()` y `toString()`.
