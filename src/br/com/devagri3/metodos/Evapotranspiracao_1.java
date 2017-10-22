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
@Table(name = "evapotranspiracao", catalog = "devagri", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Evapotranspiracao_1.findAll", query = "SELECT e FROM Evapotranspiracao_1 e"),
    @NamedQuery(name = "Evapotranspiracao_1.findByIdEvapot", query = "SELECT e FROM Evapotranspiracao_1 e WHERE e.idEvapot = :idEvapot"),
    @NamedQuery(name = "Evapotranspiracao_1.findByKc", query = "SELECT e FROM Evapotranspiracao_1 e WHERE e.kc = :kc"),
    @NamedQuery(name = "Evapotranspiracao_1.findByEvptrRef", query = "SELECT e FROM Evapotranspiracao_1 e WHERE e.evptrRef = :evptrRef")})
public class Evapotranspiracao_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evapot")
    private Short idEvapot;
    @Basic(optional = false)
    @Column(name = "kc")
    private float kc;
    @Basic(optional = false)
    @Column(name = "evptr_ref")
    private float evptrRef;

    public Evapotranspiracao_1() {
    }

    public Evapotranspiracao_1(Short idEvapot) {
        this.idEvapot = idEvapot;
    }

    public Evapotranspiracao_1(Short idEvapot, float kc, float evptrRef) {
        this.idEvapot = idEvapot;
        this.kc = kc;
        this.evptrRef = evptrRef;
    }

    public Short getIdEvapot() {
        return idEvapot;
    }

    public void setIdEvapot(Short idEvapot) {
        Short oldIdEvapot = this.idEvapot;
        this.idEvapot = idEvapot;
        changeSupport.firePropertyChange("idEvapot", oldIdEvapot, idEvapot);
    }

    public float getKc() {
        return kc;
    }

    public void setKc(float kc) {
        float oldKc = this.kc;
        this.kc = kc;
        changeSupport.firePropertyChange("kc", oldKc, kc);
    }

    public float getEvptrRef() {
        return evptrRef;
    }

    public void setEvptrRef(float evptrRef) {
        float oldEvptrRef = this.evptrRef;
        this.evptrRef = evptrRef;
        changeSupport.firePropertyChange("evptrRef", oldEvptrRef, evptrRef);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvapot != null ? idEvapot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evapotranspiracao_1)) {
            return false;
        }
        Evapotranspiracao_1 other = (Evapotranspiracao_1) object;
        if ((this.idEvapot == null && other.idEvapot != null) || (this.idEvapot != null && !this.idEvapot.equals(other.idEvapot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.devagri3.metodos.Evapotranspiracao_1[ idEvapot=" + idEvapot + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
