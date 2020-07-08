package coolabsensystem;

import java.awt.Color;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

public class FormDataSiswaKeren extends javax.swing.JFrame {

    int selected, baris = -1;
    Connection koneksi;
    DefaultTableModel dtm;

    public FormDataSiswaKeren() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormDataSiswaKeren.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FormDataSiswaKeren.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FormDataSiswaKeren.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FormDataSiswaKeren.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        koneksi = CoolAbsenSystem.getKoneksi("localhost", "3306", "root", "", "absenkeren");

        headPanel.setBackground(new Color(229, 13, 58));
        bodyPanel.setBackground(new Color(255, 255, 255));
        naviPanel.setBackground(new Color(189, 188, 188));

        showDataRPL();
        showDataTKJ();
        showDataMM();

    }

    public void showDataRPL() {
        String kolom[] = {"No", "NIS", "Nama Siswa", "Kelas"};
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_murid WHERE kelas='XII RPL'";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String nis = rs.getString("nis");
                String nama = rs.getString("nm_siswa");
                String kelas = rs.getString("kelas");

                dtm.addRow(new String[]{no + "", nis, nama, kelas});
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_RPL.setModel(dtm);
    }

    public void showDataTKJ() {
        String kolom[] = {"No", "NIS", "Nama Siswa", "Kelas"};
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_murid WHERE kelas='XII TKJ'";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String nis = rs.getString("nis");
                String nama = rs.getString("nm_siswa");
                String kelas = rs.getString("kelas");

                dtm.addRow(new String[]{no + "", nis, nama, kelas});
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_TKJ.setModel(dtm);
    }

    public void showDataMM() {
        String kolom[] = {"No", "NIS", "Nama Siswa", "Kelas"};
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_murid WHERE kelas='XII MM'";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String nis = rs.getString("nis");
                String nama = rs.getString("nm_siswa");
                String kelas = rs.getString("kelas");

                dtm.addRow(new String[]{no + "", nis, nama, kelas});
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_MM.setModel(dtm);
    }

    public void addMurid() {
        ManageMurid Tambah = new ManageMurid(this, true, "add", "", "");
        Tambah.setVisible(true);
    }

    public void editMurid() {
        String nis = null, kelas = null;

        if (selected == 0) {
            nis = tbl_RPL.getValueAt(baris, 1).toString();
            kelas = tbl_RPL.getValueAt(baris, 3).toString();
        } else if (selected == 1) {
            nis = tbl_TKJ.getValueAt(baris, 1).toString();
            kelas = tbl_TKJ.getValueAt(baris, 3).toString();
        } else if (selected == 2) {
            nis = tbl_MM.getValueAt(baris, 1).toString();
            kelas = tbl_MM.getValueAt(baris, 3).toString();
        }

        if (baris == -1) {
            JOptionPane.showMessageDialog(null, "Data belum dipilih!");
        } else {
            System.out.println(kelas);
            new ManageMurid(this, true, "edit", nis, kelas).setVisible(true);
        }
    }

    public void deleteMurid() {
        String nis = null;
        if (selected == 0) {
            nis = tbl_RPL.getValueAt(baris, 1).toString();
        } else if (selected == 1) {
            nis = tbl_TKJ.getValueAt(baris, 1).toString();
        } else if (selected == 2) {
            nis = tbl_MM.getValueAt(baris, 1).toString();
        }

        if (baris == -1) {
            JOptionPane.showMessageDialog(null, "Data belum dipilih!");
        } else {
            try {
                Statement stmt = koneksi.createStatement();
                String delete = "DELETE FROM t_murid WHERE nis='" + nis + "';";
                int berhasil = stmt.executeUpdate(delete);
                if (berhasil == 1) {
                    String delet = "DELETE FROM t_absen WHERE nis='" + nis + "';";
                    stmt.executeUpdate(delet);
                    JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!");
                    dtm.getDataVector().removeAllElements();
                    showDataRPL();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal dihapus!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void createKelas(String nm_kelas) {
        System.out.println(nm_kelas);
        javax.swing.JPanel panelKelas = new javax.swing.JPanel();
        //panelKelas.add();
        DataMurid.addTab(nm_kelas, tabRPL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        naviPanel = new javax.swing.JPanel();
        btnAbsen = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnManageKelas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        headPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        DataMurid = new javax.swing.JTabbedPane();
        tabRPL = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_RPL = new javax.swing.JTable();
        tabTKJ = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_TKJ = new javax.swing.JTable();
        tabMM = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_MM = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLaporan = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAbsen.setText("Absensi");
        btnAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsenActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus Murid");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Murid");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setText("Tambah Murid");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnManageKelas.setText("Manage Kelas");
        btnManageKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageKelasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Made With B", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("C.A.S");

        jLabel4.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        jLabel4.setText("Cool Absen System");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coolabsensystem/smkn4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel2.setText("SMK NEGERI 4 BANDUNG");

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel1.setText("DATA MURID");

        DataMurid.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        DataMurid.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DataMuridStateChanged(evt);
            }
        });

        tbl_RPL.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPLMouseClicked(evt);
            }
        });
        tbl_RPL.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbl_RPLPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_RPL);

        javax.swing.GroupLayout tabRPLLayout = new javax.swing.GroupLayout(tabRPL);
        tabRPL.setLayout(tabRPLLayout);
        tabRPLLayout.setHorizontalGroup(
            tabRPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        tabRPLLayout.setVerticalGroup(
            tabRPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRPLLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        DataMurid.addTab("XII-RPL", tabRPL);

        tbl_TKJ.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_TKJ);

        javax.swing.GroupLayout tabTKJLayout = new javax.swing.GroupLayout(tabTKJ);
        tabTKJ.setLayout(tabTKJLayout);
        tabTKJLayout.setHorizontalGroup(
            tabTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        tabTKJLayout.setVerticalGroup(
            tabTKJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        DataMurid.addTab("XII-TKJ", tabTKJ);

        tbl_MM.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_MM);

        javax.swing.GroupLayout tabMMLayout = new javax.swing.GroupLayout(tabMM);
        tabMM.setLayout(tabMMLayout);
        tabMMLayout.setHorizontalGroup(
            tabMMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        tabMMLayout.setVerticalGroup(
            tabMMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        DataMurid.addTab("XII-AV", tabMM);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel7.setText("Report");

        btnLaporan.setText("Laporan");
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        btnPDF.setText("Export to PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataMurid, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(btnLaporan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint))
                            .addComponent(jLabel7))))
                .addGap(25, 25, 25))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(DataMurid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaporan)
                    .addComponent(btnPDF)
                    .addComponent(btnPrint))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout naviPanelLayout = new javax.swing.GroupLayout(naviPanel);
        naviPanel.setLayout(naviPanelLayout);
        naviPanelLayout.setHorizontalGroup(
            naviPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(naviPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(naviPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(naviPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, naviPanelLayout.createSequentialGroup()
                        .addGroup(naviPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(naviPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAbsen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addGroup(naviPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3)))
                        .addGap(27, 27, 27))))
        );
        naviPanelLayout.setVerticalGroup(
            naviPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(naviPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(57, 57, 57)
                .addComponent(btnAbsen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageKelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(naviPanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(naviPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(naviPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addMurid();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbl_RPLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPLMouseClicked
        baris = tbl_RPL.getSelectedRow();
    }//GEN-LAST:event_tbl_RPLMouseClicked

    private void tbl_TKJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJMouseClicked
        baris = tbl_TKJ.getSelectedRow();
    }//GEN-LAST:event_tbl_TKJMouseClicked

    private void tbl_MMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MMMouseClicked
        baris = tbl_MM.getSelectedRow();
    }//GEN-LAST:event_tbl_MMMouseClicked

    private void DataMuridStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DataMuridStateChanged
        selected = DataMurid.getSelectedIndex();
        baris = -1;
    }//GEN-LAST:event_DataMuridStateChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (baris == -1) {
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih!");
        } else {
            editMurid();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JFrame frame = new JFrame();
        String message = "Apakah anda benar - benar ingin menghapus data ini???";

        if (baris == -1) {
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih!");
        } else {
            int answer = JOptionPane.showConfirmDialog(frame, message);

            if (answer == JOptionPane.YES_OPTION) {
                deleteMurid();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbl_RPLPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbl_RPLPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_RPLPropertyChange

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showDataRPL();
        showDataTKJ();
        showDataMM();
        baris = -1;
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsenActionPerformed
        new FormAbsensi(this, true).setVisible(true);
    }//GEN-LAST:event_btnAbsenActionPerformed

    private void btnManageKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageKelasActionPerformed
        new ManageKelas(this, true).setVisible(true);
    }//GEN-LAST:event_btnManageKelasActionPerformed

    public void callReport(String act, String path) {
        int kelas = DataMurid.getSelectedIndex();
        String kls = "";
        if (kelas == 0) {
            kls = "XII RPL";
        } else if (kelas == 1) {
            kls = "XII TKJ";
        } else if (kelas == 2) {
            kls = "XII MM";
        }

        try {
            ClassLoader cl = getClass().getClassLoader();
            //if(kelas.equals(""))
            InputStream inReportFile = cl.getResourceAsStream("DataSiswa.jasper");

            HashMap parameter = new HashMap();
            parameter.put("nama_kelas", kls);

            JasperPrint jasperPrint = JasperFillManager.fillReport(inReportFile, parameter, koneksi);
            if (act.equals("view")) {
                JasperViewer.viewReport(jasperPrint, false);
            } else if (act.equals("save")) {
                JasperExportManager.exportReportToPdfFile(jasperPrint, path);
            } else if (act.equals("print")) {
                JasperPrintManager.printPage(jasperPrint, 0, true);
            }
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        callReport("view", "");
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(".pdf", "pdf"));

        fileChooser.setDialogTitle("Pilih Lokasi Penyimpanan");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String file_name = fileToSave.getAbsolutePath();

            if (!file_name.endsWith(".pdf")) {
                fileToSave = new File(file_name + ".pdf");
            }

            System.out.println("Save as file: " + fileToSave);
            callReport("save", fileToSave.getAbsolutePath());
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        callReport("print", "");
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataSiswaKeren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataSiswaKeren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataSiswaKeren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataSiswaKeren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataSiswaKeren().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane DataMurid;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAbsen;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnManageKelas;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel naviPanel;
    private javax.swing.JPanel tabMM;
    private javax.swing.JPanel tabRPL;
    private javax.swing.JPanel tabTKJ;
    private javax.swing.JTable tbl_MM;
    private javax.swing.JTable tbl_RPL;
    private javax.swing.JTable tbl_TKJ;
    // End of variables declaration//GEN-END:variables
}
