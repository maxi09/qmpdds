package com.company;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda(){
    //Utilizo la validacion de la clase prenda para poder decidir si la creacion se puede hacer o no
    return new Prenda(this.tipoPrenda, this.colorPrimario, this.material, this.trama, this.colorSecundario);
  }
}
