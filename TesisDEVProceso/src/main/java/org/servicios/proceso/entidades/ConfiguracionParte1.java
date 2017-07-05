package org.servicios.proceso.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name = "C##TESIS.CONFIGURACION_SEGURO_PARTE1")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ConfiguracionParte1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
 
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE_CARGA")
    private String nombreCarga;
    @Basic(optional = false)
  
    @Column(name = "ID_PROCESO")
    private short idProceso;
    @Basic(optional = false)

    @Size(min = 1, max = 1)
    @Column(name = "SEPARADOR")
    private String separador;
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_NEGOCIO")
    private String nombreNegocio;
    @Column(name = "ACTIVO")
    private Short activo;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FECHA_ACTUALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "FECHA_ELIMINACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEliminacion;
    @Size(max = 20)
    @Column(name = "SERIE")
    private String serie;

    public ConfiguracionParte1() {
    }

    public ConfiguracionParte1(String id) {
        this.id = id;
    }

    public ConfiguracionParte1(String id, String nombreCarga, short idProceso, String separador, String nombreNegocio) {
        this.id = id;
        this.nombreCarga = nombreCarga;
        this.idProceso = idProceso;
        this.separador = separador;
        this.nombreNegocio = nombreNegocio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    public short getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(short idProceso) {
        this.idProceso = idProceso;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
        if (!(object instanceof ConfiguracionParte1)) {
            return false;
        }
        ConfiguracionParte1 other = (ConfiguracionParte1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.ConfiguracionSeguroParte1[ id=" + id + " ]";
    }
    
}
