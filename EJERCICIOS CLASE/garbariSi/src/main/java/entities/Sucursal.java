package entities;

import entities.observers.IObserver;
import entities.productos.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Sucursal {
   private String nombre;
   private List<Producto> productos;
   private List<IObserver> observers;

   public Sucursal(String nombre){
     this.nombre = nombre;
     this.productos = new ArrayList<>();
     this.observers = new ArrayList<>();
   }

   public void agregarObservers(IObserver ... observers) {
     Collections.addAll(this.observers, observers);
   }

   public void eliminarObserver(IObserver observer) {
     observers.remove(observer);
   }

   public void agregarProducto(Producto ... productos) {
     Collections.addAll(this.productos, productos);
   }

   public void vende(Producto producto){
      this.observers.forEach(o -> o.notificarVenta(producto));
   }

}
