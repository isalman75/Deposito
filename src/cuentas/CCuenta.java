package cuentas;

/**
 * Clase cuenta que implementa diversas funcionalidades de una cuenta bancaria
 * @author Israel
 * @version 2.0
 * @since 14-01-2022
 */
public class CCuenta 
    {
    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Numero de cuenta del titular.
     */
    private String cuenta;
    /**
     * Saldo de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interes de la cuenta.
     */
    private double tipoInteres;

    public CCuenta()
        {
        }
    /**
     * Constructor que inicializa los atributos de la clase a los parametos pasados.
     * @param nom nombre del titular de la cuenta.
     * @param cue numero de cuenta del titular.
     * @param sal saldo de la cuenta del titular.
     * @param tipo tipo de interes de la cuenta del titular.
     */
     
    public CCuenta(String nom, String cue, double sal, double tipo)
        {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo; // Linea  no incluido por error en el enunciado.
        }
    /**
     * Metodo que devuelve el saldo de cuenta (getSaldo).
     * @return saldo valor del saldo de la cuenta. 
     */
    public double estado()
        {
        return saldo;
        }
    /**
     * Metodo que ingresa una cantidad en la cuenta (setSaldo).
     * @param cantidad cantidad a ingresar en la cuenta.
     * @throws Exception se poduce excepción si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
        {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
        }
    /**
     * Metodo que retira una cantidad de la cuenta.
     * @param cantidad cantidad a retirar de la cuenta.
     * @throws Exception se produce excepción en el caso de querer retirar una 
     * cantidad negativa o si no hay saldo suficiente en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
        {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
        }
    /**
     * Metodo que devuelve el titular de la cuenta.
     * @return nombre titular de la cuenta.
     */
    public String getNombre() 
        {
        return nombre;
        }
    /**
     * Metodo que pone el titular de una cuenta.
     * @param nombre nombre del titualar de la cuenta.
     */
    public void setNombre(String nombre) 
        {
        this.nombre = nombre;
        }
    /**
     * Metodo que devuelve el numero de cuenta.
     * @return cuenta numero de la cuenta.
     */
    public String getCuenta() 
        {
        return cuenta;
        }
    /**
     * Metodo que pone el numero de una cuenta.
     * @param cuenta numero de cuenta.
     */
    public void setCuenta(String cuenta) 
        {
        this.cuenta = cuenta;
        }
    /**
     * Metodo que devuelve el tipo de interés de la cuenta.
     * @return tipoInteres tipo de interés de la cuenta.
     */
    public double getTipoInteres() 
        {
        return tipoInteres;
        }
    /**
     * Metodoque pone el tipo de interes de una cuenta.
     * @param tipoInteres tipo interes de una cuenta.
     */
    public void setTipoInteres(double tipoInteres) 
        {
        this.tipoInteres = tipoInteres;
        }
    }
