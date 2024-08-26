/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

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
        Plantas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Riesgos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Jardin = new javax.swing.JPanel();
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
        CicloDeAgua1 = new javax.swing.JPanel();
        MenuCiclo = new javax.swing.JTabbedPane();
        ProcesoPrincipal = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Potabilizacion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
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
                .addContainerGap(625, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Operaciones); // NOI18N

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
                .addContainerGap(529, Short.MAX_VALUE))
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
            .addGap(0, 884, Short.MAX_VALUE)
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
            .addGap(0, 884, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recomendaciones", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), jPanel7); // NOI18N

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
            .addGap(0, 884, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        Clima.setBackground(new java.awt.Color(0, 51, 0));
        Clima.setPreferredSize(new java.awt.Dimension(1400, 1026));

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

        javax.swing.GroupLayout ClimaLayout = new javax.swing.GroupLayout(Clima);
        Clima.setLayout(ClimaLayout);
        ClimaLayout.setHorizontalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClimaLayout.createSequentialGroup()
                .addGroup(ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClimaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane8))
                    .addGroup(ClimaLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jTextPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ClimaLayout.setVerticalGroup(
            ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClimaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jTextPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(ClimaLayout.createSequentialGroup()
                .addGroup(ClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClimaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClimaLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1400, 1026));
        CicloDeAgua1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuCiclo.setBackground(new java.awt.Color(153, 153, 255));
        MenuCiclo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        MenuCiclo.setForeground(new java.awt.Color(0, 153, 153));
        MenuCiclo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MenuCiclo.setPreferredSize(new java.awt.Dimension(541, 604));

        ProcesoPrincipal.setBackground(new java.awt.Color(153, 204, 0));
        ProcesoPrincipal.setName("Principal"); // NOI18N
        ProcesoPrincipal.setPreferredSize(new java.awt.Dimension(533, 604));
        ProcesoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("¿Que es?");
        ProcesoPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jButton1.setText("¿Que es?");
        ProcesoPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 730, -1, -1));

        jButton4.setText("¿Que es?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ProcesoPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jButton3.setText("¿Que es?");
        ProcesoPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/Captura.JPG"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        ProcesoPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 860));

        MenuCiclo.addTab("Ciclos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (6).png")), ProcesoPrincipal); // NOI18N

        Potabilizacion.setBackground(new java.awt.Color(255, 204, 51));
        Potabilizacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Potabilizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/potabilizacion.jpg"))); // NOI18N
        Potabilizacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 430, 790));

        MenuCiclo.addTab("Potabilizacion", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/brote.png")), Potabilizacion); // NOI18N

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

        CicloDeAgua1.add(MenuCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 3, 490, 900));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N
        CicloDeAgua1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/jardin3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/32.png"))); // NOI18N
        CicloDeAgua1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes ciclo del agua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N
        CicloDeAgua1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea2.setTabSize(0);
        jTextArea2.setText("¿Alguna vez te has preguntado \nde dónde viene el agua que\nbebemos, la que riega las plantas \no la que forma los ríos, lagunas, \nvenas de agua, pozos y cauces? \n¡Pues se trata de un recurso \nrenovable que da vida y del cual \nes un viaje increíble que no para nunca! ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        CicloDeAgua1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 180));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea4.setTabSize(0);
        jTextArea4.setText("Imagina un gran circuito \n(sistema ecológico) o \npropiamente un sistema de la \nnaturaleza donde el agua \ncambia constantemente de \nestado, pasando de líquido a \ngaseoso y de gaseoso a \nlíquido, en un ciclo sin fin. \n¡Este es el ciclo del agua! \n\nEn este viaje, descubriremos \ncómo el sol, la gravedad y la \ntemperatura juegan un papel \nfundamental, y cómo este ciclo \nes esencial para la vida en la \nTierra, además te \nproporcionaremos \ninformación para aprovechar \nal máximo este ciclo de agua \npara tus plantas, y de que \nmanera lo puedes emplear. ");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        CicloDeAgua1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(153, 204, 0));
        jTextArea6.setTabSize(0);
        jTextArea6.setText("¿Estás preparado para \nembarcarte en esta emocionante \naventura?\n\nA tu derecha, encontrarás material \ncuidadosamente elaborado que \nofrece información valiosa sobre \nel ciclo del agua. Descubrirás\ncómo este proceso no solo \nbeneficia a las plantas, sino \ntambién cómo influye en el \ncomportamiento de los \necosistemas.");
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setAutoscrolls(false);
        jTextArea6.setBorder(null);
        jScrollPane7.setViewportView(jTextArea6);

        CicloDeAgua1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 270, 280));

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
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
    private javax.swing.JPanel Potabilizacion;
    private javax.swing.JPanel ProcesoPrincipal;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane7;
    // End of variables declaration//GEN-END:variables
}
