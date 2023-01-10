package Errores;
/*
*------------> Tipos de error <-------------
* 1 - Error en tiempo de ejecución: situación que ha ocurrido en nuestro programa que
* no hemos podido esperar y hace que nuestro programa aborte. Es muy fácil de no
* capturar
* Se producen cuando se ejecuta el programa
*
* 2 - Error de compilación: fallas en la estructura o sintaxis
*
* 3 - Error lógico / humano: fallas en la lógica al armar el programa. Son los peores
* porque pueden pasar desapercibidos.
*
*
*
*
* --------------< Warnings >---------------
*
* Puedo evitarlos con decoradores
* @SuppressWarnings("tipo de warning") -> hace desaparecer o lo ignora
*
* Lo ideal es siempre solucionarlos, no ignorarlos porque puede traer
* muchos errores a la larga.
*
* ---------> Gestion de error <---------------
* try -> va el código que quieres "proteger"
* catch(Exception e) ->  dispara la excepcion
*   (Exception e) -> cuando no se cual es la excepcion y captura todas pero no es lo ideal
*   (ExceptionEnConcreto e) -> específica
* puedo ponerle tantos catch() como excepciones necesite.
*
* finally -> se ejecuta siempre
*         -> se puede utilizar para resetear variables o así
*         -> se dice que no está bien utilizarla
*
*
*
* ---------> Generar excepciones <--------------
*
* throw -> generar una excepcion
*
* throws -> para declarar que una funcion devuelve una excepcion
*
*
*
*
*
 */
public class Errores {
}
