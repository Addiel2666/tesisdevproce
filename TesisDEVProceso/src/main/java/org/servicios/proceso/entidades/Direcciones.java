package org.servicios.proceso.entidades;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zony_
 */
@Entity
@Table(name = "DIRECCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direcciones.findAll", query = "SELECT d FROM Direcciones d")
    , @NamedQuery(name = "Direcciones.findById", query = "SELECT d FROM Direcciones d WHERE d.id = :id")
    , @NamedQuery(name = "Direcciones.findByCalle", query = "SELECT d FROM Direcciones d WHERE d.calle = :calle")
    , @NamedQuery(name = "Direcciones.findByNumero", query = "SELECT d FROM Direcciones d WHERE d.numero = :numero")
    , @NamedQuery(name = "Direcciones.findByColonia", query = "SELECT d FROM Direcciones d WHERE d.colonia = :colonia")
    , @NamedQuery(name = "Direcciones.findByCiudad", query = "SELECT d FROM Direcciones d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "Direcciones.findByMunicipio", query = "SELECT d FROM Direcciones d WHERE d.municipio = :municipio")
    , @NamedQuery(name = "Direcciones.findByEstado", query = "SELECT d FROM Direcciones d WHERE d.estado = :estado")
    , @NamedQuery(name = "Direcciones.findByPais", query = "SELECT d FROM Direcciones d WHERE d.pais = :pais")
    , @NamedQuery(name = "Direcciones.findByIdConfiguracion", query = "SELECT d FROM Direcciones d WHERE d.idConfiguracion = :idConfiguracion")})
public class Direcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Size(max = 100)
    @Column(name = "CALLE")
    private String calle;
    @Size(max = 20)
    @Column(name = "NUMERO")
    private String numero;
    @Size(max = 50)
    @Column(name = "COLONIA")
    private String colonia;
    @Size(max = 50)
    @Column(name = "CIUDAD")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "MUNICIPIO")
    private String municipio;
    @Size(max = 50)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 50)
    @Column(name = "PAIS")
    private String pais;
    @Size(max = 20)
    @Column(name = "ID_CONFIGURACION")
    private String idConfiguracion;

    public Direcciones() {
    }

    public Direcciones(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(String idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
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
        if (!(object instanceof Direcciones)) {
            return false;
        }
        Direcciones other = (Direcciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.Direcciones[ id=" + id + " ]";
    }
    
}
