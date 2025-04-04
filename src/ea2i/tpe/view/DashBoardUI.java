
package ea2i.tpe.view;

public class DashBoardUI extends javax.swing.JFrame {

    public DashBoardUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonHome = new ea2i.tpe.view.JButtonHover();
        jButtonEmployee = new ea2i.tpe.view.JButtonHover();
        jButtonPaie = new ea2i.tpe.view.JButtonHover();
        jButtonHistorique = new ea2i.tpe.view.JButtonHover();
        jButtonPresence = new ea2i.tpe.view.JButtonHover();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRecherche = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelUserProfile = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelParentHome = new javax.swing.JPanel();
        HomePage = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonAddEmployee2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EmployeePage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListsEmployees = new javax.swing.JTable();
        jRadioButtonShowContrat = new javax.swing.JRadioButton();
        jRadioButtonShowPrime = new javax.swing.JRadioButton();
        jRadioButtonShowAvantages = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButtonAddEmployees = new javax.swing.JButton();
        jButtonUpdateEmployee = new javax.swing.JButton();
        jButtonDeleteEmployee = new javax.swing.JButton();
        jButtonImprimer = new javax.swing.JButton();
        jButtonImporte = new javax.swing.JButton();
        jButtonExporte = new javax.swing.JButton();
        Paie = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableListPaie = new javax.swing.JTable();
        jButtonUpdatePaie = new javax.swing.JButton();
        jButtonExportPDF = new javax.swing.JButton();
        Presence = new javax.swing.JPanel();
        jLabelPresence = new javax.swing.JLabel();
        cardLayoutPresence = new javax.swing.JPanel();
        jScrollPaneFichePresence = new javax.swing.JScrollPane();
        jTableFichePresence = new javax.swing.JTable();
        jScrollPaneListePresence = new javax.swing.JScrollPane();
        jTableListePresence = new javax.swing.JTable();
        jButtonExporterPDFListeAbsence = new javax.swing.JButton();
        jButtonConsulterListeAbsence = new javax.swing.JButton();
        Historique = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G-Paie");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(2, 62, 81));
        jPanel3.setMaximumSize(new java.awt.Dimension(260, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(260, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 600));

        jPanel4.setBackground(new java.awt.Color(2, 62, 81));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(2, 62, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ea2i/tpe/ressources/peoples.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ea2i/tpe/ressources/Ellipse 2.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(203, 135));
        jLabel2.setMinimumSize(new java.awt.Dimension(203, 135));
        jLabel2.setPreferredSize(new java.awt.Dimension(203, 135));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 40));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom de Society");

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Domaine de l'entreprise");

        jButtonHome.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHome.setText("Accueil");
        jButtonHome.setColorHover(new java.awt.Color(0, 153, 153));
        jButtonHome.setColorText(new java.awt.Color(2, 62, 81));
        jButtonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButtonEmployee.setBackground(new java.awt.Color(0, 51, 51));
        jButtonEmployee.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButtonEmployee.setText("Employés");
        jButtonEmployee.setColorHover(new java.awt.Color(204, 204, 204));
        jButtonEmployee.setColorTextHover(new java.awt.Color(2, 62, 81));
        jButtonEmployee.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButtonPaie.setBackground(new java.awt.Color(0, 51, 51));
        jButtonPaie.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButtonPaie.setText("Paie");
        jButtonPaie.setColorHover(new java.awt.Color(204, 204, 204));
        jButtonPaie.setColorTextHover(new java.awt.Color(2, 62, 81));
        jButtonPaie.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonPaie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButtonHistorique.setBackground(new java.awt.Color(0, 51, 51));
        jButtonHistorique.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButtonHistorique.setText("Historique");
        jButtonHistorique.setColorHover(new java.awt.Color(204, 204, 204));
        jButtonHistorique.setColorTextHover(new java.awt.Color(2, 62, 81));
        jButtonHistorique.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonHistorique.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonHistorique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoriqueActionPerformed(evt);
            }
        });

        jButtonPresence.setBackground(new java.awt.Color(0, 51, 51));
        jButtonPresence.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButtonPresence.setText("Présence");
        jButtonPresence.setColorHover(new java.awt.Color(204, 204, 204));
        jButtonPresence.setColorTextHover(new java.awt.Color(2, 62, 81));
        jButtonPresence.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonPresence.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPaie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHistorique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPresence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPaie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPresence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHistorique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Recherche :");

        jTextFieldRecherche.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldRecherche.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldRecherche.setForeground(new java.awt.Color(0, 51, 51));
        jTextFieldRecherche.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Celestin");

        jLabelUserProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabelUserProfile.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabelUserProfile.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabelUserProfile.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton1.setText("Déconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabelUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRecherche)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanelParentHome.setBackground(new java.awt.Color(255, 255, 255));
        jPanelParentHome.setLayout(new java.awt.CardLayout());

        HomePage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(0, 3, 20, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel7.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel8.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel12.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom et Prenoms", "Date de paiement", "Salaire", "Poste", "status"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(2, 62, 81));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 62, 81));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Historiques de paiement");

        jButtonAddEmployee2.setBackground(new java.awt.Color(2, 62, 81));
        jButtonAddEmployee2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonAddEmployee2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddEmployee2.setText("Ajouter Employé");

        jButton3.setBackground(new java.awt.Color(2, 62, 81));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Imprimer");

        jButton2.setBackground(new java.awt.Color(2, 62, 81));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton2.setText("Exporter PDF");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddEmployee2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddEmployee2)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelParentHome.add(HomePage, "card2");

        EmployeePage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Liste des Eployés");

        jTableListsEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTableListsEmployees.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTableListsEmployees.setForeground(new java.awt.Color(51, 51, 51));
        jTableListsEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom et Prenoms", "Date de naissance", "N° Telephone", "Poste", "Salaire", "Poste"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListsEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableListsEmployees.setGridColor(new java.awt.Color(255, 255, 255));
        jTableListsEmployees.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableListsEmployees.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTableListsEmployees.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableListsEmployees.setShowHorizontalLines(false);
        jTableListsEmployees.setShowVerticalLines(false);
        jTableListsEmployees.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(jTableListsEmployees);

        jRadioButtonShowContrat.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonShowContrat);
        jRadioButtonShowContrat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonShowContrat.setForeground(new java.awt.Color(2, 62, 81));
        jRadioButtonShowContrat.setText("Contrats");

        jRadioButtonShowPrime.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonShowPrime);
        jRadioButtonShowPrime.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonShowPrime.setForeground(new java.awt.Color(2, 62, 81));
        jRadioButtonShowPrime.setText("Primes");

        jRadioButtonShowAvantages.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonShowAvantages);
        jRadioButtonShowAvantages.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButtonShowAvantages.setForeground(new java.awt.Color(2, 62, 81));
        jRadioButtonShowAvantages.setText("Avantages");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonAddEmployees.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAddEmployees.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonAddEmployees.setForeground(new java.awt.Color(0, 102, 102));
        jButtonAddEmployees.setText("Ajouter");
        jButtonAddEmployees.setFocusPainted(false);
        jButtonAddEmployees.setFocusable(false);
        jButtonAddEmployees.setMinimumSize(new java.awt.Dimension(0, 0));
        jButtonAddEmployees.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.add(jButtonAddEmployees);

        jButtonUpdateEmployee.setBackground(new java.awt.Color(204, 204, 204));
        jButtonUpdateEmployee.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonUpdateEmployee.setForeground(new java.awt.Color(0, 102, 102));
        jButtonUpdateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ea2i/tpe/ressources/update icon.png"))); // NOI18N
        jButtonUpdateEmployee.setText("Modifier");
        jButtonUpdateEmployee.setFocusPainted(false);
        jButtonUpdateEmployee.setFocusable(false);
        jButtonUpdateEmployee.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.add(jButtonUpdateEmployee);

        jButtonDeleteEmployee.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeleteEmployee.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonDeleteEmployee.setForeground(new java.awt.Color(0, 102, 102));
        jButtonDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ea2i/tpe/ressources/delete_16x16.gif"))); // NOI18N
        jButtonDeleteEmployee.setText("Supprimer");
        jButtonDeleteEmployee.setFocusPainted(false);
        jButtonDeleteEmployee.setFocusable(false);
        jButtonDeleteEmployee.setPreferredSize(new java.awt.Dimension(130, 40));
        jPanel1.add(jButtonDeleteEmployee);

        jButtonImprimer.setBackground(new java.awt.Color(204, 204, 204));
        jButtonImprimer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonImprimer.setForeground(new java.awt.Color(0, 102, 102));
        jButtonImprimer.setText("Imprimer");
        jButtonImprimer.setFocusPainted(false);
        jButtonImprimer.setFocusable(false);
        jButtonImprimer.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.add(jButtonImprimer);

        jButtonImporte.setBackground(new java.awt.Color(204, 204, 204));
        jButtonImporte.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonImporte.setForeground(new java.awt.Color(0, 102, 102));
        jButtonImporte.setText("Importer");
        jButtonImporte.setFocusPainted(false);
        jButtonImporte.setFocusable(false);
        jButtonImporte.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImporteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonImporte);

        jButtonExporte.setBackground(new java.awt.Color(204, 204, 204));
        jButtonExporte.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonExporte.setForeground(new java.awt.Color(0, 102, 102));
        jButtonExporte.setText("Exporter PDF");
        jButtonExporte.setFocusPainted(false);
        jButtonExporte.setFocusable(false);
        jButtonExporte.setPreferredSize(new java.awt.Dimension(130, 40));
        jPanel1.add(jButtonExporte);

        javax.swing.GroupLayout EmployeePageLayout = new javax.swing.GroupLayout(EmployeePage);
        EmployeePage.setLayout(EmployeePageLayout);
        EmployeePageLayout.setHorizontalGroup(
            EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePageLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeePageLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeePageLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonShowAvantages, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jRadioButtonShowPrime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonShowContrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(EmployeePageLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                        .addGap(37, 37, 37))))
        );
        EmployeePageLayout.setVerticalGroup(
            EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeePageLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButtonShowContrat)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonShowPrime)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonShowAvantages)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE))
                    .addGroup(EmployeePageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanelParentHome.add(EmployeePage, "card3");

        Paie.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LISTES DE PAIE");

        jTableListPaie.setBackground(new java.awt.Color(255, 255, 255));
        jTableListPaie.setForeground(new java.awt.Color(51, 51, 51));
        jTableListPaie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom&Prénoms", "Cotisation", "Avantage", "Salaire Brute", "Salaire Net", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableListPaie.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTableListPaie.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jTableListPaie);

        jButtonUpdatePaie.setBackground(new java.awt.Color(153, 153, 153));
        jButtonUpdatePaie.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonUpdatePaie.setForeground(new java.awt.Color(51, 51, 51));
        jButtonUpdatePaie.setText("Modifier");

        jButtonExportPDF.setBackground(new java.awt.Color(0, 153, 153));
        jButtonExportPDF.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonExportPDF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportPDF.setText("Exporter PDF");

        javax.swing.GroupLayout PaieLayout = new javax.swing.GroupLayout(Paie);
        Paie.setLayout(PaieLayout);
        PaieLayout.setHorizontalGroup(
            PaieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaieLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonUpdatePaie)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExportPDF)))
                .addContainerGap())
        );
        PaieLayout.setVerticalGroup(
            PaieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaieLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdatePaie)
                    .addComponent(jButtonExportPDF))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanelParentHome.add(Paie, "card4");

        Presence.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPresence.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPresence.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPresence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPresence.setText("Fiche de présence");

        cardLayoutPresence.setLayout(new java.awt.CardLayout());

        jTableFichePresence.setBackground(new java.awt.Color(255, 255, 255));
        jTableFichePresence.setForeground(new java.awt.Color(51, 51, 51));
        jTableFichePresence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom&Prénoms", "Date actuelle", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableFichePresence.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTableFichePresence.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPaneFichePresence.setViewportView(jTableFichePresence);
        if (jTableFichePresence.getColumnModel().getColumnCount() > 0) {
            jTableFichePresence.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableFichePresence.getColumnModel().getColumn(1).setMinWidth(30);
            jTableFichePresence.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableFichePresence.getColumnModel().getColumn(2).setMinWidth(10);
            jTableFichePresence.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        cardLayoutPresence.add(jScrollPaneFichePresence, "card2");

        jScrollPaneListePresence.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneListePresence.setForeground(new java.awt.Color(51, 51, 51));

        jTableListePresence.setBackground(new java.awt.Color(255, 255, 255));
        jTableListePresence.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableListePresence.setForeground(new java.awt.Color(51, 51, 51));
        jTableListePresence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom&Prénoms", "Nombre d'absence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableListePresence.setGridColor(new java.awt.Color(102, 102, 102));
        jTableListePresence.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTableListePresence.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPaneListePresence.setViewportView(jTableListePresence);

        cardLayoutPresence.add(jScrollPaneListePresence, "card3");

        jButtonExporterPDFListeAbsence.setBackground(new java.awt.Color(204, 204, 255));
        jButtonExporterPDFListeAbsence.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonExporterPDFListeAbsence.setForeground(new java.awt.Color(51, 51, 51));
        jButtonExporterPDFListeAbsence.setText("Exporter PDF");

        jButtonConsulterListeAbsence.setBackground(new java.awt.Color(204, 204, 255));
        jButtonConsulterListeAbsence.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonConsulterListeAbsence.setForeground(new java.awt.Color(51, 51, 51));
        jButtonConsulterListeAbsence.setText("Consulter");

        javax.swing.GroupLayout PresenceLayout = new javax.swing.GroupLayout(Presence);
        Presence.setLayout(PresenceLayout);
        PresenceLayout.setHorizontalGroup(
            PresenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PresenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPresence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardLayoutPresence, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresenceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExporterPDFListeAbsence)
                .addGap(43, 43, 43)
                .addComponent(jButtonConsulterListeAbsence)
                .addGap(31, 31, 31))
        );
        PresenceLayout.setVerticalGroup(
            PresenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresenceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelPresence)
                .addGap(27, 27, 27)
                .addComponent(cardLayoutPresence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PresenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExporterPDFListeAbsence)
                    .addComponent(jButtonConsulterListeAbsence))
                .addContainerGap())
        );

        jPanelParentHome.add(Presence, "card5");

        Historique.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Historiques de payement");

        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom&Prénoms", "Salaire Net", "Date de payement", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(51, 51, 51));
        jTable2.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable2);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Imprimer");

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Effacer L'historique");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Actualiser");

        javax.swing.GroupLayout HistoriqueLayout = new javax.swing.GroupLayout(Historique);
        Historique.setLayout(HistoriqueLayout);
        HistoriqueLayout.setHorizontalGroup(
            HistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoriqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HistoriqueLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
                .addContainerGap())
        );
        HistoriqueLayout.setVerticalGroup(
            HistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoriqueLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(HistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        jPanelParentHome.add(Historique, "card6");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelParentHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelParentHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImporteActionPerformed

    private void jButtonHistoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoriqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHistoriqueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmployeePage;
    private javax.swing.JPanel Historique;
    private javax.swing.JPanel HomePage;
    private javax.swing.JPanel Paie;
    private javax.swing.JPanel Presence;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardLayoutPresence;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAddEmployee2;
    private javax.swing.JButton jButtonAddEmployees;
    private javax.swing.JButton jButtonConsulterListeAbsence;
    private javax.swing.JButton jButtonDeleteEmployee;
    private ea2i.tpe.view.JButtonHover jButtonEmployee;
    private javax.swing.JButton jButtonExportPDF;
    private javax.swing.JButton jButtonExporte;
    private javax.swing.JButton jButtonExporterPDFListeAbsence;
    private ea2i.tpe.view.JButtonHover jButtonHistorique;
    private ea2i.tpe.view.JButtonHover jButtonHome;
    private javax.swing.JButton jButtonImporte;
    private javax.swing.JButton jButtonImprimer;
    private ea2i.tpe.view.JButtonHover jButtonPaie;
    private ea2i.tpe.view.JButtonHover jButtonPresence;
    private javax.swing.JButton jButtonUpdateEmployee;
    private javax.swing.JButton jButtonUpdatePaie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPresence;
    private javax.swing.JLabel jLabelUserProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelParentHome;
    private javax.swing.JRadioButton jRadioButtonShowAvantages;
    private javax.swing.JRadioButton jRadioButtonShowContrat;
    private javax.swing.JRadioButton jRadioButtonShowPrime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPaneFichePresence;
    private javax.swing.JScrollPane jScrollPaneListePresence;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableFichePresence;
    private javax.swing.JTable jTableListPaie;
    private javax.swing.JTable jTableListePresence;
    private javax.swing.JTable jTableListsEmployees;
    private javax.swing.JTextField jTextFieldRecherche;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JPanel getEmployeePage() {
        return EmployeePage;
    }

    public void setEmployeePage(javax.swing.JPanel EmployeePage) {
        this.EmployeePage = EmployeePage;
    }

    public javax.swing.JPanel getHistorique() {
        return Historique;
    }

    public void setHistorique(javax.swing.JPanel Historique) {
        this.Historique = Historique;
    }

    public javax.swing.JPanel getHomePage() {
        return HomePage;
    }

    public void setHomePage(javax.swing.JPanel HomePage) {
        this.HomePage = HomePage;
    }

    public javax.swing.JPanel getPaie() {
        return Paie;
    }

    public void setPaie(javax.swing.JPanel Paie) {
        this.Paie = Paie;
    }

    public javax.swing.JPanel getPresence() {
        return Presence;
    }

    public void setPresence(javax.swing.JPanel Presence) {
        this.Presence = Presence;
    }

    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public javax.swing.JPanel getCardLayoutPresence() {
        return cardLayoutPresence;
    }

    public void setCardLayoutPresence(javax.swing.JPanel cardLayoutPresence) {
        this.cardLayoutPresence = cardLayoutPresence;
    }

    public javax.swing.JButton getjButtonAddEmployees() {
        return jButtonAddEmployees;
    }

    public void setjButtonAddEmployees(javax.swing.JButton jButtonAddEmployees) {
        this.jButtonAddEmployees = jButtonAddEmployees;
    }

    public javax.swing.JButton getjButtonConsulterListeAbsence() {
        return jButtonConsulterListeAbsence;
    }

    public void setjButtonConsulterListeAbsence(javax.swing.JButton jButtonConsulterListeAbsence) {
        this.jButtonConsulterListeAbsence = jButtonConsulterListeAbsence;
    }

    public javax.swing.JButton getjButtonDeleteEmployee() {
        return jButtonDeleteEmployee;
    }

    public void setjButtonDeleteEmployee(javax.swing.JButton jButtonDeleteEmployee) {
        this.jButtonDeleteEmployee = jButtonDeleteEmployee;
    }

    public ea2i.tpe.view.JButtonHover getjButtonEmployee() {
        return jButtonEmployee;
    }

    public void setjButtonEmployee(ea2i.tpe.view.JButtonHover jButtonEmployee) {
        this.jButtonEmployee = jButtonEmployee;
    }

    public javax.swing.JButton getjButtonExportPDF() {
        return jButtonExportPDF;
    }

    public void setjButtonExportPDF(javax.swing.JButton jButtonExportPDF) {
        this.jButtonExportPDF = jButtonExportPDF;
    }

    public javax.swing.JButton getjButtonExporte() {
        return jButtonExporte;
    }

    public void setjButtonExporte(javax.swing.JButton jButtonExporte) {
        this.jButtonExporte = jButtonExporte;
    }

    public javax.swing.JButton getjButtonExporterPDFListeAbsence() {
        return jButtonExporterPDFListeAbsence;
    }

    public void setjButtonExporterPDFListeAbsence(javax.swing.JButton jButtonExporterPDFListeAbsence) {
        this.jButtonExporterPDFListeAbsence = jButtonExporterPDFListeAbsence;
    }

    public ea2i.tpe.view.JButtonHover getjButtonHistorique() {
        return jButtonHistorique;
    }

    public void setjButtonHistorique(ea2i.tpe.view.JButtonHover jButtonHistorique) {
        this.jButtonHistorique = jButtonHistorique;
    }

    public ea2i.tpe.view.JButtonHover getjButtonHome() {
        return jButtonHome;
    }

    public void setjButtonHome(ea2i.tpe.view.JButtonHover jButtonHome) {
        this.jButtonHome = jButtonHome;
    }

    public javax.swing.JButton getjButtonImporte() {
        return jButtonImporte;
    }

    public void setjButtonImporte(javax.swing.JButton jButtonImporte) {
        this.jButtonImporte = jButtonImporte;
    }

    public javax.swing.JButton getjButtonImprimer() {
        return jButtonImprimer;
    }

    public void setjButtonImprimer(javax.swing.JButton jButtonImprimer) {
        this.jButtonImprimer = jButtonImprimer;
    }

    public ea2i.tpe.view.JButtonHover getjButtonPaie() {
        return jButtonPaie;
    }

    public void setjButtonPaie(ea2i.tpe.view.JButtonHover jButtonPaie) {
        this.jButtonPaie = jButtonPaie;
    }

    public ea2i.tpe.view.JButtonHover getjButtonPresence() {
        return jButtonPresence;
    }

    public void setjButtonPresence(ea2i.tpe.view.JButtonHover jButtonPresence) {
        this.jButtonPresence = jButtonPresence;
    }

    public javax.swing.JButton getjButtonUpdateEmployee() {
        return jButtonUpdateEmployee;
    }

    public void setjButtonUpdateEmployee(javax.swing.JButton jButtonUpdateEmployee) {
        this.jButtonUpdateEmployee = jButtonUpdateEmployee;
    }

    public javax.swing.JButton getjButtonUpdatePaie() {
        return jButtonUpdatePaie;
    }

    public void setjButtonUpdatePaie(javax.swing.JButton jButtonUpdatePaie) {
        this.jButtonUpdatePaie = jButtonUpdatePaie;
    }

    public javax.swing.JRadioButton getjRadioButtonShowAvantages() {
        return jRadioButtonShowAvantages;
    }

    public void setjRadioButtonShowAvantages(javax.swing.JRadioButton jRadioButtonShowAvantages) {
        this.jRadioButtonShowAvantages = jRadioButtonShowAvantages;
    }

    public javax.swing.JRadioButton getjRadioButtonShowContrat() {
        return jRadioButtonShowContrat;
    }

    public void setjRadioButtonShowContrat(javax.swing.JRadioButton jRadioButtonShowContrat) {
        this.jRadioButtonShowContrat = jRadioButtonShowContrat;
    }

    public javax.swing.JRadioButton getjRadioButtonShowPrime() {
        return jRadioButtonShowPrime;
    }

    public void setjRadioButtonShowPrime(javax.swing.JRadioButton jRadioButtonShowPrime) {
        this.jRadioButtonShowPrime = jRadioButtonShowPrime;
    }

    public javax.swing.JScrollPane getjScrollPaneFichePresence() {
        return jScrollPaneFichePresence;
    }

    public void setjScrollPaneFichePresence(javax.swing.JScrollPane jScrollPaneFichePresence) {
        this.jScrollPaneFichePresence = jScrollPaneFichePresence;
    }

    public javax.swing.JScrollPane getjScrollPaneListePresence() {
        return jScrollPaneListePresence;
    }

    public void setjScrollPaneListePresence(javax.swing.JScrollPane jScrollPaneListePresence) {
        this.jScrollPaneListePresence = jScrollPaneListePresence;
    }

    public javax.swing.JTable getjTableFichePresence() {
        return jTableFichePresence;
    }

    public void setjTableFichePresence(javax.swing.JTable jTableFichePresence) {
        this.jTableFichePresence = jTableFichePresence;
    }

    public javax.swing.JTable getjTableListPaie() {
        return jTableListPaie;
    }

    public void setjTableListPaie(javax.swing.JTable jTableListPaie) {
        this.jTableListPaie = jTableListPaie;
    }

    public javax.swing.JTable getjTableListePresence() {
        return jTableListePresence;
    }

    public void setjTableListePresence(javax.swing.JTable jTableListePresence) {
        this.jTableListePresence = jTableListePresence;
    }

    public javax.swing.JTable getjTableListsEmployees() {
        return jTableListsEmployees;
    }

    public void setjTableListsEmployees(javax.swing.JTable jTableListsEmployees) {
        this.jTableListsEmployees = jTableListsEmployees;
    }

    public javax.swing.JTextField getjTextFieldRecherche() {
        return jTextFieldRecherche;
    }

    public void setjTextFieldRecherche(javax.swing.JTextField jTextFieldRecherche) {
        this.jTextFieldRecherche = jTextFieldRecherche;
    }

    public javax.swing.JLabel getjLabelPresence() {
        return jLabelPresence;
    }

    public void setjLabelPresence(javax.swing.JLabel jLabelPresence) {
        this.jLabelPresence = jLabelPresence;
    }

    public javax.swing.JLabel getjLabelUserProfile() {
        return jLabelUserProfile;
    }

    public void setjLabelUserProfile(javax.swing.JLabel jLabelUserProfile) {
        this.jLabelUserProfile = jLabelUserProfile;
    }

    public javax.swing.JPanel getjPanelParentHome() {
        return jPanelParentHome;
    }

    public void setjPanelParentHome(javax.swing.JPanel jPanelParentHome) {
        this.jPanelParentHome = jPanelParentHome;
    }

    public javax.swing.JButton getjButtonAddEmployee2() {
        return jButtonAddEmployee2;
    }

    public void setjButtonAddEmployee2(javax.swing.JButton jButtonAddEmployee2) {
        this.jButtonAddEmployee2 = jButtonAddEmployee2;
    }
}
