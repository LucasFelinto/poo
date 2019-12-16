public abstract class Poligono {
  private int id;
  private double base;
  private double altura;


  public Poligono(int id, double base, double altura) {
    this.setId(id);
    this.setAltura(altura);
    this.setBase(base);
  }
  
  public abstract double area();

  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }


  public double getBase() {
    return this.base;
  }
  
  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return this.altura;
  }
  
  public void setAltura(double altura) {
    this.altura = altura;
  }
}