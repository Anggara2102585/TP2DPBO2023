/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Apri Anggara Yudha
 */
public class AddVolcano extends javax.swing.JFrame {
    
    // Properties
    private Volcano volcano;
    private dbConnection db;
    private String previousPath;

    /**
     * Creates new form AddVolcano
     */
    public AddVolcano() {                   // ADD MODE
        initComponents();
        volcano = new Volcano();
        fieldPath.setEnabled(false);
        
        // make connection to db
        db = new dbConnection();
        
        setComboBox();
        
        // Hide the save button, show the add button
        btnSave.setVisible(false);
        btnAdd.setVisible(true);
    }
    
    public AddVolcano(Volcano volcano) {    // EDIT MODE
        initComponents();
        this.volcano = volcano;
        fieldPath.setEnabled(false);
        previousPath = volcano.getImgPath();
        labelTitle.setText("Edit Volcano");
        this.setTitle("Edit Volcano");
        
        // make connection to db
        db = new dbConnection();
        
        // Hide the add button, show the save button
        btnAdd.setVisible(false);
        btnSave.setVisible(true);
        
        // Set the text fields
        fieldName.setText(volcano.getName());
        fieldType.setText(volcano.getType());
        fieldLastEruption.setValue(volcano.getLastEruption());
        setComboBox();
        fieldPath.setText(volcano.getImgPath());
    }
    
    public void setComboBox() {
        // Get volcano rows from database
        ResultSet res = db.selectQuery("SELECT * FROM country;");
        try {
            // Iterate through result and populate the combo box, while checking the selected country
            while (res.next()) {
                cbCountry.addItem(res.getString("name"));
                if (res.getInt("id_country") == volcano.getCountry()) {
                    cbCountry.setSelectedItem(res.getString("name"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void saveUserInput() {
        volcano.setName(fieldName.getText());
        volcano.setType(fieldType.getText());
        volcano.setLastEruption((Integer) fieldLastEruption.getValue());
        volcano.setCountry(getCountryId((String) cbCountry.getSelectedItem()));
//        volcano.setImgPath(fieldPath.getText());
    }
    
    public int getCountryId(String name) {
        ResultSet res = db.selectQuery("SELECT * FROM country WHERE name='"+name+"';");
        try {
            if (res.next()) {
                return res.getInt("id_country");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
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
        labelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldType = new javax.swing.JTextField();
        cbCountry = new javax.swing.JComboBox<>();
        btnBrowse = new javax.swing.JButton();
        fieldPath = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        fieldLastEruption = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AddVolcano");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(204, 204, 204));
        labelTitle.setText("Add Volcano");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Type");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Last Eruption");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Country");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Image");

        btnBrowse.setBackground(new java.awt.Color(204, 204, 204));
        btnBrowse.setForeground(new java.awt.Color(0, 0, 0));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        btnAdd.setBackground(new java.awt.Color(0, 153, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, "card2");

        btnSave.setBackground(new java.awt.Color(0, 153, 0));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, "card3");

        fieldLastEruption.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(fieldType))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(fieldName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowse)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldLastEruption)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldLastEruption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBrowse))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        saveUserInput();
        
        if (volcano.getName().equals("") || volcano.getType().equals("") || volcano.getImgPath() == null) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap!");
        } else {
            try {
                // Add volcano to database
                String query = "INSERT INTO volcano VALUES (NULL, '"+volcano.getName()+"', '"+volcano.getType()+"', '"+volcano.getLastEruption()+"', '"+volcano.getCountry()+"', '"+volcano.getImgPath()+"');";
                db.updateQuery(query);

                // Save the image
                File sourceFile = new File(fieldPath.getText());
                File destinationFile = new File(volcano.getImgPath());
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
                
                // Show Information
                System.out.println("Add Volcano Success");
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
                // Close this frame
                this.dispose();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveUserInput();
        String sourcePath = fieldPath.getText();
        
        if (volcano.getName().equals("") || volcano.getType().equals("") || volcano.getImgPath() == null) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap!");
        } else {
            try {
                // Add country to database
                String query = "UPDATE volcano SET name='"+volcano.getName()+"', type='"+volcano.getType()+"', lastEruption='"+volcano.getLastEruption()+"', id_country='"+volcano.getCountry()+"', imgPath='"+volcano.getImgPath()+"' WHERE id_volcano='"+volcano.getId()+"';";
                db.updateQuery(query);

                // If the path changed
                if (!volcano.getImgPath().equals(sourcePath)) {
                    // Save the image
                    File sourceFile = new File(sourcePath);
                    File destinationFile = new File(volcano.getImgPath());
                    Files.copy(sourceFile.toPath(), destinationFile.toPath());
                    // Delete the previous image
                    File imageFile = new File(previousPath);
                    if (imageFile.exists()) {
                        if (imageFile.delete()) {
                            System.out.println("Previous image file deleted");
                        }
                    }
                }
                
                // Show Information
                System.out.println("Edit Volcano Success");
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                // Close this frame
                this.dispose();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        // Filter image extensions
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int showOpenDialogue = chooser.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {        
            // Get selected file path
            File f = chooser.getSelectedFile();
            String sourcePath = f.getAbsolutePath();
            fieldPath.setText(sourcePath);

            // Prepare the new directory
            String newPath = "uploads/volcano_img/";
            File directory = new File(newPath);
            if(!directory.exists()) {
                directory.mkdirs();
            }
            
            // Set the destination file path
            String extension = sourcePath.substring(sourcePath.lastIndexOf('.'));
            String newName = UUID.randomUUID().toString() + extension;
            volcano.setImgPath(newPath + newName);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddVolcano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddVolcano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddVolcano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddVolcano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddVolcano().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCountry;
    private javax.swing.JSpinner fieldLastEruption;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JTextField fieldType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
