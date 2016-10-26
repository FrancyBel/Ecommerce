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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "e_tbl_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETblCliente.findAll", query = "SELECT e FROM ETblCliente e"),
    @NamedQuery(name = "ETblCliente.findById", query = "SELECT e FROM ETblCliente e WHERE e.id = :id"),
    @NamedQuery(name = "ETblCliente.findByNombre", query = "SELECT e FROM ETblCliente e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "ETblCliente.findByEmail", query = "SELECT e FROM ETblCliente e WHERE e.email = :email"),
    @NamedQuery(name = "ETblCliente.findByTelefono", query = "SELECT e FROM ETblCliente e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "ETblCliente.findByDireccion", query = "SELECT e FROM ETblCliente e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "ETblCliente.findByCiudadRegion", query = "SELECT e FROM ETblCliente e WHERE e.ciudadRegion = :ciudadRegion"),
    @NamedQuery(name = "ETblCliente.findByCcNumero", query = "SELECT e FROM ETblCliente e WHERE e.ccNumero = :ccNumero")})
public class ETblCliente implements Serializable {

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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ciudad_region")
    private String ciudadRegion;
    @Size(max = 19)
    @Column(name = "cc_numero")
    private String ccNumero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eTblClienteId")
    private List<ETblOrdenCliente> eTblOrdenClienteList;

    public ETblCliente() {
    }

    public ETblCliente(Integer id) {
        this.id = id;
    }

    public ETblCliente(Integer id, String nombre, String email, String telefono, String direccion, String ciudadRegion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadRegion = ciudadRegion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadRegion() {
        return ciudadRegion;
    }

    public void setCiudadRegion(String ciudadRegion) {
        this.ciudadRegion = ciudadRegion;
    }

    public String getCcNumero() {
        return ccNumero;
    }

    public void setCcNumero(String ccNumero) {
        this.ccNumero = ccNumero;
    }

    @XmlTransient
    public List<ETblOrdenCliente> getETblOrdenClienteList() {
        return eTblOrdenClienteList;
    }

    public void setETblOrdenClienteList(List<ETblOrdenCliente> eTblOrdenClienteList) {
        this.eTblOrdenClienteList = eTblOrdenClienteList;
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
        if (!(object instanceof ETblCliente)) {
            return false;
        }
        ETblCliente other = (ETblCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.ecommerce.entity.ETblCliente[ id=" + id + " ]";
    }
    
}
