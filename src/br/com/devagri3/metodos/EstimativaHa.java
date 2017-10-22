/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.metodos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author willyan
 */
@Entity
@Table(name = "estimativa_ha", catalog = "devagri", schema = "public")
@NamedQueries({
    @NamedQuery(name = "EstimativaHa.findAll", query = "SELECT e FROM EstimativaHa e"),
    @NamedQuery(name = "EstimativaHa.findByIdEstimativa", query = "SELECT e FROM EstimativaHa e WHERE e.idEstimativa = :idEstimativa"),
    @NamedQuery(name = "EstimativaHa.findByPpcana", query = "SELECT e FROM EstimativaHa e WHERE e.ppcana = :ppcana"),
    @NamedQuery(name = "EstimativaHa.findByKy", query = "SELECT e FROM EstimativaHa e WHERE e.ky = :ky"),
    @NamedQuery(name = "EstimativaHa.findByEtrcana", query = "SELECT e FROM EstimativaHa e WHERE e.etrcana = :etrcana"),
    @NamedQuery(name = "EstimativaHa.findByEtccana", query = "SELECT e FROM EstimativaHa e WHERE e.etccana = :etccana")})
public class EstimativaHa implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estimativa")
    private Short idEstimativa;
    @Basic(optional = false)
    @Column(name = "ppcana")
    private float ppcana;
    @Basic(optional = false)
    @Column(name = "ky")
    private float ky;
    @Basic(optional = false)
    @Column(name = "etrcana")
    private float etrcana;
    @Basic(optional = false)
    @Column(name = "etccana")
    private float etccana;

    public EstimativaHa() {
    }

    public EstimativaHa(Short idEstimativa) {
        this.idEstimativa = idEstimativa;
    }

    public EstimativaHa(Short idEstimativa, float ppcana, float ky, float etrcana, float etccana) {
        this.idEstimativa = idEstimativa;
        this.ppcana = ppcana;
        this.ky = ky;
        this.etrcana = etrcana;
        this.etccana = etccana;
    }

    public Short getIdEstimativa() {
        return idEstimativa;
    }

    public void setIdEstimativa(Short idEstimativa) {
        Short oldIdEstimativa = this.idEstimativa;
        this.idEstimativa = idEstimativa;
        changeSupport.firePropertyChange("idEstimativa", oldIdEstimativa, idEstimativa);
    }

    public float getPpcana() {
        return ppcana;
    }

    public void setPpcana(float ppcana) {
        float oldPpcana = this.ppcana;
        this.ppcana = ppcana;
        changeSupport.firePropertyChange("ppcana", oldPpcana, ppcana);
    }

    public float getKy() {
        return ky;
    }

    public void setKy(float ky) {
        float oldKy = this.ky;
        this.ky = ky;
        changeSupport.firePropertyChange("ky", oldKy, ky);
    }

    public float getEtrcana() {
        return etrcana;
    }

    public void setEtrcana(float etrcana) {
        float oldEtrcana = this.etrcana;
        this.etrcana = etrcana;
        changeSupport.firePropertyChange("etrcana", oldEtrcana, etrcana);
    }

    public float getEtccana() {
        return etccana;
    }

    public void setEtccana(float etccana) {
        float oldEtccana = this.etccana;
        this.etccana = etccana;
        changeSupport.firePropertyChange("etccana", oldEtccana, etccana);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstimativa != null ? idEstimativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstimativaHa)) {
            return false;
        }
        EstimativaHa other = (EstimativaHa) object;
        if ((this.idEstimativa == null && other.idEstimativa != null) || (this.idEstimativa != null && !this.idEstimativa.equals(other.idEstimativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.devagri3.metodos.EstimativaHa[ idEstimativa=" + idEstimativa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
