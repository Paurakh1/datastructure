/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week5;

import java.util.ArrayList;


public class mergeSortFrame extends javax.swing.JFrame {
private final ArrayList T_DATAS = new ArrayList(); //Inilizing the ArrayList 

    public mergeSortFrame() {
        initComponents();
    }
 
    //This method get data from the table called jTable_Table from their index.
    public ArrayList getT_Datas(int size){
    int [] S_id = new int[size];
    String[] S_name = new String[size];
    //for loop start
    for(int i= 0; i<size; i++){
    S_id[i] = (int)jTable_Table.getValueAt(i,0); //getting value From the tables jTable_sortingTable index 0.
    S_name[i] = (String)jTable_Table.getValueAt(i,1);//getting value From the tables jTable_sortingTable index 1.
    
    } //for loop ends.
      T_DATAS.add(0,S_id);
      T_DATAS.add(1,S_name);
      
      return T_DATAS;
    }
    //This method set data from the table called jTable_Table to their index.
    public void setT_DATAS(int size, int[] S_id, String [] S_name ){
    for (int i = 0; i<size; i++){
    jTable_Table.setValueAt(S_id [i], i,0);
     jTable_Table.setValueAt(S_name [i], i,1);
    
    }
    
    }
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    
    public void sort(int[] S_id, String[] S_name, int size,boolean byAsc,boolean isID){
        if(S_id.length <=1)
        return;
        
        int[] fir_ID =new int [size/2];
        String [] fir_NAME =new String [size/2];
         int[] sec_ID = new int [size - fir_ID.length ];
         String[] sec_NAME = new String [size-fir_NAME.length];
        
         for(int i =0; i<fir_ID.length; i++){
         fir_ID[i] = S_id[i];
         fir_NAME [i] = S_name[i];
         }
        for (int j = 0; j<sec_ID.length;j++){
        sec_ID[j] = S_id[j+fir_ID.length];
        sec_NAME[j]= S_name[j+fir_ID.length];
        }
        
        sort(fir_ID,fir_NAME,fir_ID.length,byAsc,isID);
        sort(sec_ID,sec_NAME,sec_ID.length,byAsc,isID);
        
        if(isID){
        mer_id(fir_ID,sec_ID,fir_NAME,sec_NAME,S_id,S_name,byAsc);
        }   
        
        else{
        mer_name(fir_ID,sec_ID,fir_NAME,sec_NAME,S_id,S_name,byAsc);
        }
    }
    public void mer_id(int[]fir_ID,int[] sec_ID,String[] fir_NAME,String[] sec_NAME,int[] S_id, String[] S_name,boolean byAsc){
       int counterA = 0;
       int counterB  = 0;
       int counterC = 0;
       
       while(counterB < fir_ID.length && counterC < sec_ID.length) {
       if(byAsc){
           if(fir_ID[counterB]< sec_ID[counterC] ){
           S_id[counterA] = fir_ID[counterB];
           S_name[counterA] = fir_NAME[counterB];
           counterA++;
           counterB++;
           } 
           else{
           S_id[counterA] = sec_ID[counterC];
           S_name[counterA] = sec_NAME[counterC];
           counterA++;
           counterC++;
           }
       }
       else{
       if(fir_ID[counterB]> sec_ID[counterC]){
           S_id[counterA] = fir_ID[counterB];
           S_name[counterA] = fir_NAME[counterB];
           counterA++;
           counterB++;  
       }
       else{
           S_id[counterA] = sec_ID[counterC];
           S_name[counterA] = sec_NAME[counterC];
           counterA++;
           counterC++;
       }
       }
       }
      while(counterB<fir_ID.length){
      S_id[counterA] = fir_ID[counterB];
      S_name[counterA] = fir_NAME[counterB];
      counterA++;
      counterB++;
      } 
      
      while(counterC<sec_ID.length){
      S_id[counterA] = sec_ID[counterC];
      S_name[counterA] = sec_NAME[counterC];
      counterA++;
      counterC++;
      } 
        
    }
    
