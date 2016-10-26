/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguel.camargo
 */
@Entity
@Table(name = "e_tbl_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETblProducto.findAll", query = "SELECT e FROM ETblProducto e"),
    @NamedQuery(name = "ETblProducto.findById", query = "SELECT e FROM ETblProducto e WHERE e.id = :id"),
    @NamedQuery(name = "ETblProducto.findByNombre", query = "SELECT e FROM ETblProducto e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "ETblProducto.findByPrecio", query = "SELECT e FROM ETblProducto e WHERE e.precio = :precio"),
    @NamedQuery(name = "ETblProducto.findByDescripcion", query = "SELECT e FROM ETblProducto e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "ETblProducto.findByUltimaModificacion", query = "SELECT e FROM ETblProducto e WHERE e.ultimaModificacion = :ultimaModificacion")})
public class ETblProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private int precio;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ultima_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaModificacion;
    @JoinColumn(name = "e_tbl_categoria_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ETblCategoria eTblCategoriaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eTblProducto")
    private List<ETblProductoSolicitado> eTblProductoSolicitadoList;

    public ETblProducto() {
    }

    public ETblProducto(Integer id) {
        this.id = id;
    }

    public ETblProducto(Integer id, String nombre, int precio, Date ultimaModificacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ultimaModificacion = ultimaModificacion;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Date ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public ETblCategoria getETblCategoriaId() {
        return eTblCategoriaId;
    }

    public void setETblCategoriaId(ETblCategoria eTblCategoriaId) {
        this.eTblCategoriaId = eTblCategoriaId;
    }

    @XmlTransient
    public List<ETblProductoSolicitado> getETblProductoSolicitadoList() {
        return eTblProductoSolicitadoList;
    }

    public void setETblProductoSolicitadoList(List<ETblProductoSolicitado> eTblProductoSolicitadoList) {
        this.eTblProductoSolicitadoList = eTblProductoSolicitadoList;
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
        if (!(object instanceof ETblProducto)) {
            return false;
        }
        ETblProducto other = (ETblProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblProducto[ id=" + id + " ]";
    }
    
}
