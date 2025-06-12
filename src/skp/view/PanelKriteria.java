package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import skp.controller.KriteriaController;
import skp.customs.CustomMessageDialog;
import skp.customs.CustomNotification;
import skp.customs.GlassPanePopup;
import skp.model.KriteriaModel;
import skp.util.PerhitunganAHP;

/**
 *
 * @author yabsiraditya
 */
public class PanelKriteria extends javax.swing.JPanel {
    
    private JFrame parent;
    private KriteriaController kri;
    private List<String> kriteriaID = new ArrayList<>();
    private JTextField[][] inputFields = new JTextField[4][4];
    private double[] priority;


    private final int noColumnIndex = 0;
    private final int noColumnWidth = 40;    
    
    public PanelKriteria(JFrame parent) {
        this.parent = parent;
        kri = new KriteriaController(parent);

        initComponents();
        loadTable();
        setColumnWidth();
        setupFields();
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tabelkriteria.getColumnModel();
        columnModel.getColumn(noColumnIndex).setPreferredWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMaxWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMinWidth(noColumnWidth);
    }
    
    private void setupFields() {
        // Input dari atas diagonal (segitiga atas)
        inputFields[0][1] = k1k2;
        inputFields[0][2] = k1k3;
        inputFields[0][3] = k1k4;
        inputFields[1][2] = k2k3;
        inputFields[1][3] = k2k4;
        inputFields[2][3] = k3k4;
    }
    
    public double[][] getComparisonMatrix() {
        int n = 4;
        double[][] matrix = new double[n][n];
        
        // Diagonal = 1 (selalu)
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1.0;
        }
        
