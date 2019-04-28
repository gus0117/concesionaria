/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.imp.AutoDAOImp;
import aplicacion.modelo.dominio.Auto;

/**
 *
 * @author Rocio
 */
public class Test {
    public static void main(String[] args) {
        //ListaAutos catalogo = new ListaAutos();
        AutoDAOImp catalogo = new AutoDAOImp();
        Auto auto1 = new Auto(1,"Suran","Volkswagen","Gris",500000f);
        Auto auto2 = new Auto(2,"307","Peugeaut","Blanco",350210f);
        Auto auto3 = new Auto(3,"Veneno", "Lamborgini","Rojo",1023134f);
        Auto auto4 = new Auto(4,"Fox","Volkswagen","Blanco",500000f);
        
        catalogo.agregarAuto(auto1);
        catalogo.agregarAuto(auto2);
        catalogo.agregarAuto(auto3);
        catalogo.agregarAuto(auto4);
        
        catalogo.mostrarListaPorMarcaModelo("wag");
    }
}
