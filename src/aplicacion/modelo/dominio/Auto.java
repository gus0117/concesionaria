
package aplicacion.modelo.dominio;

public class Auto {
    private int codigo;
    private String marca;
    private String modelo;
    private String color;
    private double precio;

    public Auto() {
    }

    public Auto(int codigo, String marca, String modelo, String color, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    
    public void mostrarPrecio(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Precio: " + this.precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Auto{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + '}';
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
