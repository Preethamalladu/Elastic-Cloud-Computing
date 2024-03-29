/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import elasticcomputing.Elasticcomputing;
import elasticcomputing.server;
import elasticcomputing.Request;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imperio2494
 */

public class elasticComputingUI extends javax.swing.JFrame {
    private Elasticcomputing dispatcher;
    private int requestrate;
    private int timespan;
    public boolean exit=false;
    
    /**
     * Creates new form elasticComputingUI
     */
    
    public elasticComputingUI() {
        initComponents();
        Elasticcomputing dispatcher; 
//        dispatcher.start();
        Timer timer = new Timer(100, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.print("pop123");
            
            populateTable();
//           
        }
}       );

        timer.setDelay(100); // delay for 30 seconds
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpane = new javax.swing.JSplitPane();
        rightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        threadStatusTbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        totalServers = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maxServer = new javax.swing.JTextField();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        requestRateTb = new javax.swing.JTextField();
        serverCptyTB = new javax.swing.JTextField();
        processTimeTB = new javax.swing.JTextField();
        beginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        timeSpanTB = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitpane.setDividerLocation(160);

        threadStatusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "requestId", "Service", "Processing Time", "Pending Requests in Queue", "Average Processing Time"
            }
        ));
        jScrollPane1.setViewportView(threadStatusTbl);

        jLabel5.setText("Total Servers spawned : ");

        totalServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalServersActionPerformed(evt);
            }
        });

        jLabel6.setText("Maximum Server at Highest Load :");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServers, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(maxServer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalServers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(maxServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitpane.setRightComponent(rightPanel);

        jLabel1.setText("Request Rate(requests/sec)");

        jLabel2.setText("server request capacity");

        jLabel3.setText("server processing time");

        beginBtn.setText("Begin");
        beginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("timespan");

        jButton1.setText("Stop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(requestRateTb, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(serverCptyTB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(processTimeTB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beginBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                    .addComponent(jLabel4)
                    .addComponent(timeSpanTB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestRateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeSpanTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(serverCptyTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(processTimeTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(beginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        splitpane.setLeftComponent(leftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginBtnActionPerformed
        // TODO add your handling code here:
         dispatcher= new Elasticcomputing();
        dispatcher.start();
        dispatcher.exit = false;
        
        this.exit = false;
        Request.count = 1;
        server.count = 1;
        int requestrate=Integer.parseInt(requestRateTb.getText());
        int serverCapacity=Integer.parseInt(serverCptyTB.getText());
        int processingTime=Integer.parseInt(processTimeTB.getText());
        int timespan=Integer.parseInt(timeSpanTB.getText());
        this.timespan = timespan;
        this.requestrate = requestrate;
        
        dispatcher.setServerCapacity(serverCapacity);
        dispatcher.setProcessingTime(processingTime);
        
        Thread t1 = new Thread(new Runnable() {

        @Override
        public void run() {
        int count=0;
        System.out.println("!!!!!!!!!!!!!!!!");
        for(int k=0;k<timespan;k++){
            for(int l=0;l<requestrate;l++){
                if(exit){}
                else{
                try {
                    Thread.sleep(1000/requestrate);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Elasticcomputing.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispatcher.addtoQ(count);
                count++;}
            }
            
        }
        while(!exit){
            boolean toggle=false;
            List<server> temp = dispatcher.getL();
            for(server i: temp){
                if(!i.qisEmpty()){
                    toggle=true;
                    break;
                }
            }
            if(!toggle){
                totalServers.setText(String.valueOf(dispatcher.gettotalServers()));
                maxServer.setText(String.valueOf(dispatcher.maxservers));
                System.out.println("Total Number of servers -- "+dispatcher.gettotalServers());
                System.out.println("Maximum number of Running servers at highest load -- "+dispatcher.maxservers);
                System.out.println("Done"); 
                break;
            }
           
        
        }
        }
        });  
        t1.start();
        
    }//GEN-LAST:event_beginBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.exit = true;
        List<server> temp = dispatcher.getL();
            for(server i: temp){
                i.stopthread();
            }
        this.dispatcher.stopthread();
        
        DefaultTableModel model = (DefaultTableModel) threadStatusTbl.getModel();
        model.setRowCount(0);
        
//        dispatcher = new Elasticcomputing();
//        dispatcher.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalServersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalServersActionPerformed

    
    
    
    public  void populateTable(){
        if(dispatcher!=null){
         DefaultTableModel model = (DefaultTableModel) threadStatusTbl.getModel();
        model.setRowCount(0);
        HashMap<Integer,List> m = new HashMap<Integer,List>();
        List<Request> requests = dispatcher.getRequest();
//                System.out.print("aaaaaa"+String.valueOf(requests.size()));
        for(int i = requests.size()-1; i>=0; i--){
            Request r = requests.get(i);
            if(r.status.equals("complete")){
                List<Long> ll = r.server.responsetimes;
                long sum = 0;
                int c=0;
                for(Long l:ll){
                    sum+=l;
                    c++;
                }
                if(ll.size()==0){
                    sum=0;
                }
                else{
                sum=sum/c;
                }
                
                
                model.addRow(new Object[]{String.valueOf(r.request_id),String.valueOf(r.server.server_id),String.valueOf(r.response_time), String.valueOf(r.queuesizeafterrequest),String.valueOf(sum)});
            }

        }
        totalServers.setText(String.valueOf(dispatcher.gettotalServers()));
        maxServer.setText(String.valueOf(dispatcher.maxservers));
        
}
//         System.out.println(new Date());
        
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
            java.util.logging.Logger.getLogger(elasticComputingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elasticComputingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elasticComputingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elasticComputingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elasticComputingUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beginBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField maxServer;
    private javax.swing.JTextField processTimeTB;
    private javax.swing.JTextField requestRateTb;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField serverCptyTB;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JTable threadStatusTbl;
    private javax.swing.JTextField timeSpanTB;
    private javax.swing.JTextField totalServers;
    // End of variables declaration//GEN-END:variables
}
