
package Principal;


public class Principal {
    public static void main(String[] args) {
    Inventario inventario = new Inventario();
    
    
    //creamos 5 productos
         
        Producto p1 = new Producto("A1", "Leche", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B2", "Celular", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C3", "Remera", 3000, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D4", "Sillón", 28000, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E5", "Pan", 800, 50, CategoriaProducto.ALIMENTOS);
    
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        
        System.out.println("LISTA DE PRODUCTOS");
        inventario.listarProductos();
        
        System.out.println("PRODUCTOS DE ALIMENTOS");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        
        System.out.println("ELIMINAR PRODUCTO");
        inventario.eliminarProducto("D4");
        inventario.listarProductos();
        
        System.out.println("ACTUALIZAR STOCK");
        inventario.actualizarStock("A1", 40);
        inventario.listarProductos();
        
        System.out.println("TOTAL DE STOCK");
        System.out.println("Total: " + inventario.obtenerTotalStock());
        
        System.out.println("PRODUCTO CON MAYOR STOCK");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
       
        System.out.println("PRODUCTOS ENTRE $1000 Y $3000");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        System.out.println("CATEGORÍAS DISPONIBLES");
        inventario.mostrarCategoriasDisponibles();
        
}
}