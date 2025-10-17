
package ejercicio8;


public class Principal {
        public static void main(String[] args) {
         
            
            Usuario usuario = new Usuario("Ezequiel Zema", "eze234@gmail.com");

            FirmaDigital firmaDigital = new FirmaDigital(534546, "23-08-2025", "EzeZema", usuario);
            Documento documento = new Documento("Contrato Propiedad", "Bla bla bla",34235, "2025", "Eze", usuario);
        
         
            System.out.println(documento);
            System.out.println(firmaDigital);
            System.out.println(usuario);

        
        }
    
}
