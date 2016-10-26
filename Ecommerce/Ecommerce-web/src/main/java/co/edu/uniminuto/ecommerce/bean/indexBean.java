package co.edu.uniminuto.ecommerce.bean;

import co.edu.uniminuto.ecommerce.ejb.facade.ICategoriaFacadeLocal;
import co.edu.uniminuto.ecommerce.entity.ETblCategoria;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author miguel.camargo
 */
@ManagedBean
@SessionScoped
public class indexBean {

    private List<ETblCategoria> categoriaList;
    private ETblCategoria categoriaSelected;

    @EJB(mappedName = "ICategoriaFacadeLocal")
    private ICategoriaFacadeLocal iCategoriaFacadeLocal;

    /**
     * Creates a new instance of indexBean
     */
    public indexBean() {
    }

    @PostConstruct
    public void init() {
        cargarCategorias();
    }

    public void cargarCategorias() {
        categoriaList = iCategoriaFacadeLocal.findAll();
    }

    public List<ETblCategoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<ETblCategoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public ETblCategoria getCategoriaSelected() {
        return categoriaSelected;
    }

    public void setCategoriaSelected(ETblCategoria categoriaSelected) {
        this.categoriaSelected = categoriaSelected;
    }

}
