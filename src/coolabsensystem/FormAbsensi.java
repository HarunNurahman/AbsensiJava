package coolabsensystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Harun Nurahman
 */
public class FormAbsensi extends javax.swing.JDialog {
    
    Connection koneksi;
    DefaultTableModel dtm;
    String action, kls;
    int selBulan, selKelas, baris, fokus;
    
    public FormAbsensi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        koneksi = CoolAbsenSystem.getKoneksi("localhost", "3306", "root", "", "absenkeren");
        
        setBulan();
        setRank();
        btnAbsenEnable(-1);
        
        logoPanel.setBackground(new Color(189, 188, 188));
        absenPanel.setBackground(new Color(229,13,58));
        backPanel.setBackground(new Color(255, 255, 255));
        
        showDataRPL(); 
        showDataTKJ();
        showDataMM();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        absenPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        cmbMinggu = new javax.swing.JComboBox();
        backPanel = new javax.swing.JPanel();
        tabContent = new javax.swing.JTabbedPane();
        tabJul = new javax.swing.JPanel();
        julTab = new javax.swing.JTabbedPane();
        tabRPL1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_RPL1 = new javax.swing.JTable();
        tabTKJ1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_TKJ1 = new javax.swing.JTable();
        tabMM1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_MM1 = new javax.swing.JTable();
        tabAgu = new javax.swing.JPanel();
        aguTab = new javax.swing.JTabbedPane();
        tabRPL2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_RPL2 = new javax.swing.JTable();
        tabTKJ2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_TKJ2 = new javax.swing.JTable();
        tabMM2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_MM2 = new javax.swing.JTable();
        tabSep = new javax.swing.JPanel();
        sepTab = new javax.swing.JTabbedPane();
        tabRPL3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_RPL3 = new javax.swing.JTable();
        tabTKJ3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_TKJ3 = new javax.swing.JTable();
        tabMM3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_MM3 = new javax.swing.JTable();
        tabOkt = new javax.swing.JPanel();
        oktTab = new javax.swing.JTabbedPane();
        tabRPL4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_RPL4 = new javax.swing.JTable();
        tabTKJ4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_TKJ4 = new javax.swing.JTable();
        tabMM4 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbl_MM4 = new javax.swing.JTable();
        tabNov = new javax.swing.JPanel();
        novTab = new javax.swing.JTabbedPane();
        tabRPL5 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbl_RPL5 = new javax.swing.JTable();
        tabTKJ5 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbl_TKJ5 = new javax.swing.JTable();
        tabMM5 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_MM5 = new javax.swing.JTable();
        tabDes = new javax.swing.JPanel();
        desTab = new javax.swing.JTabbedPane();
        tabRPL6 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tbl_RPL6 = new javax.swing.JTable();
        tabTKJ6 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbl_TKJ6 = new javax.swing.JTable();
        tabMM6 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tbl_MM6 = new javax.swing.JTable();
        tabJan = new javax.swing.JPanel();
        janTab = new javax.swing.JTabbedPane();
        tabRPL7 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tbl_RPL7 = new javax.swing.JTable();
        tabTKJ7 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tbl_TKJ7 = new javax.swing.JTable();
        tabMM7 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tbl_MM7 = new javax.swing.JTable();
        tabFeb = new javax.swing.JPanel();
        febTab = new javax.swing.JTabbedPane();
        tabRPL8 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tbl_RPL8 = new javax.swing.JTable();
        tabTKJ8 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tbl_TKJ8 = new javax.swing.JTable();
        tabMM8 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tbl_MM8 = new javax.swing.JTable();
        tabMar = new javax.swing.JPanel();
        marTab = new javax.swing.JTabbedPane();
        tabRPL9 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tbl_RPL9 = new javax.swing.JTable();
        tabTKJ9 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tbl_TKJ9 = new javax.swing.JTable();
        tabMM9 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tbl_MM9 = new javax.swing.JTable();
        tabApr = new javax.swing.JPanel();
        aprTab = new javax.swing.JTabbedPane();
        tabRPL10 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tbl_RPL10 = new javax.swing.JTable();
        tabTKJ10 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tbl_TKJ10 = new javax.swing.JTable();
        tabMM10 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tbl_MM10 = new javax.swing.JTable();
        tabMei = new javax.swing.JPanel();
        meiTab = new javax.swing.JTabbedPane();
        tabRPL11 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        tbl_RPL11 = new javax.swing.JTable();
        tabTKJ11 = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        tbl_TKJ11 = new javax.swing.JTable();
        tabMM11 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        tbl_MM11 = new javax.swing.JTable();
        tabJun = new javax.swing.JPanel();
        junTab = new javax.swing.JTabbedPane();
        tabRPL12 = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        tbl_RPL12 = new javax.swing.JTable();
        tabTKJ12 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tbl_TKJ12 = new javax.swing.JTable();
        tabMM12 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tbl_MM12 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblHadir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblIzin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSakit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAlfa = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnHadir = new javax.swing.JButton();
        btnGaHadir = new javax.swing.JButton();
        btnIzin = new javax.swing.JButton();
        btnSakit = new javax.swing.JButton();
        jScrollPane38 = new javax.swing.JScrollPane();
        tbl_rank = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coolabsensystem/smkn4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel2.setText("SMK NEGERI 4 BANDUNG");

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel1.setText("DATA ABSEN");

        lblTanggal.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lblTanggal.setText("09 Sep 2015");

