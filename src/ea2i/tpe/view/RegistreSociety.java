
package ea2i.tpe.view;

public class RegistreSociety extends javax.swing.JFrame {


    public RegistreSociety() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonChooserLogo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelCancel = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonAddUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNameSociety = new javax.swing.JTextField();
        jTextFieldDomaineSociety = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNameUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldConfirmPasseword = new javax.swing.JPasswordField();
        jTextFieldPhotoProfil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonSelectPhotoProfil = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 483));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 62, 81));
        jPanel1.setMinimumSize(new java.awt.Dimension(267, 483));
        jPanel1.setPreferredSize(new java.awt.Dimension(267, 483));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ea2i/tpe/ressources/Ellipse.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setMinimumSize(new java.awt.Dimension(92, 115));
        jLabelLogo.setPreferredSize(new java.awt.Dimension(92, 115));
        jLabelLogo.setVerifyInputWhenFocusTarget(false);

        jButtonChooserLogo.setBackground(new java.awt.Color(255, 255, 255));
        jButtonChooserLogo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonChooserLogo.setForeground(new java.awt.Color(2, 62, 81));
        jButtonChooserLogo.setText("Choisir Logo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonChooserLogo)
                            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChooserLogo)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(533, 483));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(533, 40));
        jPanelHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jLabelCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCancel.setForeground(new java.awt.Color(2, 62, 81));
        jLabelCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancel.setText("-");
        jLabelCancel.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelHeader.add(jLabelCancel);

        jLabelClose.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(2, 62, 81));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelHeader.add(jLabelClose);

        jPanel2.add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        jPanelFooter.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFooter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 27, 5));

        jButtonBack.setBackground(new java.awt.Color(112, 112, 112));
        jButtonBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(2, 62, 81));
        jButtonBack.setText("Retour");
        jPanelFooter.add(jButtonBack);

        jButtonCancel.setBackground(new java.awt.Color(112, 112, 112));
        jButtonCancel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(2, 62, 81));
        jButtonCancel.setText("Annuler");
        jPanelFooter.add(jButtonCancel);

        jButtonAddUser.setBackground(new java.awt.Color(2, 62, 81));
        jButtonAddUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonAddUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddUser.setText("Enregistrer");
        jPanelFooter.add(jButtonAddUser);

        jPanel2.add(jPanelFooter, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(533, 414));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(2, 62, 81));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 62, 81));
        jLabel3.setText("Nom Socèté :");

        jTextFieldNameSociety.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNameSociety.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldNameSociety.setForeground(new java.awt.Color(2, 62, 81));
        jTextFieldNameSociety.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jTextFieldNameSociety.setCaretColor(new java.awt.Color(2, 62, 81));
        jTextFieldNameSociety.setPreferredSize(new java.awt.Dimension(55, 30));

        jTextFieldDomaineSociety.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDomaineSociety.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldDomaineSociety.setForeground(new java.awt.Color(2, 62, 81));
        jTextFieldDomaineSociety.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jTextFieldDomaineSociety.setCaretColor(new java.awt.Color(2, 62, 81));
        jTextFieldDomaineSociety.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 62, 81));
        jLabel4.setText("Domaine :");

        jTextFieldNameUser.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNameUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldNameUser.setForeground(new java.awt.Color(2, 62, 81));
        jTextFieldNameUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jTextFieldNameUser.setCaretColor(new java.awt.Color(2, 62, 81));
        jTextFieldNameUser.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 62, 81));
        jLabel5.setText("Nom d' Utilisateur :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 62, 81));
        jLabel6.setText("Mot de passe :");

        jPasswordFieldPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldPassword.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(2, 62, 81));
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 62, 81));
        jLabel7.setText("Confirmation de mot de passe :");

        jPasswordFieldConfirmPasseword.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldConfirmPasseword.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPasswordFieldConfirmPasseword.setForeground(new java.awt.Color(2, 62, 81));
        jPasswordFieldConfirmPasseword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));

        jTextFieldPhotoProfil.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPhotoProfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextFieldPhotoProfil.setForeground(new java.awt.Color(2, 62, 81));
        jTextFieldPhotoProfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jTextFieldPhotoProfil.setCaretColor(new java.awt.Color(2, 62, 81));
        jTextFieldPhotoProfil.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 62, 81));
        jLabel8.setText("Photo de profile :");

        jButtonSelectPhotoProfil.setBackground(new java.awt.Color(0, 46, 81));
        jButtonSelectPhotoProfil.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNameSociety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDomaineSociety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldPassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmPasseword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPhotoProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelectPhotoProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNameSociety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDomaineSociety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordFieldConfirmPasseword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldPhotoProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSelectPhotoProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChooserLogo;
    private javax.swing.JButton jButtonSelectPhotoProfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPasswordField jPasswordFieldConfirmPasseword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldDomaineSociety;
    private javax.swing.JTextField jTextFieldNameSociety;
    private javax.swing.JTextField jTextFieldNameUser;
    private javax.swing.JTextField jTextFieldPhotoProfil;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getjButtonAddUser() {
        return jButtonAddUser;
    }

    public void setjButtonAddUser(javax.swing.JButton jButtonAddUser) {
        this.jButtonAddUser = jButtonAddUser;
    }

    public javax.swing.JButton getjButtonBack() {
        return jButtonBack;
    }

    public void setjButtonBack(javax.swing.JButton jButtonBack) {
        this.jButtonBack = jButtonBack;
    }

    public javax.swing.JButton getjButtonCancel() {
        return jButtonCancel;
    }

    public void setjButtonCancel(javax.swing.JButton jButtonCancel) {
        this.jButtonCancel = jButtonCancel;
    }

    public javax.swing.JButton getjButtonSelectPhotoProfil() {
        return jButtonSelectPhotoProfil;
    }

    public void setjButtonSelectPhotoProfil(javax.swing.JButton jButtonSelectPhotoProfil) {
        this.jButtonSelectPhotoProfil = jButtonSelectPhotoProfil;
    }

    public javax.swing.JLabel getjLabelCancel() {
        return jLabelCancel;
    }

    public void setjLabelCancel(javax.swing.JLabel jLabelCancel) {
        this.jLabelCancel = jLabelCancel;
    }

    public javax.swing.JLabel getjLabelClose() {
        return jLabelClose;
    }

    public void setjLabelClose(javax.swing.JLabel jLabelClose) {
        this.jLabelClose = jLabelClose;
    }

    public javax.swing.JPasswordField getjPasswordFieldConfirmPasseword() {
        return jPasswordFieldConfirmPasseword;
    }

    public void setjPasswordFieldConfirmPasseword(javax.swing.JPasswordField jPasswordFieldConfirmPasseword) {
        this.jPasswordFieldConfirmPasseword = jPasswordFieldConfirmPasseword;
    }

    public javax.swing.JPasswordField getjPasswordFieldPassword() {
        return jPasswordFieldPassword;
    }

    public void setjPasswordFieldPassword(javax.swing.JPasswordField jPasswordFieldPassword) {
        this.jPasswordFieldPassword = jPasswordFieldPassword;
    }

    public javax.swing.JTextField getjTextFieldDomaineSociety() {
        return jTextFieldDomaineSociety;
    }

    public void setjTextFieldDomaineSociety(javax.swing.JTextField jTextFieldDomaineSociety) {
        this.jTextFieldDomaineSociety = jTextFieldDomaineSociety;
    }

    public javax.swing.JTextField getjTextFieldNameSociety() {
        return jTextFieldNameSociety;
    }

    public void setjTextFieldNameSociety(javax.swing.JTextField jTextFieldNameSociety) {
        this.jTextFieldNameSociety = jTextFieldNameSociety;
    }

    public javax.swing.JTextField getjTextFieldNameUser() {
        return jTextFieldNameUser;
    }

    public void setjTextFieldNameUser(javax.swing.JTextField jTextFieldNameUser) {
        this.jTextFieldNameUser = jTextFieldNameUser;
    }

    public javax.swing.JTextField getjTextFieldPhotoProfil() {
        return jTextFieldPhotoProfil;
    }

    public void setjTextFieldPhotoProfil(javax.swing.JTextField jTextFieldPhotoProfil) {
        this.jTextFieldPhotoProfil = jTextFieldPhotoProfil;
    }

    public javax.swing.JButton getjButtonChooserLogo() {
        return jButtonChooserLogo;
    }

    public void setjButtonChooserLogo(javax.swing.JButton jButtonChooserLogo) {
        this.jButtonChooserLogo = jButtonChooserLogo;
    }

    public javax.swing.JLabel getjLabelLogo() {
        return jLabelLogo;
    }

    public void setjLabelLogo(javax.swing.JLabel jLabelLogo) {
        this.jLabelLogo = jLabelLogo;
    }
}
