/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ecommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguel.camargo
 */
@Entity
@Table(name = "e_tbl_orden_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETblOrdenCliente.findAll", query = "SELECT e FROM ETblOrdenCliente e"),
    @NamedQuery(name = "ETblOrdenCliente.findById", query = "SELECT e FROM ETblOrdenCliente e WHERE e.id = :id"),
    @NamedQuery(name = "ETblOrdenCliente.findByCantidad", query = "SELECT e FROM ETblOrdenCliente e WHERE e.cantidad = :cantidad"),
    @NamedQuery(name = "ETblOrdenCliente.findByFechaCreacion", query = "SELECT e FROM ETblOrdenCliente e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "ETblOrdenCliente.findByNumeroConfirmacion", query = "SELECT e FROM ETblOrdenCliente e WHERE e.numeroConfirmacion = :numeroConfirmacion")})
public class ETblOrdenCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_confirmacion")
    private int numeroConfirmacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eTblOrdenCliente")
    private List<ETblProductoSolicitado> eTblProductoSolicitadoList;
    @JoinColumn(name = "e_tbl_cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ETblCliente eTblClienteId;

    public ETblOrdenCliente() {
    }

    public ETblOrdenCliente(Integer id) {
        this.id = id;
    }

    public ETblOrdenCliente(Integer id, BigDecimal cantidad, Date fechaCreacion, int numeroConfirmacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.numeroConfirmacion = numeroConfirmacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    public void setNumeroConfirmacion(int numeroConfirmacion) {
        this.numeroConfirmacion = numeroConfirmacion;
    }

    @XmlTransient
    public List<ETblProductoSolicitado> getETblProductoSolicitadoList() {
        return eTblProductoSolicitadoList;
    }

    public void setETblProductoSolicitadoList(List<ETblProductoSolicitado> eTblProductoSolicitadoList) {
        this.eTblProductoSolicitadoList = eTblProductoSolicitadoList;
    }

    public ETblCliente getETblClienteId() {
        return eTblClienteId;
    }

    public void setETblClienteId(ETblCliente eTblClienteId) {
        this.eTblClienteId = eTblClienteId;
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
        if (!(object instanceof ETblOrdenCliente)) {
            return false;
        }
        ETblOrdenCliente other = (ETblOrdenCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblOrdenCliente[ id=" + id + " ]";
    }
    
}
