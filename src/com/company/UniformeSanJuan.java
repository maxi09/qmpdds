package com.company;

public class UniformeSanJuan extends UniformeInstituto {

  @Override
  public Prenda crearPrendaSuperior() {
    Borrador chomba = new Borrador();
    chomba.setColorPrimario(new Color(0,1,0));
    chomba.setTipoPrenda(TipoPrenda.CHOMBA);
    chomba.setMaterial(Material.PIQUE);
    return chomba.crearPrenda();
  }

  @Override
  public Prenda crearPrendaInferior() {
    Borrador pantalon = new Borrador();
    pantalon.setColorPrimario(new Color(1,1,0)); //no se como hacer el gris con los tres
    pantalon.setTipoPrenda(TipoPrenda.PANTALON);
    pantalon.setMaterial(Material.ACETATO);
    return pantalon.crearPrenda();
  }

  @Override
  public Prenda crearPrendaCalzado() {
    Borrador zapatillas = new Borrador();
    zapatillas.setColorPrimario(new Color(1,1,1)); //es blanco
    zapatillas.setTipoPrenda(TipoPrenda.ZAPATILLA);
    zapatillas.setMaterial(Material.ALGODON);
    return zapatillas.crearPrenda();
  }
}
