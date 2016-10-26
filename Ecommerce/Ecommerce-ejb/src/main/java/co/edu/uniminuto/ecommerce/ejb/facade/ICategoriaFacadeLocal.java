package co.edu.uniminuto.ecommerce.ejb.facade;

import co.edu.uniminuto.ecommerce.entity.ETblCategoria;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author miguel.camargo
 */
@Local
public interface ICategoriaFacadeLocal extends Serializable {

    public List<ETblCategoria> findAll();
}
