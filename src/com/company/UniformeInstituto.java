package com.company;

public abstract class UniformeInstituto {
  public UniformeInstituto() {
    new Uniforme(this.crearPrendaSuperior(),
        this.crearPrendaInferior(),
        this.crearPrendaCalzado());
  }

  public abstract Prenda crearPrendaSuperior();
  public abstract Prenda crearPrendaInferior();
  public abstract Prenda crearPrendaCalzado();
}
