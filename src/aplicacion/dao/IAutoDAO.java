/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Auto;

/**
 *
 * @author Rocio
 */
public interface IAutoDAO {
    public void agregarAuto(Auto auto);
    public void modificarAuto(Auto auto);
    public void borrarAuto(Auto auto);
}
