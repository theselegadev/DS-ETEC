
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }
    
    
    private void Limpa() {
                
        edtCodigo.setText("");
        edtDescricao.setText("");
        edtQuantidade.setText("");
        edtValor.setText("");
        edtTotal.setText("");
    }
    
    
    private void Lista() {
        
        
                try
        {
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/estoque","root",""); 
        
            String sql;
        
            sql="select * from produtos";
        
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
      
            banco.execute(); // cria o vetor
      
            ResultSet resultado = banco.executeQuery(sql);
 
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        
            model.setNumRows(0);
 
            while(resultado.next())
            {
                
                model.addRow(new Object[] 
                { 
                    //retorna os dados da tabela do BD, cada campo e um coluna.
                    resultado.getString("codigo"),
                    resultado.getString("descricao"),
                    resultado.getString("quantidade"),
                    resultado.getString("valor"),
                    resultado.getString("total")
                   }); 
            } 
            banco.close();
            con.close();   
    }        
catch (SQLException ex)
 {
    System.out.println("o erro foi " +ex);
  } 
        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btlSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        edtCodigo = new javax.swing.JTextField();
        edtQuantidade = new javax.swing.JTextField();
        edtTotal = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();

        jLabel1.setText("Total");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(255, 255, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Quantidade", "Valor", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigo.setText("Codigo");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Descrição");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("Quantidade");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("Valor");

        edtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtValorFocusLost(evt);
            }
        });
        edtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtValorActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btlSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btlSalvar.setText("Gravar");
        btlSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        edtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQuantidadeActionPerformed(evt);
            }
        });

        edtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalActionPerformed(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail1.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(4, 4, 4)
                        .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail1)
                        .addGap(13, 13, 13)
                        .addComponent(edtTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addGap(45, 45, 45)
                        .addComponent(btlSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblNome)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btlSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnSair))
                    .addComponent(btnListar))
                .addGap(288, 288, 288))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        
       this.Lista(); 
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        
         int response = JOptionPane.showConfirmDialog(null, "Deseja sair?","Confirmação",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
         if(response == JOptionPane.YES_OPTION){
            System.exit(0);
         }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Deseja Limpar?","Confirmação",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
         if(response == JOptionPane.YES_OPTION){
            this.Limpa();
         }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btlSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSalvarActionPerformed
        // TODO add your handling code here:
       
        int response = JOptionPane.showConfirmDialog(null, "Deseja salvar?","Confirmação",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
         if(response == JOptionPane.YES_OPTION){
            int quantidade = Integer.parseInt(edtQuantidade.getText());
            double valor = Double.parseDouble(edtValor.getText());

            double total = quantidade * valor;

            edtTotal.setText(String.valueOf(total));
            
            try
            {
               Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/estoque","root",""); 
               Statement stmt=(Statement)con.createStatement();

              String insert="INSERT INTO produtos VALUES('"+edtCodigo.getText()+"','"+edtDescricao.getText()+"','"+edtQuantidade.getText()+"','"+edtValor.getText()+"','"+edtTotal.getText()+"');";
              stmt.executeUpdate(insert);



            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);

            }        
     
            
            this.Limpa();
      
        //ActionListener listener = new actionperformclass();
        
            this.Lista();
            
            
        }
     
 
    }//GEN-LAST:event_btlSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(null, "Deseja excluir?","Confirmação",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
         if(response == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getSelectedRow() >= 0){
                 
                try
                {
                    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/estoque","root",""); 
                    Statement stmt=(Statement)con.createStatement();

                    String delete="DELETE FROM produtos WHERE codigo="+
                    jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0)+";";  
                    stmt.executeUpdate(delete);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
                }        

                this.Lista();     
              
            }else{
                JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
            }
        }
   
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void edtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtValorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_edtValorActionPerformed

    private void edtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtValorFocusLost
        // TODO add your handling code here:
        edtValor.setText(edtValor.getText().toLowerCase());
    }//GEN-LAST:event_edtValorFocusLost

    private void edtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQuantidadeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_edtQuantidadeActionPerformed

    private void edtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_edtTotalActionPerformed

       
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlSalvar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
