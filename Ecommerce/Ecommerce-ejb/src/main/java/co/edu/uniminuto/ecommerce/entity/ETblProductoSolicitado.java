/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miguel.camargo
 */
@Entity
@Table(name = "e_tbl_producto_solicitado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETblProductoSolicitado.findAll", query = "SELECT e FROM ETblProductoSolicitado e"),
    @NamedQuery(name = "ETblProductoSolicitado.findByETblProductoSolicitadoOrdenCliente", query = "SELECT e FROM ETblProductoSolicitado e WHERE e.eTblProductoSolicitadoPK.eTblProductoSolicitadoOrdenCliente = :eTblProductoSolicitadoOrdenCliente"),
    @NamedQuery(name = "ETblProductoSolicitado.findByETblProductoSolicitadoProducto", query = "SELECT e FROM ETblProductoSolicitado e WHERE e.eTblProductoSolicitadoPK.eTblProductoSolicitadoProducto = :eTblProductoSolicitadoProducto"),
    @NamedQuery(name = "ETblProductoSolicitado.findByCantidad", query = "SELECT e FROM ETblProductoSolicitado e WHERE e.cantidad = :cantidad")})
public class ETblProductoSolicitado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ETblProductoSolicitadoPK eTblProductoSolicitadoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private short cantidad;
    @JoinColumn(name = "e_tbl_producto_solicitado_orden_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ETblOrdenCliente eTblOrdenCliente;
    @JoinColumn(name = "e_tbl_producto_solicitado_producto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ETblProducto eTblProducto;

    public ETblProductoSolicitado() {
    }

    public ETblProductoSolicitado(ETblProductoSolicitadoPK eTblProductoSolicitadoPK) {
        this.eTblProductoSolicitadoPK = eTblProductoSolicitadoPK;
    }

    public ETblProductoSolicitado(ETblProductoSolicitadoPK eTblProductoSolicitadoPK, short cantidad) {
        this.eTblProductoSolicitadoPK = eTblProductoSolicitadoPK;
        this.cantidad = cantidad;
    }

    public ETblProductoSolicitado(int eTblProductoSolicitadoOrdenCliente, int eTblProductoSolicitadoProducto) {
        this.eTblProductoSolicitadoPK = new ETblProductoSolicitadoPK(eTblProductoSolicitadoOrdenCliente, eTblProductoSolicitadoProducto);
    }

    public ETblProductoSolicitadoPK getETblProductoSolicitadoPK() {
        return eTblProductoSolicitadoPK;
    }

    public void setETblProductoSolicitadoPK(ETblProductoSolicitadoPK eTblProductoSolicitadoPK) {
        this.eTblProductoSolicitadoPK = eTblProductoSolicitadoPK;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public ETblOrdenCliente getETblOrdenCliente() {
        return eTblOrdenCliente;
    }

    public void setETblOrdenCliente(ETblOrdenCliente eTblOrdenCliente) {
        this.eTblOrdenCliente = eTblOrdenCliente;
    }

    public ETblProducto getETblProducto() {
        return eTblProducto;
    }

    public void setETblProducto(ETblProducto eTblProducto) {
        this.eTblProducto = eTblProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eTblProductoSolicitadoPK != null ? eTblProductoSolicitadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ETblProductoSolicitado)) {
            return false;
        }
        ETblProductoSolicitado other = (ETblProductoSolicitado) object;
        if ((this.eTblProductoSolicitadoPK == null && other.eTblProductoSolicitadoPK != null) || (this.eTblProductoSolicitadoPK != null && !this.eTblProductoSolicitadoPK.equals(other.eTblProductoSolicitadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblProductoSolicitado[ eTblProductoSolicitadoPK=" + eTblProductoSolicitadoPK + " ]";
    }
    
}
