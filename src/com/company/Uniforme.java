package com.company;

import Excepciones.UniformeInvalido;

public class Uniforme {
  Prenda prendasuperior;
  Prenda prendainferior;
  Prenda calzado;

  public Uniforme(Prenda prendasuperior, Prenda prendainferior, Prenda calzado) {
    if(prendasuperior.categoriaPrenda().equals(Categoria.PRENDA_SUPERIOR)
        && prendainferior.categoriaPrenda().equals(Categoria.PRENDA_INFERIOR)
        && calzado.categoriaPrenda().equals(Categoria.CALZADO)){
      this.prendasuperior = prendasuperior;
      this.prendainferior = prendainferior;
      this.calzado = calzado;

    }
    else{
      throw new UniformeInvalido();
    }
  }
}
