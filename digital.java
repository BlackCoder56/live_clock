
package clock2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class digital extends javax.swing.JFrame implements Runnable{
    
    int hour,second,minute;

    
    public digital() {
        initComponents();
        
        Thread t = new Thread(this);
        t.start();
        
    }
  String time12;  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rr = new javax.swing.JLabel();
        f12 = new javax.swing.JLabel();
        f24 = new javax.swing.JLabel();
        rrr = new javax.swing.JLabel();
        rr1 = new javax.swing.JLabel();
        dayf = new javax.swing.JLabel();
        rr2 = new javax.swing.JLabel();
        datef = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rr.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        rr.setText("Time(12hrs)");

        f12.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        f12.setText("jLabel1");

        f24.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        f24.setText("jLabel1");

        rrr.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        rrr.setText("Time(24hrs)");

        rr1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        rr1.setText("Day of the WK");

        dayf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        dayf.setText("jLabel1");

        rr2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        rr2.setText("Date");

        datef.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        datef.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rr)
                    .addComponent(rr1)
                    .addComponent(rr2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f24, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datef, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(rrr)
                    .addContainerGap(387, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(f24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f12)
                    .addComponent(rr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayf)
                    .addComponent(rr1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datef)
                    .addComponent(rr2))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(rrr)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new digital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datef;
    private javax.swing.JLabel dayf;
    private javax.swing.JLabel f12;
    private javax.swing.JLabel f24;
    private javax.swing.JLabel rr;
    private javax.swing.JLabel rr1;
    private javax.swing.JLabel rr2;
    private javax.swing.JLabel rrr;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minute = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);
            
            
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss");
            
            Date dat = cal.getTime();
            String time24 = sdf24.format(dat);
           
            f24.setText(time24);
            
            
            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ss aa");
           
            time12 = sdf12.format(dat);
            f12.setText(time12);
            
            SimpleDateFormat day = new SimpleDateFormat("EEEE");// single capital E for shortform of the day name
            String storeDay = day.format(dat);
            dayf.setText(storeDay);
            
            SimpleDateFormat datee = new SimpleDateFormat("MMMMM dd, yyyy");//for full name of month use MMMMM. for digit month use MM
            String storeDate = datee.format(dat);
            datef.setText(storeDate);
            
            
        }
    }
}
