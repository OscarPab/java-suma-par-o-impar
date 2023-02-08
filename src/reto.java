
public class reto {
  public String suma(int valor1, int valor2) {
    int resultado = valor1 + valor2;
    return "El resultado es: " + resultado;
  }

  public static void main(String[] args) {
    reto objetoreto = new reto();
    String resultado = objetoreto.suma(10, 5);
    System.out.println(resultado);
  }
}
/* oscar pablo morales zuñiga */