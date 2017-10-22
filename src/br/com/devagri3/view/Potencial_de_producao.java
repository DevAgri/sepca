/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.view;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author willyan
 */
public class Potencial_de_producao extends JPanel {
    
    public Potencial_de_producao() {
        initComponents();
     
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("devagriPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MetodoZae m");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        ciafLabel = new javax.swing.JLabel();
        crLabel = new javax.swing.JLabel();
        ccolLabel = new javax.swing.JLabel();
        cumLabel = new javax.swing.JLabel();
        ndLabel = new javax.swing.JLabel();
        fLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        ppbpLabel = new javax.swing.JLabel();
        pbnLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        pbcLabel = new javax.swing.JLabel();
        anoLabel = new javax.swing.JLabel();
        produtorLabel = new javax.swing.JLabel();
        setorLabel = new javax.swing.JLabel();
        ciafField = new javax.swing.JTextField();
        crField = new javax.swing.JTextField();
        ccolField = new javax.swing.JTextField();
        cumField = new javax.swing.JTextField();
        ndField = new javax.swing.JTextField();
        fField = new javax.swing.JTextField();
        aField = new javax.swing.JTextField();
        bField = new javax.swing.JTextField();
        ppbpField = new javax.swing.JTextField();
        pbnField = new javax.swing.JTextField();
        cField = new javax.swing.JTextField();
        dField = new javax.swing.JTextField();
        pbcField = new javax.swing.JTextField();
        anoField = new javax.swing.JTextField();
        produtorField = new javax.swing.JTextField();
        setorField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masterTable.setShowGrid(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ciaf}"));
        columnBinding.setColumnName("Ciaf");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cr}"));
        columnBinding.setColumnName("Cr");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ccol}"));
        columnBinding.setColumnName("Ccol");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cum}"));
        columnBinding.setColumnName("Cum");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nd}"));
        columnBinding.setColumnName("Nd");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${f}"));
        columnBinding.setColumnName("F");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${a}"));
        columnBinding.setColumnName("A");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${b}"));
        columnBinding.setColumnName("B");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ppbp}"));
        columnBinding.setColumnName("Ppbp");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pbn}"));
        columnBinding.setColumnName("Pbn");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${c}"));
        columnBinding.setColumnName("C");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${d}"));
        columnBinding.setColumnName("D");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pbc}"));
        columnBinding.setColumnName("Pbc");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ano}"));
        columnBinding.setColumnName("Ano");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produtor}"));
        columnBinding.setColumnName("Produtor");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${setor}"));
        columnBinding.setColumnName("Setor");
        columnBinding.setColumnClass(Short.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 860, 131));

        ciafLabel.setText("Ciaf:");
        add(ciafLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 148, -1, -1));

        crLabel.setText("Cr:");
        add(crLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 148, -1, -1));

        ccolLabel.setText("Ccol:");
        add(ccolLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 148, -1, -1));

        cumLabel.setText("Cum:");
        add(cumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 148, -1, -1));

        ndLabel.setText("Nd:");
        add(ndLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 148, -1, -1));

        fLabel.setText("F:");
        add(fLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 148, -1, -1));

        aLabel.setText("A:");
        add(aLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 148, -1, -1));

        bLabel.setText("B:");
        add(bLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, -1, -1));

        ppbpLabel.setText("Ppbp:");
        add(ppbpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 180, -1, -1));

        pbnLabel.setText("Pbn:");
        add(pbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 180, -1, -1));

        cLabel.setText("C:");
        add(cLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 180, -1, -1));

        dLabel.setText("D:");
        add(dLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 180, -1, -1));

        pbcLabel.setText("Pbc:");
        add(pbcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 180, -1, -1));

        anoLabel.setText("Ano:");
        add(anoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        produtorLabel.setText("Produtor:");
        add(produtorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        setorLabel.setText("Setor:");
        add(setorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ciaf}"), ciafField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ciafField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(ciafField, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 143, 62, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cr}"), crField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), crField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(crField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 143, 116, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ccol}"), ccolField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ccolField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(ccolField, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 143, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cum}"), cumField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cumField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(cumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 143, 64, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nd}"), ndField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ndField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(ndField, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 143, 64, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.f}"), fField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), fField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(fField, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 143, 64, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.a}"), aField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), aField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(aField, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 143, 64, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.b}"), bField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), bField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(bField, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 175, 62, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ppbp}"), ppbpField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ppbpField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(ppbpField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 175, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pbn}"), pbnField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), pbnField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(pbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 175, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.c}"), cField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(cField, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 175, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.d}"), dField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), dField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(dField, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 175, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pbc}"), pbcField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), pbcField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(pbcField, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 175, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ano}"), anoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), anoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(anoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produtor}"), produtorField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), produtorField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(produtorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 56, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.setor}"), setorField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), setorField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(setorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 56, -1));

        saveButton.setText("Salvar");
        saveButton.addActionListener(formListener);
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 100, -1));

        refreshButton.setText("Atualizar");
        refreshButton.addActionListener(formListener);
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        newButton.setText("Inserir");
        newButton.addActionListener(formListener);
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 100, -1));

        deleteButton.setText("Apagar");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, -1));

        jLabel1.setText("Ciaf - Coeficiente de Área Foliar");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel2.setText("Cr - Coeficiente de Respiração ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, 20));

        jLabel3.setText("Ccol - Coeficiente (Índice de Colheita)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel4.setText("Cum - Coeficiente de Umidade Residual");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel5.setText("Nd - Número do ciclo de crescimento (dias) ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel6.setText("F - Fração do dia com Nebulosidade");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jLabel7.setText("A - 0,8 de acordo com PPBp  e\" 20kg ha(Fischer et al., 2002; Doorenbos & Kassam, 1979) ou 0,5 PPBp < 20kg ha");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel8.setText("B - 0,01 de acordo com PPBp  e\" 20kg ha(Fischer et al., 2002; Doorenbos & Kassam, 1979) ou 0,025 PPBp < 20kg ha");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel9.setText("PPBp - Produção Bruta da Matéria");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel10.setText("PBn - Período Nublado");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel11.setText("C - 0,5 de acordo com PPBp  e\" 20kg ha(Fischer et al., 2002; Doorenbos & Kassam, 1979) ou 0 PPBp < 20kg ha");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel12.setText("D - 0,025 de acordo com PPBp  e\" 20kg ha(Fischer et al., 2002; Doorenbos & Kassam, 1979) ou 0,05 PPBp < 20kg ha");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel13.setText("PBc - Período de Céu Claro");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/devagri3/assets/2background.jpg"))); // NOI18N
        add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 500));

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                Potencial_de_producao.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                Potencial_de_producao.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                Potencial_de_producao.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                Potencial_de_producao.this.deleteButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<br.com.devagri3.metodos.MetodoZae> toRemove = new ArrayList<br.com.devagri3.metodos.MetodoZae>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            br.com.devagri3.metodos.MetodoZae m = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(m);
            entityManager.remove(m);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        br.com.devagri3.metodos.MetodoZae m = new br.com.devagri3.metodos.MetodoZae();
        entityManager.persist(m);
        list.add(m);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.com.devagri3.metodos.MetodoZae> merged = new ArrayList<br.com.devagri3.metodos.MetodoZae>(list.size());
            for (br.com.devagri3.metodos.MetodoZae m : list) {
                merged.add(entityManager.merge(m));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aField;
    private javax.swing.JLabel aLabel;
    private javax.swing.JTextField anoField;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField bField;
    private javax.swing.JLabel bLabel;
    private javax.swing.JTextField cField;
    private javax.swing.JLabel cLabel;
    private javax.swing.JTextField ccolField;
    private javax.swing.JLabel ccolLabel;
    private javax.swing.JTextField ciafField;
    private javax.swing.JLabel ciafLabel;
    private javax.swing.JTextField crField;
    private javax.swing.JLabel crLabel;
    private javax.swing.JTextField cumField;
    private javax.swing.JLabel cumLabel;
    private javax.swing.JTextField dField;
    private javax.swing.JLabel dLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField fField;
    private javax.swing.JLabel fLabel;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.util.List<br.com.devagri3.metodos.MetodoZae> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JTextField ndField;
    private javax.swing.JLabel ndLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField pbcField;
    private javax.swing.JLabel pbcLabel;
    private javax.swing.JTextField pbnField;
    private javax.swing.JLabel pbnLabel;
    private javax.swing.JTextField ppbpField;
    private javax.swing.JLabel ppbpLabel;
    private javax.swing.JTextField produtorField;
    private javax.swing.JLabel produtorLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField setorField;
    private javax.swing.JLabel setorLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Potencial_de_producao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Potencial_de_producao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Potencial_de_producao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Potencial_de_producao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new Potencial_de_producao());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                //frame.setSize(900, 550);
                frame.setLocationRelativeTo(null);
                //frame.setResizable(false); 
                frame.setVisible(true);
                
            }
        });
    }
    
}
