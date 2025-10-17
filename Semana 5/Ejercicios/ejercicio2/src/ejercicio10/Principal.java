
package ejercicio10;


public class Principal {
    public static void main(String[] args) {
        
        
        ClaveSeguridad claveSeguridad = new ClaveSeguridad(33634, "AB-330230", "perla");        
        Titular titular = new Titular("Roberto Garcia", 35465653);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(5435, 4345555,53,"23-03-2025", "diamante");
       

        System.out.println(claveSeguridad);
        System.out.println(cuentaBancaria);
        System.out.println(titular);

    }

}
