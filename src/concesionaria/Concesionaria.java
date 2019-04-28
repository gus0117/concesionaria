
package concesionaria;
import aplicacion.modelo.dominio.Empleado;
import aplicacion.modelo.dominio.Cliente;
import aplicacion.modelo.dominio.Auto;

public class Concesionaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(1,"Suran","Valkswagen","Gris",500000f);
        Auto auto2 = new Auto(2,"307","Peugeaut","Blanco",350210f);
        Auto auto3 = new Auto(3,"Veneno", "Lamborgini","Rojo",1023134f);
        
        System.out.println("Auto 1");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Color: " + auto1.getColor());
        System.out.println("Precio: " + auto1.getPrecio());
        
        System.out.println("Auto 2");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Color: " + auto2.getColor());
        System.out.println("Precio: " + auto2.getPrecio());
        
        System.out.println("Auto 3");
        System.out.println("Marca: " + auto3.getMarca());
        System.out.println("Modelo: " + auto3.getModelo());
        System.out.println("Color: " + auto3.getColor());
        System.out.println("Precio: " + auto3.getPrecio());
        
        Cliente cli1 = new Cliente("Gustavo","Lozano","33.444.513",123);
        Cliente cli2 = new Cliente("Alberto","Gutierrez","23.241.123",455);
        Cliente cli3 = new Cliente("Gimenza","Mendoza","31.412.523",789);
        
        System.out.println("Cliente 1");
        System.out.println("Nombre: " + cli1.getNombre());
        System.out.println("Apellido: "+cli1.getApellido());
        System.out.println("DNI: " + cli1.getDni());
        System.out.println("ID: " + cli1.getId());
        
        System.out.println("Cliente 2");
        System.out.println("Nombre: " + cli2.getNombre());
        System.out.println("Apellido: "+cli2.getApellido());
        System.out.println("DNI: " + cli2.getDni());
        System.out.println("ID: " + cli2.getId());
        
        System.out.println("Cliente 3");
        System.out.println("Nombre: " + cli3.getNombre());
        System.out.println("Apellido: "+cli3.getApellido());
        System.out.println("DNI: " + cli3.getDni());
        System.out.println("ID: " + cli3.getId());
        
        Empleado emp1 = new Empleado("Carlos","Lopez",111);
        Empleado emp2 = new Empleado("Ignacio", "Perez", 222);
        Empleado emp3 = new Empleado("Rocio", "Ibarra",333);
        
        System.out.println("Empleado 1");
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("Apellido: " + emp1.getApellido());
        System.out.println("Numero de empleado: " + emp1.getNumEmpleado());
        
        System.out.println("Empleado 2");
        System.out.println("Nombre: " + emp2.getNombre());
        System.out.println("Apellido: " + emp2.getApellido());
        System.out.println("Numero de empleado: " + emp2.getNumEmpleado());
        
        System.out.println("Empleado 3");
        System.out.println("Nombre: " + emp3.getNombre());
        System.out.println("Apellido: " + emp3.getApellido());
        System.out.println("Numero de empleado: " + emp3.getNumEmpleado());
    }
    
}
