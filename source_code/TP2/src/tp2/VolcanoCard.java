/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tp2;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Apri Anggara Yudha
 */
public class VolcanoCard extends javax.swing.JPanel {
    
    // Properties
    private Volcano volcano;
    private dbConnection db;

    /**
     * Creates new form VolcanoCard
     */
    public VolcanoCard(Volcano volcano) {
        initComponents();
        
        this.volcano = new Volcano(
                volcano.getId(),
                volcano.getName(),
                volcano.getType(),
                volcano.getLastEruption(),
                volcano.getCountry(),
                volcano.getImgPath()
        );
        
        // make connection to db
        db = new dbConnection();
        
        setCard();
    }
    
    public void setCard() {
        labelName.setText(volcano.getName());
        labelType.setText(volcano.getType());
        labelLastEruption.setText(String.valueOf(volcano.getLastEruption()));
        ResultSet res = db.selectQuery("SELECT * FROM country WHERE id_country='"+volcano.getCountry()+"';");
        try {
            if (res.next()) {
                labelCountry.setText(res.getString("name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Read the image
        Image image;
        try {
            image = ImageIO.read(new File(volcano.getImgPath()));
            image = image.getScaledInstance(133, 121, Image.SCALE_SMOOTH);
            // Display image
            labelImage.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        labelLastEruption = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Name :");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Type :");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last Eruption :");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Country :");

        labelName.setForeground(new java.awt.Color(204, 204, 204));
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelName.setText("Name");

        labelType.setForeground(new java.awt.Color(204, 204, 204));
        labelType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelType.setText("Type");

        labelLastEruption.setForeground(new java.awt.Color(204, 204, 204));
        labelLastEruption.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelLastEruption.setText("LastEruption");

        labelCountry.setForeground(new java.awt.Color(204, 204, 204));
        labelCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCountry.setText("Country");

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 102, 0));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelType, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelLastEruption, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelLastEruption))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelCountry))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Confirmation prompt
        int response = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus?", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Action
        if (response == JOptionPane.YES_OPTION) {
            // Delete row from database
            String query = "DELETE FROM volcano WHERE id_volcano='"+volcano.getId()+"';";
            db.updateQuery(query);

            // Delete the image file in the uploads folder
            File imageFile = new File(volcano.getImgPath());
            if (imageFile.exists()) {
                if (imageFile.delete()) {
                    System.out.println("Image file deleted");
                }
            }

            // Reset list from parent container
            MainFrame parent = (MainFrame) this.getTopLevelAncestor();
            if (parent != null) {
                parent.setPanel();
            }

            // Show Information
            System.out.println("Delete volcano success");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        AddVolcano addVolcano = new AddVolcano(volcano);
        addVolcano.setVisible(true);
        MainFrame parent = (MainFrame) this.getTopLevelAncestor();

        addVolcano.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Call setPanel() after the addVolcano frame is disposed/closed
                // Reset list from parent container
                if (parent != null) {
                    parent.setPanel();
                }
            }
        });
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelLastEruption;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelType;
    // End of variables declaration//GEN-END:variables
}
