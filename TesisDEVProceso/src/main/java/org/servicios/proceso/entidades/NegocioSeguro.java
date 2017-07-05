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
@Table(name = "NEGOCIO_SEGURO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NegocioSeguro.findAll", query = "SELECT n FROM NegocioSeguro n")
    , @NamedQuery(name = "NegocioSeguro.findById", query = "SELECT n FROM NegocioSeguro n WHERE n.id = :id")
    , @NamedQuery(name = "NegocioSeguro.findByNombreSeguro", query = "SELECT n FROM NegocioSeguro n WHERE n.nombreSeguro = :nombreSeguro")
    , @NamedQuery(name = "NegocioSeguro.findByIdSocio", query = "SELECT n FROM NegocioSeguro n WHERE n.idSocio = :idSocio")
    , @NamedQuery(name = "NegocioSeguro.findByIdConfiguracion", query = "SELECT n FROM NegocioSeguro n WHERE n.idConfiguracion = :idConfiguracion")})
public class NegocioSeguro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Size(max = 20)
    @Column(name = "NOMBRE_SEGURO")
    private String nombreSeguro;
    @Size(max = 20)
    @Column(name = "ID_SOCIO")
    private String idSocio;
    @Size(max = 20)
    @Column(name = "ID_CONFIGURACION")
    private String idConfiguracion;

    public NegocioSeguro() {
    }

    public NegocioSeguro(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
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
        if (!(object instanceof NegocioSeguro)) {
            return false;
        }
        NegocioSeguro other = (NegocioSeguro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.NegocioSeguro[ id=" + id + " ]";
    }
    
}
