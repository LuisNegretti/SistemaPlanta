/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import CICLODELAGUA.Coleccion;
import CICLODELAGUA.Precipitacion;
import CICLODELAGUA.condensacion;
import CICLODELAGUA.evaporacion;
import OPERACIONES.Operaciones;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author pc
 */
public class Menu1 extends javax.swing.JFrame {
 
    public Menu1() {
        initComponents(); 
        this.setTitle("Menu principal");
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
        Riesgos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Jardin = new javax.swing.JPanel();
        CicloDeAgua1 = new javax.swing.JPanel();
        MenuCiclo = new javax.swing.JTabbedPane();
        consejos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ProcesoPrincipal = new javax.swing.JPanel();
        coleccion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        condensacion = new javax.swing.JButton();
        evaporacion = new javax.swing.JButton();
        precipitacion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Potabilizacion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Plantas = new javax.swing.JPanel();
        jTabbedPaneMargarita = new javax.swing.JTabbedPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPaneIxoras = new javax.swing.JTabbedPane();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jPanel10 = new javax.swing.JPanel();
        Clima = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setBackground(new java.awt.Color(0, 153, 102));
        setName("MenuPrincipal"); // NOI18N
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1064, 800));

        Operaciones.setBackground(new java.awt.Color(0, 51, 0));
        Operaciones.setForeground(new java.awt.Color(0, 51, 0));
        Operaciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Operaciones.setPreferredSize(new java.awt.Dimension(1064, 800));

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
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Operaciones); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 51, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recomendaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), jPanel7); // NOI18N

        Jardin.setBackground(new java.awt.Color(0, 51, 0));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 800));

        javax.swing.GroupLayout JardinLayout = new javax.swing.GroupLayout(Jardin);
        Jardin.setLayout(JardinLayout);
        JardinLayout.setHorizontalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        JardinLayout.setVerticalGroup(
            JardinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 51, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1064, 800));
        CicloDeAgua1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuCiclo.setBackground(new java.awt.Color(204, 255, 204));
        MenuCiclo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        MenuCiclo.setForeground(new java.awt.Color(0, 51, 102));
        MenuCiclo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MenuCiclo.setPreferredSize(new java.awt.Dimension(541, 604));

        consejos.setBackground(new java.awt.Color(0, 51, 153));
        consejos.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        consejos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        consejos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/gato.png"))); // NOI18N
        consejos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas.png"))); // NOI18N
        consejos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 60, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flor.png"))); // NOI18N
        consejos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ES Water_ A Resource for Everyone by Slidesgo2.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 255, 255)));
        jLabel14.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel14.setPreferredSize(new java.awt.Dimension(533, 604));
        consejos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        consejos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        MenuCiclo.addTab("Agua", new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/h2o_3357227.png")), consejos); // NOI18N

        ProcesoPrincipal.setBackground(new java.awt.Color(0, 51, 153));
        ProcesoPrincipal.setName("Principal"); // NOI18N
        ProcesoPrincipal.setPreferredSize(new java.awt.Dimension(533, 604));
        ProcesoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coleccion.setBackground(new java.awt.Color(255, 153, 0));
        coleccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        coleccion.setForeground(new java.awt.Color(153, 153, 0));
        coleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/save-water_7296364.png"))); // NOI18N
        coleccion.setActionCommand("¿Que es la evaporacion?");
        coleccion.setIconTextGap(1);
        coleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coleccionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(coleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 70, 60));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/save-water_7296364.png"))); // NOI18N
        jButton3.setText("Coleccion.");
        jButton3.setActionCommand("¿Que es la evaporacion?");
        jButton3.setIconTextGap(1);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, -1, -1));

        condensacion.setBackground(new java.awt.Color(0, 204, 204));
        condensacion.setForeground(new java.awt.Color(0, 0, 204));
        condensacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-purification_13505860.png"))); // NOI18N
        condensacion.setActionCommand("¿Que es la evaporacion?");
        condensacion.setIconTextGap(1);
        condensacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(condensacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        evaporacion.setBackground(new java.awt.Color(0, 0, 153));
        evaporacion.setForeground(new java.awt.Color(0, 255, 255));
        evaporacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-cycle_525893.png"))); // NOI18N
        evaporacion.setActionCommand("¿Que es la evaporacion?");
        evaporacion.setIconTextGap(1);
        evaporacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaporacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(evaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        precipitacion.setBackground(new java.awt.Color(0, 255, 153));
        precipitacion.setForeground(new java.awt.Color(0, 204, 153));
        precipitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water_5625899.png"))); // NOI18N
        precipitacion.setActionCommand("¿Que es la evaporacion?");
        precipitacion.setIconTextGap(1);
        precipitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precipitacionActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(precipitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/Captura.JPG"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 255, 255)));
        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel9.setPreferredSize(new java.awt.Dimension(533, 604));
        ProcesoPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 450, 510));

        MenuCiclo.addTab("Ciclos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (6).png")), ProcesoPrincipal); // NOI18N

        Potabilizacion.setBackground(new java.awt.Color(0, 51, 153));
        Potabilizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Potabilizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/potabilizacion.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        Potabilizacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 430, 600));

        MenuCiclo.addTab("Potabilizacion", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), Potabilizacion); // NOI18N

        CicloDeAgua1.add(MenuCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 490, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/32.png"))); // NOI18N
        CicloDeAgua1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N
        CicloDeAgua1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N
        CicloDeAgua1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ahorrar-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jScrollPane3.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea2.setTabSize(0);
        jTextArea2.setText("¿Alguna vez te has preguntado de dónde viene\nel agua que bebemos, la que riega las plantas \no la que forma los ríos, lagunas, pozos y cauces? \n¡Pues se trata de un recurso renovable que da vida\n y del cual es un viaje increíble que no para nunca! ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        CicloDeAgua1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 110));

        jScrollPane5.setBorder(null);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea4.setTabSize(0);
        jTextArea4.setText("Imagina un gran circuito (sistema ecológico) \no propiamente un sistema de la naturaleza \ndonde el agua cambia constantemente de \nestado, pasando de líquido a gaseoso \ny de gaseoso a líquido, en un ciclo sin fin. \n¡Este es el ciclo del agua! \n\nEn este viaje, descubriremos cómo el sol, \nla gravedad y la temperatura juegan un papel \nfundamental, y cómo este ciclo es esencial \npara la vida en la Tierra, además viene\nincluida la información para aprovechar \nal máximo este ciclo de agua para tus plantas, \ny de que manera lo puedes emplear.");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        CicloDeAgua1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 280, 230));

        jScrollPane7.setBorder(null);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea6.setTabSize(0);
        jTextArea6.setText("¿Estás preparado para embarcarte en esta\nemocionante aventura?\n\nA tu derecha, encontrarás material elaborado\nque ofrece buena información sobre el ciclo \ndel agua donde descubrirás cómo este \nproceso no solo beneficia a las plantas, \nsino también cómo influye en el conjunto\nde los ecosistemas.");
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setAutoscrolls(false);
        jTextArea6.setBorder(null);
        jScrollPane7.setViewportView(jTextArea6);

        CicloDeAgua1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 280, 150));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas (1).png"))); // NOI18N
        CicloDeAgua1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flores.png"))); // NOI18N
        CicloDeAgua1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        Plantas.setBackground(new java.awt.Color(0, 51, 0));
        Plantas.setPreferredSize(new java.awt.Dimension(1064, 800));
        Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneMargarita.setBackground(new java.awt.Color(0, 204, 51));
        jTabbedPaneMargarita.setPreferredSize(new java.awt.Dimension(270, 360));

        jLabel6.setBackground(new java.awt.Color(0, 51, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Margaritajava.png"))); // NOI18N
        jTabbedPaneMargarita.addTab("Planta", jLabel6);

        jPanel8.setBackground(new java.awt.Color(204, 204, 0));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane2.setText("Margaritas.\n\nContenido en Minerales:\n- Sin requisitos estrictos.\n\nNivel de pH:\n-  4.5 – 7.5\n\nHumedad del suelo:\n-  Sin requisitos estrictos.\n\nSalinidad:\n-  No soportada\n\nTipo de tierra: \n- Rico en Nitrógeno, bajos en fertilizantes\n\n");
        jScrollPane9.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        jTabbedPaneMargarita.addTab("Inf", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jTabbedPaneMargarita.addTab("Nota", jPanel9);

        Plantas.add(jTabbedPaneMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 328, 604));
        jTabbedPaneMargarita.getAccessibleContext().setAccessibleName("Planta");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amapola Rosa.png"))); // NOI18N
        jTabbedPaneIxoras.addTab("tab3", jLabel10);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(323, 574));

        jTextPane3.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane3.setText("Amapola Rosa\n\nContenido en Minerales:\n- Sin requisitos estrictos.\n\nNivel de pH:\n-  6.0 – 6.8\n\nHumedad del suelo:\n-  Sin requisitos estrictos.\n\nSalinidad:\n-  No soportada\n\nTipo de tierra:\n-  Tierra de Jardín (Común) \n");
        jScrollPane10.setViewportView(jTextPane3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        jTabbedPaneIxoras.addTab("tab2", jPanel3);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jTabbedPaneIxoras.addTab("tab3", jPanel10);

        Plantas.add(jTabbedPaneIxoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 6, 336, -1));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/hoja.png")), Plantas); // NOI18N

        Clima.setBackground(new java.awt.Color(0, 51, 0));
        Clima.setPreferredSize(new java.awt.Dimension(1064, 800));

        jTextArea1.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea1.setTabSize(0);
        jTextArea1.setText("Imagina un gran circuito \n(sistema ecológico) o \npropiamente un sistema de la \nnaturaleza donde el agua \ncambia constantemente de \nestado, pasando de líquido a \ngaseoso y de gaseoso a \nlíquido, en un ciclo sin fin. \n¡Este es el ciclo del agua! \n\nEn este viaje, descubriremos \ncómo el sol, la gravedad y la \ntemperatura juegan un papel \nfundamental, y cómo este ciclo \nes esencial para la vida en la \nTierra, además te \nproporcionaremos \ninformación para aprovechar \nal máximo este ciclo de agua \npara tus plantas, y de que \nmanera lo puedes emplear. ");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jTextPane7.setEditable(false);
        jTextPane7.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane7.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane7.setText("Imagina un gran circuito (sistema ecológico) o propiamente un sistema de la naturaleza donde el agua cambia constantemente de estado, pasando de líquido a gaseoso y de gaseoso a líquido, en un ciclo sin fin. ¡Este es el ciclo del agua! \n\nEn este viaje, descubriremos cómo el sol, la gravedad y la temperatura juegan un papel fundamental, y cómo este ciclo es esencial para la vida en la Tierra, además te proporcionaremos información para aprovechar al máximo este ciclo de agua para tus plantas, y de que manera lo puedes emplear. \n\n");
        jTextPane7.setToolTipText("");
        jTextPane7.setFocusable(false);

        jTextArea3.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea3.setTabSize(0);
        jTextArea3.setText("¿Alguna vez te has preguntado \nde dónde viene el agua que\nbebemos, la que riega las plantas \no la que forma los ríos, lagunas, \nvenas de agua, pozos y cauces? \n¡Pues se trata de un recurso \nrenovable que da vida y del cual \nes un viaje increíble que no para nunca! ");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea3);

        jTextPane5.setEditable(false);
        jTextPane5.setBackground(new java.awt.Color(0, 102, 153));
        jTextPane5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextPane5.setForeground(new java.awt.Color(153, 204, 0));
        jTextPane5.setText("¿Estás preparado para embarcarte en esta emocionante aventura?\n\nA tu derecha, encontrarás material cuidadosamente elaborado que ofrece información valiosa sobre el ciclo del agua. Descubrirás cómo este proceso no solo beneficia a las plantas, sino también cómo influye en el comportamiento de los ecosistemas.");
        jTextPane5.setToolTipText("");
        jTextPane5.setFocusable(false);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea5.setTabSize(0);
        jTextArea5.setText("¿Estás preparado para \nembarcarte en esta emocionante \naventura?\n\nA tu derecha, encontrarás material \ncuidadosamente elaborado que \nofrece información valiosa sobre \nel ciclo del agua. Descubrirás\ncómo este proceso no solo \nbeneficia a las plantas, sino \ntambién cómo influye en el \ncomportamiento de los \necosistemas.");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setAutoscrolls(false);
        jTextArea5.setBorder(null);
        jScrollPane6.setViewportView(jTextArea5);

        jTextArea7.setBackground(new java.awt.Color(0, 51, 0));
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane8.setViewportView(jTextArea7);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("¿Alguna vez te has preguntado \nde dónde viene el agua que\nbebemos, la que riega las plantas \no la que forma los ríos, lagunas, \nvenas de agua, pozos y cauces? \n¡Pues se trata de un recurso \nrenovable que da vida y del cual \nes un viaje increíble que no para nunca!");
        jScrollPane11.setViewportView(jTextArea8);

        javax.swing.GroupLayout ClimaLayout = new javax.swing.GroupLayout(Clima);
        Clima.setLayout(ClimaLayout);
        ClimaLayout.setHorizontalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClimaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jTextPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(105, 105, 105)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ClimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClimaLayout.setVerticalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClimaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ClimaLayout.createSequentialGroup()
                .addGroup(ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClimaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(ClimaLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jardin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
    
    private void bt_op_ventanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_op_ventanaMouseClicked

        Operaciones btop = new Operaciones();
        btop.setVisible(true); 
    }//GEN-LAST:event_bt_op_ventanaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void condensacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacionActionPerformed
        condensacion acceso = new condensacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_condensacionActionPerformed

    private void evaporacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaporacionActionPerformed
        evaporacion acceso = new evaporacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_evaporacionActionPerformed

    private void precipitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precipitacionActionPerformed
        Precipitacion acceso = new Precipitacion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_precipitacionActionPerformed

    private void coleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coleccionActionPerformed
        Coleccion acceso = new Coleccion();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_coleccionActionPerformed

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
    private javax.swing.JPanel Potabilizacion;
    private javax.swing.JPanel ProcesoPrincipal;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JButton bt_op_ventana;
    private javax.swing.JButton coleccion;
    private javax.swing.JButton condensacion;
    private javax.swing.JPanel consejos;
    private javax.swing.JButton evaporacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneIxoras;
    private javax.swing.JTabbedPane jTabbedPaneMargarita;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JButton precipitacion;
    // End of variables declaration//GEN-END:variables
}
