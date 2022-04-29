package com.company;

public class UniformeJhonson extends UniformeInstituto {

  @Override
  public Prenda crearPrendaSuperior() {
    Borrador camisa = new Borrador();
    camisa.setColorPrimario(new Color(1,1,1));//blanco
    camisa.setTipoPrenda(TipoPrenda.CHOMBA);
    camisa.setMaterial(Material.PIQUE);
    return camisa.crearPrenda();
  }

  @Override
  public Prenda crearPrendaInferior() {
    Borrador pantalon = new Borrador();
    pantalon.setColorPrimario(new Color(0,0,0)); //negro
    pantalon.setTipoPrenda(TipoPrenda.PANTALON);
    return pantalon.crearPrenda();
  }

  @Override
  public Prenda crearPrendaCalzado() {
    Borrador zapatos = new Borrador();
    zapatos.setColorPrimario(new Color(0,0,0));
    zapatos.setTipoPrenda(TipoPrenda.ZAPATO);
    return zapatos.crearPrenda();
  }
}
