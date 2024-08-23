/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import OPERACIONES.Operaciones;
import java.awt.Color;

/**
 *
 * @author pc
 */
public class Menu1 extends javax.swing.JFrame {
 
    public Menu1() {
        initComponents(); 
        this.setTitle("hola mundo");
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Operaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bt_op_ventana = new javax.swing.JButton();
        Clima = new javax.swing.JPanel();
        Plantas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Riesgos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        CicloDeAgua1 = new javax.swing.JPanel();
        MenuCiclo = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextPane3 = new javax.swing.JTextPane();
        jTextPane4 = new javax.swing.JTextPane();
        jTextPane5 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jardin = new javax.swing.JPanel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setBackground(new java.awt.Color(0, 153, 102));
        setMaximumSize(new java.awt.Dimension(1050, 1026));
        setName("MenuPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1050, 1026));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1400, 1026));

        Operaciones.setBackground(new java.awt.Color(0, 51, 0));
        Operaciones.setForeground(new java.awt.Color(0, 51, 0));
        Operaciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Operaciones.setPreferredSize(new java.awt.Dimension(1400, 1026));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 0)), "Descripcion.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 18), new java.awt.Color(102, 102, 0))); // NOI18N
        jScrollPane1.setToolTipText("");
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 51, 0));
        jTextPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(153, 102, 0));
        jTextPane1.setText("Una planta ornamental se cultiva y comercializa con propósitos decorativos por sus características estéticas, flores, perfume, frutos o tallos en jardines y diseños paisajísticos, como planta de interior o para flor cortada.");
        jTextPane1.setToolTipText("");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        bt_op_ventana.setBackground(new java.awt.Color(102, 51, 0));
        bt_op_ventana.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        bt_op_ventana.setForeground(new java.awt.Color(153, 255, 153));
        bt_op_ventana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/evolucion.png"))); // NOI18N
        bt_op_ventana.setText("Realizar operacion.");
        bt_op_ventana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_op_ventanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout OperacionesLayout = new javax.swing.GroupLayout(Operaciones);
        Operaciones.setLayout(OperacionesLayout);
        OperacionesLayout.setHorizontalGroup(
            OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_op_ventana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );
        OperacionesLayout.setVerticalGroup(
            OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperacionesLayout.createSequentialGroup()
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(bt_op_ventana)))
                .addContainerGap(649, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Operaciones); // NOI18N

        Clima.setBackground(new java.awt.Color(0, 51, 0));
        Clima.setPreferredSize(new java.awt.Dimension(1400, 1026));

        javax.swing.GroupLayout ClimaLayout = new javax.swing.GroupLayout(Clima);
        Clima.setLayout(ClimaLayout);
        ClimaLayout.setHorizontalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        ClimaLayout.setVerticalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        Plantas.setBackground(new java.awt.Color(0, 51, 0));
        Plantas.setPreferredSize(new java.awt.Dimension(1400, 1026));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PlantasLayout = new javax.swing.GroupLayout(Plantas);
        Plantas.setLayout(PlantasLayout);
        PlantasLayout.setHorizontalGroup(
            PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlantasLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        PlantasLayout.setVerticalGroup(
            PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlantasLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(553, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/hoja.png")), Plantas); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1400, 1026));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 51, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(1400, 1026));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recomendaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), jPanel7); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1400, 1026));

        MenuCiclo.setBackground(new java.awt.Color(153, 153, 255));
        MenuCiclo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        MenuCiclo.setForeground(new java.awt.Color(0, 153, 153));
        MenuCiclo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MenuCiclo.setPreferredSize(new java.awt.Dimension(541, 604));

        jPanel6.setBackground(new java.awt.Color(153, 204, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(533, 604));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("¿Que es?");
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jButton1.setText("¿Que es?");
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 730, -1, -1));

        jButton4.setText("¿Que es?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jButton3.setText("¿Que es?");
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/Captura.JPG"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 860));

        MenuCiclo.addTab("tab4", jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 204, 51));
        jPanel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/potabilizacion.jpg"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 430, -1));

        MenuCiclo.addTab("Agua", jPanel8);

        jPanel4.setBackground(new java.awt.Color(153, 204, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(533, 604));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MenuCiclo.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 204, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(533, 604));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/photo_2024-08-22_21-08-52.jpg"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        MenuCiclo.addTab("tab3", jPanel5);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane3.setText("¿Alguna vez te has preguntado de dónde viene el agua que bebemos, la que riega las plantas o la que forma los ríos, lagunas, venas de agua, pozos y cauces? ¡Pues se trata de un recurso renovable que da vida y del cual es un viaje increíble que no para nunca! \n\n");
        jTextPane3.setToolTipText("");
        jTextPane3.setFocusable(false);

        jTextPane4.setEditable(false);
        jTextPane4.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane4.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane4.setText("¿Estás preparado para embarcarte en esta emocionante aventura?\n\nA tu derecha, encontrarás material cuidadosamente elaborado que ofrece información valiosa sobre el ciclo del agua. Descubrirás cómo este proceso no solo beneficia a las plantas, sino también cómo influye en el comportamiento de los ecosistemas.");
        jTextPane4.setToolTipText("");
        jTextPane4.setFocusable(false);

        jTextPane5.setEditable(false);
        jTextPane5.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane5.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane5.setText("\nImagina un gran circuito (sistema ecológico) o propiamente un sistema de la naturaleza donde el agua cambia constantemente de estado, pasando de líquido a gaseoso y de gaseoso a líquido, en un ciclo sin fin. ¡Este es el ciclo del agua! \n\nEn este viaje, descubriremos cómo el sol, la gravedad y la temperatura juegan un papel fundamental, y cómo este ciclo es esencial para la vida en la Tierra, además te proporcionaremos información para aprovechar al máximo este ciclo de agua para tus plantas, y de que manera lo puedes emplear. \n\n");
        jTextPane5.setToolTipText("");
        jTextPane5.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin3.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/32.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N

        javax.swing.GroupLayout CicloDeAgua1Layout = new javax.swing.GroupLayout(CicloDeAgua1);
        CicloDeAgua1.setLayout(CicloDeAgua1Layout);
        CicloDeAgua1Layout.setHorizontalGroup(
            CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CicloDeAgua1Layout.createSequentialGroup()
                .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addComponent(jLabel7)
                    .addContainerGap(612, Short.MAX_VALUE)))
        );
        CicloDeAgua1Layout.setVerticalGroup(
            CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CicloDeAgua1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(MenuCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(CicloDeAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CicloDeAgua1Layout.createSequentialGroup()
                    .addContainerGap(687, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(83, 83, 83)))
        );

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        Jardin.setBackground(new java.awt.Color(0, 51, 0));
        Jardin.setPreferredSize(new java.awt.Dimension(1400, 1026));

        javax.swing.GroupLayout JardinLayout = new javax.swing.GroupLayout(Jardin);
        Jardin.setLayout(JardinLayout);
        JardinLayout.setHorizontalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        JardinLayout.setVerticalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jardin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_op_ventanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_op_ventanaMouseClicked

        Operaciones btop = new Operaciones();
        btop.setVisible(true); 
    }//GEN-LAST:event_bt_op_ventanaMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CicloDeAgua1;
    private javax.swing.JPanel Clima;
    private javax.swing.JPanel Jardin;
    private javax.swing.JTabbedPane MenuCiclo;
    private javax.swing.JPanel Operaciones;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JButton bt_op_ventana;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration//GEN-END:variables
}
