package com.company;

public class PropuestaQuitar implements Propuesta {

  private Prenda prenda;

  @Override
  public void aceptar(Guardarropa guardarropa){
    guardarropa.agregarPrenda(prenda);

  }

  @Override
  public void quitar(Guardarropa guardarropa){
    guardarropa.sacarPrenda(prenda);
  }

}
