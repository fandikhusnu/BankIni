/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaultpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Fandi Khusnu
 */
public class BankIni extends javax.swing.JFrame {

    /**
     * Creates new form BankIni
     */
    public BankIni() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saldo = new javax.swing.JButton();
        penarikan = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        setor = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        inputPenarikan = new javax.swing.JTextField();
        inputTransfer = new javax.swing.JTextField();
        inputSetor = new javax.swing.JTextField();
        keterangan = new javax.swing.JLabel();
        nilai = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 230, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Selamat Datang di layanan ATM BANK INI");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 40, 330, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Silahkan Pilih Transaksi yang anda inginkan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 80, 250, 17);

        saldo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        saldo.setText("SALDO");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(30, 130, 103, 32);

        penarikan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        penarikan.setText("PENARIKAN");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        getContentPane().add(penarikan);
        penarikan.setBounds(30, 180, 103, 32);

        transfer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        transfer.setText("TRANSFER");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer);
        transfer.setBounds(30, 230, 103, 32);

        setor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        setor.setText("SETOR");
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        getContentPane().add(setor);
        setor.setBounds(30, 280, 103, 32);

        logOut.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        logOut.setText("Keluar");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(550, 360, 75, 23);

        inputPenarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPenarikanActionPerformed(evt);
            }
        });
        getContentPane().add(inputPenarikan);
        inputPenarikan.setBounds(190, 180, 103, 30);
        getContentPane().add(inputTransfer);
        inputTransfer.setBounds(190, 230, 103, 30);
        getContentPane().add(inputSetor);
        inputSetor.setBounds(190, 280, 103, 30);

        keterangan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(keterangan);
        keterangan.setBounds(320, 140, 320, 30);

        nilai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(nilai);
        nilai.setBounds(360, 170, 230, 30);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 390);

        setBounds(0, 0, 672, 432);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        new BankIniLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        int saldo = 150000;
        keterangan.setText("SISA SALDO YANG ANDA :");
        nilai.setText(""+saldo);
        
        
    }//GEN-LAST:event_saldoActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
        String tarikan = inputPenarikan.getText();
            int saldo = 150000;
            int jmltarik = Integer.parseInt(tarikan);
            int total = saldo-jmltarik;
            if(saldo<jmltarik)
                JOptionPane.showMessageDialog(null, "Saldo yang anda miliki tidak cukup ");
            else
                nilai.setText(""+total);
    }//GEN-LAST:event_penarikanActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        String transfer = inputTransfer.getText();
        String saldolast = nilai.getText();
        nilai.setText(""+saldolast);
        int jmltransfer = Integer.parseInt(transfer);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo-jmltransfer;
        if(lastsaldo<jmltransfer)
                JOptionPane.showMessageDialog(null, "Saldo yang anda miliki tidak cukup ");
            else
                nilai.setText(""+total);
    }//GEN-LAST:event_transferActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        String setor = inputSetor.getText();
        String saldolast = nilai.getText();
        nilai.setText(""+saldolast);
        int jmlsetor = Integer.parseInt(setor);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo+jmlsetor;
        nilai.setText(""+total);
    }//GEN-LAST:event_setorActionPerformed

    private void inputPenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPenarikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPenarikanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BankIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankIni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputPenarikan;
    private javax.swing.JTextField inputSetor;
    private javax.swing.JTextField inputTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel keterangan;
    private javax.swing.JButton logOut;
    private javax.swing.JLabel nilai;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton saldo;
    private javax.swing.JButton setor;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}
