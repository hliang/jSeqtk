/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jseqtk;

/**
 *
 * @author hliang
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map;
import javax.swing.JFileChooser;
//import javax.swing.JFileChooser;

public class JSeqtkGUI extends javax.swing.JFrame {

    HashMap cmdOptions = new HashMap<String, String>();
    /**
     * Creates new form JSeqtkGUI
     */
    public JSeqtkGUI() {
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

        inputFileChooser = new javax.swing.JFileChooser();
        inputFilePathTextField = new javax.swing.JTextField();
        outputFilePathTextField = new javax.swing.JTextField();
        optionLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        selectInputButton = new javax.swing.JButton();
        selectOutputButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        logScrollPane = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        seqSettings = new javax.swing.JPanel();
        seq_f = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        seq_q = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seq_n = new javax.swing.JTextField();
        seq_Q = new javax.swing.JTextField();
        seq_M = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        seq_L = new javax.swing.JTextField();
        seq_s = new javax.swing.JTextField();
        seq_l = new javax.swing.JTextField();
        seq_c = new javax.swing.JRadioButton();
        seq_A = new javax.swing.JRadioButton();
        seq_1 = new javax.swing.JRadioButton();
        seq_V = new javax.swing.JRadioButton();
        seq_2 = new javax.swing.JRadioButton();
        seq_C = new javax.swing.JRadioButton();
        seq_r = new javax.swing.JRadioButton();

        inputFileChooser.setApproveButtonToolTipText("");
        inputFileChooser.setDialogTitle("Select Input File");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jSeqtk");

        inputFilePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFilePathTextFieldActionPerformed(evt);
            }
        });

        outputFilePathTextField.setText("output.txt");
        outputFilePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFilePathTextFieldActionPerformed(evt);
            }
        });

        optionLabel.setText("seqtk seq");

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        selectInputButton.setText("input file");
        selectInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectInputButtonActionPerformed(evt);
            }
        });

        selectOutputButton.setText("output file");
        selectOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOutputButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        logTextArea.setColumns(20);
        logTextArea.setRows(5);
        logTextArea.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                logTextAreaPropertyChange(evt);
            }
        });
        logScrollPane.setViewportView(logTextArea);

        seq_f.setText("1");

        jLabel6.setText("-M");

        jLabel9.setText("-f");

        seq_q.setText("0");

        jLabel1.setText("-q");

        jLabel8.setText("-Q");

        jLabel7.setText("-n");

        jLabel2.setText("-l");

        seq_n.setText("0");

        seq_Q.setText("33");

        seq_M.setText("null");

        jLabel4.setText("-s");

        jLabel10.setText("-L");

        seq_L.setText("0");

        seq_s.setText("11");

        seq_l.setText("0");

        seq_c.setText("-c");
        seq_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_cActionPerformed(evt);
            }
        });

        seq_A.setText("-A");
        seq_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_AActionPerformed(evt);
            }
        });

        seq_1.setText("-1");
        seq_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_1ActionPerformed(evt);
            }
        });

        seq_V.setText("-V");
        seq_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_VActionPerformed(evt);
            }
        });

        seq_2.setText("-2");
        seq_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_2ActionPerformed(evt);
            }
        });

        seq_C.setText("-C");
        seq_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_CActionPerformed(evt);
            }
        });

        seq_r.setText("-r");
        seq_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seq_rActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seqSettingsLayout = new javax.swing.GroupLayout(seqSettings);
        seqSettings.setLayout(seqSettingsLayout);
        seqSettingsLayout.setHorizontalGroup(
            seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seqSettingsLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seq_2)
                    .addComponent(seq_C)
                    .addComponent(seq_r))
                .addGap(82, 82, 82))
            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(seqSettingsLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(seqSettingsLayout.createSequentialGroup()
                            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seq_q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_s, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_l, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seq_n, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_f, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seq_L, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seq_c)
                            .addComponent(seq_A)
                            .addComponent(seq_1)
                            .addComponent(seq_V)))
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        seqSettingsLayout.setVerticalGroup(
            seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seqSettingsLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(seq_r)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seq_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seq_2)
                .addGap(38, 38, 38))
            .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(seqSettingsLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seqSettingsLayout.createSequentialGroup()
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(seqSettingsLayout.createSequentialGroup()
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_Q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(seqSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seq_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGroup(seqSettingsLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(seq_c)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seq_A)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seq_1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seq_V)))
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(optionLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectInputButton)
                                    .addComponent(selectOutputButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seqSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputFilePathTextField)
                                        .addComponent(outputFilePathTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 30, Short.MAX_VALUE)
                        .addComponent(logScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(startButton)
                        .addGap(92, 92, 92)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logScrollPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectInputButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOutputButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionLabel)
                            .addComponent(seqSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(startButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFilePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFilePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFilePathTextFieldActionPerformed

    private void selectInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectInputButtonActionPerformed
        int returnVal = inputFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
           File file = inputFileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                // textarea.read( new FileReader( file.getAbsolutePath() ), null );
                System.out.println("You chose to open this file: " + file.getAbsolutePath());
                inputFilePathTextField.setText(file.getAbsolutePath());

            } catch (Exception ex) {
                System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_selectInputButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void selectOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOutputButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        // set initial default directory and file name
        chooser.setCurrentDirectory(new java.io.File(".")); 
        chooser.setSelectedFile(new File("output.txt"));
        
        chooser.setDialogTitle("Save Output as ...");
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " +  chooser.getSelectedFile());
            //outputFilePathTextField.setText("" + chooser.getCurrentDirectory());
            outputFilePathTextField.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_selectOutputButtonActionPerformed

    private void logTextAreaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_logTextAreaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_logTextAreaPropertyChange

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        System.out.println("starting ...");
        System.out.println(getCmdOptions());
        List<String> listOfString = new ArrayList<String>();;
        listOfString.addAll(Arrays.asList("/opt/local/bin/seqtk", "seq"));
        listOfString.add("-f");
        listOfString.add("0.2");
        //listOfString.add("-A");
        listOfString.add(inputFilePathTextField.getText());
        //List<String> listOfString = Arrays.asList("date");
        JSeqtk jseqtkInstance = new JSeqtk(listOfString);
        jseqtkInstance.setOutFile("/Users/hliang/NetBeansProjects/jSeqtk/output.txt");
        //jseqtkInstance.setCommand("seqtk comp ");
        //jseqtkInstance.setOptions("-q 20 -n _ -f 0.5 /Users/hliang/NetBeansProjects/jSeqtk/sample_R1.fastq");
        jseqtkInstance.runCommand();
    }//GEN-LAST:event_startButtonActionPerformed

    private void seq_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_cActionPerformed
        if(cmdOptions.containsKey("-c")) {
            cmdOptions.remove("-c");
        } else {
            cmdOptions.put("-c", "ccc");
        }
    }//GEN-LAST:event_seq_cActionPerformed

    private void seq_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_AActionPerformed
        if(cmdOptions.containsKey("-A")) {
            cmdOptions.remove("-A");
        } else {
            cmdOptions.put("-A", null);
        }
    }//GEN-LAST:event_seq_AActionPerformed

    private void seq_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_1ActionPerformed
        if(cmdOptions.containsKey("-1")) {
            cmdOptions.remove("-1");
        } else {
            cmdOptions.put("-1", null);
        }
    }//GEN-LAST:event_seq_1ActionPerformed

    private void seq_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_VActionPerformed
        if(cmdOptions.containsKey("-V")) {
            cmdOptions.remove("-V");
        } else {
            cmdOptions.put("-V", null);
        }
    }//GEN-LAST:event_seq_VActionPerformed

    private void seq_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_2ActionPerformed
        if(cmdOptions.containsKey("-2")) {
            cmdOptions.remove("-2");
        } else {
            cmdOptions.put("-2", null);
        }
    }//GEN-LAST:event_seq_2ActionPerformed

    private void seq_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_CActionPerformed
        if(cmdOptions.containsKey("-C")) {
            cmdOptions.remove("-C");
        } else {
            cmdOptions.put("-C", null);
        }
    }//GEN-LAST:event_seq_CActionPerformed

    private void seq_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seq_rActionPerformed
        if(cmdOptions.containsKey("-r")) {
            cmdOptions.remove("-r");
        } else {
            cmdOptions.put("-r", null);
        }
    }//GEN-LAST:event_seq_rActionPerformed

    private void outputFilePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFilePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputFilePathTextFieldActionPerformed

    private List<String> getCmdOptions() {
        List<String> listOfStrings = new ArrayList<String>();
        
        // get settings from textfield NOT WORKING !!! need variable name too
        java.awt.Component[] children = seqSettings.getComponents();
        for (int i=0;i<children.length;i++){
            if (children[i] instanceof javax.swing.JTextField){
                String text = ((javax.swing.JTextField) children[i]).getText();
            }
        }
        
        // iterate through hashtable
//        Enumeration optionNames = cmdOptions.keys();
//        while(optionNames.hasMoreElements()) {
//            String str = (String) optionNames.nextElement();
//            listOfStrings.add(str);
//            listOfStrings.add((String) cmdOptions.get(str)); // CANNOT add null!!!
//        }
        
        // iterate through hashmap, store command options in a list
        Iterator it = cmdOptions.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry) it.next();;
            String key = (String) pairs.getKey();
            String value = (String) pairs.getValue();
            listOfStrings.add(key);
            if(value != null) {
                listOfStrings.add(value);
            }
        }
        return listOfStrings;
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
            java.util.logging.Logger.getLogger(JSeqtkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSeqtkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSeqtkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSeqtkGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSeqtkGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JFileChooser inputFileChooser;
    private javax.swing.JTextField inputFilePathTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane logScrollPane;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JTextField outputFilePathTextField;
    private javax.swing.JButton selectInputButton;
    private javax.swing.JButton selectOutputButton;
    private javax.swing.JPanel seqSettings;
    private javax.swing.JRadioButton seq_1;
    private javax.swing.JRadioButton seq_2;
    private javax.swing.JRadioButton seq_A;
    private javax.swing.JRadioButton seq_C;
    private javax.swing.JTextField seq_L;
    private javax.swing.JTextField seq_M;
    private javax.swing.JTextField seq_Q;
    private javax.swing.JRadioButton seq_V;
    private javax.swing.JRadioButton seq_c;
    private javax.swing.JTextField seq_f;
    private javax.swing.JTextField seq_l;
    private javax.swing.JTextField seq_n;
    private javax.swing.JTextField seq_q;
    private javax.swing.JRadioButton seq_r;
    private javax.swing.JTextField seq_s;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
