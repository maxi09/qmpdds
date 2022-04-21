package com.company;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Categoria categoria;
  private String colorPrincipal;
  private String colorSecundario;
  private Material material;

  public Prenda(TipoPrenda tipoPrenda, String colorPrincipal, Material material) {
    if (tipoPrenda == null || material == null || colorPrincipal == null){
      throw new PrendaExcepcion("La prenda no esta completa");
    }
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
  }


  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public String getColorPrincipal() {
    return colorPrincipal;
  }

  public String getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }


}
