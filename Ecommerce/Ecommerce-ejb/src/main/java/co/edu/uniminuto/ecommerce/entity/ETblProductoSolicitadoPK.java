/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author miguel.camargo
 */
@Embeddable
public class ETblProductoSolicitadoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "e_tbl_producto_solicitado_orden_cliente")
    private int eTblProductoSolicitadoOrdenCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_tbl_producto_solicitado_producto")
    private int eTblProductoSolicitadoProducto;

    public ETblProductoSolicitadoPK() {
    }

    public ETblProductoSolicitadoPK(int eTblProductoSolicitadoOrdenCliente, int eTblProductoSolicitadoProducto) {
        this.eTblProductoSolicitadoOrdenCliente = eTblProductoSolicitadoOrdenCliente;
        this.eTblProductoSolicitadoProducto = eTblProductoSolicitadoProducto;
    }

    public int getETblProductoSolicitadoOrdenCliente() {
        return eTblProductoSolicitadoOrdenCliente;
    }

    public void setETblProductoSolicitadoOrdenCliente(int eTblProductoSolicitadoOrdenCliente) {
        this.eTblProductoSolicitadoOrdenCliente = eTblProductoSolicitadoOrdenCliente;
    }

    public int getETblProductoSolicitadoProducto() {
        return eTblProductoSolicitadoProducto;
    }

    public void setETblProductoSolicitadoProducto(int eTblProductoSolicitadoProducto) {
        this.eTblProductoSolicitadoProducto = eTblProductoSolicitadoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) eTblProductoSolicitadoOrdenCliente;
        hash += (int) eTblProductoSolicitadoProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ETblProductoSolicitadoPK)) {
            return false;
        }
        ETblProductoSolicitadoPK other = (ETblProductoSolicitadoPK) object;
        if (this.eTblProductoSolicitadoOrdenCliente != other.eTblProductoSolicitadoOrdenCliente) {
            return false;
        }
        if (this.eTblProductoSolicitadoProducto != other.eTblProductoSolicitadoProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblProductoSolicitadoPK[ eTblProductoSolicitadoOrdenCliente=" + eTblProductoSolicitadoOrdenCliente + ", eTblProductoSolicitadoProducto=" + eTblProductoSolicitadoProducto + " ]";
    }
    
}
