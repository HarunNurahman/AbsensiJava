package coolabsensystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harun Nurahman
 */
public class Report extends javax.swing.JDialog {
    Connection koneksi;
    String action, id_kelas;
    DefaultTableModel dtm;
    int baris = -1;
    
    public Report(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        koneksi = CoolAbsenSystem.getKoneksi("localhost", "3306", "root", "", "absenkeren");
        action = "add";
        
        bodyPanel.setBackground(new Color(255, 255, 255));
        backPanel.setBackground(new Color(189, 188, 188));
        titlePanel.setBackground(new Color(229,13,58));
        
        tb_ID.setEnabled(false);
        getNewID();
        showKelas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kelas = new javax.swing.JTable();
        bodyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tb_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tb_kelas = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        tbl_kelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_kelas);

        jLabel2.setText("ID Kelas");

        tb_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_IDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Kelas");

        tb_kelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_kelasKeyPressed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Tambah Baru");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        lblJudul.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        lblJudul.setText("Form Manage Kelas");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tb_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tb_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        simpan();
    }//GEN-LAST:event_btnSimpanActionPerformed
    
    public void simpan(){
        String idKelas = tb_ID.getText();
        String kelas = tb_kelas.getText();
        FormDataSiswaKeren rsa = new FormDataSiswaKeren();
        
        if(action.equals("edit")){
            try {
                Statement stmt = koneksi.createStatement();
                String query = "UPDATE t_kelas SET id_kelas = '"+idKelas+"',"
                        + "kelas = '"+kelas+"' WHERE id_kelas = '"+idKelas+"'";
                System.out.println(query);
                int berhasil = stmt.executeUpdate(query);
                if(berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                }           
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Query");
            }
        } else {
            try {
                Statement stmt = koneksi.createStatement();
                String query = "INSERT INTO t_kelas (id_kelas, kelas)"
                        + "VALUES('"+idKelas+"','"+kelas+"')";
                System.out.println(query);
                int berhasil = stmt.executeUpdate(query);
                if (berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
                    rsa.createKelas(kelas);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Database");
            }
        }      
        setVisible(false);
    }
    
    private void tb_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_IDActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_formKeyPressed

    private void tb_kelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_kelasKeyPressed
        int key = evt.getKeyCode();
        if(key==10){
            simpan();
        }
    }//GEN-LAST:event_tb_kelasKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        getNewID();
        action = "add";
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbl_kelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kelasMouseClicked
        baris = tbl_kelas.getSelectedRow();
        id_kelas = tbl_kelas.getValueAt (baris, 1).toString();
        showData(id_kelas);
        action = "edit";
    }//GEN-LAST:event_tbl_kelasMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JFrame frame = new JFrame();
        String message = "Apakah anda benar - benar ingin menghapus data ini???";

        if (baris == -1){
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih!");
        } else {
            int answer = JOptionPane.showConfirmDialog(frame, message);

            if (answer == JOptionPane.YES_OPTION) {
                deleteKelas();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    void deleteKelas(){
        try{
            Statement stmt = koneksi.createStatement();
            String delete = "DELETE FROM t_kelas WHERE id_kelas='"+id_kelas+"';";
            int berhasil = stmt.executeUpdate(delete);
            if(berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!");
                dtm.getDataVector().removeAllElements();
                showKelas();
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal dihapus!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    void getNewID(){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT id_kelas FROM t_kelas ORDER BY id_kelas DESC LIMIT 1 ";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            int nomer = Integer.valueOf(rs.getString("id_kelas"));
            nomer+=1;
            tb_ID.setText(String.valueOf(nomer));
            tb_kelas.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan di Query");
        }
    }
    
    void showKelas(){
        String kolom[] = {"No","ID kelas","Kelas"};
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_kelas";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String idKelas = rs.getString("id_kelas");
                String kelas = rs.getString("kelas");

                dtm.addRow(new String[]{no+"",idKelas, kelas});
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_kelas.setModel(dtm);
    }
    
    void showData(String id_kelas){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_kelas WHERE id_kelas = '"+id_kelas+"'";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            tb_ID.setText(rs.getString("id_kelas"));
            tb_kelas.setText(rs.getString("kelas"));
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan di Query");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JTextField tb_ID;
    private javax.swing.JTextField tb_kelas;
    private javax.swing.JTable tbl_kelas;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
