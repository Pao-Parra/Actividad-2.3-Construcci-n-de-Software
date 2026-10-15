package tienda;

public class Cliente {
    private String nombre;
    private String ciudad;
    private int comprasRealizadas;

    public Cliente(String nombre, String ciudad, int comprasRealizadas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.comprasRealizadas = comprasRealizadas;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public int getComprasRealizadas() { return comprasRealizadas; }

    // INLINE METHOD
    public boolean esFrecuente() {
        return masDeCincoCompras();
    }

    private boolean masDeCincoCompras() {
        return comprasRealizadas > 5;
    }
}
