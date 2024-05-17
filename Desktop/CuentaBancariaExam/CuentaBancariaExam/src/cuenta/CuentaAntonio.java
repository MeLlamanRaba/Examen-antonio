package cuenta;

public class CuentaAntonio {


    // Propiedades de la Clase CuentaAntonio
    private String nombre;
    private String cuenta;
    private double saldo;  //No se contemplan saldos negativos
    private double tipoInteres;

   
    public CuentaAntonio ()
    {
    }
   
   
    public CuentaAntonio (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }
     
    
    public void asignarTipo(double tipo)
    {
        tipoInteres=tipo;
    }
   
   
    public double obtenerTipo()
    {
        return tipoInteres;
    }

   
    public void ingresar(double cantidad, float interes) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        
        saldo = saldo - cantidad;
    }

   
    public String obtenerCuenta ()
    {
        return cuenta;
    }
}