        btnReset.setText("Reset Data Absen");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHelp.setText("Help");
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
        });
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        cmbMinggu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minggu ke-1", "Minggu ke-2", "Minggu ke-3", "Minggu ke-4" }));

        tabContent.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabContentStateChanged(evt);
            }
        });

        julTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        julTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                julTabStateChanged(evt);
            }
        });

        tbl_RPL1.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL1MouseClicked(evt);
            }
        });
        tbl_RPL1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_RPL1);

        javax.swing.GroupLayout tabRPL1Layout = new javax.swing.GroupLayout(tabRPL1);
        tabRPL1.setLayout(tabRPL1Layout);
        tabRPL1Layout.setHorizontalGroup(
            tabRPL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL1Layout.setVerticalGroup(
            tabRPL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        julTab.addTab("XII RPL1", tabRPL1);

        tbl_TKJ1.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ1MouseClicked(evt);
            }
        });
        tbl_TKJ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_TKJ1);

        javax.swing.GroupLayout tabTKJ1Layout = new javax.swing.GroupLayout(tabTKJ1);
        tabTKJ1.setLayout(tabTKJ1Layout);
        tabTKJ1Layout.setHorizontalGroup(
            tabTKJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ1Layout.setVerticalGroup(
            tabTKJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        julTab.addTab("XII TKJ", tabTKJ1);

        tbl_MM1.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM1MouseClicked(evt);
            }
        });
        tbl_MM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_MM1);

        javax.swing.GroupLayout tabMM1Layout = new javax.swing.GroupLayout(tabMM1);
        tabMM1.setLayout(tabMM1Layout);
        tabMM1Layout.setHorizontalGroup(
            tabMM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM1Layout.setVerticalGroup(
            tabMM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        julTab.addTab("XII MM", tabMM1);

        javax.swing.GroupLayout tabJulLayout = new javax.swing.GroupLayout(tabJul);
        tabJul.setLayout(tabJulLayout);
        tabJulLayout.setHorizontalGroup(
            tabJulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(julTab)
        );
        tabJulLayout.setVerticalGroup(
            tabJulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(julTab)
        );

        tabContent.addTab("Juli", tabJul);

        aguTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        aguTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aguTabStateChanged(evt);
            }
        });

        tbl_RPL2.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL2MouseClicked(evt);
            }
        });
        tbl_RPL2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL2KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_RPL2);

        javax.swing.GroupLayout tabRPL2Layout = new javax.swing.GroupLayout(tabRPL2);
        tabRPL2.setLayout(tabRPL2Layout);
        tabRPL2Layout.setHorizontalGroup(
            tabRPL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL2Layout.setVerticalGroup(
            tabRPL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aguTab.addTab("XII RPL1", tabRPL2);

        tbl_TKJ2.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ2MouseClicked(evt);
            }
        });
        tbl_TKJ2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ2KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_TKJ2);

        javax.swing.GroupLayout tabTKJ2Layout = new javax.swing.GroupLayout(tabTKJ2);
        tabTKJ2.setLayout(tabTKJ2Layout);
        tabTKJ2Layout.setHorizontalGroup(
            tabTKJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ2Layout.setVerticalGroup(
            tabTKJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aguTab.addTab("XII TKJ", tabTKJ2);

        tbl_MM2.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM2MouseClicked(evt);
            }
        });
        tbl_MM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM2KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_MM2);

        javax.swing.GroupLayout tabMM2Layout = new javax.swing.GroupLayout(tabMM2);
        tabMM2.setLayout(tabMM2Layout);
        tabMM2Layout.setHorizontalGroup(
            tabMM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM2Layout.setVerticalGroup(
            tabMM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aguTab.addTab("XII MM", tabMM2);

        javax.swing.GroupLayout tabAguLayout = new javax.swing.GroupLayout(tabAgu);
        tabAgu.setLayout(tabAguLayout);
        tabAguLayout.setHorizontalGroup(
            tabAguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aguTab)
        );
        tabAguLayout.setVerticalGroup(
            tabAguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aguTab)
        );

        tabContent.addTab("Agustus", tabAgu);

        sepTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        sepTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sepTabStateChanged(evt);
            }
        });

        tbl_RPL3.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL3MouseClicked(evt);
            }
        });
        tbl_RPL3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL3KeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_RPL3);

        javax.swing.GroupLayout tabRPL3Layout = new javax.swing.GroupLayout(tabRPL3);
        tabRPL3.setLayout(tabRPL3Layout);
        tabRPL3Layout.setHorizontalGroup(
            tabRPL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL3Layout.setVerticalGroup(
            tabRPL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        sepTab.addTab("XII RPL1", tabRPL3);

        tbl_TKJ3.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ3MouseClicked(evt);
            }
        });
        tbl_TKJ3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ3KeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_TKJ3);

        javax.swing.GroupLayout tabTKJ3Layout = new javax.swing.GroupLayout(tabTKJ3);
        tabTKJ3.setLayout(tabTKJ3Layout);
        tabTKJ3Layout.setHorizontalGroup(
            tabTKJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ3Layout.setVerticalGroup(
            tabTKJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        sepTab.addTab("XII TKJ", tabTKJ3);

        tbl_MM3.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM3MouseClicked(evt);
            }
        });
        tbl_MM3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM3KeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_MM3);

        javax.swing.GroupLayout tabMM3Layout = new javax.swing.GroupLayout(tabMM3);
        tabMM3.setLayout(tabMM3Layout);
        tabMM3Layout.setHorizontalGroup(
            tabMM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM3Layout.setVerticalGroup(
            tabMM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        sepTab.addTab("XII MM", tabMM3);

        javax.swing.GroupLayout tabSepLayout = new javax.swing.GroupLayout(tabSep);
        tabSep.setLayout(tabSepLayout);
        tabSepLayout.setHorizontalGroup(
            tabSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sepTab)
        );
        tabSepLayout.setVerticalGroup(
            tabSepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sepTab)
        );

        tabContent.addTab("September", tabSep);

        oktTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        oktTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oktTabStateChanged(evt);
            }
        });

        tbl_RPL4.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL4MouseClicked(evt);
            }
        });
        tbl_RPL4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL4KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(tbl_RPL4);

        javax.swing.GroupLayout tabRPL4Layout = new javax.swing.GroupLayout(tabRPL4);
        tabRPL4.setLayout(tabRPL4Layout);
        tabRPL4Layout.setHorizontalGroup(
            tabRPL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL4Layout.setVerticalGroup(
            tabRPL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        oktTab.addTab("XII RPL1", tabRPL4);

        tbl_TKJ4.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ4MouseClicked(evt);
            }
        });
        tbl_TKJ4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ4KeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(tbl_TKJ4);

        javax.swing.GroupLayout tabTKJ4Layout = new javax.swing.GroupLayout(tabTKJ4);
        tabTKJ4.setLayout(tabTKJ4Layout);
        tabTKJ4Layout.setHorizontalGroup(
            tabTKJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ4Layout.setVerticalGroup(
            tabTKJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        oktTab.addTab("XII TKJ", tabTKJ4);

        tbl_MM4.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM4MouseClicked(evt);
            }
        });
        tbl_MM4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM4KeyPressed(evt);
            }
        });
        jScrollPane13.setViewportView(tbl_MM4);

        javax.swing.GroupLayout tabMM4Layout = new javax.swing.GroupLayout(tabMM4);
        tabMM4.setLayout(tabMM4Layout);
        tabMM4Layout.setHorizontalGroup(
            tabMM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM4Layout.setVerticalGroup(
            tabMM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        oktTab.addTab("XII MM", tabMM4);

        javax.swing.GroupLayout tabOktLayout = new javax.swing.GroupLayout(tabOkt);
        tabOkt.setLayout(tabOktLayout);
        tabOktLayout.setHorizontalGroup(
            tabOktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oktTab)
        );
        tabOktLayout.setVerticalGroup(
            tabOktLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oktTab)
        );

        tabContent.addTab("Oktober", tabOkt);

        novTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        novTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                novTabStateChanged(evt);
            }
        });

        tbl_RPL5.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL5MouseClicked(evt);
            }
        });
        tbl_RPL5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL5KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(tbl_RPL5);

        javax.swing.GroupLayout tabRPL5Layout = new javax.swing.GroupLayout(tabRPL5);
        tabRPL5.setLayout(tabRPL5Layout);
        tabRPL5Layout.setHorizontalGroup(
            tabRPL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL5Layout.setVerticalGroup(
            tabRPL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        novTab.addTab("XII RPL1", tabRPL5);

        tbl_TKJ5.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ5MouseClicked(evt);
            }
        });
        tbl_TKJ5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ5KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(tbl_TKJ5);

        javax.swing.GroupLayout tabTKJ5Layout = new javax.swing.GroupLayout(tabTKJ5);
        tabTKJ5.setLayout(tabTKJ5Layout);
        tabTKJ5Layout.setHorizontalGroup(
            tabTKJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ5Layout.setVerticalGroup(
            tabTKJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        novTab.addTab("XII TKJ", tabTKJ5);

        tbl_MM5.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM5MouseClicked(evt);
            }
        });
        tbl_MM5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM5KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(tbl_MM5);

        javax.swing.GroupLayout tabMM5Layout = new javax.swing.GroupLayout(tabMM5);
        tabMM5.setLayout(tabMM5Layout);
        tabMM5Layout.setHorizontalGroup(
            tabMM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM5Layout.setVerticalGroup(
            tabMM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        novTab.addTab("XII MM", tabMM5);

        javax.swing.GroupLayout tabNovLayout = new javax.swing.GroupLayout(tabNov);
        tabNov.setLayout(tabNovLayout);
        tabNovLayout.setHorizontalGroup(
            tabNovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novTab)
        );
        tabNovLayout.setVerticalGroup(
            tabNovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novTab)
        );

        tabContent.addTab("November", tabNov);

        desTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        desTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                desTabStateChanged(evt);
            }
        });

        tbl_RPL6.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL6MouseClicked(evt);
            }
        });
        tbl_RPL6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL6KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tbl_RPL6);

        javax.swing.GroupLayout tabRPL6Layout = new javax.swing.GroupLayout(tabRPL6);
        tabRPL6.setLayout(tabRPL6Layout);
        tabRPL6Layout.setHorizontalGroup(
            tabRPL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL6Layout.setVerticalGroup(
            tabRPL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        desTab.addTab("XII RPL1", tabRPL6);

        tbl_TKJ6.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ6MouseClicked(evt);
            }
        });
        tbl_TKJ6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ6KeyPressed(evt);
            }
        });
        jScrollPane18.setViewportView(tbl_TKJ6);

        javax.swing.GroupLayout tabTKJ6Layout = new javax.swing.GroupLayout(tabTKJ6);
        tabTKJ6.setLayout(tabTKJ6Layout);
        tabTKJ6Layout.setHorizontalGroup(
            tabTKJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ6Layout.setVerticalGroup(
            tabTKJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        desTab.addTab("XII TKJ", tabTKJ6);

        tbl_MM6.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM6MouseClicked(evt);
            }
        });
        tbl_MM6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM6KeyPressed(evt);
            }
        });
        jScrollPane19.setViewportView(tbl_MM6);

        javax.swing.GroupLayout tabMM6Layout = new javax.swing.GroupLayout(tabMM6);
        tabMM6.setLayout(tabMM6Layout);
        tabMM6Layout.setHorizontalGroup(
            tabMM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM6Layout.setVerticalGroup(
            tabMM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        desTab.addTab("XII MM", tabMM6);

        javax.swing.GroupLayout tabDesLayout = new javax.swing.GroupLayout(tabDes);
        tabDes.setLayout(tabDesLayout);
        tabDesLayout.setHorizontalGroup(
            tabDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desTab)
        );
        tabDesLayout.setVerticalGroup(
            tabDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desTab)
        );

        tabContent.addTab("Desember", tabDes);

        janTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        janTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                janTabStateChanged(evt);
            }
        });

        tbl_RPL7.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL7MouseClicked(evt);
            }
        });
        tbl_RPL7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL7KeyPressed(evt);
            }
        });
        jScrollPane20.setViewportView(tbl_RPL7);

        javax.swing.GroupLayout tabRPL7Layout = new javax.swing.GroupLayout(tabRPL7);
        tabRPL7.setLayout(tabRPL7Layout);
        tabRPL7Layout.setHorizontalGroup(
            tabRPL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL7Layout.setVerticalGroup(
            tabRPL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        janTab.addTab("XII RPL1", tabRPL7);

        tbl_TKJ7.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ7MouseClicked(evt);
            }
        });
        tbl_TKJ7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ7KeyPressed(evt);
            }
        });
        jScrollPane21.setViewportView(tbl_TKJ7);

        javax.swing.GroupLayout tabTKJ7Layout = new javax.swing.GroupLayout(tabTKJ7);
        tabTKJ7.setLayout(tabTKJ7Layout);
        tabTKJ7Layout.setHorizontalGroup(
            tabTKJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ7Layout.setVerticalGroup(
            tabTKJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        janTab.addTab("XII TKJ", tabTKJ7);

        tbl_MM7.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM7MouseClicked(evt);
            }
        });
        tbl_MM7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM7KeyPressed(evt);
            }
        });
        jScrollPane22.setViewportView(tbl_MM7);

        javax.swing.GroupLayout tabMM7Layout = new javax.swing.GroupLayout(tabMM7);
        tabMM7.setLayout(tabMM7Layout);
        tabMM7Layout.setHorizontalGroup(
            tabMM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM7Layout.setVerticalGroup(
            tabMM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        janTab.addTab("XII MM", tabMM7);

        javax.swing.GroupLayout tabJanLayout = new javax.swing.GroupLayout(tabJan);
        tabJan.setLayout(tabJanLayout);
        tabJanLayout.setHorizontalGroup(
            tabJanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janTab)
        );
        tabJanLayout.setVerticalGroup(
            tabJanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janTab)
        );

        tabContent.addTab("Januari", tabJan);

        febTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        febTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                febTabStateChanged(evt);
            }
        });

        tbl_RPL8.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL8MouseClicked(evt);
            }
        });
        tbl_RPL8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL8KeyPressed(evt);
            }
        });
        jScrollPane23.setViewportView(tbl_RPL8);

        javax.swing.GroupLayout tabRPL8Layout = new javax.swing.GroupLayout(tabRPL8);
        tabRPL8.setLayout(tabRPL8Layout);
        tabRPL8Layout.setHorizontalGroup(
            tabRPL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL8Layout.setVerticalGroup(
            tabRPL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        febTab.addTab("XII RPL1", tabRPL8);

        tbl_TKJ8.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ8MouseClicked(evt);
            }
        });
        tbl_TKJ8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ8KeyPressed(evt);
            }
        });
        jScrollPane24.setViewportView(tbl_TKJ8);

        javax.swing.GroupLayout tabTKJ8Layout = new javax.swing.GroupLayout(tabTKJ8);
        tabTKJ8.setLayout(tabTKJ8Layout);
        tabTKJ8Layout.setHorizontalGroup(
            tabTKJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ8Layout.setVerticalGroup(
            tabTKJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        febTab.addTab("XII TKJ", tabTKJ8);

        tbl_MM8.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM8MouseClicked(evt);
            }
        });
        tbl_MM8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM8KeyPressed(evt);
            }
        });
        jScrollPane25.setViewportView(tbl_MM8);

        javax.swing.GroupLayout tabMM8Layout = new javax.swing.GroupLayout(tabMM8);
        tabMM8.setLayout(tabMM8Layout);
        tabMM8Layout.setHorizontalGroup(
            tabMM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM8Layout.setVerticalGroup(
            tabMM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        febTab.addTab("XII MM", tabMM8);

        javax.swing.GroupLayout tabFebLayout = new javax.swing.GroupLayout(tabFeb);
        tabFeb.setLayout(tabFebLayout);
        tabFebLayout.setHorizontalGroup(
            tabFebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(febTab)
        );
        tabFebLayout.setVerticalGroup(
            tabFebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(febTab)
        );

        tabContent.addTab("Februari", tabFeb);

        marTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        marTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                marTabStateChanged(evt);
            }
        });

        tbl_RPL9.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL9MouseClicked(evt);
            }
        });
        tbl_RPL9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL9KeyPressed(evt);
            }
        });
        jScrollPane26.setViewportView(tbl_RPL9);

        javax.swing.GroupLayout tabRPL9Layout = new javax.swing.GroupLayout(tabRPL9);
        tabRPL9.setLayout(tabRPL9Layout);
        tabRPL9Layout.setHorizontalGroup(
            tabRPL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL9Layout.setVerticalGroup(
            tabRPL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        marTab.addTab("XII RPL1", tabRPL9);

        tbl_TKJ9.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ9MouseClicked(evt);
            }
        });
        tbl_TKJ9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ9KeyPressed(evt);
            }
        });
        jScrollPane27.setViewportView(tbl_TKJ9);

        javax.swing.GroupLayout tabTKJ9Layout = new javax.swing.GroupLayout(tabTKJ9);
        tabTKJ9.setLayout(tabTKJ9Layout);
        tabTKJ9Layout.setHorizontalGroup(
            tabTKJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ9Layout.setVerticalGroup(
            tabTKJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        marTab.addTab("XII TKJ", tabTKJ9);

        tbl_MM9.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM9MouseClicked(evt);
            }
        });
        tbl_MM9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM9KeyPressed(evt);
            }
        });
        jScrollPane28.setViewportView(tbl_MM9);

        javax.swing.GroupLayout tabMM9Layout = new javax.swing.GroupLayout(tabMM9);
        tabMM9.setLayout(tabMM9Layout);
        tabMM9Layout.setHorizontalGroup(
            tabMM9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM9Layout.setVerticalGroup(
            tabMM9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        marTab.addTab("XII MM", tabMM9);

        javax.swing.GroupLayout tabMarLayout = new javax.swing.GroupLayout(tabMar);
        tabMar.setLayout(tabMarLayout);
        tabMarLayout.setHorizontalGroup(
            tabMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marTab)
        );
        tabMarLayout.setVerticalGroup(
            tabMarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(marTab)
        );

        tabContent.addTab("Maret", tabMar);

        aprTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        aprTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aprTabStateChanged(evt);
            }
        });

        tbl_RPL10.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL10MouseClicked(evt);
            }
        });
        tbl_RPL10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL10KeyPressed(evt);
            }
        });
        jScrollPane29.setViewportView(tbl_RPL10);

        javax.swing.GroupLayout tabRPL10Layout = new javax.swing.GroupLayout(tabRPL10);
        tabRPL10.setLayout(tabRPL10Layout);
        tabRPL10Layout.setHorizontalGroup(
            tabRPL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL10Layout.setVerticalGroup(
            tabRPL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aprTab.addTab("XII RPL1", tabRPL10);

        tbl_TKJ10.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ10MouseClicked(evt);
            }
        });
        tbl_TKJ10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ10KeyPressed(evt);
            }
        });
        jScrollPane30.setViewportView(tbl_TKJ10);

        javax.swing.GroupLayout tabTKJ10Layout = new javax.swing.GroupLayout(tabTKJ10);
        tabTKJ10.setLayout(tabTKJ10Layout);
        tabTKJ10Layout.setHorizontalGroup(
            tabTKJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ10Layout.setVerticalGroup(
            tabTKJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aprTab.addTab("XII TKJ", tabTKJ10);

        tbl_MM10.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM10MouseClicked(evt);
            }
        });
        tbl_MM10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM10KeyPressed(evt);
            }
        });
        jScrollPane31.setViewportView(tbl_MM10);

        javax.swing.GroupLayout tabMM10Layout = new javax.swing.GroupLayout(tabMM10);
        tabMM10.setLayout(tabMM10Layout);
        tabMM10Layout.setHorizontalGroup(
            tabMM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM10Layout.setVerticalGroup(
            tabMM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        aprTab.addTab("XII MM", tabMM10);

        javax.swing.GroupLayout tabAprLayout = new javax.swing.GroupLayout(tabApr);
        tabApr.setLayout(tabAprLayout);
        tabAprLayout.setHorizontalGroup(
            tabAprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aprTab)
        );
        tabAprLayout.setVerticalGroup(
            tabAprLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aprTab)
        );

        tabContent.addTab("April", tabApr);

        meiTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        meiTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meiTabStateChanged(evt);
            }
        });

        tbl_RPL11.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL11MouseClicked(evt);
            }
        });
        tbl_RPL11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL11KeyPressed(evt);
            }
        });
        jScrollPane32.setViewportView(tbl_RPL11);

        javax.swing.GroupLayout tabRPL11Layout = new javax.swing.GroupLayout(tabRPL11);
        tabRPL11.setLayout(tabRPL11Layout);
        tabRPL11Layout.setHorizontalGroup(
            tabRPL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL11Layout.setVerticalGroup(
            tabRPL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        meiTab.addTab("XII RPL1", tabRPL11);

        tbl_TKJ11.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ11MouseClicked(evt);
            }
        });
        tbl_TKJ11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ11KeyPressed(evt);
            }
        });
        jScrollPane33.setViewportView(tbl_TKJ11);

        javax.swing.GroupLayout tabTKJ11Layout = new javax.swing.GroupLayout(tabTKJ11);
        tabTKJ11.setLayout(tabTKJ11Layout);
        tabTKJ11Layout.setHorizontalGroup(
            tabTKJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ11Layout.setVerticalGroup(
            tabTKJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        meiTab.addTab("XII TKJ", tabTKJ11);

        tbl_MM11.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM11MouseClicked(evt);
            }
        });
        tbl_MM11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM11KeyPressed(evt);
            }
        });
        jScrollPane34.setViewportView(tbl_MM11);

        javax.swing.GroupLayout tabMM11Layout = new javax.swing.GroupLayout(tabMM11);
        tabMM11.setLayout(tabMM11Layout);
        tabMM11Layout.setHorizontalGroup(
            tabMM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM11Layout.setVerticalGroup(
            tabMM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        meiTab.addTab("XII MM", tabMM11);

        javax.swing.GroupLayout tabMeiLayout = new javax.swing.GroupLayout(tabMei);
        tabMei.setLayout(tabMeiLayout);
        tabMeiLayout.setHorizontalGroup(
            tabMeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meiTab)
        );
        tabMeiLayout.setVerticalGroup(
            tabMeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meiTab)
        );

        tabContent.addTab("Mei", tabMei);

        junTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        junTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                junTabStateChanged(evt);
            }
        });

        tbl_RPL12.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RPL12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RPL12MouseClicked(evt);
            }
        });
        tbl_RPL12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_RPL12KeyPressed(evt);
            }
        });
        jScrollPane35.setViewportView(tbl_RPL12);

        javax.swing.GroupLayout tabRPL12Layout = new javax.swing.GroupLayout(tabRPL12);
        tabRPL12.setLayout(tabRPL12Layout);
        tabRPL12Layout.setHorizontalGroup(
            tabRPL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabRPL12Layout.setVerticalGroup(
            tabRPL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        junTab.addTab("XII RPL1", tabRPL12);

        tbl_TKJ12.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_TKJ12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TKJ12MouseClicked(evt);
            }
        });
        tbl_TKJ12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_TKJ12KeyPressed(evt);
            }
        });
        jScrollPane36.setViewportView(tbl_TKJ12);

        javax.swing.GroupLayout tabTKJ12Layout = new javax.swing.GroupLayout(tabTKJ12);
        tabTKJ12.setLayout(tabTKJ12Layout);
        tabTKJ12Layout.setHorizontalGroup(
            tabTKJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabTKJ12Layout.setVerticalGroup(
            tabTKJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        junTab.addTab("XII TKJ", tabTKJ12);

        tbl_MM12.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_MM12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MM12MouseClicked(evt);
            }
        });
        tbl_MM12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_MM12KeyPressed(evt);
            }
        });
        jScrollPane37.setViewportView(tbl_MM12);

        javax.swing.GroupLayout tabMM12Layout = new javax.swing.GroupLayout(tabMM12);
        tabMM12.setLayout(tabMM12Layout);
        tabMM12Layout.setHorizontalGroup(
            tabMM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tabMM12Layout.setVerticalGroup(
            tabMM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        junTab.addTab("XII MM", tabMM12);

        javax.swing.GroupLayout tabJunLayout = new javax.swing.GroupLayout(tabJun);
        tabJun.setLayout(tabJunLayout);
        tabJunLayout.setHorizontalGroup(
            tabJunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(junTab)
        );
        tabJunLayout.setVerticalGroup(
            tabJunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(junTab)
        );

        tabContent.addTab("Juni", tabJun);

        jLabel5.setText("Total Hadir");

        lblHadir.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblHadir.setText("0");

        jLabel4.setText("Total Izin");

        lblIzin.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblIzin.setText("0");

        jLabel6.setText("Total Sakit");

        lblSakit.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblSakit.setText("0");

        jLabel3.setText("Total Alfa");

        lblAlfa.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblAlfa.setText("0");

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jLabel9.setText("Perhitungan Kehadiran dalam Setahun");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHadir, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIzin, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSakit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tabContent, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lblAlfa)
                    .addComponent(lblSakit)
                    .addComponent(lblIzin)
                    .addComponent(lblHadir))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Mata Pelajaran Pemrograman Berbasis Objek");

        javax.swing.GroupLayout absenPanelLayout = new javax.swing.GroupLayout(absenPanel);
        absenPanel.setLayout(absenPanelLayout);
        absenPanelLayout.setHorizontalGroup(
            absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absenPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(absenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(absenPanelLayout.createSequentialGroup()
                        .addGroup(absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(absenPanelLayout.createSequentialGroup()
                                .addComponent(cmbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTanggal)))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        absenPanelLayout.setVerticalGroup(
            absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absenPanelLayout.createSequentialGroup()
                .addGroup(absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(absenPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(absenPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblTanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(absenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset)
                            .addComponent(btnHelp))))
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jLabel8.setText("Jumlah Kehadiran [per Kelas]");

        btnHadir.setText("Hadir [h]");
        btnHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadirActionPerformed(evt);
            }
        });

        btnGaHadir.setText("Alfa [a]");
        btnGaHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaHadirActionPerformed(evt);
            }
        });

        btnIzin.setText("Izin [i]");
        btnIzin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzinActionPerformed(evt);
            }
        });

        btnSakit.setText("Sakit [s]");
        btnSakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSakitActionPerformed(evt);
            }
        });

        tbl_rank.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane38.setViewportView(tbl_rank);

        btnDel.setText("Del [d]");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGaHadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIzin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(absenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnHadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGaHadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIzin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSakit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(absenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setBulan(){
        DateFormat dateFormat=new SimpleDateFormat("EEEE, dd MMM yyyy");
        Calendar b= Calendar.getInstance();
        lblTanggal.setText(dateFormat.format(b.getTime()));
        int bln = b.get(MONTH);
        if(bln==0){
            bln=6;
        }else if(bln==1){
            bln=7;
        }else if(bln==2){
            bln=8;
        }else if(bln==3){
            bln=9;
        }else if(bln==4){
            bln=10;
        }else if(bln==5){
            bln=11;
        }else if(bln==6){
            bln=0;
        }else if(bln==7){
            bln=1;
        }else if(bln==8){
            bln=2;
        }else if(bln==9){
            bln=3;
        }else if(bln==10){
            bln=4;
        }else if(bln==11){
            bln=5;
        }
        tabContent.setSelectedIndex(bln);
    }
    
    public void setRank(){
        String kolom[] = {"No","Kelas","Hadir"};
        String kls[]={"","XII RPL1", "XII TKJ", "XII MM"};
        
        int hadir=0;
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = koneksi.createStatement();
            for (int j=1;j<=3;j++){
                hadir=0;
                for (int i=1;i<=4;i++){
                    String query = "SELECT COUNT(a.m"+i+") AS m1 FROM t_absen a, t_murid m WHERE a.`nis`=m.`nis` AND a.m"+i+"='h' AND m.`kelas`='"+kls[j]+"'";
                    ResultSet rs = stmt.executeQuery(query);
                    rs.first();
                    int m1 = rs.getInt("m1");
                    hadir+=m1;
                }

                dtm.addRow(new String[]{j+"", kls[j], String.valueOf(hadir)});
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbl_rank.setModel(dtm);
        /*TableRowSorter<TableModel> sorter = new TableRowSorter<>(tbl_rank.getModel());
        List<RowSorter.SortKey> sortKey = new ArrayList<>();
        
        int columnIndexForClass = 1;
        sortKey.add(new RowSorter.SortKey(columnIndexForClass, SortOrder.ASCENDING));
        
        int columnIndexForHadir = 2;
        sortKey.add(new RowSorter.SortKey(columnIndexForHadir, SortOrder.ASCENDING));
        
        sorter.setSortKeys(sortKey);
        sorter.sort();
        sorter.setSortable(0, false);
        
        tbl_rank.setRowSorter(sorter);*/
    }
    
    public void btnAbsenEnable(int a){
        if(a != -1){
            btnHadir.setEnabled(true);
            btnGaHadir.setEnabled(true);
            btnIzin.setEnabled(true);
            btnSakit.setEnabled(true);
        } else {
            btnHadir.setEnabled(false);
            btnGaHadir.setEnabled(false);
            btnIzin.setEnabled(false);
            btnSakit.setEnabled(false);
        }
    }
    
    public void showDataRPL(){
        Statement stmt;
        ResultSet rs;
        String query;
        int bulan;
        
        for(int i=1;i<=12;i++){
            bulan = i+6;
            if(bulan>12)bulan-=12;
            
            String kolom[] = {"No","NIS","Nama Siswa", "M-1", "M-2", "M-3", "M-4"};
            dtm = new DefaultTableModel(null, kolom);
            try {
                stmt = koneksi.createStatement();
                query = "SELECT m.nis, m.nm_siswa, a.m1, a.m2, a.m3, a.m4 FROM t_murid m, t_absen a WHERE m.nis = a.nis AND a.bulan = '"+bulan+"' AND m.kelas='XII RPL1'";
                rs = stmt.executeQuery(query);
                int no = 1;
                while (rs.next()) {
                    String nis = rs.getString("m.nis");
                    String nama = rs.getString("m.nm_siswa");
                    String m1 = rs.getString("a.m1");
                    String m2 = rs.getString("a.m2");
                    String m3 = rs.getString("a.m3");
                    String m4 = rs.getString("a.m4");

                    dtm.addRow(new String[]{no+"",nis, nama, m1, m2, m3, m4});
                    no++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            if(i==1){
                tbl_RPL1.setModel(dtm);
            }else if(i==2){
                tbl_RPL2.setModel(dtm);
            }else if(i==3){
                tbl_RPL3.setModel(dtm);
            }else if(i==4){
                tbl_RPL4.setModel(dtm);
            }else if(i==5){
                tbl_RPL5.setModel(dtm);
            }else if(i==6){
                tbl_RPL6.setModel(dtm);
            }else if(i==7){
                tbl_RPL7.setModel(dtm);
            }else if(i==8){
                tbl_RPL8.setModel(dtm);
            }else if(i==9){
                tbl_RPL9.setModel(dtm);
            }else if(i==10){
                tbl_RPL10.setModel(dtm);
            }else if(i==11){
                tbl_RPL11.setModel(dtm);
            }else if(i==12){
                tbl_RPL12.setModel(dtm);
            }
            
        }
    }
     
    public void showDataTKJ(){
        Statement stmt;
        ResultSet rs;
        String query;
        int bulan;
        
        for(int i=1;i<=12;i++){
            bulan = i+6;
            if(bulan>12)bulan-=12;
            
            String kolom[] = {"No","NIS","Nama Siswa", "M-1", "M-2", "M-3", "M-4"};
            dtm = new DefaultTableModel(null, kolom);
            try {
                stmt = koneksi.createStatement();
                query = "SELECT m.nis, m.nm_siswa, a.m1, a.m2, a.m3, a.m4 FROM t_murid m, t_absen a WHERE m.nis = a.nis AND a.bulan = '"+bulan+"' AND m.kelas='XII TKJ'";
                rs = stmt.executeQuery(query);
                int no = 1;
                while (rs.next()) {
                    String nis = rs.getString("m.nis");
                    String nama = rs.getString("m.nm_siswa");
                    String m1 = rs.getString("a.m1");
                    String m2 = rs.getString("a.m2");
                    String m3 = rs.getString("a.m3");
                    String m4 = rs.getString("a.m4");

                    dtm.addRow(new String[]{no+"",nis, nama, m1, m2, m3, m4});
                    no++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            if(i==1){
                tbl_TKJ1.setModel(dtm);
            }else if(i==2){
                tbl_TKJ2.setModel(dtm);
            }else if(i==3){
                tbl_TKJ3.setModel(dtm);
            }else if(i==4){
                tbl_TKJ4.setModel(dtm);
            }else if(i==5){
                tbl_TKJ5.setModel(dtm);
            }else if(i==6){
                tbl_TKJ6.setModel(dtm);
            }else if(i==7){
                tbl_TKJ7.setModel(dtm);
            }else if(i==8){
                tbl_TKJ8.setModel(dtm);
            }else if(i==9){
                tbl_TKJ9.setModel(dtm);
            }else if(i==10){
                tbl_TKJ10.setModel(dtm);
            }else if(i==11){
                tbl_TKJ11.setModel(dtm);
            }else if(i==12){
                tbl_TKJ12.setModel(dtm);
            }
            
        }
    }
    
    public void showDataMM(){
        Statement stmt;
        ResultSet rs;
        String query;
        int bulan;
        
        for(int i=1;i<=12;i++){
            bulan = i+6;
            if(bulan>12)bulan-=12;
            
            String kolom[] = {"No","NIS","Nama Siswa", "M-1", "M-2", "M-3", "M-4"};
            dtm = new DefaultTableModel(null, kolom);
            try {
                stmt = koneksi.createStatement();
                query = "SELECT m.nis, m.nm_siswa, a.m1, a.m2, a.m3, a.m4 FROM t_murid m, t_absen a WHERE m.nis = a.nis AND a.bulan = '"+bulan+"' AND m.kelas='XII MM'";
                rs = stmt.executeQuery(query);
                int no = 1;
                while (rs.next()) {
                    String nis = rs.getString("m.nis");
                    String nama = rs.getString("m.nm_siswa");
                    String m1 = rs.getString("a.m1");
                    String m2 = rs.getString("a.m2");
                    String m3 = rs.getString("a.m3");
                    String m4 = rs.getString("a.m4");

                    dtm.addRow(new String[]{no+"",nis, nama, m1, m2, m3, m4});
                    no++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            if(i==1){
                tbl_MM1.setModel(dtm);
            }else if(i==2){
                tbl_MM2.setModel(dtm);
            }else if(i==3){
                tbl_MM3.setModel(dtm);
            }else if(i==4){
                tbl_MM4.setModel(dtm);
            }else if(i==5){
                tbl_MM5.setModel(dtm);
            }else if(i==6){
                tbl_MM6.setModel(dtm);
            }else if(i==7){
                tbl_MM7.setModel(dtm);
            }else if(i==8){
                tbl_MM8.setModel(dtm);
            }else if(i==9){
                tbl_MM9.setModel(dtm);
            }else if(i==10){
                tbl_MM10.setModel(dtm);
            }else if(i==11){
                tbl_MM11.setModel(dtm);
            }else if(i==12){
                tbl_MM12.setModel(dtm);
            }
            
        }
    }
    
    private void julTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_julTabStateChanged
        baris=-1;
        selKelas = julTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_julTabStateChanged

    private void aguTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aguTabStateChanged
        baris=-1;
        selKelas = aguTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_aguTabStateChanged

    private void sepTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sepTabStateChanged
        baris=-1;
        selKelas = sepTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_sepTabStateChanged

    private void oktTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oktTabStateChanged
        baris=-1;
        selKelas = oktTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_oktTabStateChanged

    private void novTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_novTabStateChanged
        baris=-1;
        selKelas = novTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_novTabStateChanged

    private void desTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_desTabStateChanged
        baris=-1;
        selKelas = desTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_desTabStateChanged

    private void janTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_janTabStateChanged
        baris=-1;
        selKelas = janTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_janTabStateChanged

    private void febTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_febTabStateChanged
        baris=-1;
        selKelas = febTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_febTabStateChanged

    private void marTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_marTabStateChanged
        baris=-1;
        selKelas = marTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_marTabStateChanged

    private void aprTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aprTabStateChanged
        baris=-1;
        selKelas = aprTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_aprTabStateChanged

    private void meiTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meiTabStateChanged
        baris=-1;
        selKelas = meiTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_meiTabStateChanged

    private void junTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_junTabStateChanged
        baris=-1;
        selKelas = junTab.getSelectedIndex();
        btnAbsenEnable(baris);
    }//GEN-LAST:event_junTabStateChanged

    private void tabContentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabContentStateChanged
        selBulan = tabContent.getSelectedIndex();
        baris = -1;
        btnAbsenEnable(baris);
    }//GEN-LAST:event_tabContentStateChanged

    private void tbl_RPL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL1MouseClicked
        baris = tbl_RPL1.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL1.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL1MouseClicked

    private void tbl_TKJ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ1MouseClicked
        baris = tbl_TKJ1.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ1.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ1MouseClicked

    private void tbl_MM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM1MouseClicked
        baris = tbl_MM1.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM1.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM1MouseClicked

    private void tbl_RPL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL2MouseClicked
        baris = tbl_RPL2.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL2.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL2MouseClicked

    private void tbl_TKJ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ2MouseClicked
        baris = tbl_TKJ2.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ2.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ2MouseClicked

    private void tbl_MM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM2MouseClicked
        baris = tbl_MM2.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM2.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM2MouseClicked

    private void tbl_RPL3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL3MouseClicked
        baris = tbl_RPL3.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL3.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL3MouseClicked

    private void tbl_TKJ3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ3MouseClicked
        baris = tbl_TKJ3.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ3.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ3MouseClicked

    private void tbl_MM3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM3MouseClicked
        baris = tbl_MM3.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM3.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM3MouseClicked

    private void tbl_RPL4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL4MouseClicked
        baris = tbl_RPL4.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL4.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL4MouseClicked

    private void tbl_TKJ4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ4MouseClicked
        baris = tbl_TKJ4.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ4.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ4MouseClicked

    private void tbl_MM4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM4MouseClicked
        baris = tbl_MM4.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM4.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM4MouseClicked

    private void tbl_RPL5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL5MouseClicked
        baris = tbl_RPL5.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL5.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL5MouseClicked

    private void tbl_TKJ5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ5MouseClicked
        baris = tbl_TKJ5.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ5.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ5MouseClicked

    private void tbl_MM5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM5MouseClicked
        baris = tbl_MM5.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM5.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM5MouseClicked

    private void tbl_RPL6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL6MouseClicked
        baris = tbl_RPL6.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL6.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL6MouseClicked

    private void tbl_TKJ6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ6MouseClicked
        baris = tbl_TKJ6.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ6.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ6MouseClicked

    private void tbl_MM6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM6MouseClicked
        baris = tbl_MM6.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM6.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM6MouseClicked

    private void tbl_RPL7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL7MouseClicked
        baris = tbl_RPL7.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL7.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL7MouseClicked

    private void tbl_TKJ7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ7MouseClicked
        baris = tbl_TKJ7.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ7.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ7MouseClicked

    private void tbl_MM7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM7MouseClicked
        baris = tbl_MM7.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM7.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM7MouseClicked

    private void tbl_RPL8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL8MouseClicked
        baris = tbl_RPL8.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL8.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL8MouseClicked

    private void tbl_TKJ8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ8MouseClicked
        baris = tbl_TKJ8.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ8.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ8MouseClicked

    private void tbl_MM8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM8MouseClicked
        baris = tbl_MM8.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM8.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM8MouseClicked

    private void tbl_RPL9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL9MouseClicked
        baris = tbl_RPL9.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL9.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL9MouseClicked

    private void tbl_TKJ9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ9MouseClicked
        baris = tbl_TKJ9.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ9.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ9MouseClicked

    private void tbl_MM9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM9MouseClicked
        baris = tbl_MM9.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM9.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM9MouseClicked

    private void tbl_RPL10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL10MouseClicked
        baris = tbl_RPL10.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL10.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL10MouseClicked

    private void tbl_TKJ10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ10MouseClicked
        baris = tbl_TKJ10.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ10.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ10MouseClicked

    private void tbl_MM10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM10MouseClicked
        baris = tbl_MM10.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM10.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM10MouseClicked

    private void tbl_RPL11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL11MouseClicked
        baris = tbl_RPL11.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL11.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL11MouseClicked

    private void tbl_TKJ11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ11MouseClicked
        baris = tbl_TKJ11.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ11.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ11MouseClicked

    private void tbl_MM11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM11MouseClicked
        baris = tbl_MM11.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM11.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM11MouseClicked

    private void tbl_RPL12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RPL12MouseClicked
        baris = tbl_RPL12.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_RPL12.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_RPL12MouseClicked

    private void tbl_TKJ12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TKJ12MouseClicked
        baris = tbl_TKJ12.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_TKJ12.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_TKJ12MouseClicked

    private void tbl_MM12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MM12MouseClicked
        baris = tbl_MM12.getSelectedRow();
        btnAbsenEnable(baris);
        
        String nis = tbl_MM12.getValueAt (baris, 1).toString();
        hitungData(nis);
    }//GEN-LAST:event_tbl_MM12MouseClicked

    private void btnHadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHadirActionPerformed
       setAbsen("hadir");
    }//GEN-LAST:event_btnHadirActionPerformed

    private void btnGaHadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaHadirActionPerformed
        setAbsen("alfa");
    }//GEN-LAST:event_btnGaHadirActionPerformed

    private void btnIzinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzinActionPerformed
        setAbsen("izin");
    }//GEN-LAST:event_btnIzinActionPerformed

    private void btnSakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSakitActionPerformed
        setAbsen("sakit");
    }//GEN-LAST:event_btnSakitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        JFrame frame = new JFrame();
        String message = "Apakah anda benar - benar ingin mereset data absen ini??? Jika iya, anda akan kehilangan semua data absen dari semua kelas.";

        int answer = JOptionPane.showConfirmDialog(frame, message);

        if (answer == JOptionPane.YES_OPTION) {
            try{
                Statement stmt = koneksi.createStatement();
                String query = "UPDATE t_absen SET m1='', m2='', m3='', m4=''";
                System.out.println(query);
                int berhasil = stmt.executeUpdate(query);
                System.out.println(berhasil);
                if(berhasil == 312){
                    JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal dihapus!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        showDataRPL();
        showDataTKJ();
        showDataMM();
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void tbl_RPL1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL1KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL1.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL1.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL1KeyPressed

    private void tbl_TKJ1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ1KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ1.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ1.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ1KeyPressed

    private void tbl_MM1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM1KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM1.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM1.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM1KeyPressed

    private void tbl_RPL2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL2KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL2.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL2.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL2KeyPressed

    private void tbl_TKJ2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ2KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ2.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ2.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ2KeyPressed

    private void tbl_MM2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM2KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM2.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM2.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM2KeyPressed

    private void tbl_RPL3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL3KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL3.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL3.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL3KeyPressed

    private void tbl_TKJ3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ3KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ3.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ3.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ3KeyPressed

    private void tbl_MM3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM3KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM3.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM3.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM3KeyPressed

    private void tbl_RPL4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL4KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL4.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL4.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL4KeyPressed

    private void tbl_TKJ4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ4KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ4.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ4.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ4KeyPressed

    private void tbl_MM4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM4KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM4.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM4.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM4KeyPressed

    private void tbl_RPL5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL5KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL5.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL5.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL5KeyPressed

    private void tbl_TKJ5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ5KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ5.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ5.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ5KeyPressed

    private void tbl_MM5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM5KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM5.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM5.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM5KeyPressed

    private void tbl_RPL6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL6KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL6.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL6.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL6KeyPressed

    private void tbl_TKJ6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ6KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ6.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ6.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ6KeyPressed

    private void tbl_MM6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM6KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM6.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM6.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM6KeyPressed

    private void tbl_RPL7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL7KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL7.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL7.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL7KeyPressed

    private void tbl_TKJ7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ7KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ7.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ7.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ7KeyPressed

    private void tbl_MM7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM7KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM7.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM7.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM7KeyPressed

    private void tbl_RPL8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL8KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL8.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL8.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL8KeyPressed

    private void tbl_TKJ8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ8KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ8.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ8.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ8KeyPressed

    private void tbl_MM8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM8KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM8.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM8.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM8KeyPressed

    private void tbl_RPL9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL9KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL9.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL9.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL9KeyPressed

    private void tbl_TKJ9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ9KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ9.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ9.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ9KeyPressed

    private void tbl_MM9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM9KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM9.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM9.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM9KeyPressed

    private void tbl_RPL10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL10KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL10.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL10.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL10KeyPressed

    private void tbl_TKJ10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ10KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ10.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ10.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ10KeyPressed

    private void tbl_MM10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM10KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM10.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM10.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM10KeyPressed

    private void tbl_RPL11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL11KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL11.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL11.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL11KeyPressed

    private void tbl_TKJ11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ11KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ11.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ11.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ11KeyPressed

    private void tbl_MM11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM11KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM11.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM11.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM11KeyPressed

    private void tbl_RPL12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_RPL12KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_RPL12.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_RPL12.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_RPL12KeyPressed

    private void tbl_TKJ12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_TKJ12KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_TKJ12.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_TKJ12.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_TKJ12KeyPressed

    private void tbl_MM12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_MM12KeyPressed
        int key = evt.getKeyCode();
        if(key == 72){
            setAbsen("hadir");
        }else if(key == 65){
            setAbsen("alfa");
        }else if(key == 73){
            setAbsen("izin");
        }else if(key == 83){
            setAbsen("sakit");
        }else if(key == 38 || key == 40){
            baris = tbl_MM12.getSelectedRow();
            if(key==38){
                baris-=1;
                if(baris<0)baris=0;
            }else if(key==40){
                baris+=1;
            }
            String nis = tbl_MM12.getValueAt (baris, 1).toString();
            hitungData(nis);
        }
    }//GEN-LAST:event_tbl_MM12KeyPressed

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
        new HelpForm(this, true).setVisible(true);
    }//GEN-LAST:event_btnHelpMouseClicked

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        setAbsen("kosong");
    }//GEN-LAST:event_btnDelActionPerformed
    
    public void setAbsen(String b){
       String nis=null, bulan=null, mg=null, absen=null;
       int m = cmbMinggu.getSelectedIndex();
       
       if(b.equals("hadir")){
           absen="h";
       }else if(b.equals("alfa")){
           absen="a";
       }else if(b.equals("sakit")){
           absen="s";
       }else if(b.equals("izin")){
           absen="i";
       }else if(b.equals("kosong")){
           absen="";
       }
       
       if(baris == -1){
            JOptionPane.showMessageDialog(null, "Data belum dipilih!");
       } else {
            if (m == 0){
                 mg="m1";
            }else if(m == 1){
                 mg="m2";
            }else if(m == 2){
                 mg="m3";
            }else if(m==3){
                 mg="m4";
            }

            if (selBulan == 0){//jul
                bulan="7";
                if(selKelas==0){
                    nis = tbl_RPL1.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ1.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM1.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 1){//agu
                 bulan="8";
                 if(selKelas==0){
                    nis = tbl_RPL2.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ2.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM2.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 2){//sep
                 bulan="9";
                 if(selKelas==0){
                    nis = tbl_RPL3.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ3.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM3.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 3){//okt
                 bulan="10";
                 if(selKelas==0){
                    nis = tbl_RPL4.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ4.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM4.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 4){//nov
                 bulan="11";
                 if(selKelas==0){
                    nis = tbl_RPL5.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ5.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM5.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 5){//des
                 bulan="12";
                 if(selKelas==0){
                    nis = tbl_RPL6.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ6.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM6.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 6){//jan
                 bulan="1";
                 if(selKelas==0){
                    nis = tbl_RPL7.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ7.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM7.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 7){//feb
                 bulan="2";
                 if(selKelas==0){
                    nis = tbl_RPL8.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ8.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM8.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 8){//mar
                 bulan="3";
                 if(selKelas==0){
                    nis = tbl_RPL9.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ9.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM9.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 9){//apr
                 bulan="4";
                 if(selKelas==0){
                    nis = tbl_RPL10.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ10.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM10.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 10){//mei
                 bulan="5";
                 if(selKelas==0){
                    nis = tbl_RPL11.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ11.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM11.getValueAt (baris, 1).toString();
                }
             }
             else if (selBulan == 11){//jun
                 bulan="6";
                 if(selKelas==0){
                    nis = tbl_RPL12.getValueAt (baris, 1).toString();
                } else if(selKelas==1) {
                    nis = tbl_TKJ12.getValueAt (baris, 1).toString();
                } else if(selKelas==2){
                    nis = tbl_MM12.getValueAt (baris, 1).toString();
                }
             }
             try {
                 Statement stmt = koneksi.createStatement();
                 String query = "UPDATE t_absen SET "+mg+" = '"+absen+"' WHERE nis = '"+nis+"' AND bulan = '"+bulan+"'";
                 //System.out.println(query);
                 int berhasil = stmt.executeUpdate(query);
                 setRank();
                 if(berhasil != 1) {
                     JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                 }           
             } catch (SQLException ex) {
                 ex.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Query");
             }
       }
        
        showDataRPL(); 
        showDataTKJ();
        showDataMM();
        baris = -1;
    }
    
    public void hitungData(String nis){
        int total_hadir=0, total_izin=0, total_sakit=0, total_alfa=0, m1h=0, 
                m2h=0, m3h=0, m4h=0, m1s=0, m2s=0, m3s=0, m4s=0, 
                m1i=0, m2i=0, m3i=0, m4i=0, m1a=0, m2a=0, m3a=0, m4a=0;
                
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT COUNT(m1) AS m1 FROM t_absen WHERE nis ="+nis+"  AND m1 = 'h'";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            m1h = Integer.valueOf(rs.getString("m1"));
            
            query = "SELECT COUNT(m2) AS m2 FROM t_absen WHERE nis ="+nis+"  AND m2 = 'h'";
            rs = stmt.executeQuery(query);
            rs.first();
            m2h = Integer.valueOf(rs.getString("m2"));
            
            query = "SELECT COUNT(m3) AS m3 FROM t_absen WHERE nis ="+nis+"  AND m3 = 'h'";
            rs = stmt.executeQuery(query);
            rs.first();
            m3h = Integer.valueOf(rs.getString("m3"));
            
            query = "SELECT COUNT(m4) AS m4 FROM t_absen WHERE nis ="+nis+"  AND m4 = 'h'";
            rs = stmt.executeQuery(query);
            rs.first();
            m4h = Integer.valueOf(rs.getString("m4"));
            
            query = "SELECT COUNT(m1) AS m1 FROM t_absen WHERE nis ="+nis+"  AND m1 = 's'";
            rs = stmt.executeQuery(query);
            rs.first();
            m1s = Integer.valueOf(rs.getString("m1"));
            
            query = "SELECT COUNT(m2) AS m2 FROM t_absen WHERE nis ="+nis+"  AND m2 = 's'";
            rs = stmt.executeQuery(query);
            rs.first();
            m2s = Integer.valueOf(rs.getString("m2"));
            
            query = "SELECT COUNT(m3) AS m3 FROM t_absen WHERE nis ="+nis+"  AND m3 = 's'";
            rs = stmt.executeQuery(query);
            rs.first();
            m3s = Integer.valueOf(rs.getString("m3"));
            
            query = "SELECT COUNT(m4) AS m4 FROM t_absen WHERE nis ="+nis+"  AND m4 = 's'";
            rs = stmt.executeQuery(query);
            rs.first();
            m4s = Integer.valueOf(rs.getString("m4"));
            
            query = "SELECT COUNT(m1) AS m1 FROM t_absen WHERE nis ="+nis+"  AND m1 = 'i'";
            rs = stmt.executeQuery(query);
            rs.first();
            m1i = Integer.valueOf(rs.getString("m1"));
            
            query = "SELECT COUNT(m2) AS m2 FROM t_absen WHERE nis ="+nis+"  AND m2 = 'i'";
            rs = stmt.executeQuery(query);
            rs.first();
            m2i = Integer.valueOf(rs.getString("m2"));
            
            query = "SELECT COUNT(m3) AS m3 FROM t_absen WHERE nis ="+nis+"  AND m3 = 'i'";
            rs = stmt.executeQuery(query);
            rs.first();
            m3i = Integer.valueOf(rs.getString("m3"));
            
            query = "SELECT COUNT(m4) AS m4 FROM t_absen WHERE nis ="+nis+"  AND m4 = 'i'";
            rs = stmt.executeQuery(query);
            rs.first();
            m4i = Integer.valueOf(rs.getString("m4"));
            
            query = "SELECT COUNT(m1) AS m1 FROM t_absen WHERE nis ="+nis+"  AND m1 = 'a'";
            rs = stmt.executeQuery(query);
            rs.first();
            m1a = Integer.valueOf(rs.getString("m1"));
            
            query = "SELECT COUNT(m2) AS m2 FROM t_absen WHERE nis ="+nis+"  AND m2 = 'a'";
            rs = stmt.executeQuery(query);
            rs.first();
            m2a = Integer.valueOf(rs.getString("m2"));
            
            query = "SELECT COUNT(m3) AS m3 FROM t_absen WHERE nis ="+nis+"  AND m3 = 'a'";
            rs = stmt.executeQuery(query);
            rs.first();
            m3a = Integer.valueOf(rs.getString("m3"));
            
            query = "SELECT COUNT(m4) AS m4 FROM t_absen WHERE nis ="+nis+"  AND m4 = 'a'";
            rs = stmt.executeQuery(query);
            rs.first();
            m4a = Integer.valueOf(rs.getString("m4"));
            
            total_hadir = m1h + m2h + m3h +m4h;
            total_izin = m1i + m2i + m3i +m4i;
            total_sakit = m1s + m2s + m3s +m4s;
            total_alfa = m1a + m2a + m3a +m4a;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        lblAlfa.setText(String.valueOf(total_alfa));
        lblIzin.setText(String.valueOf(total_izin));
        lblSakit.setText(String.valueOf(total_sakit));
        lblHadir.setText(String.valueOf(total_hadir));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel absenPanel;
    private javax.swing.JTabbedPane aguTab;
    private javax.swing.JTabbedPane aprTab;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnGaHadir;
    private javax.swing.JButton btnHadir;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnIzin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSakit;
    private javax.swing.JComboBox cmbMinggu;
    private javax.swing.JTabbedPane desTab;
    private javax.swing.JTabbedPane febTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane janTab;
    private javax.swing.JTabbedPane julTab;
    private javax.swing.JTabbedPane junTab;
    private javax.swing.JLabel lblAlfa;
    private javax.swing.JLabel lblHadir;
    private javax.swing.JLabel lblIzin;
    private javax.swing.JLabel lblSakit;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JTabbedPane marTab;
    private javax.swing.JTabbedPane meiTab;
    private javax.swing.JTabbedPane novTab;
    private javax.swing.JTabbedPane oktTab;
    private javax.swing.JTabbedPane sepTab;
    private javax.swing.JPanel tabAgu;
    private javax.swing.JPanel tabApr;
    private javax.swing.JTabbedPane tabContent;
    private javax.swing.JPanel tabDes;
    private javax.swing.JPanel tabFeb;
    private javax.swing.JPanel tabJan;
    private javax.swing.JPanel tabJul;
    private javax.swing.JPanel tabJun;
    private javax.swing.JPanel tabMM1;
    private javax.swing.JPanel tabMM10;
    private javax.swing.JPanel tabMM11;
    private javax.swing.JPanel tabMM12;
    private javax.swing.JPanel tabMM2;
    private javax.swing.JPanel tabMM3;
    private javax.swing.JPanel tabMM4;
    private javax.swing.JPanel tabMM5;
    private javax.swing.JPanel tabMM6;
    private javax.swing.JPanel tabMM7;
    private javax.swing.JPanel tabMM8;
    private javax.swing.JPanel tabMM9;
    private javax.swing.JPanel tabMar;
    private javax.swing.JPanel tabMei;
    private javax.swing.JPanel tabNov;
    private javax.swing.JPanel tabOkt;
    private javax.swing.JPanel tabRPL1;
    private javax.swing.JPanel tabRPL10;
    private javax.swing.JPanel tabRPL11;
    private javax.swing.JPanel tabRPL12;
    private javax.swing.JPanel tabRPL2;
    private javax.swing.JPanel tabRPL3;
    private javax.swing.JPanel tabRPL4;
    private javax.swing.JPanel tabRPL5;
    private javax.swing.JPanel tabRPL6;
    private javax.swing.JPanel tabRPL7;
    private javax.swing.JPanel tabRPL8;
    private javax.swing.JPanel tabRPL9;
    private javax.swing.JPanel tabSep;
    private javax.swing.JPanel tabTKJ1;
    private javax.swing.JPanel tabTKJ10;
    private javax.swing.JPanel tabTKJ11;
    private javax.swing.JPanel tabTKJ12;
    private javax.swing.JPanel tabTKJ2;
    private javax.swing.JPanel tabTKJ3;
    private javax.swing.JPanel tabTKJ4;
    private javax.swing.JPanel tabTKJ5;
    private javax.swing.JPanel tabTKJ6;
    private javax.swing.JPanel tabTKJ7;
    private javax.swing.JPanel tabTKJ8;
    private javax.swing.JPanel tabTKJ9;
    private javax.swing.JTable tbl_MM1;
    private javax.swing.JTable tbl_MM10;
    private javax.swing.JTable tbl_MM11;
    private javax.swing.JTable tbl_MM12;
    private javax.swing.JTable tbl_MM2;
    private javax.swing.JTable tbl_MM3;
    private javax.swing.JTable tbl_MM4;
    private javax.swing.JTable tbl_MM5;
    private javax.swing.JTable tbl_MM6;
    private javax.swing.JTable tbl_MM7;
    private javax.swing.JTable tbl_MM8;
    private javax.swing.JTable tbl_MM9;
    private javax.swing.JTable tbl_RPL1;
    private javax.swing.JTable tbl_RPL10;
    private javax.swing.JTable tbl_RPL11;
    private javax.swing.JTable tbl_RPL12;
    private javax.swing.JTable tbl_RPL2;
    private javax.swing.JTable tbl_RPL3;
    private javax.swing.JTable tbl_RPL4;
    private javax.swing.JTable tbl_RPL5;
    private javax.swing.JTable tbl_RPL6;
    private javax.swing.JTable tbl_RPL7;
    private javax.swing.JTable tbl_RPL8;
    private javax.swing.JTable tbl_RPL9;
    private javax.swing.JTable tbl_TKJ1;
    private javax.swing.JTable tbl_TKJ10;
    private javax.swing.JTable tbl_TKJ11;
    private javax.swing.JTable tbl_TKJ12;
    private javax.swing.JTable tbl_TKJ2;
    private javax.swing.JTable tbl_TKJ3;
    private javax.swing.JTable tbl_TKJ4;
    private javax.swing.JTable tbl_TKJ5;
    private javax.swing.JTable tbl_TKJ6;
    private javax.swing.JTable tbl_TKJ7;
    private javax.swing.JTable tbl_TKJ8;
    private javax.swing.JTable tbl_TKJ9;
    private javax.swing.JTable tbl_rank;
    // End of variables declaration//GEN-END:variables
}
