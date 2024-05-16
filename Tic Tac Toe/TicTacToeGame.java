
    /* TIC TAC TOE GAME BY RUTUJA */

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;


public class TicTacToeGame extends JFrame {

    JFrame f;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    public TicTacToeGame(){
        initComponents();
        addAction();
    }

    public void winEffect(JButton b1, JButton b2, JButton b3)
    {
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        
        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        
        String msg = b1.getText() + " Is The Winner";
        jLabelMSG.setText(msg);
        
    }
    
    boolean win = false;
    public void getTheWinner(){
        
        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton2.getText()) && jButton1.getText().equals(jButton3.getText())){
            winEffect(jButton1, jButton2, jButton3);
            win = true;
        }
        
        if(!jButton4.getText().equals("") && jButton4.getText().equals(jButton5.getText()) && jButton4.getText().equals(jButton6.getText())){
            winEffect(jButton4, jButton5, jButton6);
            win = true;
        }
        
        if(!jButton7.getText().equals("") && jButton7.getText().equals(jButton8.getText()) && jButton7.getText().equals(jButton9.getText())){
            winEffect(jButton7, jButton8, jButton9);
            win = true;
        }
        
        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton4.getText()) && jButton1.getText().equals(jButton7.getText())){
            winEffect(jButton1, jButton4, jButton7);
            win = true;
        }
        
        if(!jButton2.getText().equals("") && jButton2.getText().equals(jButton5.getText()) && jButton2.getText().equals(jButton8.getText())){
           winEffect(jButton2, jButton5, jButton8);
           win = true;
        }
        
        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton6.getText()) && jButton3.getText().equals(jButton9.getText())){
            winEffect(jButton3, jButton6, jButton9);
            win = true;
        }
        
        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton5.getText()) && jButton1.getText().equals(jButton9.getText())){
            winEffect(jButton1, jButton5, jButton9);
            win = true;
        }
        
        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton5.getText()) && jButton3.getText().equals(jButton7.getText())){
            winEffect(jButton3, jButton5, jButton7);
            win = true;
        }
        
        else if(allButtonsTextLength() == 9 && win == false){
            jLabelMSG.setText("No One Win");
        }
    }
    
    // if no one win
    public int allButtonsTextLength(){
        
        // all buttons text length mean if 
        // all buttons text length = 9
        // all buttons with text on them

        String txt = "";
        
        Component[] comps = jPanel1.getComponents();
        
        for(Component comp : comps){
            if(comp instanceof JButton){
                JButton button = (JButton)comp;
                 txt = txt + button.getText();
            }
        }
        return txt.length();
    }
    
    
    // create action
    // x_or_o => to display X or O
    int x_or_o = 0;
    
    public ActionListener createAction(JButton button)
    {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if(button.getText().equals("")){
                    if((x_or_o % 2) == 0)
                        {
                            button.setText("X");
                            button.setForeground(Color.BLUE);
                           jLabelMSG.setText("O turn now");
                            getTheWinner();
                        }else{
                            button.setText("O");
                            button.setForeground(Color.RED);
                            jLabelMSG.setText("X turn now");
                            getTheWinner();
                        }

                          x_or_o ++;
                }
                
            }
            
        };
        return al;
    }      
    
    // function to add action to the buttons
    public void addAction(){
        
        Component[] comps = jPanel1.getComponents();
        
        for(Component comp : comps){
            if(comp instanceof JButton){
                JButton button = (JButton)comp;
                button.addActionListener(createAction(button));
            }
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMSG = new javax.swing.JLabel();
        jButtonReplay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(Color.PINK);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30));
        jButton1.setBorder(null);

        jButton2.setBackground(Color.PINK);
        jButton2.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton2.setBorder(null);

        jButton3.setBackground(Color.PINK);
        jButton3.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton3.setBorder(null);

        jButton4.setBackground(Color.PINK);
        jButton4.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton4.setBorder(null);

        jButton5.setBackground(Color.PINK);
        jButton5.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton5.setBorder(null);

        jButton6.setBackground(Color.PINK);
        jButton6.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton6.setBorder(null);

        jButton7.setBackground(Color.PINK);
        jButton7.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton7.setBorder(null);

        jButton8.setBackground(Color.PINK);
        jButton8.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton8.setBorder(null);

        jButton9.setBackground(Color.PINK);
        jButton9.setFont(new java.awt.Font("Sarif", 1, 30));
        jButton9.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(Color.ORANGE);

        jLabelMSG.setFont(new java.awt.Font("Sarif", 1, 24)); // NOI18N
        jLabelMSG.setForeground(Color.darkGray);
        jLabelMSG.setText("Play");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMSG, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMSG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jButtonReplay.setBackground(Color.BLUE);
        jButtonReplay.setFont(new java.awt.Font("Sarif", 0, 24)); // NOI18N
        jButtonReplay.setForeground(Color.CYAN);
        jButtonReplay.setText("Replay");
        jButtonReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReplay, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();

    }// </editor-fold>                        

    private void jButtonReplayActionPerformed(java.awt.event.ActionEvent evt) {                         
        win = false;        
        Component[] comps = jPanel1.getComponents();
        
        for(Component comp : comps){
            if(comp instanceof JButton){
                JButton button = (JButton)comp;
                button.setText("");
                button.setBackground(Color.WHITE);
                jLabelMSG.setText("Play");
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
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonReplay;
    private javax.swing.JLabel jLabelMSG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
