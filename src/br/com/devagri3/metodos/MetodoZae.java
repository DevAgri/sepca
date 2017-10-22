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
    @NamedQuery(name = "MetodoZae.findByAno", query = "SELECT m FROM MetodoZae m WHERE m.ano = :ano"),
    @NamedQuery(name = "MetodoZae.findByProdutor", query = "SELECT m FROM MetodoZae m WHERE m.produtor = :produtor"),
    @NamedQuery(name = "MetodoZae.findBySetor", query = "SELECT m FROM MetodoZae m WHERE m.setor = :setor")})
public class MetodoZae implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_metodo_zae")
    private Integer idMetodoZae;
    @Basic(optional = false)
    @Column(name = "ciaf")
    private float ciaf;
    @Basic(optional = false)
    @Column(name = "cr")
    private float cr;
    @Basic(optional = false)
    @Column(name = "ccol")
    private float ccol;
    @Basic(optional = false)
    @Column(name = "cum")
    private float cum;
    @Basic(optional = false)
    @Column(name = "nd")
    private float nd;
    @Basic(optional = false)
    @Column(name = "f_")
    private float f;
    @Basic(optional = false)
    @Column(name = "a_")
    private float a;
    @Basic(optional = false)
    @Column(name = "b_")
    private float b;
    @Basic(optional = false)
    @Column(name = "ppbp")
    private float ppbp;
    @Basic(optional = false)
    @Column(name = "pbn")
    private float pbn;
    @Basic(optional = false)
    @Column(name = "c_")
    private float c;
    @Basic(optional = false)
    @Column(name = "d_")
    private float d;
    @Basic(optional = false)
    @Column(name = "pbc")
    private float pbc;
    @Basic(optional = false)
    @Column(name = "ano")
    private short ano;
    @Basic(optional = false)
    @Column(name = "produtor")
    private short produtor;
    @Basic(optional = false)
    @Column(name = "setor")
    private short setor;

    public MetodoZae() {
    }

    public MetodoZae(Integer idMetodoZae) {
        this.idMetodoZae = idMetodoZae;
    }

    public MetodoZae(Integer idMetodoZae, float ciaf, float cr, float ccol, float cum, float nd, float f, float a, float b, float ppbp, float pbn, float c, float d, float pbc, short ano, short produtor, short setor) {
        this.idMetodoZae = idMetodoZae;
        this.ciaf = ciaf;
        this.cr = cr;
        this.ccol = ccol;
        this.cum = cum;
        this.nd = nd;
        this.f = f;
        this.a = a;
        this.b = b;
        this.ppbp = ppbp;
        this.pbn = pbn;
        this.c = c;
        this.d = d;
        this.pbc = pbc;
        this.ano = ano;
        this.produtor = produtor;
        this.setor = setor;
    }

    public Integer getIdMetodoZae() {
        return idMetodoZae;
    }

    public void setIdMetodoZae(Integer idMetodoZae) {
        Integer oldIdMetodoZae = this.idMetodoZae;
        this.idMetodoZae = idMetodoZae;
        changeSupport.firePropertyChange("idMetodoZae", oldIdMetodoZae, idMetodoZae);
    }

    public float getCiaf() {
        return ciaf;
    }

    public void setCiaf(float ciaf) {
        float oldCiaf = this.ciaf;
        this.ciaf = ciaf;
        changeSupport.firePropertyChange("ciaf", oldCiaf, ciaf);
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        float oldCr = this.cr;
        this.cr = cr;
        changeSupport.firePropertyChange("cr", oldCr, cr);
    }

    public float getCcol() {
        return ccol;
    }

    public void setCcol(float ccol) {
        float oldCcol = this.ccol;
        this.ccol = ccol;
        changeSupport.firePropertyChange("ccol", oldCcol, ccol);
    }

    public float getCum() {
        return cum;
    }

    public void setCum(float cum) {
        float oldCum = this.cum;
        this.cum = cum;
        changeSupport.firePropertyChange("cum", oldCum, cum);
    }

    public float getNd() {
        return nd;
    }

    public void setNd(float nd) {
        float oldNd = this.nd;
        this.nd = nd;
        changeSupport.firePropertyChange("nd", oldNd, nd);
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        float oldF = this.f;
        this.f = f;
        changeSupport.firePropertyChange("f", oldF, f);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        float oldA = this.a;
        this.a = a;
        changeSupport.firePropertyChange("a", oldA, a);
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        float oldB = this.b;
        this.b = b;
        changeSupport.firePropertyChange("b", oldB, b);
    }

    public float getPpbp() {
        return ppbp;
    }

    public void setPpbp(float ppbp) {
        float oldPpbp = this.ppbp;
        this.ppbp = ppbp;
        changeSupport.firePropertyChange("ppbp", oldPpbp, ppbp);
    }

    public float getPbn() {
        return pbn;
    }

    public void setPbn(float pbn) {
        float oldPbn = this.pbn;
        this.pbn = pbn;
        changeSupport.firePropertyChange("pbn", oldPbn, pbn);
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        float oldC = this.c;
        this.c = c;
        changeSupport.firePropertyChange("c", oldC, c);
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        float oldD = this.d;
        this.d = d;
        changeSupport.firePropertyChange("d", oldD, d);
    }

    public float getPbc() {
        return pbc;
    }

    public void setPbc(float pbc) {
        float oldPbc = this.pbc;
        this.pbc = pbc;
        changeSupport.firePropertyChange("pbc", oldPbc, pbc);
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        short oldAno = this.ano;
        this.ano = ano;
        changeSupport.firePropertyChange("ano", oldAno, ano);
    }

    public short getProdutor() {
        return produtor;
    }

    public void setProdutor(short produtor) {
        short oldProdutor = this.produtor;
        this.produtor = produtor;
        changeSupport.firePropertyChange("produtor", oldProdutor, produtor);
    }

    public short getSetor() {
        return setor;
    }

    public void setSetor(short setor) {
        short oldSetor = this.setor;
        this.setor = setor;
        changeSupport.firePropertyChange("setor", oldSetor, setor);
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
