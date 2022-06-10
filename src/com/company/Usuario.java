package com.company;

import Excepciones.GuardarropaNoExiste;
import java.util.List;

public class Usuario {

  private List<Guardarropa> guardarropas;



  public void agregarGuardarropa(Guardarropa guardarropa){
    this.guardarropas.add(guardarropa);

  }

  public void sugerirAgregarEn(Guardarropa guardarropa, Prenda prenda){
    if (!guardarropas.contains(guardarropa)){
      throw new GuardarropaNoExiste();
    }
    guardarropa.agregarSugerenciaPrenda(prenda);
  }

  public void sugerirQuitarEn(Guardarropa guardarropa, Prenda prenda){
    if (!guardarropas.contains(guardarropa)){
      throw new GuardarropaNoExiste();
    }
    guardarropa.quitarSugerenciaPrenda(prenda);
  }



}
