package Dominio;

import Dominio.Parte2.Trama;

public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(Tipo tipo, Material material, Color colorPrimario,Color colorSecundario,Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama=trama;
  }

  public Categoria categoria(){
    return tipo.getCategoria();
  }

}