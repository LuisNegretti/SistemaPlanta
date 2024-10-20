/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPERACIONES;

import java.awt.Toolkit;
import sistema.planta.Principal;

/**
 * 
 * @author pc
 */
public class Operaciones extends javax.swing.JFrame {
    
    public Operaciones() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        String lista[] = {"hola", "estupe"};
        for(int x = 0; x < lista.length; x++){
            this.cbx_Planta.addItem(lista[x]);
            //Select nombre from plantas
            //Select url from plantas where nombre=nombrecbx
            //planta.getResource("/Imagenes/nombre.png"))
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tipo_planta = new javax.swing.JPanel();
        cbx_Planta = new javax.swing.JComboBox<>();
        tipo_tierra = new javax.swing.JPanel();
        sexoCombo3 = new javax.swing.JComboBox<>();
        lvl_PH = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        cont_mnrl = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        sexoCombo6 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        Plantas = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Guia = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuPricipal = new javax.swing.JMenuItem();
        SalirPrograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane2.addTab("Sala principal.", jPanel1);

        jPanel8.setBackground(new java.awt.Color(0, 51, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(102, 51, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 153, 0));

        tipo_planta.setBackground(new java.awt.Color(102, 51, 0));
        tipo_planta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de planta.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N
        tipo_planta.setFont(new java.awt.Font("Calisto MT", 1, 11)); // NOI18N

        cbx_Planta.setBackground(new java.awt.Color(0, 204, 0));
        cbx_Planta.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        cbx_Planta.setForeground(new java.awt.Color(0, 153, 102));
        cbx_Planta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "mata", "papa" }));
        cbx_Planta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cbx_Planta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_PlantaItemStateChanged(evt);
            }
        });
        cbx_Planta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_PlantaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbx_PlantaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbx_PlantaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_PlantaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbx_PlantaMouseReleased(evt);
            }
        });
        cbx_Planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_PlantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipo_plantaLayout = new javax.swing.GroupLayout(tipo_planta);
        tipo_planta.setLayout(tipo_plantaLayout);
        tipo_plantaLayout.setHorizontalGroup(
            tipo_plantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipo_plantaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbx_Planta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tipo_plantaLayout.setVerticalGroup(
            tipo_plantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipo_plantaLayout.createSequentialGroup()
                .addComponent(cbx_Planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tipo_tierra.setBackground(new java.awt.Color(102, 51, 0));
        tipo_tierra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de tierra.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N

        sexoCombo3.setBackground(new java.awt.Color(102, 51, 0));
        sexoCombo3.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        sexoCombo3.setForeground(new java.awt.Color(255, 255, 255));
        sexoCombo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Negra", "Arena", "Lodo" }));
        sexoCombo3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        sexoCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoCombo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipo_tierraLayout = new javax.swing.GroupLayout(tipo_tierra);
        tipo_tierra.setLayout(tipo_tierraLayout);
        tipo_tierraLayout.setHorizontalGroup(
            tipo_tierraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipo_tierraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sexoCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tipo_tierraLayout.setVerticalGroup(
            tipo_tierraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipo_tierraLayout.createSequentialGroup()
                .addComponent(sexoCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lvl_PH.setBackground(new java.awt.Color(102, 51, 0));
        lvl_PH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nivel de PH.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N
        lvl_PH.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField1.setText("Nivel PH");

        javax.swing.GroupLayout lvl_PHLayout = new javax.swing.GroupLayout(lvl_PH);
        lvl_PH.setLayout(lvl_PHLayout);
        lvl_PHLayout.setHorizontalGroup(
            lvl_PHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lvl_PHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        lvl_PHLayout.setVerticalGroup(
            lvl_PHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lvl_PHLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jTextField1.getAccessibleContext().setAccessibleName("txt_lvl_PH");

        cont_mnrl.setBackground(new java.awt.Color(102, 51, 0));
        cont_mnrl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minerales.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N

        jCheckBox1.setText("Calcio");

        jCheckBox2.setText("nitrogeno");

        jCheckBox3.setText("fosforo");

        jCheckBox4.setText("potasio");

        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setText("jCheckBox6");

        jCheckBox7.setText("jCheckBox7");

        jCheckBox8.setText("jCheckBox8");

        javax.swing.GroupLayout cont_mnrlLayout = new javax.swing.GroupLayout(cont_mnrl);
        cont_mnrl.setLayout(cont_mnrlLayout);
        cont_mnrlLayout.setHorizontalGroup(
            cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mnrlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3))
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox4))
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox8))
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cont_mnrlLayout.setVerticalGroup(
            cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mnrlLayout.createSequentialGroup()
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8)))
        );

        jPanel6.setBackground(new java.awt.Color(102, 51, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de tierra.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N

        sexoCombo6.setBackground(new java.awt.Color(102, 51, 0));
        sexoCombo6.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        sexoCombo6.setForeground(new java.awt.Color(255, 255, 255));
        sexoCombo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Negra", "Arena", "Lodo" }));
        sexoCombo6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        sexoCombo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoCombo6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sexoCombo6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(sexoCombo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cont_mnrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lvl_PH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_planta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tipo_planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lvl_PH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cont_mnrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        lvl_PH.getAccessibleContext().setAccessibleDescription("");
        cont_mnrl.getAccessibleContext().setAccessibleName("Contenido Minerales.");

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 744));

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Valores (Referencias)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 18), new java.awt.Color(102, 51, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel13);

        Plantas.setBackground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout PlantasLayout = new javax.swing.GroupLayout(Plantas);
        Plantas.setLayout(PlantasLayout);
        PlantasLayout.setHorizontalGroup(
            PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        PlantasLayout.setVerticalGroup(
            PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Plantas", Plantas);

        jPanel10.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel10);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jPanel8.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 6, 290, -1));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/evolucion.png"))); // NOI18N
        jButton1.setText("Realizar operacion.");
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 320, -1));

        jTextPane1.setBackground(new java.awt.Color(153, 102, 0));
        jTextPane1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 0, 204));
        jTextPane1.setText("Plantas ");
        jTextPane1.setToolTipText("");
        jPanel8.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 6, 187, 184));

        jTabbedPane2.addTab("Centro de operaciones.", jPanel8);

        Guia.setText("Guia de operaciones.");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0));
        jMenuItem3.setText("¿Como realizar una operacion?");
        jMenuItem3.setActionCommand("¿Como realizar una operacion?");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Guia.add(jMenuItem3);

        jMenuItem4.setText("¿Que debo tener en cuenta?");
        Guia.add(jMenuItem4);

        jMenuBar1.add(Guia);

        jMenu2.setText("Opciones.");

        MenuPricipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        MenuPricipal.setText("Volver al menu principal.");
        MenuPricipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPricipalActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPricipal);

        SalirPrograma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SalirPrograma.setText("Salir del programa.");
        SalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirProgramaActionPerformed(evt);
            }
        });
        jMenu2.add(SalirPrograma);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Operaciones.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_PlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_PlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_PlantaActionPerformed

    private void sexoCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoCombo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoCombo3ActionPerformed

    private void sexoCombo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoCombo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoCombo6ActionPerformed

    private void cbx_PlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseClicked
        //System.out.println(this.cbx_Planta.getSelectedItem().toString());
        
    }//GEN-LAST:event_cbx_PlantaMouseClicked

    private void cbx_PlantaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMousePressed
//
    }//GEN-LAST:event_cbx_PlantaMousePressed

    private void cbx_PlantaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseEntered
//
    }//GEN-LAST:event_cbx_PlantaMouseEntered

    private void cbx_PlantaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseReleased
//
    }//GEN-LAST:event_cbx_PlantaMouseReleased

    private void cbx_PlantaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseExited
//
    }//GEN-LAST:event_cbx_PlantaMouseExited

    private void cbx_PlantaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_PlantaItemStateChanged
      System.out.println(this.cbx_Planta.getSelectedItem().toString() + "state");
    }//GEN-LAST:event_cbx_PlantaItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MenuPricipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPricipalActionPerformed
       Principal acceso = new Principal();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MenuPricipalActionPerformed

    private void SalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirProgramaActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Guia;
    private javax.swing.JMenuItem MenuPricipal;
    private javax.swing.JPanel Plantas;
    private javax.swing.JMenuItem SalirPrograma;
    private javax.swing.JComboBox<String> cbx_Planta;
    private javax.swing.JPanel cont_mnrl;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel lvl_PH;
    private javax.swing.JComboBox<String> sexoCombo3;
    private javax.swing.JComboBox<String> sexoCombo6;
    private javax.swing.JPanel tipo_planta;
    private javax.swing.JPanel tipo_tierra;
    // End of variables declaration//GEN-END:variables
}
