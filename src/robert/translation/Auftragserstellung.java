/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robert.translation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Hawk9
 */
public class Auftragserstellung extends javax.swing.JFrame {
    String date    = null;
    int    counter = 0;
    
    
    public static final String FILE_PATH = "Auftragsnummer.x";
    private Object WordProcessing;
    
    public Auftragserstellung() {
        initComponents();
        setSize(800,800);
        
        Date dt = new Date();
        // Festlegung des Formats:
        SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
        // Formatierung zu String:
        date = df.format(dt); 
        
        try{
            BufferedReader file = new BufferedReader(new FileReader(FILE_PATH));
            
            if(date.equals(file.readLine())) {
                counter = Integer.parseInt(file.readLine());
            }
        } catch(IOException e) {}
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDetail = new javax.swing.JPanel();
        lAuftragsnummer = new javax.swing.JLabel();
        tfAuftragsnummer = new javax.swing.JTextField();
        lKKZ = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lKundenname = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lBezeichnung = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lStatus = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        tpTabs = new javax.swing.JTabbedPane();
        pHauptdaten = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();
        lBeginn = new javax.swing.JLabel();
        tfBeginn = new javax.swing.JTextField();
        lEnde = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        tlWörterzählen = new javax.swing.JLabel();
        cbWörterzählen = new javax.swing.JCheckBox();
        lZeichengesamt = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        lZeilenanzahl = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        lWörteranzahl = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        lSeitenzanzahl = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        lFertigstellung = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        lKorrekturEN = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        lPreisnetto = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        lPreisbrutto = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        pRight = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        pDokumente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lAuftragsnummer2 = new javax.swing.JLabel();
        pStunden = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lAuftragsnummer3 = new javax.swing.JLabel();
        pButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        pDetail.setLayout(new java.awt.GridLayout(5, 2));

        lAuftragsnummer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAuftragsnummer.setText("Auftragsnummer:");
        pDetail.add(lAuftragsnummer);
        pDetail.add(tfAuftragsnummer);

        lKKZ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lKKZ.setText("KKZ:");
        pDetail.add(lKKZ);
        pDetail.add(jTextField1);

        lKundenname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lKundenname.setText("Kundenname:");
        pDetail.add(lKundenname);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        pDetail.add(jTextField3);

        lBezeichnung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBezeichnung.setText("Bezeichnung:");
        pDetail.add(lBezeichnung);
        pDetail.add(jTextField4);

        lStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lStatus.setText("Status:");
        pDetail.add(lStatus);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bearbeitung", "Fertig", "Bezahlt", "Storno" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        pDetail.add(jComboBox1);

        getContentPane().add(pDetail, java.awt.BorderLayout.NORTH);

        pHauptdaten.setLayout(new java.awt.GridLayout(1, 2));

        pLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pLeft.setLayout(new java.awt.GridLayout(11, 1));

        lBeginn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBeginn.setText("Beginn:");
        pLeft.add(lBeginn);

        tfBeginn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfBeginn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBeginnActionPerformed(evt);
            }
        });
        pLeft.add(tfBeginn);

        lEnde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnde.setText("Ende:");
        pLeft.add(lEnde);

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField6);

        tlWörterzählen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tlWörterzählen.setText("Wörter zählen:");
        pLeft.add(tlWörterzählen);
        pLeft.add(cbWörterzählen);

        lZeichengesamt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lZeichengesamt.setText("Zeichen gesamt:");
        pLeft.add(lZeichengesamt);

        jTextField7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField7);

        lZeilenanzahl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lZeilenanzahl.setText("Zeilenanzahl:");
        pLeft.add(lZeilenanzahl);

        jTextField8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField8);

        lWörteranzahl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lWörteranzahl.setText("Wörteranzahl:");
        pLeft.add(lWörteranzahl);

        jTextField9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField9);

        lSeitenzanzahl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lSeitenzanzahl.setText("Seitenanzahl:");
        pLeft.add(lSeitenzanzahl);

        jTextField10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField10);

        lFertigstellung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lFertigstellung.setText("Fertigstellung:");
        pLeft.add(lFertigstellung);

        jTextField11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField11);

        lKorrekturEN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lKorrekturEN.setText("Korrektur EN:");
        pLeft.add(lKorrekturEN);

        jTextField12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField12);

        lPreisnetto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPreisnetto.setText("Preis netto:");
        pLeft.add(lPreisnetto);

        jTextField13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField13);

        lPreisbrutto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPreisbrutto.setText("Preis brutto:");
        pLeft.add(lPreisbrutto);

        jTextField14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pLeft.add(jTextField14);

        pHauptdaten.add(pLeft);

        pRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pRight.setLayout(new java.awt.GridLayout(8, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Rechnungsdatum:");
        pRight.add(jLabel1);

        jTextField16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Rechnungsnr.:");
        pRight.add(jLabel2);

        jTextField18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField18);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Zahlungsdatum:");
        pRight.add(jLabel3);

        jTextField19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Schwierigkeit:");
        pRight.add(jLabel4);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Leicht", "Mittel", "Schwer" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        pRight.add(jComboBox2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ermäßigung (%):");
        pRight.add(jLabel5);

        jTextField21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        pRight.add(jTextField21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Zeilenpreis:");
        pRight.add(jLabel6);

        jTextField22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("MWSt (%):");
        pRight.add(jLabel7);

        jTextField23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Stunden gesamt:");
        pRight.add(jLabel8);

        jTextField24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pRight.add(jTextField24);

        pHauptdaten.add(pRight);

        tpTabs.addTab("Hauptdaten", pHauptdaten);

        pDokumente.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jScrollPane1);

        pDokumente.add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Dokumente zum Antrag");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Bezeichnung");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Zeichen");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Wörter");

        jLabel13.setText("Auftragsnummer:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lAuftragsnummer2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAuftragsnummer2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pDokumente.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        tpTabs.addTab("Dokumente", pDokumente);

        pStunden.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );

        pStunden.add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Stunden zum Auftrag");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Datum");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Std-Anzahl");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Vermerk");

        jLabel14.setText("Auftragsnummer:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel20)
                .addGap(48, 48, 48)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAuftragsnummer3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAuftragsnummer3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pStunden.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        tpTabs.addTab("Stunden", pStunden);

        getContentPane().add(tpTabs, java.awt.BorderLayout.CENTER);

        jButton1.setText("Rechnung");

        jButton2.setText("Calculate");

        jButton3.setText("Angebot");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("EN");

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Open");

        lMessage.setForeground(new java.awt.Color(255, 0, 0));

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonsLayout = new javax.swing.GroupLayout(pButtons);
        pButtons.setLayout(pButtonsLayout);
        pButtonsLayout.setHorizontalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pButtonsLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(101, 101, 101)
                        .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                    .addGroup(pButtonsLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(pButtonsLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))))
                .addContainerGap())
        );
        pButtonsLayout.setVerticalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pButtonsLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pButtons, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void tfBeginnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBeginnActionPerformed
      Date dt = new Date();
        // Festlegung des Formats:
        SimpleDateFormat df = new SimpleDateFormat( "dd.MM.yyyy" );
        df.setTimeZone( TimeZone.getDefault() );                  // nicht mehr unbedingt notwendig seit JDK 1.2
        // Formatierung zu String:
        System.out.println( "Date = " + df.format( dt ) );        // z.B. '2001-01-26 19:03:56.731'
        tfBeginn.setText(df.format(dt));
    }//GEN-LAST:event_tfBeginnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
    Date dt = new Date();
    
    SimpleDateFormat df = new SimpleDateFormat( "dd.MM.yyyy" ); 
    tfBeginn.setText(df.format(dt));
    
    counter++;
    if(counter >= 100) {
        System.out.println("Es können heute keine weiteren Aufträge erstellt werden!");
        lMessage.setText("Es können heute keine weiteren Aufträge erstellt werden!");
    } else {
        SimpleDateFormat df1 = new SimpleDateFormat("yyMMdd");
        String auftragsnr = df1.format(dt);
       
        tfAuftragsnummer.setText(auftragsnr + String.format("%02d", counter));
    }
    
    try (PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(FILE_PATH)))) {
        file.println(date);
        file.println(counter);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    String Auftragsnummer2 = tfAuftragsnummer.getText(); 
    lAuftragsnummer2.setText(Auftragsnummer2);
    lAuftragsnummer3.setText(Auftragsnummer2); 
      
    //------------------------------------------------------------------------
    
      //------------------------------------------------------------------------
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        
    }//GEN-LAST:event_jTextField21ActionPerformed

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
            java.util.logging.Logger.getLogger(Auftragserstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auftragserstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auftragserstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auftragserstellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auftragserstellung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbWörterzählen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lAuftragsnummer;
    private javax.swing.JLabel lAuftragsnummer2;
    private javax.swing.JLabel lAuftragsnummer3;
    private javax.swing.JLabel lBeginn;
    private javax.swing.JLabel lBezeichnung;
    private javax.swing.JLabel lEnde;
    private javax.swing.JLabel lFertigstellung;
    private javax.swing.JLabel lKKZ;
    private javax.swing.JLabel lKorrekturEN;
    private javax.swing.JLabel lKundenname;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lPreisbrutto;
    private javax.swing.JLabel lPreisnetto;
    private javax.swing.JLabel lSeitenzanzahl;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lWörteranzahl;
    private javax.swing.JLabel lZeichengesamt;
    private javax.swing.JLabel lZeilenanzahl;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pDetail;
    private javax.swing.JPanel pDokumente;
    private javax.swing.JPanel pHauptdaten;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pStunden;
    private javax.swing.JTextField tfAuftragsnummer;
    private javax.swing.JTextField tfBeginn;
    private javax.swing.JLabel tlWörterzählen;
    private javax.swing.JTabbedPane tpTabs;
    // End of variables declaration//GEN-END:variables
}
