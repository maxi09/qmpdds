package Excepciones;

public class GuardarropaNoExiste extends  RuntimeException{
  public GuardarropaNoExiste() {
    super("El guardarropa no existe)");
  }
}
