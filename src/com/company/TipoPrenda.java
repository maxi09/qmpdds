package com.company;

public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  ZAPATILLA(Categoria.CALZADO),
  CAMISA(Categoria.PRENDA_SUPERIOR),
  CHOMBA(Categoria.PRENDA_SUPERIOR),
  PANTALON(Categoria.PRENDA_INFERIOR),
  ANTEOJOS(Categoria.ACCESORIO);


  private final Categoria CATEGORIA;

  TipoPrenda(Categoria categoria) {
    CATEGORIA = categoria;
  }


  protected Categoria getCategoria() {
    return CATEGORIA;
  }
}
