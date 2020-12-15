/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CodeGenerator;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author Admin
 */
public class HieuExcel extends javax.swing.JFrame {
    //private final ArrayList<String> listSheet;
    private final ArrayList<JCheckBox> objCheckBoxs;
    private final ArrayList<JCheckBox> subObjCheckBoxs;
    private int numObj = -1;
    //private int numSubObj;
    
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    /**
     * Creates new form HieuExcel
     */
    public HieuExcel() {
        initComponents();
        //listSheet = new ArrayList<>();
        objCheckBoxs = new ArrayList<>();
        subObjCheckBoxs = new ArrayList<>();
//        panelObject.scrollRectToVisible(panelObject.getVisibleRect());
//        panelSubObject.scrollRectToVisible(panelObject.getVisibleRect());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfieldBrowseFile = new javax.swing.JTextField();
        btnBrowseFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        panelObject = new javax.swing.JPanel();
        panelSubObject = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBrowseFile.setText("Browse File");
        btnBrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Object");

        jLabel2.setText("Sub Object");

        btnClose.setBackground(new java.awt.Color(255, 51, 51));
        btnClose.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnGenerate.setBackground(new java.awt.Color(51, 255, 255));
        btnGenerate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelObjectLayout = new javax.swing.GroupLayout(panelObject);
        panelObject.setLayout(panelObjectLayout);
        panelObjectLayout.setHorizontalGroup(
            panelObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelObjectLayout.setVerticalGroup(
            panelObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSubObjectLayout = new javax.swing.GroupLayout(panelSubObject);
        panelSubObject.setLayout(panelSubObjectLayout);
        panelSubObjectLayout.setHorizontalGroup(
            panelSubObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        panelSubObjectLayout.setVerticalGroup(
            panelSubObjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(248, 248, 248)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(182, 182, 182))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfieldBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnBrowseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(panelSubObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBrowseFile, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(tfieldBrowseFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSubObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:                                       
        CodeGenerator generator = new CodeGenerator(tfieldBrowseFile.getText(),getPath());         
        try {
            if(numObj < 0){
                JOptionPane.showMessageDialog(this, "Please check an object box");
                return;
            }
            generator.GEN(numObj);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(this, "Code has been generated successfully");
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnBrowseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter excelFilter = new FileNameExtensionFilter("Excel", "xlsx","xls");
        fileChooser.setFileFilter(excelFilter);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Brower File");
        if (x==JFileChooser.APPROVE_OPTION)
        {
            File f = fileChooser.getSelectedFile();
            tfieldBrowseFile.setText(f.getAbsolutePath());
            setPath(fileChooser.getCurrentDirectory().toString());
            try {
                XSSFWorkbook workbook = new XSSFWorkbook(f);
                String sheetName;
                panelObject.removeAll();
                panelSubObject.removeAll();
//                JPanel panelObject = new JPanel();
//                panelObject.setBounds(0, 0, scrollpaneObj.getWidth(), 25*workbook.getNumberOfSheets());
//                JPanel panelSubObject = new JPanel();
//                panelSubObject.setBounds(0, 0, scrollpaneSubObj.getWidth(), 25*workbook.getNumberOfSheets());
                for(int i = 0; i < workbook.getNumberOfSheets(); i++){
                    sheetName = workbook.getSheetAt(i).getSheetName();
                    JCheckBox cboxObjSheet = new JCheckBox(sheetName);
                    cboxObjSheet.setBounds(0, 25*i, panelObject.getWidth(), 20);
                    cboxObjSheet.addActionListener(new CBoxObjSheetListener());
                    objCheckBoxs.add(cboxObjSheet);
                    panelObject.add(cboxObjSheet);
                    JCheckBox cboxSubObjSheet = new JCheckBox(sheetName);
                    cboxSubObjSheet.setBounds(0, 25*i, panelSubObject.getWidth(), 20);
                    cboxSubObjSheet.addActionListener(new CBoxSubObjSheetListener());
                    subObjCheckBoxs.add(cboxSubObjSheet);
                    panelSubObject.add(cboxSubObjSheet);
                }
                panelObject.revalidate();
                panelObject.repaint();
                panelSubObject.revalidate();
                panelSubObject.repaint();
//                scrollpaneObj.add(panelObject);
//                scrollpaneSubObj.add(panelSubObject);
//                scrollpaneObj.revalidate();
//                scrollpaneObj.repaint();
//                scrollpaneSubObj.revalidate();
//                scrollpaneSubObj.repaint();
            } catch (IOException | InvalidFormatException ex) {
                Logger.getLogger(HieuExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBrowseFileActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    
    private class CBoxObjSheetListener implements ActionListener{
     /**
     * Object chỉ đc tích 1 checkbox
     * Sub Object đc tích nhiều checkbox nhưng không đc trùng vs checkbox đã tích bên Object
     */
        @Override
        public void actionPerformed(ActionEvent evt){
            boolean isCheck = false;
            for (int i = 0; i < objCheckBoxs.size(); i++) {
                if(objCheckBoxs.get(i).isSelected()){
                    isCheck = true;
                    if(evt.getSource().equals(objCheckBoxs.get(i))){
                        numObj = i;
                    }
                    else{
                        objCheckBoxs.get(i).setSelected(false);
                    }
                }
                if(subObjCheckBoxs.get(i).isSelected() && i == numObj){
                    subObjCheckBoxs.get(i).setSelected(false);
                }
            }
            if(!isCheck){
                numObj = -1;
            }
//            for(int i = 0; i < subObjCheckBoxs.size(); i++){
//                if(subObjCheckBoxs.get(i).isSelected() && i == numObj){
//                    subObjCheckBoxs.get(i).setSelected(false);
//                }
//            }
        }
    }
    
    private class CBoxSubObjSheetListener implements ActionListener {
    /**
     * Sub Object đc tích nhiều checkbox nhưng không đc trùng vs checkbox đã tích bên Object
     */
        @Override
        public void actionPerformed(ActionEvent evt){
            if(numObj < 0){
                return;
            }
            for(int i = 0; i < subObjCheckBoxs.size(); i++){
                if(i == numObj){
                    subObjCheckBoxs.get(i).setSelected(false);
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(HieuExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HieuExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HieuExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HieuExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HieuExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseFile;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelObject;
    private javax.swing.JPanel panelSubObject;
    private javax.swing.JTextField tfieldBrowseFile;
    // End of variables declaration//GEN-END:variables
}