    private void mer_name(int[] fir_ID, int[] sec_ID, String[] fir_NAME, String[] sec_NAME, int[] S_id, String[] S_name, boolean byAsc) {
        int counterA = 0;
       int counterB  = 0;//counterf
       int counterC = 0;//counters
       
       
       while(counterB < fir_ID.length && counterC < sec_ID.length) {
       if(byAsc){
          if(fir_NAME[counterB].compareTo (sec_NAME[counterC]) < 0 ){
           S_id[counterA] = fir_ID[counterB];
           S_name[counterA] = fir_NAME[counterB];
           counterA++;
           counterB++;
           } 
           else{
           S_id[counterA] = sec_ID[counterC];
           S_name[counterA] = sec_NAME[counterC];
           counterA++;
           counterC++;
           }
       }
       else{
       if(fir_NAME[counterB].compareTo (sec_NAME[counterC])>0){
           S_id[counterA] = fir_ID[counterB];
           S_name[counterA] = fir_NAME[counterB];
           counterA++;
           counterB++;  
       }
       else{
           S_id[counterA] = sec_ID[counterC];
           S_name[counterA] = sec_NAME[counterC];
           counterA++;
           counterC++;
       }
       }
       }
      while(counterB < fir_ID.length){
      S_id[counterA] = fir_ID[counterB];
      S_name[counterA] = fir_NAME[counterB];
      counterA++;
      counterB++;
      } 
      
      while(counterC<sec_ID.length){
      S_id[counterA] = sec_ID[counterC];
      S_name[counterA] = fir_NAME[counterC];
      counterA++;
      counterC++;
      }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Table = new javax.swing.JTable();
        jComboBoxchoosetosort = new javax.swing.JComboBox<>();
        jButtonsortbyID = new javax.swing.JButton();
        jButtonsortbyname = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Merge Sort");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Merge Sort");

        jTable_Table.setAutoCreateRowSorter(true);
        jTable_Table.setBackground(new java.awt.Color(255, 255, 153));
        jTable_Table.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTable_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(12433), "Paurakh "},
                { new Integer(23445), "Anuja "},
                { new Integer(54432), "Ram"},
                { new Integer(87557), "Sita Ram"},
                { new Integer(12343), "Manzil"}
            },
            new String [] {
                "Student's Id", "Student's Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Table.setGridColor(new java.awt.Color(255, 153, 153));
        jTable_Table.setRowHeight(26);
        jTable_Table.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_Table);

        jComboBoxchoosetosort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        jButtonsortbyID.setText("By ID");
        jButtonsortbyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsortbyIDActionPerformed(evt);
            }
        });

        jButtonsortbyname.setText("By Name");
        jButtonsortbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsortbynameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jComboBoxchoosetosort, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonsortbyID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonsortbyname)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxchoosetosort, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsortbyID)
                    .addComponent(jButtonsortbyname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsortbyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsortbyIDActionPerformed
     int size  = jTable_Table.getRowCount();
     int[] S_id = (int[])getT_Datas(size).get(0);
     String[] S_name = (String[])getT_Datas(size).get(1);
     
     sort(S_id,S_name,size,jComboBoxchoosetosort.getSelectedIndex()==0,true);
     setT_DATAS(size,S_id,S_name);
    }//GEN-LAST:event_jButtonsortbyIDActionPerformed

    private void jButtonsortbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsortbynameActionPerformed
        // TODO add your handling code here:
        int size  = jTable_Table.getRowCount();
        int[] S_id = (int[])getT_Datas(size).get(0);
        String[] S_name = (String[])getT_Datas(size).get(1);
        sort(S_id,S_name,size,jComboBoxchoosetosort.getSelectedIndex()==1,true);
        setT_DATAS(size,S_id,S_name);
    }//GEN-LAST:event_jButtonsortbynameActionPerformed


    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mergeSortFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonsortbyID;
    private javax.swing.JButton jButtonsortbyname;
    private javax.swing.JComboBox<String> jComboBoxchoosetosort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Table;
    // End of variables declaration//GEN-END:variables

    
}
