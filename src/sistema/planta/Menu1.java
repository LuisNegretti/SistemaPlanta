/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.planta;

import CICLODELAGUA.Coleccion;
import CICLODELAGUA.InporAgua;
import CICLODELAGUA.Precipitacion;
import CICLODELAGUA.RAICES;
import CICLODELAGUA.condensacion;
import CICLODELAGUA.evaporacion;
import CLIMA.Antartico;
import CLIMA.Continental;
import CLIMA.Desertico;
import CLIMA.Mediterraneo;
import CLIMA.Templado;
import CLIMA.Tropical;
import CLIMA.subTropical;
import OPERACIONES.Operaciones;
import Plantas.Margaritas1;
import java.awt.Color;
import java.awt.Toolkit;
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
        this.setLocationRelativeTo(null);
        
      
        //this.setResizable(false);
        
    }
   
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Bienvenida = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        Riesgos = new javax.swing.JPanel();
        Clima = new javax.swing.JPanel();
        SubTropical = new javax.swing.JPanel();
        antartico = new javax.swing.JPanel();
        continental = new javax.swing.JPanel();
        tropical = new javax.swing.JPanel();
        mediterraneo = new javax.swing.JPanel();
        Desertico = new javax.swing.JPanel();
        Templado = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Plantas = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Int_Plantas = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        Margaritas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Amapolas_Rosas = new javax.swing.JPanel();
        butt_AmapolasRosas = new javax.swing.JButton();
        Ixoras = new javax.swing.JPanel();
        butt_Ixora = new javax.swing.JButton();
        Tulipanes = new javax.swing.JPanel();
        butt_Tulipanes = new javax.swing.JButton();
        Rosas_Desierto = new javax.swing.JPanel();
        butt_rosaDelDesierto = new javax.swing.JButton();
        Magnolio = new javax.swing.JPanel();
        Azalea = new javax.swing.JPanel();
        Genciana = new javax.swing.JPanel();
        Primula = new javax.swing.JPanel();
        Hortensia = new javax.swing.JPanel();
        Begonia = new javax.swing.JPanel();
        Narciso = new javax.swing.JPanel();
        Brezo = new javax.swing.JPanel();
        Gardenia = new javax.swing.JPanel();
        Helecho = new javax.swing.JPanel();
        Diente_Leon = new javax.swing.JPanel();
        Fresa = new javax.swing.JPanel();
        Rododendro = new javax.swing.JPanel();
        Llanten = new javax.swing.JPanel();
        Achicoria = new javax.swing.JPanel();
        Quenopodio = new javax.swing.JPanel();
        Boca_De_dragon = new javax.swing.JPanel();
        Caléndula = new javax.swing.JPanel();
        Mastuerzo_marino = new javax.swing.JPanel();
        Tagetes = new javax.swing.JPanel();
        Árbol_del_amor = new javax.swing.JPanel();
        Jardin = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        CicloDeAgua1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        condensacion1 = new javax.swing.JButton();
        condensacion2 = new javax.swing.JButton();
        coleccion = new javax.swing.JButton();
        evaporacion = new javax.swing.JButton();
        precipitacion = new javax.swing.JButton();
        condensacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz");
        setBackground(new java.awt.Color(0, 153, 102));
        setName("MenuPrincipal"); // NOI18N
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 0));
        jTabbedPane1.setForeground(new java.awt.Color(51, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1049, 903));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1064, 900));

        Bienvenida.setBackground(new java.awt.Color(0, 153, 153));
        Bienvenida.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        Bienvenida.setForeground(new java.awt.Color(0, 51, 0));
        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida.setPreferredSize(new java.awt.Dimension(1064, 870));
        Bienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane23.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));

        jTextArea22.setEditable(false);
        jTextArea22.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 23)); // NOI18N
        jTextArea22.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea22.setTabSize(0);
        jTextArea22.setText(" Es un honor recibirte en este fascinante mundo de la jardinería escolar y el cuidado \n de nuestras plantas. Exploraremos juntos la diversidad de las plantas y su adapta\n ción a diferentes tierras y climas, lo que te permitirá comprender mejor su cuidado \n y mantenimiento. Este es un lugar para experimentar, aprender y compartir tu pasi-\n ón por la naturaleza.");
        jTextArea22.setWrapStyleWord(true);
        jTextArea22.setBorder(null);
        jScrollPane23.setViewportView(jTextArea22);

        Bienvenida.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 150));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/pngwing.com (6).png"))); // NOI18N
        Bienvenida.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, 610));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/plantas.png"))); // NOI18N
        Bienvenida.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        jScrollPane24.setBorder(null);

        jTextArea23.setEditable(false);
        jTextArea23.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea23.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea23.setTabSize(0);
        jTextArea23.setText(" Aprenderás a identificar los riesgos que pueden afectar \n a tus plantas y cómo prevenirlos, asegurando un entor-\n no saludable para que florezcan.");
        jTextArea23.setWrapStyleWord(true);
        jTextArea23.setBorder(null);
        jScrollPane24.setViewportView(jTextArea23);

        Bienvenida.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 570, 80));

        jLabel51.setBackground(new java.awt.Color(255, 204, 204));
        jLabel51.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 0));
        jLabel51.setText("Hola! Bienvenidos a nuestro espacio educativo.");
        Bienvenida.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, -1, -1));

        jLabel52.setBackground(new java.awt.Color(255, 204, 204));
        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 0));
        jLabel52.setText("Aqui aprenderas sobre:");
        Bienvenida.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel53.setBackground(new java.awt.Color(255, 204, 204));
        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 0));
        jLabel53.setText("1*");
        Bienvenida.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jScrollPane25.setBorder(null);

        jTextArea24.setEditable(false);
        jTextArea24.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea24.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea24.setTabSize(0);
        jTextArea24.setText(" Abordaremos temas como la selección de plantas, \n el uso sostenible de recursos, la planificación del \n espacio y las tendencias actuales en jardinería.");
        jTextArea24.setWrapStyleWord(true);
        jTextArea24.setBorder(null);
        jScrollPane25.setViewportView(jTextArea24);

        Bienvenida.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 510, 70));

        jLabel54.setBackground(new java.awt.Color(255, 204, 204));
        jLabel54.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 0));
        jLabel54.setText("2*");
        Bienvenida.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel55.setBackground(new java.awt.Color(255, 204, 204));
        jLabel55.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 0));
        jLabel55.setText("3*");
        Bienvenida.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jScrollPane26.setBorder(null);

        jTextArea25.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextArea25.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea25.setTabSize(0);
        jTextArea25.setText(" Los secretos del ciclo del agua y cómo este elemento vital \n influye en el crecimiento y bienestar de las plantas. ");
        jTextArea25.setWrapStyleWord(true);
        jTextArea25.setBorder(null);
        jScrollPane26.setViewportView(jTextArea25);

        Bienvenida.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 590, 60));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/ciclo del agua.png"))); // NOI18N
        Bienvenida.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 160, 90));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/riesgos.png"))); // NOI18N
        Bienvenida.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 160, 140));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/jardin.png"))); // NOI18N
        Bienvenida.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        jTabbedPane1.addTab("Bienvenida ", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/computadora.png")), Bienvenida); // NOI18N

        Riesgos.setBackground(new java.awt.Color(0, 51, 0));
        Riesgos.setPreferredSize(new java.awt.Dimension(1064, 870));

        javax.swing.GroupLayout RiesgosLayout = new javax.swing.GroupLayout(Riesgos);
        Riesgos.setLayout(RiesgosLayout);
        RiesgosLayout.setHorizontalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        RiesgosLayout.setVerticalGroup(
            RiesgosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riesgos", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/parasito.png")), Riesgos); // NOI18N

        Clima.setBackground(new java.awt.Color(255, 204, 204));
        Clima.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 80, 5, new java.awt.Color(0, 0, 0)));
        Clima.setPreferredSize(new java.awt.Dimension(1064, 870));
        Clima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTropical.setBackground(new java.awt.Color(255, 204, 204));
        SubTropical.setOpaque(false);
        SubTropical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubTropicalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SubTropicalLayout = new javax.swing.GroupLayout(SubTropical);
        SubTropical.setLayout(SubTropicalLayout);
        SubTropicalLayout.setHorizontalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        SubTropicalLayout.setVerticalGroup(
            SubTropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        Clima.add(SubTropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 220, 220));

        antartico.setBackground(new java.awt.Color(255, 204, 204));
        antartico.setOpaque(false);
        antartico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antarticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout antarticoLayout = new javax.swing.GroupLayout(antartico);
        antartico.setLayout(antarticoLayout);
        antarticoLayout.setHorizontalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        antarticoLayout.setVerticalGroup(
            antarticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        Clima.add(antartico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 490, 230));

        continental.setBackground(new java.awt.Color(255, 204, 204));
        continental.setName("continental"); // NOI18N
        continental.setOpaque(false);
        continental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continentalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout continentalLayout = new javax.swing.GroupLayout(continental);
        continental.setLayout(continentalLayout);
        continentalLayout.setHorizontalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        continentalLayout.setVerticalGroup(
            continentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Clima.add(continental, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 300));
        continental.getAccessibleContext().setAccessibleName("continental");

        tropical.setBackground(new java.awt.Color(255, 204, 204));
        tropical.setOpaque(false);
        tropical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tropicalMouseClicked(evt);
            }
        });
        tropical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tropicalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout tropicalLayout = new javax.swing.GroupLayout(tropical);
        tropical.setLayout(tropicalLayout);
        tropicalLayout.setHorizontalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        tropicalLayout.setVerticalGroup(
            tropicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Clima.add(tropical, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 380, 390));

        mediterraneo.setBackground(new java.awt.Color(255, 204, 204));
        mediterraneo.setOpaque(false);
        mediterraneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediterraneoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mediterraneoLayout = new javax.swing.GroupLayout(mediterraneo);
        mediterraneo.setLayout(mediterraneoLayout);
        mediterraneoLayout.setHorizontalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        mediterraneoLayout.setVerticalGroup(
            mediterraneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        Clima.add(mediterraneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 350, 210));

        Desertico.setBackground(new java.awt.Color(255, 204, 204));
        Desertico.setOpaque(false);
        Desertico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeserticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DeserticoLayout = new javax.swing.GroupLayout(Desertico);
        Desertico.setLayout(DeserticoLayout);
        DeserticoLayout.setHorizontalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        DeserticoLayout.setVerticalGroup(
            DeserticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        Clima.add(Desertico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 330));

        Templado.setBackground(new java.awt.Color(255, 204, 204));
        Templado.setOpaque(false);
        Templado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TempladoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TempladoLayout = new javax.swing.GroupLayout(Templado);
        Templado.setLayout(TempladoLayout);
        TempladoLayout.setHorizontalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        TempladoLayout.setVerticalGroup(
            TempladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        Clima.add(Templado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 180));

        jLabel13.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 204, 255));
        jLabel13.setText("Antartico");
        Clima.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        jLabel16.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 0));
        jLabel16.setText("Continental");
        Clima.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        jLabel17.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("Tropical");
        Clima.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        jLabel19.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Desertico");
        Clima.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setText("Mediterraneo");
        Clima.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 153));
        jLabel21.setText("Sub Tropical");
        Clima.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, -1, -1));

        jLabel36.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 153, 255));
        jLabel36.setText("Templado");
        Clima.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/Brown Autumn Photo Collage2.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        Clima.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1120, -1));

        jTabbedPane1.addTab("Clima", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/el-planeta-tierra.png")), Clima); // NOI18N

        Plantas.setBackground(new java.awt.Color(0, 51, 0));
        Plantas.setPreferredSize(new java.awt.Dimension(1064, 870));
        Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/intPlant.png"))); // NOI18N
        jLabel49.setText("jLabel49");

        javax.swing.GroupLayout Int_PlantasLayout = new javax.swing.GroupLayout(Int_Plantas);
        Int_Plantas.setLayout(Int_PlantasLayout);
        Int_PlantasLayout.setHorizontalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Int_PlantasLayout.setVerticalGroup(
            Int_PlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Int_PlantasLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Plantas", Int_Plantas);

        Margaritas.setBackground(new java.awt.Color(0, 204, 102));

        jScrollPane4.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setTabSize(0);
        jTextArea3.setText("MARGARITAS");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/margaritovalada.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jScrollPane6.setBorder(null);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setLineWrap(true);
        jTextArea5.setTabSize(0);
        jTextArea5.setText("En cuanto a sus beneficios, las margaritas pueden ser\nutilizadas en infusiones que ayudan con problemas \ndigestivos y actúan como antiinflamatorios naturales. \nA nivel de suelo, estas plantas no son particularmen-\nte exigentes y pueden adaptarse a una variedad de\ncondiciones, siendo su principal requerimiento un suelo \nbien drenado y rico en nutrientes. Pueden crecer \ntanto en macetas como directamente en la tierra, lo \nque las  convierte en una opción versátil para jardines \nrecicladoso comunitarios.\n\nEn cuanto a sus necesidades específicas de cuidado,\nlas margaritas prosperan en zonas con abundante luz\nsolar, aunque tambiéntoleran la sombra parcial. \nEl riego debe ser moderado, evitando tanto el enchar-\ncamiento como la sequedad extrema del suelo. Aunque\nno tienen requisitos estrictos de humedad, es fundam-\nental regarlas de manera regular, sin llegar a excesos \nque puedan provocar pudrición en las raíces. Prefieren \nsuelos ricos en nitrógeno, y es importante que los fer-\ntilizantes se utilicen de forma controlada, ya que en \ngrandes cantidades pueden \ndañar la planta. ");
        jTextArea5.setToolTipText("");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jScrollPane6.setViewportView(jTextArea5);

        jScrollPane8.setBorder(null);

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setLineWrap(true);
        jTextArea7.setTabSize(0);
        jTextArea7.setText("Las margaritas son plantas sumamente\napreciadas por su sencillez y belleza \nnatural.Son conocidas por sus flores \nblancas con centros amarillos vibrantes,\nque simbolizanpureza e inocencia. \nEstas flores pueden crecer en diversas \ncondiciones climáticas, haciéndolas \npopulares en muchos tipos de jardines.");
        jTextArea7.setToolTipText("");
        jTextArea7.setWrapStyleWord(true);
        jTextArea7.setBorder(null);
        jScrollPane8.setViewportView(jTextArea7);

        jScrollPane9.setBorder(null);

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(0, 204, 102));
        jTextArea8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setLineWrap(true);
        jTextArea8.setTabSize(0);
        jTextArea8.setText("En cuanto al pH del suelo, las margaritas toleran un amplio rango que va desde\n4.5 hasta 7.5, lo que les permite adaptarse a diferentes tipos de terrenos. Sin\nembargo, no soportan suelos con alta salinidad, lo cual es crucial evitar si se \ndesea que la planta florezca de manera óptima.\n\nEn resumen, las margaritas son plantas resistentes, fáciles de cuidar y benefi-\nciosas tanto para las personas como para los ecosistemas. Son una opción \nideal para jardines escolares o proyectos comunitarios por su capacidad para \ncrecer en condiciones variadas, su contribución a la biodiversidad y su facilid-\nad de propagación. Con cuidados básicos, estas flores brindarán belleza y vida\na cualquier entorno donde sean plantadas.\n");
        jTextArea8.setToolTipText("");
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setBorder(null);
        jScrollPane9.setViewportView(jTextArea8);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flower-pot (1).png"))); // NOI18N
        jLabel6.setText("jLabel1");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel24.setText("jLabel1");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flowers.png"))); // NOI18N
        jLabel25.setText("jLabel1");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flower-pot (1).png"))); // NOI18N
        jLabel50.setText("jLabel1");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flowers.png"))); // NOI18N
        jLabel58.setText("jLabel1");

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Regadera.png"))); // NOI18N
        jLabel61.setText("jLabel1");

        javax.swing.GroupLayout MargaritasLayout = new javax.swing.GroupLayout(Margaritas);
        Margaritas.setLayout(MargaritasLayout);
        MargaritasLayout.setHorizontalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(465, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(450, 450, 450)))
        );
        MargaritasLayout.setVerticalGroup(
            MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MargaritasLayout.createSequentialGroup()
                .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(MargaritasLayout.createSequentialGroup()
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MargaritasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MargaritasLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(MargaritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MargaritasLayout.createSequentialGroup()
                    .addContainerGap(499, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addGap(70, 70, 70)))
        );

        jTabbedPane2.addTab("Margaritas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/Margaritas.png")), Margaritas); // NOI18N

        Amapolas_Rosas.setBackground(new java.awt.Color(51, 0, 51));

        butt_AmapolasRosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Amapolas rosas.png"))); // NOI18N
        butt_AmapolasRosas.setText("jButton1");

        javax.swing.GroupLayout Amapolas_RosasLayout = new javax.swing.GroupLayout(Amapolas_Rosas);
        Amapolas_Rosas.setLayout(Amapolas_RosasLayout);
        Amapolas_RosasLayout.setHorizontalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Amapolas_RosasLayout.setVerticalGroup(
            Amapolas_RosasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Amapolas_RosasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_AmapolasRosas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Amapolas Rosas", Amapolas_Rosas);

        Ixoras.setBackground(new java.awt.Color(153, 0, 0));

        butt_Ixora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/planta_ixora.jpg"))); // NOI18N
        butt_Ixora.setText("jButton1");

        javax.swing.GroupLayout IxorasLayout = new javax.swing.GroupLayout(Ixoras);
        Ixoras.setLayout(IxorasLayout);
        IxorasLayout.setHorizontalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IxorasLayout.setVerticalGroup(
            IxorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IxorasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(butt_Ixora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ixoras", Ixoras);

        Tulipanes.setBackground(new java.awt.Color(204, 0, 51));
        Tulipanes.setForeground(new java.awt.Color(204, 0, 51));

        butt_Tulipanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/Tulipanes.jpg"))); // NOI18N
        butt_Tulipanes.setText("jButton1");

        javax.swing.GroupLayout TulipanesLayout = new javax.swing.GroupLayout(Tulipanes);
        Tulipanes.setLayout(TulipanesLayout);
        TulipanesLayout.setHorizontalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TulipanesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TulipanesLayout.setVerticalGroup(
            TulipanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TulipanesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(butt_Tulipanes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tulipanes", Tulipanes);

        Rosas_Desierto.setBackground(new java.awt.Color(255, 153, 255));

        butt_rosaDelDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPlanta/flor-rosa-desierto.png"))); // NOI18N
        butt_rosaDelDesierto.setText("jButton1");
        butt_rosaDelDesierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_rosaDelDesiertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Rosas_DesiertoLayout = new javax.swing.GroupLayout(Rosas_Desierto);
        Rosas_Desierto.setLayout(Rosas_DesiertoLayout);
        Rosas_DesiertoLayout.setHorizontalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Rosas_DesiertoLayout.setVerticalGroup(
            Rosas_DesiertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rosas_DesiertoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(butt_rosaDelDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rosas Del Desierto", Rosas_Desierto);

        javax.swing.GroupLayout MagnolioLayout = new javax.swing.GroupLayout(Magnolio);
        Magnolio.setLayout(MagnolioLayout);
        MagnolioLayout.setHorizontalGroup(
            MagnolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MagnolioLayout.setVerticalGroup(
            MagnolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Magnolio", Magnolio);

        javax.swing.GroupLayout AzaleaLayout = new javax.swing.GroupLayout(Azalea);
        Azalea.setLayout(AzaleaLayout);
        AzaleaLayout.setHorizontalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AzaleaLayout.setVerticalGroup(
            AzaleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Azalea", Azalea);

        javax.swing.GroupLayout GencianaLayout = new javax.swing.GroupLayout(Genciana);
        Genciana.setLayout(GencianaLayout);
        GencianaLayout.setHorizontalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GencianaLayout.setVerticalGroup(
            GencianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Genciana", Genciana);

        javax.swing.GroupLayout PrimulaLayout = new javax.swing.GroupLayout(Primula);
        Primula.setLayout(PrimulaLayout);
        PrimulaLayout.setHorizontalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PrimulaLayout.setVerticalGroup(
            PrimulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Primula", Primula);

        javax.swing.GroupLayout HortensiaLayout = new javax.swing.GroupLayout(Hortensia);
        Hortensia.setLayout(HortensiaLayout);
        HortensiaLayout.setHorizontalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HortensiaLayout.setVerticalGroup(
            HortensiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Hortensia", Hortensia);

        javax.swing.GroupLayout BegoniaLayout = new javax.swing.GroupLayout(Begonia);
        Begonia.setLayout(BegoniaLayout);
        BegoniaLayout.setHorizontalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BegoniaLayout.setVerticalGroup(
            BegoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Begonia", Begonia);

        javax.swing.GroupLayout NarcisoLayout = new javax.swing.GroupLayout(Narciso);
        Narciso.setLayout(NarcisoLayout);
        NarcisoLayout.setHorizontalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        NarcisoLayout.setVerticalGroup(
            NarcisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Narciso", Narciso);

        javax.swing.GroupLayout BrezoLayout = new javax.swing.GroupLayout(Brezo);
        Brezo.setLayout(BrezoLayout);
        BrezoLayout.setHorizontalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BrezoLayout.setVerticalGroup(
            BrezoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Brezo", Brezo);

        javax.swing.GroupLayout GardeniaLayout = new javax.swing.GroupLayout(Gardenia);
        Gardenia.setLayout(GardeniaLayout);
        GardeniaLayout.setHorizontalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GardeniaLayout.setVerticalGroup(
            GardeniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Gardenia", Gardenia);

        javax.swing.GroupLayout HelechoLayout = new javax.swing.GroupLayout(Helecho);
        Helecho.setLayout(HelechoLayout);
        HelechoLayout.setHorizontalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HelechoLayout.setVerticalGroup(
            HelechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Helecho", Helecho);

        javax.swing.GroupLayout Diente_LeonLayout = new javax.swing.GroupLayout(Diente_Leon);
        Diente_Leon.setLayout(Diente_LeonLayout);
        Diente_LeonLayout.setHorizontalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Diente_LeonLayout.setVerticalGroup(
            Diente_LeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Diente De León", Diente_Leon);

        javax.swing.GroupLayout FresaLayout = new javax.swing.GroupLayout(Fresa);
        Fresa.setLayout(FresaLayout);
        FresaLayout.setHorizontalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FresaLayout.setVerticalGroup(
            FresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Fresa", Fresa);

        javax.swing.GroupLayout RododendroLayout = new javax.swing.GroupLayout(Rododendro);
        Rododendro.setLayout(RododendroLayout);
        RododendroLayout.setHorizontalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RododendroLayout.setVerticalGroup(
            RododendroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Rododendro", Rododendro);

        javax.swing.GroupLayout LlantenLayout = new javax.swing.GroupLayout(Llanten);
        Llanten.setLayout(LlantenLayout);
        LlantenLayout.setHorizontalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LlantenLayout.setVerticalGroup(
            LlantenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Llantén", Llanten);

        javax.swing.GroupLayout AchicoriaLayout = new javax.swing.GroupLayout(Achicoria);
        Achicoria.setLayout(AchicoriaLayout);
        AchicoriaLayout.setHorizontalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AchicoriaLayout.setVerticalGroup(
            AchicoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Achicoria", Achicoria);

        javax.swing.GroupLayout QuenopodioLayout = new javax.swing.GroupLayout(Quenopodio);
        Quenopodio.setLayout(QuenopodioLayout);
        QuenopodioLayout.setHorizontalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        QuenopodioLayout.setVerticalGroup(
            QuenopodioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Quenopodio", Quenopodio);

        javax.swing.GroupLayout Boca_De_dragonLayout = new javax.swing.GroupLayout(Boca_De_dragon);
        Boca_De_dragon.setLayout(Boca_De_dragonLayout);
        Boca_De_dragonLayout.setHorizontalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Boca_De_dragonLayout.setVerticalGroup(
            Boca_De_dragonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Boca de dragón", Boca_De_dragon);

        javax.swing.GroupLayout CaléndulaLayout = new javax.swing.GroupLayout(Caléndula);
        Caléndula.setLayout(CaléndulaLayout);
        CaléndulaLayout.setHorizontalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CaléndulaLayout.setVerticalGroup(
            CaléndulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Caléndula", Caléndula);

        javax.swing.GroupLayout Mastuerzo_marinoLayout = new javax.swing.GroupLayout(Mastuerzo_marino);
        Mastuerzo_marino.setLayout(Mastuerzo_marinoLayout);
        Mastuerzo_marinoLayout.setHorizontalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Mastuerzo_marinoLayout.setVerticalGroup(
            Mastuerzo_marinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Mastuerzo marino", Mastuerzo_marino);

        javax.swing.GroupLayout TagetesLayout = new javax.swing.GroupLayout(Tagetes);
        Tagetes.setLayout(TagetesLayout);
        TagetesLayout.setHorizontalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TagetesLayout.setVerticalGroup(
            TagetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tagetes", Tagetes);

        javax.swing.GroupLayout Árbol_del_amorLayout = new javax.swing.GroupLayout(Árbol_del_amor);
        Árbol_del_amor.setLayout(Árbol_del_amorLayout);
        Árbol_del_amorLayout.setHorizontalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Árbol_del_amorLayout.setVerticalGroup(
            Árbol_del_amorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Árbol del amor", Árbol_del_amor);

        Plantas.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 740));

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/planta (3).png")), Plantas); // NOI18N

        Jardin.setBackground(new java.awt.Color(255, 255, 0));
        Jardin.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 50, 5, new java.awt.Color(0, 0, 0)));
        Jardin.setPreferredSize(new java.awt.Dimension(1064, 870));
        Jardin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane10.setBorder(null);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea9.setTabSize(0);
        jTextArea9.setText("Diseño del Jardin Escolar.");
        jTextArea9.setWrapStyleWord(true);
        jTextArea9.setBorder(null);
        jScrollPane10.setViewportView(jTextArea9);

        Jardin.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 104, -1, -1));

        jLabel26.setBackground(new java.awt.Color(153, 102, 0));
        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 0));
        jLabel26.setText("JARDIN DE APRENDIZAJE");
        Jardin.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, -1, 84));

        jScrollPane11.setBorder(null);

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea10.setTabSize(0);
        jTextArea10.setText("Un diseño bien pensado puede fomentar\nla curiosidad de los estudiantes, pro...\nmover la sostenibilidad en el ambiente \ny servir como un laboratorio al aire libre \npara la enseñanza sobre las plantas.");
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setBorder(null);
        jScrollPane11.setViewportView(jTextArea10);

        Jardin.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 142, 294, -1));

        jScrollPane12.setBorder(null);

        jTextArea11.setEditable(false);
        jTextArea11.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea11.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jTextArea11.setTabSize(0);
        jTextArea11.setText("Preparacion y construccion.");
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setBorder(null);
        jScrollPane12.setViewportView(jTextArea11);

        Jardin.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 319, -1, -1));

        jScrollPane13.setBorder(null);

        jTextArea12.setEditable(false);
        jTextArea12.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea12.setTabSize(0);
        jTextArea12.setText("Beneficios.");
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setBorder(null);
        jScrollPane13.setViewportView(jTextArea12);

        Jardin.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 319, -1, -1));

        jScrollPane14.setBorder(null);

        jTextArea13.setEditable(false);
        jTextArea13.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jTextArea13.setTabSize(0);
        jTextArea13.setText("Adaptacion del terreno.");
        jTextArea13.setWrapStyleWord(true);
        jTextArea13.setBorder(null);
        jScrollPane14.setViewportView(jTextArea13);

        Jardin.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 513, -1, -1));

        jScrollPane15.setBorder(null);

        jTextArea14.setEditable(false);
        jTextArea14.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea14.setTabSize(0);
        jTextArea14.setText("Tipos de Suelos.");
        jTextArea14.setWrapStyleWord(true);
        jTextArea14.setBorder(null);
        jScrollPane15.setViewportView(jTextArea14);

        Jardin.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 104, -1, -1));

        jScrollPane16.setBorder(null);

        jTextArea15.setEditable(false);
        jTextArea15.setBackground(new java.awt.Color(255, 102, 0));
        jTextArea15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextArea15.setTabSize(0);
        jTextArea15.setText("Mantenimiento.");
        jTextArea15.setWrapStyleWord(true);
        jTextArea15.setBorder(null);
        jScrollPane16.setViewportView(jTextArea15);

        Jardin.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 481, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin.png"))); // NOI18N
        Jardin.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/beneficios.png"))); // NOI18N
        Jardin.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3_1.png"))); // NOI18N
        Jardin.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 306, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/tierra-arcillosa-seca-y-compactada..png"))); // NOI18N
        Jardin.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/buenas-practicas-agricolas-tipos-suelo.png"))); // NOI18N
        Jardin.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        jScrollPane17.setBorder(null);

        jTextArea16.setEditable(false);
        jTextArea16.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea16.setTabSize(0);
        jTextArea16.setText("Esto incluye tareas regulares como el \nriego, la poda, el control de plagas y la \nrotación de cultivos, así como actividades \neducativas que involucren a los estudiantes \nen el cuidado continuo del espacio.\n");
        jTextArea16.setWrapStyleWord(true);
        jTextArea16.setBorder(null);
        jScrollPane17.setViewportView(jTextArea16);

        Jardin.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 519, -1, -1));

        jScrollPane18.setBorder(null);

        jTextArea17.setEditable(false);
        jTextArea17.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea17.setTabSize(0);
        jTextArea17.setText("La preparación y construcción del jardín \ncomienza con la selección del sitio ade\ncuado, la evaluación del tipo de suelo y \nla determinación de las plantas más \nadecuadas para el clima local.\n");
        jTextArea17.setWrapStyleWord(true);
        jTextArea17.setBorder(null);
        jScrollPane18.setViewportView(jTextArea17);

        Jardin.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 361, -1, -1));

        jScrollPane19.setBorder(null);

        jTextArea18.setEditable(false);
        jTextArea18.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea18.setTabSize(0);
        jTextArea18.setText("El suelo es un recurso vital que sus\ntenta la vida en nuestro planeta, actu\nando como un medio para el creci-\nmiento de las plantas y un hábitat \npara una variedad de organismos. \n");
        jTextArea18.setWrapStyleWord(true);
        jTextArea18.setBorder(null);
        jScrollPane19.setViewportView(jTextArea18);

        Jardin.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 142, -1, -1));

        jScrollPane20.setBorder(null);

        jTextArea19.setEditable(false);
        jTextArea19.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea19.setTabSize(0);
        jTextArea19.setText("Cada uno con características únicas,  \ninfluyen en su capacidad para retener \nagua, nutrientes y su idoneidad para \ndiferentes cultivos.\n");
        jTextArea19.setWrapStyleWord(true);
        jTextArea19.setBorder(null);
        jScrollPane20.setViewportView(jTextArea19);

        Jardin.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 363, -1, -1));

        jScrollPane21.setBorder(null);

        jTextArea20.setEditable(false);
        jTextArea20.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea20.setTabSize(0);
        jTextArea20.setText("La adaptación del terreno para maximizar \nel uso de cada tipo de suelo es esencial \npara la agricultura sostenible y la conser\nvación del medio ambiente. \n");
        jTextArea20.setWrapStyleWord(true);
        jTextArea20.setBorder(null);
        jScrollPane21.setViewportView(jTextArea20);

        Jardin.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 557, 294, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton1.setBorder(null);
        Jardin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 481, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton2.setBorder(null);
        Jardin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 319, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton4.setBorder(null);
        Jardin.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 104, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton5.setBorder(null);
        Jardin.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 104, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton6.setBorder(null);
        Jardin.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 319, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flecha1.png"))); // NOI18N
        jButton7.setBorder(null);
        Jardin.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 513, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/regando-plantas (1).png"))); // NOI18N
        Jardin.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 6, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/flores.png"))); // NOI18N
        Jardin.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 192, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/cactus.png"))); // NOI18N
        Jardin.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 10, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-la-mano.png"))); // NOI18N
        Jardin.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 481, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/impresion-de-mano.png"))); // NOI18N
        Jardin.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 243, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/informe-de-crecimiento.png"))); // NOI18N
        Jardin.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/jardin-de-infancia.png"))); // NOI18N
        Jardin.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2_1.png"))); // NOI18N
        Jardin.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 472, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/siembra.png"))); // NOI18N
        Jardin.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, -1, -1));

        jTabbedPane1.addTab("Jardin", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/arbol.png")), Jardin); // NOI18N

        CicloDeAgua1.setBackground(new java.awt.Color(0, 51, 153));
        CicloDeAgua1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        CicloDeAgua1.setForeground(new java.awt.Color(0, 102, 153));
        CicloDeAgua1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CicloDeAgua1.setPreferredSize(new java.awt.Dimension(1064, 870));
        CicloDeAgua1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin2.png"))); // NOI18N
        CicloDeAgua1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/32.png"))); // NOI18N
        CicloDeAgua1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin1.png"))); // NOI18N
        CicloDeAgua1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/81qaU6Yza-L._UC256,256_CACC,256,256_.png"))); // NOI18N
        CicloDeAgua1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ObOhgosRIJnnCAeHU_twkrWC9uCJRpoI5QYeKZF9GJk.png"))); // NOI18N
        CicloDeAgua1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/ahorrar-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas (1).png"))); // NOI18N
        CicloDeAgua1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/jardin3.png"))); // NOI18N
        CicloDeAgua1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jScrollPane5.setBorder(null);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea4.setTabSize(0);
        jTextArea4.setText("El ciclo del agua es un hermoso recordatorio de la interconexión \ny la renovación constante en la naturaleza. Desde la evaporación, \ndonde el agua asciende en forma de vapor, nos enseña sobre la \ntransformación y la capacidad de liberarnos de lo que ya no nece\nsitamos. La condensación, al formar nubes, simboliza la unión y \nla colaboración; cada gota se suma a un todo mayor.\n\nCuando el agua precipita en forma de lluvia, nos recuerda que a \nveces es necesario soltar para nutrir y dar vida a nuestro entorno. \nEste proceso alimenta ríos, lagos y océanos, revitalizando la tierra \ny sosteniendo la vida. ");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        CicloDeAgua1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, 260));

        jScrollPane3.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 153));
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 255, 0));
        jTextArea2.setTabSize(0);
        jTextArea2.setText("¿Alguna vez te has preguntado de dónde viene el agua que\nbebemos, la que riega las plantas o la que forma los ríos,\nlagunas, pozos y cauces?\n\nEl agua, como fuente de vida, nos enseña la importancia de \nla conexión y la fluidez. Su capacidad para adaptarse a dife\nrentes formas y entornos nos recuerda que, al igual que ella, \ndebemos ser flexibles y resilientes ante los cambios. El agua \ntambién simboliza la vitalidad y la renovación; nos invita a valo\nrar cada gota y a ser conscientes de su papel esencial en nues\ntro bienestar y en el equilibrio del planeta. Aprendamos de su \ntransparencia y pureza, promoviendo la honestidad y la claridad \nen nuestras relaciones. Al cuidar el agua, cuidamos de nosotros \nmismos y del futuro, creando un mundo más sostenible y bello. ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        CicloDeAgua1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 460, 300));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flores.png"))); // NOI18N
        CicloDeAgua1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/dia-mundial-del-agua.png"))); // NOI18N
        CicloDeAgua1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/regando-plantas.png"))); // NOI18N
        CicloDeAgua1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 760, 60, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/flor.png"))); // NOI18N
        CicloDeAgua1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/enfriar.png"))); // NOI18N
        CicloDeAgua1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/gato.png"))); // NOI18N
        CicloDeAgua1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        condensacion1.setBackground(new java.awt.Color(153, 102, 0));
        condensacion1.setForeground(new java.awt.Color(0, 0, 204));
        condensacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/DecoracionCicloDelAgua/arbolRaices.png"))); // NOI18N
        condensacion1.setActionCommand("¿Que es la evaporacion?");
        condensacion1.setIconTextGap(1);
        condensacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacion1ActionPerformed(evt);
            }
        });
        CicloDeAgua1.add(condensacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        condensacion2.setBackground(new java.awt.Color(0, 204, 204));
        condensacion2.setForeground(new java.awt.Color(0, 0, 204));
        condensacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos ciclo del agua/water-tap_5824199.png"))); // NOI18N
        condensacion2.setActionCommand("¿Que es la evaporacion?");
        condensacion2.setIconTextGap(1);
        condensacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condensacion2ActionPerformed(evt);
            }
        });
        CicloDeAgua1.add(condensacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, 80));

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
        CicloDeAgua1.add(coleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 740, 70, 60));

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
        CicloDeAgua1.add(evaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, -1, -1));

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
        CicloDeAgua1.add(precipitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, -1, -1));

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
        CicloDeAgua1.add(condensacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("El Ciclo del Agua.");
        CicloDeAgua1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 0));
        jLabel9.setText("El Agua.");
        CicloDeAgua1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jTabbedPane1.addTab("Ciclo del agua", new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/filtro-de-agua.png")), CicloDeAgua1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Jardin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
    
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
        
    }//GEN-LAST:event_coleccionActionPerformed

    private void condensacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacion1ActionPerformed
        InporAgua acceso = new InporAgua();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_condensacion1ActionPerformed

    private void condensacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condensacion2ActionPerformed
       RAICES acceso = new RAICES();
        acceso.setVisible(true); 
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_condensacion2ActionPerformed

    private void DeserticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeserticoMouseClicked
        
        Desertico acceso = new Desertico();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_DeserticoMouseClicked

    private void SubTropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubTropicalMouseClicked
        subTropical acceso = new subTropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_SubTropicalMouseClicked

    private void butt_rosaDelDesiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_rosaDelDesiertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butt_rosaDelDesiertoActionPerformed

    private void tropicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tropicalMouseClicked
        Tropical acceso = new Tropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_tropicalMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void TempladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TempladoMouseClicked
        Templado acceso = new Templado();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_TempladoMouseClicked

    private void tropicalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tropicalKeyPressed
        Tropical acceso = new Tropical();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_tropicalKeyPressed

    private void mediterraneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediterraneoMouseClicked
        Mediterraneo acceso = new Mediterraneo();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_mediterraneoMouseClicked

    private void continentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continentalMouseClicked
        Continental acceso = new Continental();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_continentalMouseClicked

    private void antarticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antarticoMouseClicked
        Antartico acceso = new Antartico();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
    }//GEN-LAST:event_antarticoMouseClicked

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
    private javax.swing.JPanel Achicoria;
    private javax.swing.JPanel Amapolas_Rosas;
    private javax.swing.JPanel Azalea;
    private javax.swing.JPanel Begonia;
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JPanel Boca_De_dragon;
    private javax.swing.JPanel Brezo;
    private javax.swing.JPanel Caléndula;
    private javax.swing.JPanel CicloDeAgua1;
    private javax.swing.JPanel Clima;
    private javax.swing.JPanel Desertico;
    private javax.swing.JPanel Diente_Leon;
    private javax.swing.JPanel Fresa;
    private javax.swing.JPanel Gardenia;
    private javax.swing.JPanel Genciana;
    private javax.swing.JPanel Helecho;
    private javax.swing.JPanel Hortensia;
    private javax.swing.JPanel Int_Plantas;
    private javax.swing.JPanel Ixoras;
    private javax.swing.JPanel Jardin;
    private javax.swing.JPanel Llanten;
    private javax.swing.JPanel Magnolio;
    private javax.swing.JPanel Margaritas;
    private javax.swing.JPanel Mastuerzo_marino;
    private javax.swing.JPanel Narciso;
    private javax.swing.JPanel Plantas;
    private javax.swing.JPanel Primula;
    private javax.swing.JPanel Quenopodio;
    private javax.swing.JPanel Riesgos;
    private javax.swing.JPanel Rododendro;
    private javax.swing.JPanel Rosas_Desierto;
    private javax.swing.JPanel SubTropical;
    private javax.swing.JPanel Tagetes;
    private javax.swing.JPanel Templado;
    private javax.swing.JPanel Tulipanes;
    private javax.swing.JPanel antartico;
    private javax.swing.JButton butt_AmapolasRosas;
    private javax.swing.JButton butt_Ixora;
    private javax.swing.JButton butt_Tulipanes;
    private javax.swing.JButton butt_rosaDelDesierto;
    private javax.swing.JButton coleccion;
    private javax.swing.JButton condensacion;
    private javax.swing.JButton condensacion1;
    private javax.swing.JButton condensacion2;
    private javax.swing.JPanel continental;
    private javax.swing.JButton evaporacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JPanel mediterraneo;
    private javax.swing.JButton precipitacion;
    private javax.swing.JPanel tropical;
    private javax.swing.JPanel Árbol_del_amor;
    // End of variables declaration//GEN-END:variables
}
