package org.servicios.proceso.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FAM_VIDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FamVida.findAll", query = "SELECT f FROM FamVida f")
    , @NamedQuery(name = "FamVida.findById", query = "SELECT f FROM FamVida f WHERE f.id = :id")
    , @NamedQuery(name = "FamVida.findByIdPersona", query = "SELECT f FROM FamVida f WHERE f.idPersona = :idPersona")
    , @NamedQuery(name = "FamVida.findByTipoEnfermedad", query = "SELECT f FROM FamVida f WHERE f.tipoEnfermedad = :tipoEnfermedad")
    , @NamedQuery(name = "FamVida.findByTipoAccidente", query = "SELECT f FROM FamVida f WHERE f.tipoAccidente = :tipoAccidente")
    , @NamedQuery(name = "FamVida.findBySumaAsegurada", query = "SELECT f FROM FamVida f WHERE f.sumaAsegurada = :sumaAsegurada")
    , @NamedQuery(name = "FamVida.findByPrima", query = "SELECT f FROM FamVida f WHERE f.prima = :prima")
    , @NamedQuery(name = "FamVida.findByTipoCobertura", query = "SELECT f FROM FamVida f WHERE f.tipoCobertura = :tipoCobertura")
    , @NamedQuery(name = "FamVida.findByTipoPlan", query = "SELECT f FROM FamVida f WHERE f.tipoPlan = :tipoPlan")
    , @NamedQuery(name = "FamVida.findByFechaInicioVigencia", query = "SELECT f FROM FamVida f WHERE f.fechaInicioVigencia = :fechaInicioVigencia")
    , @NamedQuery(name = "FamVida.findByFechaFinVidencia", query = "SELECT f FROM FamVida f WHERE f.fechaFinVidencia = :fechaFinVidencia")
    , @NamedQuery(name = "FamVida.findByFechaAlta", query = "SELECT f FROM FamVida f WHERE f.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "FamVida.findByIdConfig", query = "SELECT f FROM FamVida f WHERE f.idConfig = :idConfig")})
public class FamVida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Size(max = 20)
    @Column(name = "ID_PERSONA")
    private String idPersona;
    @Size(max = 20)
    @Column(name = "TIPO_ENFERMEDAD")
    private String tipoEnfermedad;
    @Size(max = 20)
    @Column(name = "TIPO_ACCIDENTE")
    private String tipoAccidente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMA_ASEGURADA")
    private BigDecimal sumaAsegurada;
    @Column(name = "PRIMA")
    private BigDecimal prima;
    @Size(max = 20)
    @Column(name = "TIPO_COBERTURA")
    private String tipoCobertura;
    @Size(max = 20)
    @Column(name = "TIPO_PLAN")
    private String tipoPlan;
    @Column(name = "FECHA_INICIO_VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioVigencia;
    @Column(name = "FECHA_FIN_VIDENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinVidencia;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 20)
    @Column(name = "ID_CONFIG")
    private String idConfig;

    public FamVida() {
    }

    public FamVida(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public BigDecimal getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(BigDecimal sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public BigDecimal getPrima() {
        return prima;
    }

    public void setPrima(BigDecimal prima) {
        this.prima = prima;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVidencia() {
        return fechaFinVidencia;
    }

    public void setFechaFinVidencia(Date fechaFinVidencia) {
        this.fechaFinVidencia = fechaFinVidencia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getIdConfig() {
        return idConfig;
    }

    public void setIdConfig(String idConfig) {
        this.idConfig = idConfig;
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
        if (!(object instanceof FamVida)) {
            return false;
        }
        FamVida other = (FamVida) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.FamVida[ id=" + id + " ]";
    }
    
}
