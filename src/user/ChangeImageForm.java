
package user;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChangeImageForm extends java.awt.Dialog {

    private final String studentID;
    
    public ChangeImageForm(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        InForStudentRegister parentFrame = (InForStudentRegister) parent;
        this.studentID = parentFrame.getSt().getStudentId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        test = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        test.setBackground(new java.awt.Color(204, 204, 204));
        test.setForeground(new java.awt.Color(204, 255, 51));
        test.setAutoscrolls(true);
        test.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    public void storeNewImage(File sourceFile) {
        File imageDir = new File("src/image/account");
        String fileName = sourceFile.getName();
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        String newFileName = studentID + "." + extension;
        File destFile = new File(imageDir, newFileName);
        try {
            Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(this, "Đã lưu ảnh và thay ảnh thành công.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu ảnh: " + e.getMessage());
        }
    }
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG JPG  Images", "png", "jpg");
        jfc.setFileFilter(filter);
        
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == 0) {
            File f = jfc.getSelectedFile();
            String fileName = f.getName().toLowerCase();
            if ( !fileName.endsWith(".png") && !fileName.endsWith(".jpg") ) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn file ảnh định dạng PNG hoặc JPG!");
                return;
            }
            
            storeNewImage(f);
            convertImage ci = new convertImage();
            ImageIcon scaledIcon = ci.convertImageFitToLabel(f, test);
            
            test.setIcon(scaledIcon);
            test.setHorizontalAlignment(SwingConstants.CENTER);
            test.setVerticalAlignment(SwingConstants.CENTER);        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
