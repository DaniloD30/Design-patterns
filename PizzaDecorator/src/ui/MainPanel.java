/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import concret.PizzaSimples;
import interfaces.Decorator;
import interfaces.IComponent;
import java.util.List;
import javax.swing.DefaultListModel;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author caiovosilva
 */
public class MainPanel extends javax.swing.JPanel {
    //selected
    private DefaultListModel selected;

    public MainPanel(List<Decorator> listaPlugins) {
        selected = new DefaultListModel();
        DefaultListModel lista = new DefaultListModel();
        initComponents();
        for (Decorator plugin : listaPlugins) {
            lista.addElement(plugin);
        }
        jList1.setModel(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_Remove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btn_MoveUp = new javax.swing.JButton();
        btn_moveDown = new javax.swing.JButton();
        btn_Ok = new javax.swing.JButton();

        btn_Add.setText(">");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        btn_Remove.setText("<");
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        btn_MoveUp.setText("^");
        btn_MoveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoveUpActionPerformed(evt);
            }
        });

        btn_moveDown.setText("v");
        btn_moveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moveDownActionPerformed(evt);
            }
        });

        btn_Ok.setText("OK");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_MoveUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_moveDown, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Add)
                        .addGap(80, 80, 80)
                        .addComponent(btn_Remove)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_MoveUp)
                        .addGap(57, 57, 57)
                        .addComponent(btn_moveDown)
                        .addGap(71, 71, 71))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_Ok)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        if (jList1.getSelectedValue() != null) {
            selected.addElement(jList1.getSelectedValue());
            jList2.setModel(selected);
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveActionPerformed
        if (jList2.getSelectedIndex() > -1) {
            selected.remove(jList2.getLeadSelectionIndex());
            jList2.setModel(selected);
        }
    }//GEN-LAST:event_btn_RemoveActionPerformed

    private void btn_MoveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoveUpActionPerformed
        int selecionado = jList2.getSelectedIndex();
        if ((selecionado > -1) && (selecionado - 1 >= 0)) {
            inverter(selecionado, selecionado - 1);
        }
    }//GEN-LAST:event_btn_MoveUpActionPerformed

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        IComponent pizza = montarPizza();
       JOptionPane.showMessageDialog(null, pizza.makePizza(), "Pizza pronta!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_OkActionPerformed

    private void btn_moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moveDownActionPerformed
        int selecionado = jList2.getSelectedIndex();
        if ((selecionado > -1) && (selecionado + 1 < selected.size())) {
            inverter(selecionado, selecionado + 1);
        }
    }//GEN-LAST:event_btn_moveDownActionPerformed

    private void inverter(int a, int b) {
        Object item = selected.getElementAt(a);
        selected.setElementAt(selected.getElementAt(b), a);
        selected.setElementAt(item, b);
        jList2.setModel(selected);
    }

    private IComponent montarPizza() {
        ListModel dlm = jList2.getModel();
        IComponent pizza = new PizzaSimples();
        for (Object obj : selected.toArray()) {
            try {
                Decorator  item = ((Decorator) obj).getClass().newInstance();
                try {
                    item.setDecorated(pizza);
                } catch (Exception ex) {
                    Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                pizza = item;
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pizza;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_MoveUp;
    private javax.swing.JButton btn_Ok;
    private javax.swing.JButton btn_Remove;
    private javax.swing.JButton btn_moveDown;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
