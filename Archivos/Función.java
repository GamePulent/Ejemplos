package com.guekho64.Test;

public class Función {

  //¡Vamos a crear nuestro primer método o función en Java!

  // Aqui, la función se llama "MiFunción" (Puedes ponerle otro nombre) y para trabajar, necesitará un "String", 
  // el cual se le conocerá como "UnMensaje" dentro de esta función, y
  // como la función es de tipo "Void", no devolverá ningun valor cuando la función termine
  static void MiFunción (String UnMensaje) {

    // Recuerda que, desde donde esta el "{" hasta donde esta el "}" es todo lo que la función hará

    // Con esto, indicamos que la variable "UnMensaje" de tipo "String", se muestre
    System.out.println(UnMensaje);

    // No olvides cerrar el "cuerpo" de la función con una llave "}"
  }
  
  // Ahora haré una función que SI devuelva algo
  
  // Esta función sumará los números que le demos y nos devolverá el resultado que se obtenga
  // Nótese que, ahora en lugar de "void", ahora dice "int". Lo podemos cambiar por lo que sea que quiéramos que nos devuelva la función (Un mensaje, un número...)
  // De igual manera, nuestros argumentos ahora, en lugar de uno, son dos, y ambos son de tipo "int", que significa "enteros" (Número enteros)
  // Con una coma estoy "separando" un argumento del otro
  static int Suma (int UnNúmero, int OtroNúmero) {
    
    // Aquí le estoy especificando qué me devolverá con la palabra "return"
    return (UnNúmero + OtroNúmero);
    
  }
  
  // Esta función es otro ejemplo de como devolver ahora un String
  static String ConvertirIntAString (int Número) {
    
    // Aquí estoy convirtiendo el Número a un mensaje y lo devuélvo como resultado de la función 
    return (((Integer) Número).toString());
    
  }

  // Recordar que la función "main" es la que hará todo el trabajo, por lo que si no llamamos a nuestras funciones desde aquí, no hará nada
  public static void main(String[] args) {

    // Creamos la variable HolaMundo con un  mensaje
    final String HolaMundo = "Hola :D";
    
    // Creamos otra variable distinta con otro mensaje
    final String SoyOtroMensaje = "Yo no pienso saludarte >:| ";
    
    // Llamamos a nuestra función con la variable "HolaMundo" como argumento, del cual la función hará uso
    MiFunción(HolaMundo);
    
    // Llamamos a nuestra función con la variable "SoyOtroMensaje" ahora
    MiFunción(SoyOtroMensaje);

    // Ahora usemos nuestra segunda función
    
    // Con una coma estoy "separando" un argumento del otro
    // Esto me tiene que devolver 3
    // Pero como solo estoy sumando, no hará nada más, lo que no me sirve de nada
    Suma(1, 2);
    
    // PERO, si quiero, igual puedo hacer que me muestren el resultado...
    // ¡Y para eso, vamos a combinar nuestras funciones!
    
    // Aquí, estoy diciendo:
    // 1 y 2 son los agumentos de "Suma"
    // Lo que salga de "Suma(1, 2)" es el argumento de "ConvertirIntAString"
    // Lo que salga de "ConvertirIntAString" será el argumento de "MiFunción"
    // Lo que salga de "MiFunción" será puesto en Pantalla
    // ¡Listo!
    MiFunción(ConvertirIntAString(Suma(1, 2)));

  }




}


