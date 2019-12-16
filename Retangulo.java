public class Retangulo {
  private double area;
  private double altura;

  private static double maior;

  public Retangulo(double area, double altura) {
    this.setArea(area);
    this.setAltua(altura);

    if(Retangulo.maior < this.getArea()) {
      Retangulo.setMaior(this.getArea());
    }
  }

  public static double getMaior() {
    return Retangulo.maior;
  }

  public static void setMaior(double maior) {
    Retangulo.maior = maior;
  }

  public double area() {
    return this.getArea() * this.getAltura();
  }

  public double getArea() {
    return this.area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltua(double altura) {
    this.altura = altura;
  }

}