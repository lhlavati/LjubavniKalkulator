/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luka
 */
public class LjubavniKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form LjubavniKalkulator
     */
    public LjubavniKalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOna = new javax.swing.JLabel();
        lblOn = new javax.swing.JLabel();
        txtOna = new javax.swing.JTextField();
        txtOn = new javax.swing.JTextField();
        btnVoleSe = new javax.swing.JButton();
        lblPostotak = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ljubavni Kalkulator");

        lblOna.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N
        lblOna.setText("Ona");

        lblOn.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N
        lblOn.setText("On");

        txtOna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtOn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnVoleSe.setIcon(new javax.swing.ImageIcon("C:\\Users\\dumbi\\Downloads\\srce.png")); // NOI18N
        btnVoleSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoleSeActionPerformed(evt);
            }
        });

        lblPostotak.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N

        btnReset.setFont(new java.awt.Font("Edwardian Script ITC", 0, 28)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtOna, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txtOn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblOna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOn)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoleSe)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPostotak, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOn)
                    .addComponent(lblOna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOna, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVoleSe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPostotak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoleSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoleSeActionPerformed
        brojacSlova();
    }//GEN-LAST:event_btnVoleSeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtOna.setText("");
        txtOn.setText("");
        lblPostotak.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private String slaganjePoAbecedi() {

        String malaSlova = ((txtOna.getText() + txtOn.getText()).toLowerCase());
        char temp;
        char[] charmalaSlova = malaSlova.toCharArray();
        for (int i = 1; i < charmalaSlova.length; i++) {
            for (int j = 0; j < charmalaSlova.length - 1; j++) {
                if (charmalaSlova[j] > charmalaSlova[j + 1]) {
                    temp = charmalaSlova[j];
                    charmalaSlova[j] = charmalaSlova[j + 1];
                    charmalaSlova[j + 1] = temp;
                }
            }
        }
        return String.valueOf(charmalaSlova);

    }

    private void brojacSlova() {
        char c;
        Map<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < slaganjePoAbecedi().length(); i++) {
            c = slaganjePoAbecedi().charAt(i);
            if (mapa.containsKey(c)) {
                int brojac = mapa.get(c);
                mapa.put(c, ++brojac);
            } else {
                mapa.put(c, 1);
            }
        }
        TreeMap<Character, Integer> sortiraj = new TreeMap<>();
        sortiraj.putAll(mapa);
        System.out.println(sortiraj);

        Collection<Integer> vrijednosti = sortiraj.values();
        Integer[] niz = vrijednosti.toArray(new Integer[vrijednosti.size()]);
        System.out.println(Arrays.deepToString(niz));

        Integer[] suma = new Integer[niz.length / 2];
        Integer[] suma1 = new Integer[suma.length / 2];
        Integer[] sumaN = new Integer[niz.length / 2 + 1];
        Integer[] sumaN1 = new Integer[suma.length / 2 + 1];
        int j = 0;
        if (niz.length % 2 == 0) {

            for (int i = 0; i <= niz.length - 2; i++) {
                if (i % 2 == 0 && j < niz.length / 2) {
                    niz[j++] = niz[i] + niz[i + 1];
                }
            }
            System.arraycopy(niz, 0, suma, 0, suma.length);
            System.out.println(Arrays.toString(suma));
            j = 0;
            if (suma.length % 2 == 0) {
                for (int i = 0; i <= suma.length - 2; i++) {
                    if (i % 2 == 0 && j < suma.length / 2) {
                        suma[j++] = suma[i] + suma[i + 1];
                    }
                }
                System.arraycopy(suma, 0, suma1, 0, suma1.length);
                System.out.println(Arrays.toString(suma1));
                lblPostotak.setText("Vole se " + String.valueOf(suma1[0]) + String.valueOf(suma1[1] + "%"));
            } else {
                for (int i = 0; i <= suma.length - 2; i++) {
                    if (i % 2 == 0 && j < suma.length / 2 + 1) {
                        suma[j++] = suma[i] + suma[i + 1];
                    }
                }
                System.arraycopy(suma, 0, sumaN1, 0, sumaN1.length);
                System.out.println(Arrays.toString(sumaN1));
                lblPostotak.setText("Vole se " + String.valueOf(sumaN1[0]) + String.valueOf(sumaN1[1] + "%"));
            }
        } else {

            for (int i = 0; i <= sumaN.length - 2; i++) {
                if (i % 2 == 0 && j < sumaN.length / 2) {
                    sumaN[j++] = sumaN[i] + sumaN[i + 1];
                }
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnVoleSe;
    private javax.swing.JLabel lblOn;
    private javax.swing.JLabel lblOna;
    private javax.swing.JLabel lblPostotak;
    private javax.swing.JTextField txtOn;
    private javax.swing.JTextField txtOna;
    // End of variables declaration//GEN-END:variables
}
