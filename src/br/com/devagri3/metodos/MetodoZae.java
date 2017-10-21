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
@Table(name = "metodo_zae", catalog = "devagri", schema = "public")
@NamedQueries({
    @NamedQuery(name = "MetodoZae.findAll", query = "SELECT m FROM MetodoZae m"),
    @NamedQuery(name = "MetodoZae.findByIdMetodoZae", query = "SELECT m FROM MetodoZae m WHERE m.idMetodoZae = :idMetodoZae"),
    @NamedQuery(name = "MetodoZae.findByCiaf", query = "SELECT m FROM MetodoZae m WHERE m.ciaf = :ciaf"),
    @NamedQuery(name = "MetodoZae.findByCr", query = "SELECT m FROM MetodoZae m WHERE m.cr = :cr"),
    @NamedQuery(name = "MetodoZae.findByCcol", query = "SELECT m FROM MetodoZae m WHERE m.ccol = :ccol"),
    @NamedQuery(name = "MetodoZae.findByCum", query = "SELECT m FROM MetodoZae m WHERE m.cum = :cum"),
    @NamedQuery(name = "MetodoZae.findByNd", query = "SELECT m FROM MetodoZae m WHERE m.nd = :nd"),
    @NamedQuery(name = "MetodoZae.findByF", query = "SELECT m FROM MetodoZae m WHERE m.f = :f"),
    @NamedQuery(name = "MetodoZae.findByA", query = "SELECT m FROM MetodoZae m WHERE m.a = :a"),
    @NamedQuery(name = "MetodoZae.findByB", query = "SELECT m FROM MetodoZae m WHERE m.b = :b"),
    @NamedQuery(name = "MetodoZae.findByPpbp", query = "SELECT m FROM MetodoZae m WHERE m.ppbp = :ppbp"),
    @NamedQuery(name = "MetodoZae.findByPbn", query = "SELECT m FROM MetodoZae m WHERE m.pbn = :pbn"),
    @NamedQuery(name = "MetodoZae.findByC", query = "SELECT m FROM MetodoZae m WHERE m.c = :c"),
    @NamedQuery(name = "MetodoZae.findByD", query = "SELECT m FROM MetodoZae m WHERE m.d = :d"),
    @NamedQuery(name = "MetodoZae.findByPbc", query = "SELECT m FROM MetodoZae m WHERE m.pbc = :pbc"),
    @NamedQuery(name = "MetodoZae.findByAno", query = "SELECT m FROM MetodoZae m WHERE m.ano = :ano")})
public class MetodoZae implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_metodo_zae")
    private Integer idMetodoZae;
    @Column(name = "ciaf")
    private Short ciaf;
    @Column(name = "cr")
    private Short cr;
    @Column(name = "ccol")
    private Short ccol;
    @Column(name = "cum")
    private Short cum;
    @Column(name = "nd")
    private Short nd;
    @Column(name = "f_")
    private Short f;
    @Column(name = "a_")
    private Short a;
    @Column(name = "b_")
    private Short b;
    @Column(name = "ppbp")
    private Short ppbp;
    @Column(name = "pbn")
    private Short pbn;
    @Column(name = "c_")
    private Short c;
    @Column(name = "d_")
    private Short d;
    @Column(name = "pbc")
    private Short pbc;
    @Column(name = "ano")
    private Short ano;

    public MetodoZae() {
    }

    public MetodoZae(Integer idMetodoZae) {
        this.idMetodoZae = idMetodoZae;
    }

    public Integer getIdMetodoZae() {
        return idMetodoZae;
    }

    public void setIdMetodoZae(Integer idMetodoZae) {
        Integer oldIdMetodoZae = this.idMetodoZae;
        this.idMetodoZae = idMetodoZae;
        changeSupport.firePropertyChange("idMetodoZae", oldIdMetodoZae, idMetodoZae);
    }

    public Short getCiaf() {
        return ciaf;
    }

    public void setCiaf(Short ciaf) {
        Short oldCiaf = this.ciaf;
        this.ciaf = ciaf;
        changeSupport.firePropertyChange("ciaf", oldCiaf, ciaf);
    }

    public Short getCr() {
        return cr;
    }

    public void setCr(Short cr) {
        Short oldCr = this.cr;
        this.cr = cr;
        changeSupport.firePropertyChange("cr", oldCr, cr);
    }

    public Short getCcol() {
        return ccol;
    }

    public void setCcol(Short ccol) {
        Short oldCcol = this.ccol;
        this.ccol = ccol;
        changeSupport.firePropertyChange("ccol", oldCcol, ccol);
    }

    public Short getCum() {
        return cum;
    }

    public void setCum(Short cum) {
        Short oldCum = this.cum;
        this.cum = cum;
        changeSupport.firePropertyChange("cum", oldCum, cum);
    }

    public Short getNd() {
        return nd;
    }

    public void setNd(Short nd) {
        Short oldNd = this.nd;
        this.nd = nd;
        changeSupport.firePropertyChange("nd", oldNd, nd);
    }

    public Short getF() {
        return f;
    }

    public void setF(Short f) {
        Short oldF = this.f;
        this.f = f;
        changeSupport.firePropertyChange("f", oldF, f);
    }

    public Short getA() {
        return a;
    }

    public void setA(Short a) {
        Short oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    public Short getB() {
        return b;
    }

    public void setB(Short b) {
        Short oldB = this.b;
        this.b = b;
        changeSupport.firePropertyChange("b", oldB, b);
    }

    public Short getPpbp() {
        return ppbp;
    }

    public void setPpbp(Short ppbp) {
        Short oldPpbp = this.ppbp;
        this.ppbp = ppbp;
        changeSupport.firePropertyChange("ppbp", oldPpbp, ppbp);
    }

    public Short getPbn() {
        return pbn;
    }

    public void setPbn(Short pbn) {
        Short oldPbn = this.pbn;
        this.pbn = pbn;
        changeSupport.firePropertyChange("pbn", oldPbn, pbn);
    }

    public Short getC() {
        return c;
    }

    public void setC(Short c) {
        Short oldC = this.c;
        this.c = c;
        changeSupport.firePropertyChange("c", oldC, c);
    }

    public Short getD() {
        return d;
    }

    public void setD(Short d) {
        Short oldD = this.d;
        this.d = d;
        changeSupport.firePropertyChange("d", oldD, d);
    }

    public Short getPbc() {
        return pbc;
    }

    public void setPbc(Short pbc) {
        Short oldPbc = this.pbc;
        this.pbc = pbc;
        changeSupport.firePropertyChange("pbc", oldPbc, pbc);
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        Short oldAno = this.ano;
        this.ano = ano;
        changeSupport.firePropertyChange("ano", oldAno, ano);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMetodoZae != null ? idMetodoZae.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetodoZae)) {
            return false;
        }
        MetodoZae other = (MetodoZae) object;
        if ((this.idMetodoZae == null && other.idMetodoZae != null) || (this.idMetodoZae != null && !this.idMetodoZae.equals(other.idMetodoZae))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.devagri3.metodos.MetodoZae[ idMetodoZae=" + idMetodoZae + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
