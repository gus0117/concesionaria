
package aplicacion.modelo.dominio;


public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private int id;
    
    public Cliente(String nombre, String apellido, String dni, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = id;
    }
    public void mostrarCliente(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Dni: " + this.dni);
        System.out.println("Id: " + this.id);
    }
    public void realizarPago(){
        
    }
    public void probarAuto(){
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
