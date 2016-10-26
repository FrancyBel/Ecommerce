package co.edu.uniminuto.ecommerce.dao.impl;

import co.edu.uniminuto.ecommerce.dao.IETblCategoriaDao;
import co.edu.uniminuto.ecommerce.entity.ETblCategoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguel.camargo
 */
public class ETblCategoriaDaoImpl extends DaoImpl<ETblCategoria> implements IETblCategoriaDao {
    
    @Override
    public List<ETblCategoria> findAll() throws Exception {
        List<ETblCategoria> listado = new ArrayList<ETblCategoria>();
        listado = findAll("ETblCategoria.findAll");
        return listado;
    }
}
