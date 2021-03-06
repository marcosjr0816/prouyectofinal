/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Computadores;
import clases.Helper;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author rmorales1
 */
public class Agregar extends javax.swing.JDialog {

    /**
     * Creates new form Agregar
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Computadores> computadores;
    int aux = 0;

    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JButton botonesH[] = {cmdCancelar, cmdBuscar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        ruta = "src/datos/computadores.txt";
        try {
            computadores = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Helper.volcado(salida, computadores);
        Helper.llenarTabla(tblTablaComputadores, ruta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDiscoduro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        cmbSistema = new javax.swing.JComboBox<>();
        cmdTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaComputadores = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477426732_floppy.png"))); // NOI18N
        cmdGuardar.setContentAreaFilled(false);
        cmdGuardar.setFocusPainted(false);
        cmdGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477426736_floppy.png"))); // NOI18N
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 100, -1));

        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427251_free-27.png"))); // NOI18N
        cmdEliminar.setContentAreaFilled(false);
        cmdEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427253_free-27.png"))); // NOI18N
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 100, -1));

        cmdLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427345_edit-clear.png"))); // NOI18N
        cmdLimpiar.setContentAreaFilled(false);
        cmdLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427346_edit-clear.png"))); // NOI18N
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031573_Log Out.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031574_Log Out.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 110, 30));

        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031465_search.png"))); // NOI18N
        cmdBuscar.setContentAreaFilled(false);
        cmdBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031466_search.png"))); // NOI18N
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 60, 30));

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427499_Cancel.png"))); // NOI18N
        cmdCancelar.setContentAreaFilled(false);
        cmdCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427501_Cancel.png"))); // NOI18N
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 80, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Procesador:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));

        txtProcesador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProcesador.setOpaque(false);
        jPanel2.add(txtProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Discoduro:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        txtDiscoduro.setOpaque(false);
        txtDiscoduro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiscoduroFocusLost(evt);
            }
        });
        txtDiscoduro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscoduroKeyTyped(evt);
            }
        });
        jPanel2.add(txtDiscoduro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 20));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dell", "HP", "PCsmart", "Sony" }));
        cmbMarca.setOpaque(false);
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        txtColor.setOpaque(false);
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 120, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pantalla :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtPantalla.setOpaque(false);
        txtPantalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPantallaFocusLost(evt);
            }
        });
        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });
        jPanel2.add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sis.Operativo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ram :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtRam.setOpaque(false);
        txtRam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRamFocusLost(evt);
            }
        });
        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });
        jPanel2.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, -1));

        cmbSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linux", "Ubuntu", "Windows 7", "Windows 8", "Windows 8.1", "Windows 10", " " }));
        jPanel2.add(cmbSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        cmdTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portatil", "Mesa" }));
        cmdTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTipoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtCodigo.setOpaque(false);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantidad:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtCantidad.setOpaque(false);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));

        txtPrecio.setOpaque(false);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 410, 210));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaComputadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Procesador", "Discoduro", "Pantalla", "Ram", "Tipo", "Marca", "Color", "Precio", "Sistema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaComputadores.setOpaque(false);
        tblTablaComputadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaComputadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaComputadores);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 780, 230));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AGREGAR COMPUTADORES");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/obr (1).png"))); // NOI18N
        jLabel14.setText("jLabel4");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 500, 360));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpapers.JPG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(801, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String codigo, cantidad, procesador, discoduro, pantalla, marca, sistema, tipo, precio, color, ram;
        codigo = txtCodigo.getText();
        cantidad = txtCantidad.getText();
        procesador = txtProcesador.getText();
        precio = txtPrecio.getText();
        discoduro = txtDiscoduro.getText();
        color = txtColor.getText();

        pantalla = txtPantalla.getText();
        ram = txtRam.getText();
        sistema = cmbSistema.getSelectedItem().toString();
        marca = cmbMarca.getSelectedItem().toString();
        tipo = cmdTipo.getSelectedItem().toString();

        if (txtCodigo.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  el Codigo del computador", 3);
            txtCodigo.requestFocusInWindow();
        }
        if (txtCantidad.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  la cantidad de Computadores", 3);
            txtCantidad.requestFocusInWindow();
        }
        if (txtProcesador.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  la serie del procesador", 3);
            txtProcesador.requestFocusInWindow();
        }
        if (txtPrecio.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  el precio del Computador", 3);
            txtPrecio.requestFocusInWindow();
        }
        if (txtDiscoduro.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  la capacidad del Discoduro", 3);
            txtDiscoduro.requestFocusInWindow();
        }
        if (txtColor.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  el color del Computador", 3);
            txtColor.requestFocusInWindow();
        }
        if (txtPantalla.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  el tamaño de la pantalla ", 3);
            txtPantalla.requestFocusInWindow();

        }
        if (txtRam.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite  la capacidad de la Ram", 3);
            txtRam.requestFocusInWindow();
        } else {
            ArrayList<Computadores> computadoresModificado;
            try {
                if (aux == 0) {
                    Computadores p = new Computadores(codigo, cantidad, procesador, discoduro, pantalla, marca, sistema, tipo, precio, color, ram);

                    p.guardar(salida);
                } else {
                    computadoresModificado = Helper.modificaComputadores(ruta, codigo, cantidad, procesador, discoduro, pantalla, marca, sistema, tipo, precio, color, ram);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.volcado(salida, computadoresModificado);
                    aux = 0;
                    Helper.mensaje(this, "Computador Actualizado Correctamente!", 1);
                }
            } catch (IOException ex) {
                Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.llenarTabla(tblTablaComputadores, ruta);
            txtCodigo.setText("");
            txtCantidad.setText("");
            txtProcesador.setText("");
            txtPrecio.setText("");
            txtDiscoduro.setText("");
            txtColor.setText("");

            txtPantalla.setText("");
            txtRam.setText("");
            cmbSistema.setSelectedIndex(0);
            cmbMarca.setSelectedIndex(0);
            cmdTipo.setSelectedIndex(0);
            txtCodigo.requestFocusInWindow();

            JButton botonesH[] = {cmdCancelar, cmdBuscar};
            JButton botonesD[] = {cmdEliminar, cmdGuardar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtProcesador.setText("");
        txtPrecio.setText("");
        txtDiscoduro.setText("");
        txtColor.setText("");
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtPantalla.setText("");
        txtRam.setText("");
        cmbSistema.setSelectedIndex(0);
        cmbMarca.setSelectedIndex(0);
        cmdTipo.setSelectedIndex(0);
        txtCodigo.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void tblTablaComputadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaComputadoresMouseClicked
        int i;
        Computadores c;
        ArrayList<Computadores> computadores = Helper.traerDatos(ruta);
        i = tblTablaComputadores.getSelectedRow();

        c = computadores.get(i);
        txtCodigo.setText(c.getCodigo());
        txtCantidad.setText(c.getCantidad());
        txtProcesador.setText(c.getProcesador());
        txtPrecio.setText(c.getPrecio());
        txtDiscoduro.setText(c.getDiscoduro());
        txtDiscoduro.setText(c.getDiscoduro());
        txtColor.setText(c.getColor());

        txtPantalla.setText(c.getPantalla());
        txtRam.setText(c.getRam());
        cmbSistema.setSelectedItem(c.getSistema());
        cmdTipo.setSelectedItem(c.getTipo());

        cmbMarca.setSelectedItem(c.getMarca());
        JButton botonesH[] = {cmdEliminar};

        Helper.habilitarBotones(botonesH);
    }//GEN-LAST:event_tblTablaComputadoresMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a este computador ?", "Eliminar", JOptionPane.YES_NO_OPTION);

        ArrayList<Computadores> computadores = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaComputadores.getSelectedRow();
            computadores.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agregar.class
                        .getName()).log(Level.SEVERE, null, ex);

            } catch (IOException ex) {
                Logger.getLogger(Agregar.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, computadores);
            Helper.llenarTabla(tblTablaComputadores, ruta);
            txtProcesador.setText("");
            txtPrecio.setText("");
            txtDiscoduro.setText("");
            txtColor.setText("");
            txtCantidad.setText("");
            txtCodigo.setText("");
            txtPantalla.setText("");
            txtRam.setText("");
            cmbSistema.setSelectedIndex(0);
            cmbMarca.setSelectedIndex(0);
            cmdTipo.setSelectedIndex(0);
            txtProcesador.requestFocusInWindow();

            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdEliminar, cmdGuardar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmdTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdTipoActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        // TODO add your handling code here:
        String codigo;
        codigo = txtCodigo.getText();
        Computadores p;

        if (txtCodigo.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero del Codigo", 3);
            txtCodigo.requestFocusInWindow();
        } else {

            if (Helper.buscarComputadores(codigo, ruta)) {
                p = Helper.traerComputadores(codigo, ruta);
                txtCodigo.setText(p.getCodigo());
                txtProcesador.setText(p.getProcesador());
                txtPrecio.setText(p.getPrecio());
                txtDiscoduro.setText(p.getDiscoduro());
                txtPantalla.setText(p.getPantalla());
                txtRam.setText(p.getRam());
                txtCantidad.setText(p.getCantidad());
                txtColor.setText(p.getColor());
                aux = 1;
            } else {
                txtCodigo.requestFocusInWindow();
                aux = 0;
            }
            JButton botonesH[] = {cmdGuardar, cmdCancelar};
            JButton botonesD[] = {cmdBuscar, cmdEliminar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }

    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtProcesador.setText("");
        txtPrecio.setText("");
        txtDiscoduro.setText("");
        txtColor.setText("");
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtPantalla.setText("");
        txtRam.setText("");
        cmbSistema.setSelectedIndex(0);
        cmbMarca.setSelectedIndex(0);
        cmdTipo.setSelectedIndex(0);
        txtProcesador.requestFocusInWindow();
        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }

    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtRamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRamFocusLost
        String ram, cadena;

        ram = txtRam.getText();
        cadena = ram + " " + "GB";
        txtRam.setText(cadena);
    }//GEN-LAST:event_txtRamFocusLost

    private void txtDiscoduroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiscoduroFocusLost
        String discoduro, cadena;

        discoduro = txtDiscoduro.getText();
        cadena = discoduro + " " + "GB";
        txtDiscoduro.setText(cadena);
    }//GEN-LAST:event_txtDiscoduroFocusLost

    private void txtDiscoduroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscoduroKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtDiscoduroKeyTyped

    private void txtPantallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPantallaFocusLost
        String pantalla, cadena;

        pantalla = txtPantalla.getText();
        cadena = pantalla + " " + "P";
        txtPantalla.setText(cadena);        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaFocusLost

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        // TODO add your handling code here: char c = evt.getKeyChar();
 char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPantallaKeyTyped

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
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox<String> cmbSistema;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JComboBox<String> cmdTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTablaComputadores;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDiscoduro;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    // End of variables declaration//GEN-END:variables
}
