
package com.mycompany.final_project_pbo.ui;

import com.mycompany.final_project_pbo.utils.Response;
import com.mycompany.final_project_pbo.utils.SessionManager;
import com.mycompany.final_project_pbo.models.User;
import com.mycompany.final_project_pbo.services.AuthenticationService;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    // private static final java.util.logging.Logger logger =
    // java.util.logging.Logger.getLogger(Login.class.getName());
    User userService = new User();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameForm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordForm = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(93, 173, 226));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(253, 254, 254));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(93, 173, 226));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(93, 173, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Selamat Datang Di Sistem POS TOSERBA Berkah Abadi ");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aplikasi ini digunakan untuk memudahkan proses transaksi  ");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Penjualan, Manajemen Stock Barang, serta Laporan Keuangan");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("harian di TOSERBA Berkah Abadi");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setText("@ 2025 TOSERBA Berkah Abadi. All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel6))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 442, 600);

        Left.setBackground(new java.awt.Color(93, 173, 226));
        Left.setMinimumSize(new java.awt.Dimension(450, 600));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 254, 254));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Username");

        usernameForm.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        usernameForm.setForeground(new java.awt.Color(86, 101, 115));
        usernameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFormActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Password");

        passwordForm.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        passwordForm.setText("jPasswordField1");
        passwordForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFormActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(93, 173, 226));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("Selamat Berkerja, dan hati hati!");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(usernameForm)
                    .addComponent(passwordForm, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(66, 66, 66))))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(usernameForm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(passwordForm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(33, 33, 33))
        );

        jPanel1.add(Left);
        Left.setBounds(450, 0, 450, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final AuthenticationService authService = new AuthenticationService();

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameForm.getText().trim();
        String password = passwordForm.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            showError("Please enter both username and password.");
            return;
        }

        Response<User> response = authService.authenticate(username, password);
        if (!response.isSuccess()) {
            showError("Login failed: " + response.getMessage());
            return;
        }

        handleSuccessfulLogin(response.getData());
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void handleSuccessfulLogin(User user) {
        SessionManager.getInstance().login(user);
        JOptionPane.showMessageDialog(this, "Login successful. Welcome, " + user.getUsername() + "!", "Success",
                JOptionPane.INFORMATION_MESSAGE);

        this.dispose(); // lebih baik daripada setVisible(false)

        if (user.getIsOwner()) {
            new OwnerDashboard().setVisible(true);
        } else {
            new Dashboard().setVisible(true);
        }
    }

    private void usernameFormActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameFormActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameFormActionPerformed

    private void passwordFormActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passwordFormActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_passwordFormActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordForm;
    private javax.swing.JTextField usernameForm;
    // End of variables declaration//GEN-END:variables
}
