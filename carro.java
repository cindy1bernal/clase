public class carro{
  private int velocidad;
  public void encender(){
    sistem.out.println("Me he encendido");
  }
public int acelerar(int a){
  velocidad = velocidad+a;
  return velocidad;
  }
public int frenar(int a){
  velocidad=velocidad-a;
  return velocidad;
  }
public void setVelocidad(int a){
  velocidad=a;
 }
public int getVelocidad(){
  return velocidad;
 }
}