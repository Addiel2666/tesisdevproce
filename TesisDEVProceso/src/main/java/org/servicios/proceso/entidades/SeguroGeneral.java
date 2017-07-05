package org.servicios.proceso.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zony_
 */
@Entity
@Table(name = "SEGURO_GENERAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeguroGeneral.findAll", query = "SELECT s FROM SeguroGeneral s")
    , @NamedQuery(name = "SeguroGeneral.findById", query = "SELECT s FROM SeguroGeneral s WHERE s.id = :id")
    , @NamedQuery(name = "SeguroGeneral.findByFechaInicio", query = "SELECT s FROM SeguroGeneral s WHERE s.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "SeguroGeneral.findByNomProducto", query = "SELECT s FROM SeguroGeneral s WHERE s.nomProducto = :nomProducto")
    , @NamedQuery(name = "SeguroGeneral.findByFechaFin", query = "SELECT s FROM SeguroGeneral s WHERE s.fechaFin = :fechaFin")
    , @NamedQuery(name = "SeguroGeneral.findByTipoSeguro", query = "SELECT s FROM SeguroGeneral s WHERE s.tipoSeguro = :tipoSeguro")
    , @NamedQuery(name = "SeguroGeneral.findByRenovacion", query = "SELECT s FROM SeguroGeneral s WHERE s.renovacion = :renovacion")
    , @NamedQuery(name = "SeguroGeneral.findByTiempoCobertura", query = "SELECT s FROM SeguroGeneral s WHERE s.tiempoCobertura = :tiempoCobertura")
    , @NamedQuery(name = "SeguroGeneral.findByBilling", query = "SELECT s FROM SeguroGeneral s WHERE s.billing = :billing")
    , @NamedQuery(name = "SeguroGeneral.findByIdFamilia", query = "SELECT s FROM SeguroGeneral s WHERE s.idFamilia = :idFamilia")
    , @NamedQuery(name = "SeguroGeneral.findByIdConfiguracion", query = "SELECT s FROM SeguroGeneral s WHERE s.idConfiguracion = :idConfiguracion")})
public class SeguroGeneral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Size(max = 20)
    @Column(name = "NOM_PRODUCTO")
    private String nomProducto;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Size(max = 20)
    @Column(name = "TIPO_SEGURO")
    private String tipoSeguro;
    @Size(max = 20)
    @Column(name = "RENOVACION")
    private String renovacion;
    @Size(max = 20)
    @Column(name = "TIEMPO_COBERTURA")
    private String tiempoCobertura;
    @Size(max = 20)
    @Column(name = "BILLING")
    private String billing;
    @Size(max = 20)
    @Column(name = "ID_FAMILIA")
    private String idFamilia;
    @Size(max = 20)
    @Column(name = "ID_CONFIGURACION")
    private String idConfiguracion;

    public SeguroGeneral() {
    }

    public SeguroGeneral(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getRenovacion() {
        return renovacion;
    }

    public void setRenovacion(String renovacion) {
        this.renovacion = renovacion;
    }

    public String getTiempoCobertura() {
        return tiempoCobertura;
    }

    public void setTiempoCobertura(String tiempoCobertura) {
        this.tiempoCobertura = tiempoCobertura;
    }

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public String getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(String idFamilia) {
        this.idFamilia = idFamilia;
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
        if (!(object instanceof SeguroGeneral)) {
            return false;
        }
        SeguroGeneral other = (SeguroGeneral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.SeguroGeneral[ id=" + id + " ]";
    }
    
}
