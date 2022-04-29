package com.company;

public class Prenda {
  private TipoPrenda tipoPrenda;
  //private Categoria categoria;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material tipoMaterial;

  private Trama trama;

  public Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Material material, Trama trama) {
    if (tipoPrenda == null || material == null || colorPrimario == null){
      throw new PrendaExcepcion("La prenda no esta completa");
    }
    this.tipoPrenda = tipoPrenda;
    this.tipoMaterial = material;
    this.colorPrimario = colorPrimario;
    if(trama == null){
      this.trama = Trama.LISO;
    }else{
      this.trama = trama;
    }

  }

  public Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Material tipoMaterial, Trama trama, Color colorSecundario) {
    if(tipoPrenda == null || colorPrimario == null || tipoMaterial == null)
      throw new PrendaExcepcion("La prenda no esta completa");
    this.tipoPrenda = tipoPrenda;
    this.colorPrimario = colorPrimario;
    this.tipoMaterial = tipoMaterial;
    if(trama == null){
      this.trama = Trama.LISO;
    }else{
      this.trama = trama;
    }
    this.colorSecundario = colorSecundario;
  }


  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Categoria categoriaPrenda() {
    return tipoPrenda.getCategoria();
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Material getMaterial() {
    return tipoMaterial;
  }

  public void setMaterial(Material material) {
    this.tipoMaterial = material;
  }


}
