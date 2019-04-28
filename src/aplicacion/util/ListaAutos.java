/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.util;

import aplicacion.modelo.dominio.Auto;
import java.util.ArrayList;

/**
 *
 * @author Rocio
 */
public class ListaAutos {
    ArrayList<Auto> listaAutos;
    
    public ListaAutos(){
        listaAutos = new ArrayList<Auto>();
    }
    /**
     * Agrega un objeto Auto a la lista
     * @param auto 
     */
    public void agregarAuto(Auto auto){
        Auto autoAux = new Auto(auto.getCodigo(), auto.getMarca(), auto.getModelo(), auto.getColor(), auto.getPrecio());
        listaAutos.add(autoAux);
    }
    public void modificarAuto(Auto auto){
        int indice = listaAutos.indexOf(auto);
        //El auto existe
        if(indice > -1){
            listaAutos.set(indice, auto);
        }
        else{
            //EL auto no existe
            System.out.println("Auto no encontrado");
        }
    }
    public void borrarAuto(Auto auto){
        listaAutos.removeIf(aut -> aut.getCodigo() == auto.getCodigo());
    }
    /**
     * Devuelve verdadero 
     * @param cadPrincipal
     * @param cadABuscar
     * @return 
     */
    private boolean compararCadenasAlPrincipio(String cadPrincipal, String cadABuscar){
        //Buscando coincidencias al principio
        return cadPrincipal.contains(cadABuscar);
    }
    public void mostrarListaPorMarcaModelo(String marcaModelo){
        for(int i = 0; i < listaAutos.size(); i++){
            //Buscar Y Mostrar Por Marca
            if(compararCadenasAlPrincipio(listaAutos.get(i).getMarca().toLowerCase(), marcaModelo.toLowerCase())){
                System.out.println(listaAutos.get(i).toString());
            }
            //Buscar Y Mostrar Por Modelo
            else if(compararCadenasAlPrincipio(listaAutos.get(i).getModelo().toLowerCase(), marcaModelo.toLowerCase())){
                System.out.println(listaAutos.get(i).toString());
            }
        }
    }
}
