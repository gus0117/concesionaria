/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAutoDAO;
import aplicacion.modelo.dominio.Auto;
import aplicacion.util.ListaAutos;
import java.io.Serializable;

/**
 *
 * @author Rocio
 */
public class AutoDAOImp implements Serializable, IAutoDAO{

    private ListaAutos listaAutos;

    public AutoDAOImp() {
        listaAutos = new ListaAutos();
    }
    
    @Override
    public void agregarAuto(Auto auto) {
        listaAutos.agregarAuto(auto);
    }

    @Override
    public void modificarAuto(Auto auto) {
        listaAutos.modificarAuto(auto);
    }

    @Override
    public void borrarAuto(Auto auto) {
        listaAutos.borrarAuto(auto);
    }
    
    
    public void mostrarCatalogo(){
        //listaAutos.mostrarLista();
    }
    public void mostrarListaPorMarcaModelo(String marcaModelo){
        listaAutos.mostrarListaPorMarcaModelo(marcaModelo);
    }
}
