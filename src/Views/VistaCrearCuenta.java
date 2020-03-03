/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import javax.swing.Action;
import javax.swing.JPasswordField;
import prueba.Persona;
import prueba.registro;

/**
 *
 * @author olive
 */
public class VistaCrearCuenta extends javax.swing.JDialog {
    
    //variable de la contencion de los numeros randon de la terjeta
    int SecionT1, SecionT2, SecionT3;
    //instancia de la clase Persona
    Persona p = new Persona();
    //instancia de la conexion de la conexion ala base de datos
    registro db = new registro();
   
    
    
    /**
     * Creates new form VistaCrearCuenta
     */
    public VistaCrearCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jButton1 = new javax.swing.JButton();
        TextNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextAMaterno = new javax.swing.JTextField();
        TextAPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextMes = new javax.swing.JTextField();
        TextAño = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextTarjeta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TextFondo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Texttutor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TextNCliente = new javax.swing.JTextField();
        btnGNT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        CNip = new javax.swing.JTextField();
        Nip = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Cuenta");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setUndecorated(true);

        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextNombre.setHighlighter(null);
        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });
        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombreKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Apellido Paterno");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Apellido Materno");

        TextAMaterno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextAMaterno.setHighlighter(null);
        TextAMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAMaternoActionPerformed(evt);
            }
        });

        TextAPaterno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextAPaterno.setHighlighter(null);
        TextAPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAPaternoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel4.setText("Datos de tarjesta ");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 40)); // NOI18N
        jLabel5.setText("Crear Cuenta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Día");

        TextDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextDia.setHighlighter(null);
        TextDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDiaActionPerformed(evt);
            }
        });
        TextDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextDiaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Año");

        TextMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextMes.setHighlighter(null);
        TextMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMesActionPerformed(evt);
            }
        });
        TextMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextMesKeyTyped(evt);
            }
        });

        TextAño.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextAño.setHighlighter(null);
        TextAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAñoActionPerformed(evt);
            }
        });
        TextAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextAñoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Mes");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel10.setText("Datos Personales");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Venus Rising", 1, 12)); // NOI18N
        jTextField7.setText("17-59");
        jTextField7.setHighlighter(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Numero de tarjeta");

        TextTarjeta.setEditable(false);
        TextTarjeta.setFont(new java.awt.Font("Venus Rising", 1, 12)); // NOI18N
        TextTarjeta.setHighlighter(null);
        TextTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTarjetaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Nip");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Fondo Inicial");

        TextFondo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFondo.setHighlighter(null);
        TextFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFondoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Nombre del Tutor");

        Texttutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Texttutor.setHighlighter(null);
        Texttutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexttutorActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Numero de Cliente");

        TextNCliente.setEditable(false);
        TextNCliente.setFont(new java.awt.Font("Venus Rising", 1, 12)); // NOI18N
        TextNCliente.setHighlighter(null);
        TextNCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNClienteActionPerformed(evt);
            }
        });

        btnGNT.setText("Generar");
        btnGNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGNTActionPerformed(evt);
            }
        });

        jButton3.setText("Generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Confirmar Nip");

        CNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNipActionPerformed(evt);
            }
        });
        CNip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CNipKeyTyped(evt);
            }
        });

        Nip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NipActionPerformed(evt);
            }
        });
        Nip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NipKeyTyped(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 0, 0));
        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(TextAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(TextAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(TextMes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(TextAño, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(TextNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel11)
                        .addGap(618, 618, 618)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(TextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnGNT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404)
                        .addComponent(Texttutor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel12)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Nip, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(CNip, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(TextFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TextNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton3)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGNT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Texttutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nip, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(TextFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TexttutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexttutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexttutorActionPerformed

    private void TextAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAñoActionPerformed

    private void TextMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMesActionPerformed

    private void TextFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFondoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFondoActionPerformed

    private void TextDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDiaActionPerformed

    private void TextTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTarjetaActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void TextAPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAPaternoActionPerformed

    private void TextAMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAMaternoActionPerformed

    private void TextNClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNClienteActionPerformed

    private void btnGNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGNTActionPerformed
        
       //generar los 12 numeros faltantes de la terjeta
        SecionT1  = (int)(Math.random()*(9999-1000+1)+1000);
        SecionT2 = (int)(Math.random()*(9999-1000+1)+1000);
        SecionT3 = (int)(Math.random()*(9999-1000+1)+1000);
        TextTarjeta.setText(SecionT1+" - "+SecionT2+" - "+SecionT3);
    }//GEN-LAST:event_btnGNTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int NCliente; //variable que almasena el nuemro de cliente
        //Gnerar nuemro de cliente
        NCliente = (int)(Math.random()*(9999-1000+1)+1000);
       TextNCliente.setText(Integer.toString(NCliente));
    }//GEN-LAST:event_jButton3ActionPerformed
        //Boton que Alacenara los campos en la base de datos 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //Almacenamos los datos de los campos en las siguientes varibes 
        String nnombre = TextNombre.getText();
        String nApellidoP = TextAPaterno.getText();
        String nApellidoM = TextAMaterno.getText();
        int ndia = Integer.parseInt(TextDia.getText());
        int nmes = Integer.parseInt(TextMes.getText());
        int anio = Integer.parseInt(TextAño.getText());
        int ncliente = Integer.parseInt(TextNCliente.getText());
        String ntarjeta = TextTarjeta.getText();
        String ntutor = Texttutor.getText();
        String nnip = CNip.getText();
        int fondo = Integer.parseInt(TextFondo.getText());
        
        /*Utilizacion de la instancia de la clase Persona
           para la signacion de los balores*/
        
        p.setId(ncliente);
        p.setNombreP(nnombre);
        p.setApellidoP(nApellidoP);
        p.setApellidoM(nApellidoM);
        p.setDia(ndia);
        p.setMes(nmes);
        p.setAño(anio);
        p.setNTJ(ntarjeta);
        p.setTutor(ntutor);
        p.setNip(nnip);
        p.setFondoIn(fondo);
        
        //Metodo que inserta los valores a la base de datos
        db.insertarRegistro(p);
        
        //Limpiador de los campos
        
        TextNombre.setText(null);
        TextAPaterno.setText(null);
        TextAMaterno.setText(null);
        TextDia.setText(null);
        TextMes.setText(null);
        TextAño.setText(null);
        TextNCliente.setText(null);
        TextTarjeta.setText(null);
        Nip.setText(null);
        CNip.setText(null);
        Texttutor.setText(null);
        TextFondo.setText(null);
        
        System.out.println(db.selecionarPersona(p));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyTyped
        //Funcio que erra que la caja de texto solo admita letras 
        
        
    }//GEN-LAST:event_TextNombreKeyTyped

    private void CNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNipActionPerformed

    private void NipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NipActionPerformed

    private void NipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NipKeyTyped
        //Validacion para no se introduscan mas de cuatro numeros para el nip
        
        if(Nip.getText().length() >=4){
            evt.consume();
        }
    }//GEN-LAST:event_NipKeyTyped

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void CNipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNipKeyTyped
         //Validacion para no se introduscan mas de cuatro numeros para el nip
        
        if(CNip.getText().length() >=4){
            evt.consume();
        }
    }//GEN-LAST:event_CNipKeyTyped

    private void TextDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextDiaKeyTyped
        //Validacion para no se instroduscan mas de dos numeros para los dias
        
        if(TextDia.getText().length() >=2){
            evt.consume();
        }
    }//GEN-LAST:event_TextDiaKeyTyped

    private void TextMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextMesKeyTyped
        //Validacion para no se introduscan mas de dos numeros para el mes
        
        if(TextMes.getText().length() >=2){
            evt.consume();
        }
    }//GEN-LAST:event_TextMesKeyTyped

    private void TextAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAñoKeyTyped
         //Validacion para no se introduscan mas de cuatro numeros para el año
        
        if(TextAño.getText().length() >=4){
            evt.consume();
        }
    }//GEN-LAST:event_TextAñoKeyTyped

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
            java.util.logging.Logger.getLogger(VistaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaCrearCuenta dialog = new VistaCrearCuenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNip;
    private javax.swing.JTextField Nip;
    private javax.swing.JTextField TextAMaterno;
    private javax.swing.JTextField TextAPaterno;
    private javax.swing.JTextField TextAño;
    private javax.swing.JTextField TextDia;
    private javax.swing.JTextField TextFondo;
    private javax.swing.JTextField TextMes;
    private javax.swing.JTextField TextNCliente;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTarjeta;
    private javax.swing.JTextField Texttutor;
    private javax.swing.JButton btnGNT;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTextField jTextField7;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    private Action close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
