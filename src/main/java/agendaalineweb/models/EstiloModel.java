/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaalineweb.models;

import agendaalineweb.daos.EstiloDao;
import agendaalineweb.entities.Estilo;
import java.sql.SQLException;

/**
 *
 * @author Utilizador
 */
public class EstiloModel {

    public void insert(Estilo estilo) throws SQLException {
        EstiloDao estiloDao = new EstiloDao();
        estiloDao.insert(estilo);
    }

    public Estilo getEstiloByIdNegocio(int idNegocio) {
        EstiloDao estiloDao = new EstiloDao();
        return estiloDao.getEstiloByIdNegocio(idNegocio);
    }
    
}
