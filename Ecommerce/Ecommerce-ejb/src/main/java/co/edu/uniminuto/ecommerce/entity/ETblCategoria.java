/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ecommerce.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguel.camargo
 */
@Entity
@Table(name = "e_tbl_categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETblCategoria.findAll", query = "SELECT e FROM ETblCategoria e"),
    @NamedQuery(name = "ETblCategoria.findById", query = "SELECT e FROM ETblCategoria e WHERE e.id = :id"),
    @NamedQuery(name = "ETblCategoria.findByNombre", query = "SELECT e FROM ETblCategoria e WHERE e.nombre = :nombre")})
public class ETblCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String path;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eTblCategoriaId")
    private List<ETblProducto> eTblProductoList;

    public ETblCategoria() {
    }

    public ETblCategoria(Integer id) {
        this.id = id;
    }

    public ETblCategoria(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @XmlTransient
    public List<ETblProducto> getETblProductoList() {
        return eTblProductoList;
    }

    public void setETblProductoList(List<ETblProducto> eTblProductoList) {
        this.eTblProductoList = eTblProductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ETblCategoria)) {
            return false;
        }
        ETblCategoria other = (ETblCategoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblCategoria[ id=" + id + " ]";
    }

}
