package com.company;

import com.company.Prenda;

import java.util.List;

public class Guardarropa {

  private String nombre;
  private List<Prenda> prendas;
  private List<Prenda> prendasPendientes;
  private List<Prenda> prendasAceptadas;


  public List<Prenda> getSugerenciasPendientes(){
    return prendasPendientes;
  }

  public List<Prenda> getSugerenciasAceptadas(){
    return prendasAceptadas;
  }

  public void agregarPrenda(Prenda prenda){
    if (this.prendas.contains(prenda))
      throw new RuntimeException("La prenda ya existe");
    else
      this.prendas.add(prenda);
  }

  public void sacarPrenda(Prenda prenda){
   if (this.prendas.contains(prenda))
     throw new RuntimeException("La prenda no existe");
   else
     this.prendas.remove(prenda);
  }

  public void agregarSugerenciaPrenda(Prenda prenda){
    this.prendasPendientes.add(prenda);
  }

  public void quitarSugerenciaPrenda(Prenda prenda){
    if(!this.prendasPendientes.contains(prenda))
      throw new RuntimeException("La prenda no existe");
    else
      this.prendasPendientes.remove(prenda);
  }

  public void quitarPrendaAceptada(Prenda prenda){
    if (!this.prendasAceptadas.contains(prenda))
      throw new RuntimeException("La prenda no existe");
    else
      this.prendasAceptadas.remove(prenda);
  }

}
