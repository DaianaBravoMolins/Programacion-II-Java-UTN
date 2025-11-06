package Principal;

import java.util.ArrayList;


public class Inventario {
    
    private ArrayList<Producto> productos = new ArrayList<>();

//Crear al menos cinco productos con diferentes categorías y agregarlos al inventario
    public void agregarProducto(Producto p){
        productos.add(p);
    }
//Listar todos los productos mostrando su información y categoría
    public void listarProductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        return;
    }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
//Buscar un producto por ID y mostrar su información.
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if(p.getId().equals(id))
                return p;
        }
            return null;
    }
    
 // Filtrar y mostrar productos que pertenezcan a una categoría específica.      
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : productos) {
            if(p.getCategoria() == categoria){
                p.mostrarInfo();
        }
        }
    }
// Eliminar un producto por su ID y listar los productos restantes.
    public void eliminarProducto(String id){
        for (Producto p : productos) {
            if(p.getId().equals(id)){
                productos.remove(p);
                break;
        }
    }
    }
    
// Actualizar el stock de un producto existente.
    public void actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null){
            p.setCantidad(nuevaCantidad);
         }
    }

// Mostrar el total de stock disponible.    

    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }


//  Obtener y mostrar el producto con mayor stock.    
    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()){
            return null;
        }
        Producto mayor =  productos.get(0);
            for (Producto p: productos) {
                if (p.getCantidad() > mayor.getCantidad()){
                    mayor = p;
                }            
        }
        return mayor;
    }
    
// Filtrar productos con precios entre $1000 y $3000
    public void filtrarProductosPorPrecio(double min, double max){
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max){
                p.mostrarInfo();
            }
        }
    }
// Mostrar las categorías disponibles con sus descripciones.
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " +  c.getDescripcion() );
        }
    }
                
}