        // Input dari atas diagonal (segitiga atas)
        try {
            matrix[0][1] = Double.parseDouble(k1k2.getText());
            matrix[0][2] = Double.parseDouble(k1k3.getText());
            matrix[0][3] = Double.parseDouble(k1k4.getText());
            matrix[1][2] = Double.parseDouble(k2k3.getText());
            matrix[1][3] = Double.parseDouble(k2k4.getText());
            matrix[2][3] = Double.parseDouble(k3k4.getText());
            
            // Segitiga bawah (kebalikan dari atas)
            matrix[1][0] = 1.0 / matrix[0][1];
            matrix[2][0] = 1.0 / matrix[0][2];
            matrix[3][0] = 1.0 / matrix[0][3];
            matrix[2][1] = 1.0 / matrix[1][2];
            matrix[3][1] = 1.0 / matrix[1][3];
            matrix[3][2] = 1.0 / matrix[2][3];
        } catch (NumberFormatException e) {
            CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.INFO, CustomNotification.Location.BOTTOM_RIGHT, "Input tidak valid.");
            panel.showNotification();
            return null;
        }
        return matrix;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenkel = new javax.swing.ButtonGroup();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        mainkriteria = new skp.customs.CustomPanelRounded();
        viewkriteria = new skp.customs.CustomPanelRounded();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new skp.customs.CustomButtonRounded();
        btndelete = new skp.customs.CustomButtonRounded();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelkriteria = new skp.customs.CustomTable();
        inputbobot = new skp.customs.CustomPanelRounded();
        jLabel2 = new javax.swing.JLabel();
        btnsaveadd = new skp.customs.CustomButtonRounded();
        btnhitung = new skp.customs.CustomButtonRounded();
        btncanceladd = new skp.customs.CustomButtonRounded();
        panelperbandingan = new skp.customs.CustomPanelRounded();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        k1k1 = new skp.customs.CustomTextfieldRounded();
        k2k1 = new skp.customs.CustomTextfieldRounded();
        k3k1 = new skp.customs.CustomTextfieldRounded();
        k4k1 = new skp.customs.CustomTextfieldRounded();
        k1k2 = new skp.customs.CustomTextfieldRounded();
        k2k2 = new skp.customs.CustomTextfieldRounded();
        k3k2 = new skp.customs.CustomTextfieldRounded();
        k4k2 = new skp.customs.CustomTextfieldRounded();
        k1k3 = new skp.customs.CustomTextfieldRounded();
        k2k3 = new skp.customs.CustomTextfieldRounded();
        k3k3 = new skp.customs.CustomTextfieldRounded();
        k4k3 = new skp.customs.CustomTextfieldRounded();
        k1k4 = new skp.customs.CustomTextfieldRounded();
        k2k4 = new skp.customs.CustomTextfieldRounded();
        k3k4 = new skp.customs.CustomTextfieldRounded();
        k4k4 = new skp.customs.CustomTextfieldRounded();
        jumk1 = new skp.customs.CustomTextfieldRounded();
        jumk2 = new skp.customs.CustomTextfieldRounded();
        jumk3 = new skp.customs.CustomTextfieldRounded();
        jumk4 = new skp.customs.CustomTextfieldRounded();
        panelnilai = new skp.customs.CustomPanelRounded();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        k1n1 = new skp.customs.CustomTextfieldRounded();
        k2n1 = new skp.customs.CustomTextfieldRounded();
        k3n1 = new skp.customs.CustomTextfieldRounded();
        k4n1 = new skp.customs.CustomTextfieldRounded();
        k4n2 = new skp.customs.CustomTextfieldRounded();
        k3n2 = new skp.customs.CustomTextfieldRounded();
        k2n2 = new skp.customs.CustomTextfieldRounded();
        k1n2 = new skp.customs.CustomTextfieldRounded();
        k4n3 = new skp.customs.CustomTextfieldRounded();
        k3n3 = new skp.customs.CustomTextfieldRounded();
        k2n3 = new skp.customs.CustomTextfieldRounded();
        k1n3 = new skp.customs.CustomTextfieldRounded();
        k2n4 = new skp.customs.CustomTextfieldRounded();
        k4n4 = new skp.customs.CustomTextfieldRounded();
        k3n4 = new skp.customs.CustomTextfieldRounded();
        k1n4 = new skp.customs.CustomTextfieldRounded();
        jumn4 = new skp.customs.CustomTextfieldRounded();
        jumn3 = new skp.customs.CustomTextfieldRounded();
        jumn2 = new skp.customs.CustomTextfieldRounded();
        jumn1 = new skp.customs.CustomTextfieldRounded();
        ratan1 = new skp.customs.CustomTextfieldRounded();
        ratan2 = new skp.customs.CustomTextfieldRounded();
        ratan3 = new skp.customs.CustomTextfieldRounded();
        ratan4 = new skp.customs.CustomTextfieldRounded();
        panelhasil = new skp.customs.CustomPanelRounded();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lambdamax = new skp.customs.CustomTextfieldRounded();
        nilaici = new skp.customs.CustomTextfieldRounded();
        nilaicr = new skp.customs.CustomTextfieldRounded();
        validcr = new skp.customs.CustomTextfieldRounded();

        dateChooser1.setForeground(new java.awt.Color(0, 106, 113));

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new java.awt.CardLayout());

        mainkriteria.setBackground(new java.awt.Color(255, 255, 255));
        mainkriteria.setPreferredSize(new java.awt.Dimension(1026, 648));
        mainkriteria.setRoundBottomLeft(30);
        mainkriteria.setRoundBottomRight(30);
        mainkriteria.setRoundTopLeft(30);
        mainkriteria.setRoundTopRight(30);
        mainkriteria.setLayout(new java.awt.CardLayout());

        viewkriteria.setBackground(new java.awt.Color(255, 255, 255));
        viewkriteria.setRoundBottomLeft(30);
        viewkriteria.setRoundBottomRight(30);
        viewkriteria.setRoundTopLeft(30);
        viewkriteria.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Data Kriteria");

        btnadd.setBackground(new java.awt.Color(78, 51, 34));
        btnadd.setText("Input Bobot");
        btnadd.setFillClick(new java.awt.Color(62, 134, 173));
        btnadd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnadd.setFillOver(new java.awt.Color(82, 191, 251));
        btnadd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnadd.setPreferredSize(new java.awt.Dimension(200, 45));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(78, 51, 34));
        btndelete.setText("Hapus");
        btndelete.setFillClick(new java.awt.Color(62, 134, 173));
        btndelete.setFillOriginal(new java.awt.Color(77, 168, 218));
        btndelete.setFillOver(new java.awt.Color(82, 191, 251));
        btndelete.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btndelete.setPreferredSize(new java.awt.Dimension(200, 45));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tabelkriteria.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelkriteria.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jScrollPane4.setViewportView(tabelkriteria);

        javax.swing.GroupLayout viewkriteriaLayout = new javax.swing.GroupLayout(viewkriteria);
        viewkriteria.setLayout(viewkriteriaLayout);
        viewkriteriaLayout.setHorizontalGroup(
            viewkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkriteriaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(viewkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewkriteriaLayout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        viewkriteriaLayout.setVerticalGroup(
            viewkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkriteriaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(viewkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainkriteria.add(viewkriteria, "card2");

        inputbobot.setBackground(new java.awt.Color(255, 255, 255));
        inputbobot.setRoundBottomLeft(30);
        inputbobot.setRoundBottomRight(30);
        inputbobot.setRoundTopLeft(30);
        inputbobot.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Input Nilai Bobot");

        btnsaveadd.setBackground(new java.awt.Color(78, 51, 34));
        btnsaveadd.setText("Simpan");
        btnsaveadd.setFillClick(new java.awt.Color(62, 134, 173));
        btnsaveadd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnsaveadd.setFillOver(new java.awt.Color(82, 191, 251));
        btnsaveadd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnsaveadd.setPreferredSize(new java.awt.Dimension(200, 45));
        btnsaveadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveaddActionPerformed(evt);
            }
        });

        btnhitung.setBackground(new java.awt.Color(78, 51, 34));
        btnhitung.setText("Hitung");
        btnhitung.setFillClick(new java.awt.Color(62, 134, 173));
        btnhitung.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnhitung.setFillOver(new java.awt.Color(82, 191, 251));
        btnhitung.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnhitung.setPreferredSize(new java.awt.Dimension(200, 45));
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        btncanceladd.setBackground(new java.awt.Color(78, 51, 34));
        btncanceladd.setText("Batal");
        btncanceladd.setFillClick(new java.awt.Color(62, 134, 173));
        btncanceladd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btncanceladd.setFillOver(new java.awt.Color(82, 191, 251));
        btncanceladd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btncanceladd.setPreferredSize(new java.awt.Dimension(200, 45));
        btncanceladd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceladdActionPerformed(evt);
            }
        });

        panelperbandingan.setRoundBottomLeft(20);
        panelperbandingan.setRoundBottomRight(20);
        panelperbandingan.setRoundTopLeft(20);
        panelperbandingan.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setText("Matriks Perbandingan Berpasangan");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setText("K1");

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel5.setText("K2");

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setText("K3");

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setText("K4");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setText("Jumlah");

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("K1");

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("K2");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("K3");

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("K4");

        k1k1.setEditable(false);
        k1k1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1k1.setText("1");
        k1k1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k1k1.setEnabled(false);
        k1k1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1k1.setPreferredSize(new java.awt.Dimension(21, 40));

        k2k1.setEditable(false);
        k2k1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2k1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2k1.setEnabled(false);
        k2k1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2k1.setPreferredSize(new java.awt.Dimension(21, 40));

        k3k1.setEditable(false);
        k3k1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3k1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3k1.setEnabled(false);
        k3k1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3k1.setPreferredSize(new java.awt.Dimension(21, 40));

        k4k1.setEditable(false);
        k4k1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4k1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4k1.setEnabled(false);
        k4k1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4k1.setPreferredSize(new java.awt.Dimension(21, 40));

        k1k2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1k2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1k2.setPreferredSize(new java.awt.Dimension(21, 40));

        k2k2.setEditable(false);
        k2k2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2k2.setText("1");
        k2k2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2k2.setEnabled(false);
        k2k2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2k2.setPreferredSize(new java.awt.Dimension(21, 40));

        k3k2.setEditable(false);
        k3k2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3k2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3k2.setEnabled(false);
        k3k2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3k2.setPreferredSize(new java.awt.Dimension(21, 40));

        k4k2.setEditable(false);
        k4k2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4k2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4k2.setEnabled(false);
        k4k2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4k2.setPreferredSize(new java.awt.Dimension(21, 40));

        k1k3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1k3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1k3.setPreferredSize(new java.awt.Dimension(21, 40));

        k2k3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2k3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2k3.setPreferredSize(new java.awt.Dimension(21, 40));

        k3k3.setEditable(false);
        k3k3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3k3.setText("1");
        k3k3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3k3.setEnabled(false);
        k3k3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3k3.setPreferredSize(new java.awt.Dimension(21, 40));

        k4k3.setEditable(false);
        k4k3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4k3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4k3.setEnabled(false);
        k4k3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4k3.setPreferredSize(new java.awt.Dimension(21, 40));

        k1k4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1k4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1k4.setPreferredSize(new java.awt.Dimension(21, 40));

        k2k4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2k4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2k4.setPreferredSize(new java.awt.Dimension(21, 40));

        k3k4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3k4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3k4.setPreferredSize(new java.awt.Dimension(21, 40));

        k4k4.setEditable(false);
        k4k4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4k4.setText("1");
        k4k4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4k4.setEnabled(false);
        k4k4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4k4.setPreferredSize(new java.awt.Dimension(21, 40));

        jumk1.setEditable(false);
        jumk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumk1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumk1.setEnabled(false);
        jumk1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumk1.setPreferredSize(new java.awt.Dimension(21, 40));

        jumk2.setEditable(false);
        jumk2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumk2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumk2.setEnabled(false);
        jumk2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumk2.setPreferredSize(new java.awt.Dimension(21, 40));

        jumk3.setEditable(false);
        jumk3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumk3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumk3.setEnabled(false);
        jumk3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumk3.setPreferredSize(new java.awt.Dimension(21, 40));

        jumk4.setEditable(false);
        jumk4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumk4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumk4.setEnabled(false);
        jumk4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumk4.setPreferredSize(new java.awt.Dimension(21, 40));

        javax.swing.GroupLayout panelperbandinganLayout = new javax.swing.GroupLayout(panelperbandingan);
        panelperbandingan.setLayout(panelperbandinganLayout);
        panelperbandinganLayout.setHorizontalGroup(
            panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelperbandinganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelperbandinganLayout.createSequentialGroup()
                        .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelperbandinganLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k2k1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelperbandinganLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k3k1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelperbandinganLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k4k1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelperbandinganLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumk1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelperbandinganLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(k1k1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2k2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3k2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4k2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumk2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1k2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2k3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3k3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4k3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumk3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1k3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2k4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3k4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4k4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumk4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1k4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelperbandinganLayout.setVerticalGroup(
            panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelperbandinganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelperbandinganLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(k1k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(k2k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(k3k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(k4k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelperbandinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jumk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelperbandinganLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(k1k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(k2k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(k3k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(k4k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jumk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelperbandinganLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelperbandinganLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelnilai.setRoundBottomLeft(20);
        panelnilai.setRoundBottomRight(20);
        panelnilai.setRoundTopLeft(20);
        panelnilai.setRoundTopRight(20);

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel13.setText("Matriks Nilai Kriteria");

        jLabel24.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("K1");

        jLabel25.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("K2");

        jLabel27.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("K4");

        jLabel26.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("K3");

        jLabel58.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Jumlah");

        jLabel59.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Rerata");

        k1n1.setEditable(false);
        k1n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k1n1.setEnabled(false);
        k1n1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1n1.setPreferredSize(new java.awt.Dimension(21, 40));

        k2n1.setEditable(false);
        k2n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2n1.setEnabled(false);
        k2n1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2n1.setPreferredSize(new java.awt.Dimension(21, 40));

        k3n1.setEditable(false);
        k3n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3n1.setEnabled(false);
        k3n1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3n1.setPreferredSize(new java.awt.Dimension(21, 40));

        k4n1.setEditable(false);
        k4n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4n1.setEnabled(false);
        k4n1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4n1.setPreferredSize(new java.awt.Dimension(21, 40));

        k4n2.setEditable(false);
        k4n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4n2.setEnabled(false);
        k4n2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4n2.setPreferredSize(new java.awt.Dimension(21, 40));

        k3n2.setEditable(false);
        k3n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3n2.setEnabled(false);
        k3n2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3n2.setPreferredSize(new java.awt.Dimension(21, 40));

        k2n2.setEditable(false);
        k2n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2n2.setEnabled(false);
        k2n2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2n2.setPreferredSize(new java.awt.Dimension(21, 40));

        k1n2.setEditable(false);
        k1n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k1n2.setEnabled(false);
        k1n2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1n2.setPreferredSize(new java.awt.Dimension(21, 40));

        k4n3.setEditable(false);
        k4n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4n3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4n3.setEnabled(false);
        k4n3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4n3.setPreferredSize(new java.awt.Dimension(21, 40));

        k3n3.setEditable(false);
        k3n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3n3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3n3.setEnabled(false);
        k3n3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3n3.setPreferredSize(new java.awt.Dimension(21, 40));

        k2n3.setEditable(false);
        k2n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2n3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2n3.setEnabled(false);
        k2n3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2n3.setPreferredSize(new java.awt.Dimension(21, 40));

        k1n3.setEditable(false);
        k1n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1n3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k1n3.setEnabled(false);
        k1n3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1n3.setPreferredSize(new java.awt.Dimension(21, 40));

        k2n4.setEditable(false);
        k2n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k2n4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k2n4.setEnabled(false);
        k2n4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k2n4.setPreferredSize(new java.awt.Dimension(21, 40));

        k4n4.setEditable(false);
        k4n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k4n4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k4n4.setEnabled(false);
        k4n4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k4n4.setPreferredSize(new java.awt.Dimension(21, 40));

        k3n4.setEditable(false);
        k3n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k3n4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k3n4.setEnabled(false);
        k3n4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k3n4.setPreferredSize(new java.awt.Dimension(21, 40));

        k1n4.setEditable(false);
        k1n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k1n4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        k1n4.setEnabled(false);
        k1n4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        k1n4.setPreferredSize(new java.awt.Dimension(21, 40));

        jumn4.setEditable(false);
        jumn4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumn4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumn4.setEnabled(false);
        jumn4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumn4.setPreferredSize(new java.awt.Dimension(21, 40));

        jumn3.setEditable(false);
        jumn3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumn3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumn3.setEnabled(false);
        jumn3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumn3.setPreferredSize(new java.awt.Dimension(21, 40));

        jumn2.setEditable(false);
        jumn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumn2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumn2.setEnabled(false);
        jumn2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumn2.setPreferredSize(new java.awt.Dimension(21, 40));

        jumn1.setEditable(false);
        jumn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumn1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumn1.setEnabled(false);
        jumn1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jumn1.setPreferredSize(new java.awt.Dimension(21, 40));

        ratan1.setEditable(false);
        ratan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratan1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ratan1.setEnabled(false);
        ratan1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ratan1.setPreferredSize(new java.awt.Dimension(21, 40));

        ratan2.setEditable(false);
        ratan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratan2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ratan2.setEnabled(false);
        ratan2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ratan2.setPreferredSize(new java.awt.Dimension(21, 40));

        ratan3.setEditable(false);
        ratan3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratan3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ratan3.setEnabled(false);
        ratan3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ratan3.setPreferredSize(new java.awt.Dimension(21, 40));

        ratan4.setEditable(false);
        ratan4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ratan4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ratan4.setEnabled(false);
        ratan4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ratan4.setPreferredSize(new java.awt.Dimension(21, 40));

        javax.swing.GroupLayout panelnilaiLayout = new javax.swing.GroupLayout(panelnilai);
        panelnilai.setLayout(panelnilaiLayout);
        panelnilaiLayout.setHorizontalGroup(
            panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2n1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3n1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4n1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1n1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2n2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3n2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4n2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1n2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k2n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k3n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k4n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(k1n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jumn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ratan2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratan3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratan4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ratan1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelnilaiLayout.setVerticalGroup(
            panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(10, 10, 10)
                .addGroup(panelnilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k1n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k2n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k3n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k4n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnilaiLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ratan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ratan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ratan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelhasil.setRoundBottomLeft(20);
        panelhasil.setRoundBottomRight(20);
        panelhasil.setRoundTopLeft(20);
        panelhasil.setRoundTopRight(20);

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel17.setText("Hasil Perhitungan");

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel18.setText("Lambda Max");

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel19.setText("Consistency Indeks (CI)");

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel20.setText("CR < 0.1");

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel21.setText("Consistency Rasio (CR)");

        lambdamax.setEditable(false);
        lambdamax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lambdamax.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lambdamax.setEnabled(false);
        lambdamax.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        lambdamax.setPreferredSize(new java.awt.Dimension(21, 40));

        nilaici.setEditable(false);
        nilaici.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilaici.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nilaici.setEnabled(false);
        nilaici.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        nilaici.setPreferredSize(new java.awt.Dimension(21, 40));

        nilaicr.setEditable(false);
        nilaicr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilaicr.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nilaicr.setEnabled(false);
        nilaicr.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        nilaicr.setPreferredSize(new java.awt.Dimension(21, 40));

        validcr.setEditable(false);
        validcr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        validcr.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        validcr.setEnabled(false);
        validcr.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        validcr.setPreferredSize(new java.awt.Dimension(21, 40));

        javax.swing.GroupLayout panelhasilLayout = new javax.swing.GroupLayout(panelhasil);
        panelhasil.setLayout(panelhasilLayout);
        panelhasilLayout.setHorizontalGroup(
            panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhasilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(panelhasilLayout.createSequentialGroup()
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelhasilLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lambdamax, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelhasilLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaici, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelhasilLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaicr, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelhasilLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validcr, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelhasilLayout.setVerticalGroup(
            panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhasilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelhasilLayout.createSequentialGroup()
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lambdamax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(nilaici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelhasilLayout.createSequentialGroup()
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(nilaicr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(validcr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout inputbobotLayout = new javax.swing.GroupLayout(inputbobot);
        inputbobot.setLayout(inputbobotLayout);
        inputbobotLayout.setHorizontalGroup(
            inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputbobotLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(inputbobotLayout.createSequentialGroup()
                        .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputbobotLayout.createSequentialGroup()
                        .addComponent(panelperbandingan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelnilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelhasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        inputbobotLayout.setVerticalGroup(
            inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputbobotLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelperbandingan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelnilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelhasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputbobotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        mainkriteria.add(inputbobot, "card2");

        add(mainkriteria, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        try {
            // 1. Ambil nilai dari field input
            double[][] matrix = getComparisonMatrix();
            if (matrix == null) return;
            
            // 2. Hitung AHP
            PerhitunganAHP ahp = new PerhitunganAHP();
            ahp.setPairwiseComparisonMatrix(matrix);
            ahp.calculatePriorityVector();
            
            // 3. Ambil hasil perhitungan
            // Menyimpan sementara matriks untuk memudahkan penghitungan
            double[][] normMatrix = ahp.getNormalizedMatrix();
            double[] columnSums = ahp.getColumnSums();
            double[] rowSums = ahp.getRowSums();
            priority = ahp.getPriorityVector();
            double lambda = ahp.getLambdaMaxValue();
            double ci = ahp.getCIValue();
            double cr = ahp.getCRValue();
            
            // 4. Tampilkan Jumlah Kolom dari Matriks Perbandingan
            jumk1.setText(String.format("%.3f", columnSums[0]));
            jumk2.setText(String.format("%.3f", columnSums[1]));
            jumk3.setText(String.format("%.3f", columnSums[2]));
            jumk4.setText(String.format("%.3f", columnSums[3]));
            
            // 5. Tampilkan segitiga bawah matriks perbandingan (hasil dari 1/nilai)
            k2k1.setText(String.format("%.3f", matrix[1][0]));
            k3k1.setText(String.format("%.3f", matrix[2][0]));
            k3k2.setText(String.format("%.3f", matrix[2][1]));
            k4k1.setText(String.format("%.3f", matrix[3][0]));
            k4k2.setText(String.format("%.3f", matrix[3][1]));
            k4k3.setText(String.format("%.3f", matrix[3][2]));
            
            // 6. Tampilkan matriks nilai kriteria (hasil normalisasi)
            k1n1.setText(String.format("%.3f", normMatrix[0][0]));
            k1n2.setText(String.format("%.3f", normMatrix[0][1]));
            k1n3.setText(String.format("%.3f", normMatrix[0][2]));
            k1n4.setText(String.format("%.3f", normMatrix[0][3]));
            
            k2n1.setText(String.format("%.3f", normMatrix[1][0]));
            k2n2.setText(String.format("%.3f", normMatrix[1][1]));
            k2n3.setText(String.format("%.3f", normMatrix[1][2]));
            k2n4.setText(String.format("%.3f", normMatrix[1][3]));
            
            k3n1.setText(String.format("%.3f", normMatrix[2][0]));
            k3n2.setText(String.format("%.3f", normMatrix[2][1]));
            k3n3.setText(String.format("%.3f", normMatrix[2][2]));
            k3n4.setText(String.format("%.3f", normMatrix[2][3]));
            
            k4n1.setText(String.format("%.3f", normMatrix[3][0]));
            k4n2.setText(String.format("%.3f", normMatrix[3][1]));
            k4n3.setText(String.format("%.3f", normMatrix[3][2]));
            k4n4.setText(String.format("%.3f", normMatrix[3][3]));
            
            // 7. Tampilkan jumlah baris dari matriks nilai kriteria
            jumn1.setText(String.format("%.3f", rowSums[0]));
            jumn2.setText(String.format("%.3f", rowSums[1]));
            jumn3.setText(String.format("%.3f", rowSums[2]));
            jumn4.setText(String.format("%.3f", rowSums[3]));
            
            // 8. Tampilkan bobot prioritas (Rata-rata baris)
            ratan1.setText(String.format("%.3f", priority[0]));
            ratan2.setText(String.format("%.3f", priority[1]));
            ratan3.setText(String.format("%.3f", priority[2]));
            ratan4.setText(String.format("%.3f", priority[3]));
            
            // 9. Tampilkan hasil perhitungan lambda, CI, CR
            lambdamax.setText(String.format("%.3f", lambda));
            nilaici.setText(String.format("%.3f", ci));
            nilaicr.setText(String.format("%.3f", cr));
            
            // 10. Tampilkan validitas CR
            validcr.setText(cr <= 0.1 ? "Konsisten" : "Tidak Konsisten");
        } catch (NumberFormatException ex) {
            CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.WARNING, CustomNotification.Location.BOTTOM_RIGHT, "Pastikan semua input diisi dengan angka");
            panel.showNotification();
        } catch (Exception e) {
            CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.WARNING, CustomNotification.Location.BOTTOM_RIGHT, "Terjadi kesalahan dalam perhitungan: " + e.getMessage());
            panel.showNotification();
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btncanceladdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceladdActionPerformed
        panelView();
        loadTable();
        resetForm();
    }//GEN-LAST:event_btncanceladdActionPerformed

    private void btnsaveaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveaddActionPerformed
        updateDataBobot(priority);
        
    }//GEN-LAST:event_btnsaveaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteDataBobot();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        panelAdd();
    }//GEN-LAST:event_btnaddActionPerformed
    
    private void panelView() {
        mainkriteria.removeAll();
        mainkriteria.add(new PanelKriteria(parent));
        mainkriteria.repaint();
        mainkriteria.revalidate();    
    }
    
    private void panelAdd() {
        mainkriteria.removeAll();
        mainkriteria.add(inputbobot);
        mainkriteria.repaint();
        mainkriteria.revalidate();    
    }
    
    private void resetForm() {
        k1k2.setText("");
        k1k3.setText("");
        k1k4.setText("");
        k2k1.setText("");
        k2k3.setText("");
        k2k4.setText("");
        k3k1.setText("");
        k3k2.setText("");
        k3k4.setText("");
        k4k1.setText("");
        k4k2.setText("");
        k4k3.setText("");
        jumk1.setText("");
        jumk2.setText("");
        jumk3.setText("");
        jumk3.setText("");
        k1n1.setText("");
        k1n2.setText("");
        k1n3.setText("");
        k1n4.setText("");
        k2n1.setText("");
        k2n2.setText("");
        k2n3.setText("");
        k2n4.setText("");
        k3n1.setText("");
        k3n2.setText("");
        k3n3.setText("");
        k3n4.setText("");
        k4n1.setText("");
        k4n2.setText("");
        k4n3.setText("");
        k4n4.setText("");
        jumn1.setText("");
        jumn2.setText("");
        jumn3.setText("");
        jumn4.setText("");
        ratan1.setText("");
        ratan2.setText("");
        ratan3.setText("");
        ratan4.setText("");
        lambdamax.setText("");
        nilaici.setText("");
        nilaicr.setText("");
        validcr.setText("");
    }
    
    private void loadTable() {
        kriteriaID.clear();
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "ID Kriteria", "Nama", "Bobot"}, 0);
        List<KriteriaModel> listkriteria = kri.getAllKriteria();
        int no = 1;
        for (KriteriaModel kriteria : listkriteria) {
            kriteriaID.add(kriteria.getIdKriteria());
            model.addRow(new Object[]{
                no++,
                kriteria.getIdKriteria(),
                kriteria.getNama(),
                kriteria.getBobot(),
            });
        }
        tabelkriteria.setModel(model);
    }
    
    private void updateDataBobot(double[] priority) {
        if (priority == null || priority.length == 0) {
            CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.WARNING, CustomNotification.Location.BOTTOM_RIGHT, "Bobot prioritas tidak tersedia.");
            panel.showNotification();
            return;
        }
        List<KriteriaModel> kriteriaList = kri.getAllKriteria();
        if (kriteriaList != null && kriteriaList.size() == priority.length) {
            boolean success = true;
            for (int i = 0; i < priority.length; i++) {
                String idKriteria = kriteriaList.get(i).getIdKriteria();
                double bobotBaru = Double.parseDouble(String.format("%.3f", priority[i]));
                if (!kri.updateBobotKriteria(idKriteria, bobotBaru)) {
                    success = false;
                    break;
                }
            }
            if (success) {
                resetForm();
                loadTable();
                panelView();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengupdate salah satu bobot kriteria.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Jumlah kriteria tidak sesuai.");
        }
    }
    
    private void deleteDataBobot() {
        CustomMessageDialog obj = new CustomMessageDialog();
        obj.setTitle("Reset Bobot Kriteria");
        obj.setMessage("Apakah anda yakin ingin mereset semua bobot kriteria?");
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean success = kri.resetSemuaBobot();
                if (success) {
                    loadTable();
                    panelView();
                }
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomButtonRounded btnadd;
    private skp.customs.CustomButtonRounded btncanceladd;
    private skp.customs.CustomButtonRounded btndelete;
    private skp.customs.CustomButtonRounded btnhitung;
    private skp.customs.CustomButtonRounded btnsaveadd;
    private com.raven.datechooser.DateChooser dateChooser1;
    private skp.customs.CustomPanelRounded inputbobot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.ButtonGroup jenkel;
    private skp.customs.CustomTextfieldRounded jumk1;
    private skp.customs.CustomTextfieldRounded jumk2;
    private skp.customs.CustomTextfieldRounded jumk3;
    private skp.customs.CustomTextfieldRounded jumk4;
    private skp.customs.CustomTextfieldRounded jumn1;
    private skp.customs.CustomTextfieldRounded jumn2;
    private skp.customs.CustomTextfieldRounded jumn3;
    private skp.customs.CustomTextfieldRounded jumn4;
    private skp.customs.CustomTextfieldRounded k1k1;
    private skp.customs.CustomTextfieldRounded k1k2;
    private skp.customs.CustomTextfieldRounded k1k3;
    private skp.customs.CustomTextfieldRounded k1k4;
    private skp.customs.CustomTextfieldRounded k1n1;
    private skp.customs.CustomTextfieldRounded k1n2;
    private skp.customs.CustomTextfieldRounded k1n3;
    private skp.customs.CustomTextfieldRounded k1n4;
    private skp.customs.CustomTextfieldRounded k2k1;
    private skp.customs.CustomTextfieldRounded k2k2;
    private skp.customs.CustomTextfieldRounded k2k3;
    private skp.customs.CustomTextfieldRounded k2k4;
    private skp.customs.CustomTextfieldRounded k2n1;
    private skp.customs.CustomTextfieldRounded k2n2;
    private skp.customs.CustomTextfieldRounded k2n3;
    private skp.customs.CustomTextfieldRounded k2n4;
    private skp.customs.CustomTextfieldRounded k3k1;
    private skp.customs.CustomTextfieldRounded k3k2;
    private skp.customs.CustomTextfieldRounded k3k3;
    private skp.customs.CustomTextfieldRounded k3k4;
    private skp.customs.CustomTextfieldRounded k3n1;
    private skp.customs.CustomTextfieldRounded k3n2;
    private skp.customs.CustomTextfieldRounded k3n3;
    private skp.customs.CustomTextfieldRounded k3n4;
    private skp.customs.CustomTextfieldRounded k4k1;
    private skp.customs.CustomTextfieldRounded k4k2;
    private skp.customs.CustomTextfieldRounded k4k3;
    private skp.customs.CustomTextfieldRounded k4k4;
    private skp.customs.CustomTextfieldRounded k4n1;
    private skp.customs.CustomTextfieldRounded k4n2;
    private skp.customs.CustomTextfieldRounded k4n3;
    private skp.customs.CustomTextfieldRounded k4n4;
    private skp.customs.CustomTextfieldRounded lambdamax;
    private skp.customs.CustomPanelRounded mainkriteria;
    private skp.customs.CustomTextfieldRounded nilaici;
    private skp.customs.CustomTextfieldRounded nilaicr;
    private skp.customs.CustomPanelRounded panelhasil;
    private skp.customs.CustomPanelRounded panelnilai;
    private skp.customs.CustomPanelRounded panelperbandingan;
    private skp.customs.CustomTextfieldRounded ratan1;
    private skp.customs.CustomTextfieldRounded ratan2;
    private skp.customs.CustomTextfieldRounded ratan3;
    private skp.customs.CustomTextfieldRounded ratan4;
    private skp.customs.CustomTable tabelkriteria;
    private skp.customs.CustomTextfieldRounded validcr;
    private skp.customs.CustomPanelRounded viewkriteria;
    // End of variables declaration//GEN-END:variables
}