
package aplicacion.modelo.dominio;


public class Empleado {
    private String nombre;
    private String apellido;
    private int numEmpleado;
    
    public Empleado(String nombre, String apellido, int numEmpleado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numEmpleado = numEmpleado;
    }
    public void mostrarEmpleado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Numero Empleado: " + this.numEmpleado);
    }
    public void venderAuto(){
        System.out.println("Vendiendo Auto");
    }
    public void mostrarAuto(){
        
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
     * @return the numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * @param numEmpleado the numEmpleado to set
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
}
