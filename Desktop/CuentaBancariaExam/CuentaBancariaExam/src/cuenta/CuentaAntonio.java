package cuenta;
/**
 * 
 * @author Antonio
 * @version 1
 * @since 17/05/2024
 */
public class CuentaAntonio {


    // Propiedades de la Clase CuentaAntonio
    
    private String nombre;
    private String cuenta;
    private double saldo;  //No se contemplan saldos negativos
    private double tipoInteres;

   /**
    * Constructor sin parametros
    */
    public CuentaAntonio ()
    {
    }
   
   /**
    * COnstructor con parametros
    * 
    * @param nom indica el nombre
    * @param cue indica la cuenta
    * @param sal indica el saldo
    * @param tipo indica el tipo de interes
    */
    public CuentaAntonio (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
   /**
    * Metodo que asigna nombres
    * @param nom indica el nombre
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     * metodo que obtiene el nombre
     * @return devuelve el nombre
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * metodo que indica el estado del saldo
     * @return devuelve el saldo
     */
     public double estado ()
    {
        return saldo;
    }
     
    /**
     * metodo que asigna el tipo de interes
     * @param tipo indica el tipo de interes
     */
    public void asignarTipo(double tipo)
    {
        tipoInteres=tipo;
    }
   
   /**
    * metodo que obtiene el tipo de interes
    * @return devuelve el tipo de interes
    */
    public double obtenerTipo()
    {
        return tipoInteres;
    }

   /**
    * Metodo para ingresar
    * @param cantidad indica la cantidad 
    * @param interes indica el intetres que tiene
    * @throws Exception lanza una excepcion en caso de que sea una cantidad negativa
    */
    public void ingresar(double cantidad, float interes) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * metodo para retirar dinero
 * @param cantidad indica la cantidad que se retira
 * @throws Exception lanza una excepcion si no se puede retirar una cantidad
 */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        
        saldo = saldo - cantidad;
    }

   /**
    * metodo que obtienes cuenta
    * @return devuelve la cuenta
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }
}
