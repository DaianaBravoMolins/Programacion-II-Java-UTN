package ejercicio10;
    
public class CuentaBancaria {
    
    private int cbu;
    private int saldo;
    private ClaveSeguridad claveSeguridad; 
    private Titular titular;               


    public CuentaBancaria(int cbu, int saldo, int codigo, String fecha, String clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, fecha, clave); 
    }
    public void mostrarClaveSeguridad(){
        System.out.println("Su clave de seguridad es: " + claveSeguridad.getClave());
    }
   
    public int getCbu(){
        return cbu;
    }
    
    public void setTitular(Titular titular){
    this.titular = titular;
    if(titular != null && titular.getCuentaBancaria() != this){
        titular.setCuentaBancaria(this);
    }
}
    public int getSaldo(){
        return saldo;
    }
    
    public Titular getTitular(){
        return titular; 
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + '}';
    }    
}