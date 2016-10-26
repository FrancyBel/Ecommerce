package co.edu.uniminuto.ecommerce.ejb.facade;

import co.edu.uniminuto.ecommerce.dao.IETblCategoriaDao;
import co.edu.uniminuto.ecommerce.dao.impl.DaoImpl;
import co.edu.uniminuto.ecommerce.entity.ETblCategoria;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author miguel.camargo
 */
@Stateless(name = "CategoriaFacade")
public class CategoriaFacade extends DaoImpl implements ICategoriaFacadeLocal {

    @EJB(mappedName = "IETblCategoriaDao")
    private IETblCategoriaDao iETblCategoriaDao;

    @Override
    public List<ETblCategoria> findAll() {
        List<ETblCategoria> listado = new ArrayList<ETblCategoria>();
        try {
            listado = iETblCategoriaDao.findAll();
        } catch (Exception e) {
            listado = new ArrayList<ETblCategoria>();
        }
        return listado;
    }
}
