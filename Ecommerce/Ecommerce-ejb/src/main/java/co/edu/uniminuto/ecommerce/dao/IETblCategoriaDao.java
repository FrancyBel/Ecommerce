package co.edu.uniminuto.ecommerce.dao;

import co.edu.uniminuto.ecommerce.entity.ETblCategoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author miguel.camargo
 */
@Local
public interface IETblCategoriaDao {

    List<ETblCategoria> findAll() throws Exception;

}
