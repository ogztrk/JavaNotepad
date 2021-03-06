/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_0517_38_78_79;
//proje
//import java.io.BufferedReader;

import javax.swing.ImageIcon;



//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;

/**
 *
 * @author {Sercan Bayram:05170000038, Egemen Aydın:05170000078, Oğuz Türk:05170000079} 
 */
public class NewJFrame extends javax.swing.JFrame {
    /* Temel JFrame class'ıdır.
       Text area, menü ve butonlar bu class'da bulunmaktadır.
    */
    ImageIcon img = new ImageIcon("logo.jpg");
        
    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        this.setIconImage(img.getImage());
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        fixFile = new javax.swing.JMenuItem();
        changeWrongs = new javax.swing.JMenuItem();
        deleteLastLetter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setMinimumSize(new java.awt.Dimension(300, 100));

        textArea.setBackground(new java.awt.Color(0, 51, 102));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setMinimumSize(new java.awt.Dimension(75, 10));
        jScrollPane1.setViewportView(textArea);

        menuBar.setBackground(new java.awt.Color(153, 153, 153));
        menuBar.setBorder(null);

        fileMenu.setForeground(new java.awt.Color(0, 204, 204));
        fileMenu.setText("Dosya");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fileMenu.setMinimumSize(new java.awt.Dimension(50, 19));
        fileMenu.setPreferredSize(new java.awt.Dimension(50, 19));

        newFile.setForeground(new java.awt.Color(0, 204, 204));
        newFile.setText("Dosya Aç");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        fileMenu.add(newFile);

        saveFile.setBackground(new java.awt.Color(255, 255, 255));
        saveFile.setForeground(new java.awt.Color(0, 204, 204));
        saveFile.setText("Dosyayı Kaydet");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        menuBar.add(fileMenu);

        editMenu.setForeground(new java.awt.Color(0, 204, 204));
        editMenu.setText("Düzenle");
        editMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editMenu.setMinimumSize(new java.awt.Dimension(50, 19));
        editMenu.setPreferredSize(new java.awt.Dimension(50, 19));

        fixFile.setForeground(new java.awt.Color(0, 204, 204));
        fixFile.setText("Hataları Düzelt");
        fixFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixFileActionPerformed(evt);
            }
        });
        editMenu.add(fixFile);

        changeWrongs.setForeground(new java.awt.Color(0, 204, 204));
        changeWrongs.setText("Kelime Değiştir");
        changeWrongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeWrongsActionPerformed(evt);
            }
        });
        editMenu.add(changeWrongs);

        deleteLastLetter.setForeground(new java.awt.Color(0, 204, 204));
        deleteLastLetter.setText("Son Harf Sil");
        deleteLastLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLastLetterActionPerformed(evt);
            }
        });
        editMenu.add(deleteLastLetter);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void kelimeParcala(String kelime,Content content){
        
        /*
        Test area'daki tüm metin bu fonksiyona gelmektedir.
        metin boşluk, noktalama işaretleri veya /n ile karşılaşılıncaya kadar okunur.
        
        karakterlerden biri bulunduğunda okunmuş olan kısım ve karşılaşılan karakter...
        birbirinden bağımsız şekilde Content nesnesine eklenir.
        
        henüz okunmamış olan kısım tekrar bu fonksiyona gönderilerek
        'recursive' şekilde 'split' işlemi gerçekleştirilmiş olur.
        
        */
        
        
           
           
           if(!kelime.equals("") && kelime !=null){
            
                boolean flag=true;
                
                if(  kelime.length()>2  ){
                    for (int i = 0; i < kelime.length(); i++) {
                        char c = kelime.charAt(i);
                        
                        if ((   c=='\n' || c=='.' || c==',' 
                                || c==';' || c=='"' || c==' ' 
                                || c=='?' || c=='-' || c=='0' || 
                                c=='1' || c=='2'|| c=='3' || 
                                c=='4' || c=='5'|| c=='6' || 
                                c=='7' || c=='8'|| c=='9') 
                                && flag) {

                            

                            flag=false;
                            
                            content.add(kelime.substring(0,i));
                            content.add(String.valueOf(kelime.charAt(i)));
                            kelimeParcala(kelime.substring(i+1,kelime.length()), content);
                        }

                    }
                }
                
                if(flag) content.add(kelime);
            
            }
    }
   
    
    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // Dosya açmak için kullanılan JFrame oluşturulur.
        txtAcmaFormu dosyaAl = new txtAcmaFormu();
        dosyaAl.setVisible(true);
    }//GEN-LAST:event_newFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // Dosya kaydetmek için kullanılan JFrame oluşturulur.
        kayitForm kayitAl = new kayitForm();
        kayitAl.setVisible(true);
    }//GEN-LAST:event_saveFileActionPerformed

    private void changeWrongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeWrongsActionPerformed
        // Bir kelimeyi başka bir kelimeye dönüştürmek için kullanılan JFrame oluşturulur.
        degistirmeForm dForm  = new degistirmeForm();
        dForm.setVisible(true);
    }//GEN-LAST:event_changeWrongsActionPerformed

    private void fixFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixFileActionPerformed
        /*
        Düzenleme fonksiyonu kullanıldıktan sonra Text Area'daki tüm metin
        kelimeParcalama fonksiyonundna geçtikten sonra tekrar Text Area'ya yazılır.
        */
        
        String allText = textArea.getText();
        Content tempContent = new Content();
        kelimeParcala(allText,tempContent);
        textArea.setText(tempContent.metin);
    }//GEN-LAST:event_fixFileActionPerformed

    private void deleteLastLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLastLetterActionPerformed
        //Text Area'daki metinin en sonundaki karakter silinir.
        String temp=textArea.getText();
        int L = temp.length();
        if(L>1) textArea.setText(temp.substring(0,L-1)); 
    }//GEN-LAST:event_deleteLastLetterActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changeWrongs;
    private javax.swing.JMenuItem deleteLastLetter;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fixFile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem saveFile;
    public static javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
