package Excepciones;

public class UniformeInvalido extends RuntimeException{
  public UniformeInvalido() {
    super("El uniforme no se pudo crear le faltan prendas (superior, inferior o calzado)");
  }

}