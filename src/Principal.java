
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/*
 * @author Victor Soares Vilela
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bttInfoFunc.setText("<html><center>Informação<br>Funcional</center></html>");
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        bttDeclara = new javax.swing.JButton();
        bttInfoFunc = new javax.swing.JButton();
        bttDespa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuUltimo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemZerar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de números");

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        bttDeclara.setBackground(new java.awt.Color(153, 0, 0));
        bttDeclara.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bttDeclara.setForeground(new java.awt.Color(255, 255, 255));
        bttDeclara.setText("Declaração");
        bttDeclara.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttDeclara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeclaraActionPerformed(evt);
            }
        });

        bttInfoFunc.setBackground(new java.awt.Color(0, 51, 153));
        bttInfoFunc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bttInfoFunc.setForeground(new java.awt.Color(255, 255, 255));
        bttInfoFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttInfoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInfoFuncActionPerformed(evt);
            }
        });

        bttDespa.setBackground(new java.awt.Color(102, 102, 102));
        bttDespa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bttDespa.setForeground(new java.awt.Color(255, 255, 255));
        bttDespa.setText("Despacho");
        bttDespa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDespaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Desenvolvido por: Victor Soares Vilela                                                          Contato: (62) 98216-4455");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(bttDeclara, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bttInfoFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bttDespa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(bttInfoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(bttDeclara, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(bttDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttInfoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttDeclara, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bttDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jMenu1.setText("Visualizar");

        jMenuUltimo.setText("Últimos números gerados");
        jMenuUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUltimoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuUltimo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItemZerar.setText("Zerar Contadores");
        jMenuItemZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZerarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemZerar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void bttDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDespaActionPerformed
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 20)));
        
        Object[] options = { "Sim", "Não" }; 
        int resposta = JOptionPane.showOptionDialog(null, "Gerar novo número de Despacho?", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 60)));
        
        if(resposta == 0){
        
            String arquivo = "despacho.txt";

            String numero = BD.LerBD(arquivo);

            numero = String.valueOf(Integer.parseInt(numero) + 1);

            BD.EnviarBD(arquivo, numero);

            JOptionPane.showMessageDialog(null, "<html><body><p width='200px' align='center'>"+ numero +"</p></body></html>", "Despacho", JOptionPane.DEFAULT_OPTION, null);
        }
    }//GEN-LAST:event_bttDespaActionPerformed

    private void bttInfoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInfoFuncActionPerformed
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 20)));
        
        Object[] options = { "Sim", "Não" };
        
        int resposta = JOptionPane.showOptionDialog(null, "Gerar novo número de Informação Funcional?", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 60)));
        
        if(resposta == 0){
            String arquivo = "informacao_funcional.txt";

            String numero = BD.LerBD(arquivo);

            numero = String.valueOf(Integer.parseInt(numero) + 1);

            BD.EnviarBD(arquivo, numero);

            JOptionPane.showMessageDialog(null, "<html><body><p width='200px' align='center'>"+ numero +"</p></body></html>", "Informação Funcional", JOptionPane.DEFAULT_OPTION, null);
        }
    }//GEN-LAST:event_bttInfoFuncActionPerformed

    private void bttDeclaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeclaraActionPerformed
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 20)));
        
        Object[] options = { "Sim", "Não" };
        
        int resposta = JOptionPane.showOptionDialog(null, "Gerar novo número de Declaração?", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 60)));
        
        if(resposta == 0){
        
            String arquivo = "declaracao.txt";

            String numero = BD.LerBD(arquivo);

            numero = String.valueOf(Integer.parseInt(numero) + 1);

            BD.EnviarBD(arquivo, numero);

            JOptionPane.showMessageDialog(null, "<html><body><p width='200px' align='center'>"+ numero +"</p></body></html>", "Declaração",  JOptionPane.DEFAULT_OPTION, null);
        }

    }//GEN-LAST:event_bttDeclaraActionPerformed

    private void jMenuItemZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZerarActionPerformed
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 20)));
        String usuario = "";
        String senha = "";
        
        String usuDigitado = JOptionPane.showInputDialog("Digite o Usuário");
        String senhaDigitada = JOptionPane.showInputDialog("Digite o senha");
        
        if (usuario.equals(usuDigitado) && senha.equals(senhaDigitada)){
            
            Object[] options = { "Sim", "Não" };
            int resposta = JOptionPane.showOptionDialog(null, "Deseja zerar os contadores?", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                
            if(resposta == 0){
                String arquivoDec = "declaracao.txt";
                String zerarDec = BD.LerBD(arquivoDec);
                zerarDec = String.valueOf(Integer.parseInt(zerarDec) * 0);
                BD.EnviarBD(arquivoDec, zerarDec);

                String arquivoInf = "informacao_funcional.txt";
                String zerarInf = BD.LerBD(arquivoInf);
                zerarInf = String.valueOf(Integer.parseInt(zerarInf) * 0);
                BD.EnviarBD(arquivoInf, zerarInf);

                String arquivoDes = "despacho.txt";
                String zerarDes = BD.LerBD(arquivoDes);
                zerarDes = String.valueOf(Integer.parseInt(zerarDes) * 0);
                BD.EnviarBD(arquivoDes, zerarDes);

                JOptionPane.showMessageDialog(null, "Contadores zerados com sucesso", "" ,JOptionPane.DEFAULT_OPTION, null);
            }           
            
        } else {
            JOptionPane.showMessageDialog(null, "Dados Incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItemZerarActionPerformed

    private void jMenuUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUltimoActionPerformed
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 30)));
        String arquivoDec = "declaracao.txt";
        String arquivoInf = "informacao_funcional.txt";
        String arquivoDes = "despacho.txt";
                
        String declaracao = BD.LerBD(arquivoDec);
        String informacao = BD.LerBD(arquivoInf);
        String despacho = BD.LerBD(arquivoDes);

        JOptionPane.showMessageDialog(null, "Informação Funcional: "+ informacao + "\nDeclaração: "+ declaracao + "\nDespacho: " + despacho, "Últimos números gerados", JOptionPane.DEFAULT_OPTION, null);
        
    }//GEN-LAST:event_jMenuUltimoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeclara;
    private javax.swing.JButton bttDespa;
    private javax.swing.JButton bttInfoFunc;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemZerar;
    private javax.swing.JMenuItem jMenuUltimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
