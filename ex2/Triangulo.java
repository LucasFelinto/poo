public class Triangulo extends Poligono implements Perimetro {

  
  public Triangulo(int id, double base, double altura) {
    super(id, base, altura);
  }

  public double area() {
    return (this.getBase() * this.getAltura()) / 2;
  }

  public double perimetro() {
    return 00;
  }
}