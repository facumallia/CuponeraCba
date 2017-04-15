package teampromociones.cuponeracba;

/**
 * Created by Facu on 6/4/2017.
 */

public class Promocion {
    private int promo_id, promo_valor, marca_id, cantidad;
    private String titulo, descripcion, promo_imagen, fecha_inicio, fecha_fin, condiciones;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Promocion(int promo_id, String titulo, String descripcion, int promo_valor, String promo_imagen, int marca_id, String fecha_inicio, String fecha_fin, String condiciones, int cantidad) {
        this.promo_id = promo_id;
        this.promo_valor = promo_valor;
        this.marca_id = marca_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.promo_imagen = promo_imagen;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.condiciones = condiciones;
        this.cantidad = cantidad;
    }

    public int getPromo_id() {

        return promo_id;
    }

    public void setPromo_id(int promo_id) {
        this.promo_id = promo_id;
    }

    public int getPromo_valor() {
        return promo_valor;
    }

    public void setPromo_valor(int promo_valor) {
        this.promo_valor = promo_valor;
    }

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    public String getPromo_imagen() {
        return promo_imagen;
    }

    public void setPromo_imagen(String promo_imagen) {
        this.promo_imagen = promo_imagen;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Promocion(String titulo, String descripcion) {

        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
