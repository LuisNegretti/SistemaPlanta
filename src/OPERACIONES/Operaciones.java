/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPERACIONES;

import db_Operaciones.Conexion;
import db_Operaciones.Plantas_Get_Set;
import db_Operaciones.TipoTierra_Get_Set;
import static java.awt.Event.INSERT;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.planta.Principal;


public class Operaciones extends javax.swing.JFrame {
     
     DefaultTableModel modelo;
     
     // Método auxiliar para verificar si una cadena es numérica
private boolean isNumeric(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

// Método para insertar datos en la base de datos BORRAR
private void insertarEnBaseDeDatos(String numberAsString, String fechaString, String planta, String PHString, String tierra, String stateString, String mensaje) {
    try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_planta", "root", "")) {
    String query = "INSERT INTO historial (ID_Operacion, Fecha, Planta, PH, Tierra, Mineral, Resultado) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement = cn.prepareStatement(query);
    
    statement.setString(1, numberAsString);
    statement.setString(2, fechaString);
    statement.setString(3, planta);
    statement.setString(4, PHString);
    statement.setString(5, tierra);
    statement.setString(6, stateString);
    statement.setString(7, mensaje);
    
    statement.executeUpdate();
} catch (SQLException e) {
    e.printStackTrace();
}

}
     
    public Operaciones() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENGRANDES/logo del software.png")));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        modelo=new DefaultTableModel();
         modelo.addColumn("ID_Operacion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Planta");
        modelo.addColumn("PH");
        modelo.addColumn("Tierra");
        modelo.addColumn("Mineral");
        modelo.addColumn("Resultado");
        this. HistorialModelo.setModel(modelo);
          
        Conexion con = new Conexion();
        
        ArrayList<Plantas_Get_Set> Lista = con.List_Plantas("plantas");
        
        ArrayList<TipoTierra_Get_Set> simple = con.List_TipoTierra();
        
        
        try {        
    // Establecer la conexión con la base de datos
    String url = "jdbc:mysql://localhost/sistema_planta";
    String usuario = "root";
    String contraseña = "";
    Connection cn = DriverManager.getConnection(url, usuario, contraseña);
    
    // Crear una declaración SQL
    Statement statement = cn.createStatement();
    
    // Ejecutar la consulta SQL y obtener el resultado
    String consulta = "SELECT * FROM historial";
    ResultSet resultSet = statement.executeQuery(consulta);
    
    // Recorrer el resultado y agregar los datos a la tabla
    while (resultSet.next()) {
        Object[] fila = new Object[7]; // Ajusta el número de columnas según la tabla
        fila[0] = resultSet.getString("ID_Operacion");
        fila[1] = resultSet.getString("Fecha");
        fila[2] = resultSet.getString("Planta");
        fila[3] = resultSet.getString("PH");
        fila[4] = resultSet.getString("Tierra");
        fila[5] = resultSet.getString("Mineral");
        fila[6] = resultSet.getString("Resultado");
        
        modelo.addRow(fila);
        
        
    }
    
    // Cerrar la conexión y liberar recursos
    resultSet.close();
    statement.close();
    cn.close();
    
} catch (SQLException ex) {
    System.out.println("Error al cargar los datos: " + ex.getMessage());
}
        
        for(Plantas_Get_Set plan : Lista){
            this.cbx_Planta.addItem(plan.getNombre_planta());          
        }
        
        for(TipoTierra_Get_Set tierra : simple){
            this.cbx_tierra.addItem(tierra.getNombreTierra());
        }
              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Principal = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        SalaOperaciones = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tipo_planta = new javax.swing.JPanel();
        cbx_Planta = new javax.swing.JComboBox<>();
        tipo_tierra = new javax.swing.JPanel();
        cbx_tierra = new javax.swing.JComboBox<>();
        lvl_PH = new javax.swing.JPanel();
        txtPH = new javax.swing.JTextField();
        cont_mnrl = new javax.swing.JPanel();
        BoxCalcio = new javax.swing.JCheckBox();
        BoxNitrogeno = new javax.swing.JCheckBox();
        BoxFosforo = new javax.swing.JCheckBox();
        BoxPotasio = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaT_Details = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP_Details = new javax.swing.JTable();
        RealizarOperacion = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        HistorialdeOpe = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HistorialModelo = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpe = new javax.swing.JMenu();
        EjemploOpe = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuPricipal = new javax.swing.JMenuItem();
        SalirPrograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        setUndecorated(true);
        setResizable(false);

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(902, 622));

        Principal.setPreferredSize(new java.awt.Dimension(902, 622));
        Principal.setRequestFocusEnabled(false);
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/una imagen de bienvenida para un centro de operaciones que realiza estudios sobre plantas ornamentales y tipos de tierra, sin palabras.png"))); // NOI18N
        Principal.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jTabbedPane2.addTab("Sala principal.", Principal);

        SalaOperaciones.setBackground(new java.awt.Color(0, 51, 0));
        SalaOperaciones.setName(""); // NOI18N
        SalaOperaciones.setPreferredSize(new java.awt.Dimension(902, 622));
        SalaOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 153, 0));

        tipo_planta.setBackground(new java.awt.Color(102, 51, 0));
        tipo_planta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de planta.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N
        tipo_planta.setFont(new java.awt.Font("Calisto MT", 1, 11)); // NOI18N

        cbx_Planta.setBackground(new java.awt.Color(0, 204, 0));
        cbx_Planta.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        cbx_Planta.setForeground(new java.awt.Color(0, 153, 102));
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
                .addContainerGap()
                .addComponent(cbx_Planta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        cbx_tierra.setBackground(new java.awt.Color(102, 51, 0));
        cbx_tierra.setFont(new java.awt.Font("Calisto MT", 1, 12)); // NOI18N
        cbx_tierra.setForeground(new java.awt.Color(255, 255, 255));
        cbx_tierra.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cbx_tierra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tierraItemStateChanged(evt);
            }
        });
        cbx_tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tierraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipo_tierraLayout = new javax.swing.GroupLayout(tipo_tierra);
        tipo_tierra.setLayout(tipo_tierraLayout);
        tipo_tierraLayout.setHorizontalGroup(
            tipo_tierraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipo_tierraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_tierra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tipo_tierraLayout.setVerticalGroup(
            tipo_tierraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipo_tierraLayout.createSequentialGroup()
                .addComponent(cbx_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lvl_PH.setBackground(new java.awt.Color(102, 51, 0));
        lvl_PH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nivel de PH.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N
        lvl_PH.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtPH.setText("Nivel PH");
        txtPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPHMousePressed(evt);
            }
        });
        txtPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lvl_PHLayout = new javax.swing.GroupLayout(lvl_PH);
        lvl_PH.setLayout(lvl_PHLayout);
        lvl_PHLayout.setHorizontalGroup(
            lvl_PHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lvl_PHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPH)
                .addContainerGap())
        );
        lvl_PHLayout.setVerticalGroup(
            lvl_PHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lvl_PHLayout.createSequentialGroup()
                .addComponent(txtPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        txtPH.getAccessibleContext().setAccessibleName("txt_lvl_PH");

        cont_mnrl.setBackground(new java.awt.Color(102, 51, 0));
        cont_mnrl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minerales.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 24), new java.awt.Color(0, 204, 102))); // NOI18N

        BoxCalcio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BoxCalcio.setText("Calcio");

        BoxNitrogeno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BoxNitrogeno.setText("nitrogeno");

        BoxFosforo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BoxFosforo.setText("fosforo");

        BoxPotasio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BoxPotasio.setText("potasio");

        javax.swing.GroupLayout cont_mnrlLayout = new javax.swing.GroupLayout(cont_mnrl);
        cont_mnrl.setLayout(cont_mnrlLayout);
        cont_mnrlLayout.setHorizontalGroup(
            cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mnrlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(BoxNitrogeno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoxPotasio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cont_mnrlLayout.createSequentialGroup()
                        .addComponent(BoxCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BoxFosforo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        cont_mnrlLayout.setVerticalGroup(
            cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_mnrlLayout.createSequentialGroup()
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxFosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cont_mnrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxNitrogeno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxPotasio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo_tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lvl_PH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_planta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cont_mnrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipo_planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo_tierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lvl_PH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cont_mnrl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        lvl_PH.getAccessibleContext().setAccessibleDescription("");
        cont_mnrl.getAccessibleContext().setAccessibleName("Contenido Minerales.");

        SalaOperaciones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 270, 610));

        tablaT_Details.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaT_Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Minerales", "Nivel de PH", "Humedad", "Salinidad"
            }
        ));
        jScrollPane3.setViewportView(tablaT_Details);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );

        SalaOperaciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 610, 160));

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Valores (Referencias)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calisto MT", 1, 18), new java.awt.Color(102, 51, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 51, 0));

        tablaP_Details = new javax.swing.JTable()
        {

            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaP_Details.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaP_Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Minerales", "Nivel de PH", "Humedad del suelo", "Salinidad", "Tipo de Tierra"
            }
        ));
        tablaP_Details.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaP_Details.setFocusable(false);

        tablaP_Details.setGridColor(new java.awt.Color(255, 255, 255));

        tablaP_Details.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaP_Details);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        SalaOperaciones.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 610, 190));

        RealizarOperacion.setBackground(new java.awt.Color(102, 51, 0));
        RealizarOperacion.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        RealizarOperacion.setForeground(new java.awt.Color(153, 255, 153));
        RealizarOperacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/planta/iconos/evolucion.png"))); // NOI18N
        RealizarOperacion.setText("Realizar operacion.");
        RealizarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarOperacionActionPerformed(evt);
            }
        });
        SalaOperaciones.add(RealizarOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 80));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/un fondo más oscuro con un tema sobre plantas, estudios de tierra y fertilización.png"))); // NOI18N
        SalaOperaciones.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jTabbedPane2.addTab("Centro de operaciones.", SalaOperaciones);

        HistorialdeOpe.setPreferredSize(new java.awt.Dimension(902, 622));
        HistorialdeOpe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(102, 51, 0));
        jScrollPane2.setForeground(new java.awt.Color(0, 255, 0));

        HistorialModelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        HistorialModelo = new javax.swing.JTable()
        {

            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        HistorialModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Operacion", "Fecha", "Planta", "Nivel de PH", "Tipo de Tierra", "Mineral", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        HistorialModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HistorialModelo.setFocusable(false);

        HistorialModelo.setGridColor(new java.awt.Color(255, 255, 255));

        HistorialModelo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(HistorialModelo);

        HistorialdeOpe.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 890, 510));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENGRANDES/un fondo oscuro con un tema sobre plantas, estudios de tierra y minerales.png"))); // NOI18N
        HistorialdeOpe.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 720));

        jTabbedPane2.addTab("Historial de operaciones.", HistorialdeOpe);

        MenuOpe.setText("Guia de operaciones.");
        MenuOpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpeActionPerformed(evt);
            }
        });

        EjemploOpe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        EjemploOpe.setText("Ejemplo de operacion.");
        EjemploOpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjemploOpeActionPerformed(evt);
            }
        });
        MenuOpe.add(EjemploOpe);

        jMenuBar1.add(MenuOpe);

        jMenu2.setText("Opciones.");

        MenuPricipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
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
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Operaciones.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPricipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPricipalActionPerformed
       
        try {
            // Ruta al archivo de audio
            File audioFile = new File("src/Sonidos/Menu_salir.wav");
            if (!audioFile.exists()) {
                throw new IllegalArgumentException("El archivo de audio no existe: " + audioFile.getAbsolutePath());
            }

            // Crea el objeto Media y MediaPlayer
            String audioPath = audioFile.toURI().toString();
            MediaPlayer mediaPlayer = new MediaPlayer(new Media(audioPath));

            // Reproduce el audio
            mediaPlayer.play();

            // Espera a que el audio termine de reproducirse
            // (opcional, solo si quieres que el programa espere hasta que termine la reproducción)
            mediaPlayer.setOnEndOfMedia(() -> System.out.println("Reproducción finalizada"));
            mediaPlayer.play();
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            
        }
        
        Principal acceso = new Principal();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MenuPricipalActionPerformed

    private void SalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirProgramaActionPerformed

    private void RealizarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarOperacionActionPerformed
           
        String ph = txtPH.getText();

        //PRIMERO SON LAS CONDICIONES DE VALIDACION DE DATOS
        if (ph.equals("")   || (cbx_Planta.getSelectedItem() == null || cbx_Planta.getSelectedIndex() == 0) || (cbx_tierra.getSelectedItem() == null || cbx_tierra.getSelectedIndex() == 0))
        {
            JOptionPane.showMessageDialog(null, "Todos los campos tienen que estar rellenados, por favor verifica");
        }
        else{//aqui este es el primer else.
                  
            if (!BoxCalcio.isSelected() && !BoxFosforo.isSelected() && !BoxNitrogeno.isSelected()&& !BoxPotasio.isSelected()){

                JOptionPane.showMessageDialog(null, "No hay ningun tipo de mineral selecionado, por favor verifica");

            }else{ //aqui este es el segundo else.
                
                //EN EL IF DE ABAJO FALTA COMPLETAR ALGUNAS CODICIONES DE LOS MINERALES.
                 if ((BoxCalcio.isSelected() && BoxFosforo.isSelected() && BoxNitrogeno.isSelected()&& BoxPotasio.isSelected()) || (BoxCalcio.isSelected() && BoxFosforo.isSelected() && BoxNitrogeno.isSelected()) || (BoxPotasio.isSelected() && BoxFosforo.isSelected() && BoxNitrogeno.isSelected()) || (BoxCalcio.isSelected() && BoxFosforo.isSelected()) || (BoxNitrogeno.isSelected() && BoxFosforo.isSelected()) || (BoxPotasio.isSelected() && BoxFosforo.isSelected()))
        {
            JOptionPane.showMessageDialog(null, "Solo puede estar seleccionado un mineral para la operacion, por favor verifica"); 
        }
        else{ //ESTE ES EL ELSE DE LOS VARIOS MINERALES //Esta llave es del TERCER else

                //1* AQUI VIENE LA OPERACION UNA VEZ SE VALIDEN LOS DATOS.
                LocalDate fechaActual = LocalDate.now();
                String fechaString = fechaActual.toString();
                double PH = Double.parseDouble(txtPH.getText());
                String PHString = String.valueOf(PH);
                String planta = cbx_Planta.getSelectedItem().toString();
                String tierra = cbx_tierra.getSelectedItem().toString();
              
                //AQUI ESTA EL PRIMER TIPO DE PLANTA MARGARITA
                if ("Margarita".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
    
                    String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Calcio*<br>" +
        "• Calcio: Es esencial para el desarrollo celular y la estructura de la planta. Un suelo con un buen contenido de calcio ayuda a fortalecer las paredes celulares y promueve un crecimiento saludable.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de calcio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Franco Negra*<br>" +
        "• Tierra Franco Negra: Este tipo de suelo es ideal debido a su alta capacidad de retención de humedad y nutrientes, así como su excelente drenaje. Es rico en materia orgánica y favorece un crecimiento saludable.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
} else if ("Margarita".equals(planta) && "Franco Negra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Fosforo*<br>" +
        "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las margaritas florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de fosforo y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Franco Negra*<br>" +
        "• Tierra Franco Negra: Este tipo de suelo es ideal debido a su alta capacidad de retención de humedad y nutrientes, así como su excelente drenaje. Es rico en materia orgánica y favorece un crecimiento saludable.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
      //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Margarita".equals(planta) && "Franco Negra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Nitrogeno*<br>" +
        "• Nitrógeno: Es esencial para el crecimiento vegetativo y un suelo rico en nitrógeno promoverá un follaje saludable. Los suelos limosos orgánicos suelen tener un buen contenido de nitrógeno debido a su capacidad para retener materia orgánica.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Nitrogeno y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Franco Negra*<br>" +
        "• Tierra Franco Negra: Este tipo de suelo es ideal debido a su alta capacidad de retención de humedad y nutrientes, así como su excelente drenaje. Es rico en materia orgánica y favorece un crecimiento saludable.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Margarita".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Potasio*<br>" +
        "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal. Los suelos arenosos pueden necesitar enmiendas para asegurar niveles adecuados de potasio.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Potasio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Franco Negra*<br>" +
        "• Tierra Franco Negra: Este tipo de suelo es ideal debido a su alta capacidad de retención de humedad y nutrientes, así como su excelente drenaje. Es rico en materia orgánica y favorece un crecimiento saludable.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));

     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
    
   boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Margarita".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            

           String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Calcio*<br>" +
        "• Calcio: Es esencial para el desarrollo celular y la estructura de la planta. Un suelo con un buen contenido de calcio ayuda a fortalecer las paredes celulares y promueve un crecimiento saludable.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de calcio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arcilla*<br>" +
        "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }
         else if ("Margarita".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Fosforo*<br>" +
        "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las margaritas florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de fosforo y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arcilla*<br>" +
        "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Margarita".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Nitrogeno*<br>" +
        "• Nitrógeno: Es esencial para el crecimiento vegetativo y un suelo rico en nitrógeno promoverá un follaje saludable. Los suelos limosos orgánicos suelen tener un buen contenido de nitrógeno debido a su capacidad para retener materia orgánica.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Nitrogeno y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arcilla*<br>" +
        "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Margarita".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Potasio*<br>" +
        "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal. Los suelos arenosos pueden necesitar enmiendas para asegurar niveles adecuados de potasio.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Potasio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arcilla*<br>" +
        "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));

    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Margarita".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Calcio*<br>" +
        "• Calcio: Es esencial para el desarrollo celular y la estructura de la planta. Un suelo con un buen contenido de calcio ayuda a fortalecer las paredes celulares y promueve un crecimiento saludable.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de calcio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arena*<br>" +
        "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Margarita".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Fosforo*<br>" +
        "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las margaritas florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de fosforo y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arena*<br>" +
        "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Margarita".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            
            

             String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Nitrogeno*<br>" +
        "• Nitrógeno: Es esencial para el crecimiento vegetativo y un suelo rico en nitrógeno promoverá un follaje saludable. Los suelos limosos orgánicos suelen tener un buen contenido de nitrógeno debido a su capacidad para retener materia orgánica.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Nitrogeno y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arcilla*<br>" +
        "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Margarita".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Potasio*<br>" +
        "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal. Los suelos arenosos pueden necesitar enmiendas para asegurar niveles adecuados de potasio.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Potasio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Arena*<br>" +
        "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));

    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Margarita".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Calcio*<br>" +
        "• Calcio: Es esencial para el desarrollo celular y la estructura de la planta. Un suelo con un buen contenido de calcio ayuda a fortalecer las paredes celulares y promueve un crecimiento saludable.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de calcio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Limonosa Organica*<br>" +
        "• Tierra Limosa Orgánica: Ideal para el cultivo de margaritas, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
    
        }
         else if ("Margarita".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Fosforo*<br>" +
        "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las margaritas florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de fosforo y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Limonosa Organica*<br>" +
        "• Tierra Limosa Orgánica: Ideal para el cultivo de margaritas, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Margarita".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4.5 && PH <= 7.5)) {

           String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Nitrogeno*<br>" +
        "• Nitrógeno: Es esencial para el crecimiento vegetativo y un suelo rico en nitrógeno promoverá un follaje saludable. Los suelos limosos orgánicos suelen tener un buen contenido de nitrógeno debido a su capacidad para retener materia orgánica.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Nitrogeno y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Limonosa Organica*<br>" +
        "• Tierra Limosa Orgánica: Ideal para el cultivo de margaritas, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));
    
     //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        }else  if ("Margarita".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4.5 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
        "1. pH del Suelo<br>" +
        "• Rango Ideal: Las margaritas prefieren un pH entre 4.5 y 7.5. Este rango permite una buena absorción de nutrientes.<br>" +
        "• Prueba de pH: Puedes utilizar kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
        "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal; si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
        "▎2. Contenido de Minerales *Potasio*<br>" +
        "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal. Los suelos arenosos pueden necesitar enmiendas para asegurar niveles adecuados de potasio.<br>" +
        "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de Potasio y ajustar con enmiendas específicas si es necesario.<br><br>" +
        "▎3. Humedad del Suelo<br>" +
        "• Requerimientos Hídricos: Las margaritas no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
        "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
        "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
        "▎4. Salinidad<br>" +
        "• Tolerancia: Las margaritas son sensibles a la salinidad. Los suelos salinos pueden causar estrés hídrico y afectar el crecimiento.<br>" +
        "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
        "▎5. Tipo de Tierra *Limonosa Organica*<br>" +
        "• Tierra Limosa Orgánica: Ideal para el cultivo de margaritas, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br>" +
        "• Drenaje: Asegúrate de que el suelo tenga buen drenaje; puedes añadir perlita o arena gruesa si es necesario para mejorar la aireación.<br>" +
        "• Evitar Fertilizantes Excesivos: Las margaritas no necesitan suelos excesivamente fertilizados; un exceso puede llevar a un crecimiento desmedido del follaje en detrimento de las flores.<br><br>" +
        "▎6. Cuidados Generales<br>" +
        "• Ubicación: Busca un lugar que reciba al menos 6 horas de luz solar directa al día. Esto fomentará una floración robusta.<br>" +
        "• Poda: Realiza podas ligeras después de la floración para eliminar flores marchitas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
        "▎7. Fertilización<br>" +
        "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para flores.<br>" +
        "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente." +
        "</body></html>";

    // Mostrar el mensaje en un JOptionPane
    JOptionPane.showMessageDialog(null, mensaje,
            "Cuidados de las Margaritas", JOptionPane.DEFAULT_OPTION,
            new javax.swing.ImageIcon(getClass().getResource(
                    "/iconos/ciclo.png")));

    //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        } //AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! Bugambilia
        else if ("Bugambilia".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6.0 && PH <= 7.0))  {

                    String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Este mineral es importante para el desarrollo celular y la estructura de las paredes celulares. Un adecuado nivel de calcio ayuda a prevenir problemas como la pudrición apical y favorece la salud general de la planta. La cal también puede ser utilizada para aumentar los niveles de calcio en el suelo.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Franco Negra: Este tipo de suelo es ideal para el cultivo de bugambilias. La tierra Franco Negra es rica en materia orgánica, tiene buena retención de humedad y un excelente drenaje, lo que favorece el crecimiento saludable de las plantas. Además, su fertilidad natural proporciona los nutrientes necesarios para un desarrollo óptimo.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Bugambilia".equals(planta) && "Franco Negra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las bugambilias florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Franco Negra: Este tipo de suelo es ideal para el cultivo de bugambilias. La tierra Franco Negra es rica en materia orgánica, tiene buena retención de humedad y un excelente drenaje, lo que favorece el crecimiento saludable de las plantas. Además, su fertilidad natural proporciona los nutrientes necesarios para un desarrollo óptimo.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Bugambilia".equals(planta) && "Franco Negra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Es esencial para el crecimiento vegetativo. Un suelo rico en nitrógeno promoverá un follaje saludable y vigoroso en las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Franco Negra: Este tipo de suelo es ideal para el cultivo de bugambilias. La tierra Franco Negra es rica en materia orgánica, tiene buena retención de humedad y un excelente drenaje, lo que favorece el crecimiento saludable de las plantas. Además, su fertilidad natural proporciona los nutrientes necesarios para un desarrollo óptimo.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Bugambilia".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal para el crecimiento robusto de las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Franco Negra: Este tipo de suelo es ideal para el cultivo de bugambilias. La tierra Franco Negra es rica en materia orgánica, tiene buena retención de humedad y un excelente drenaje, lo que favorece el crecimiento saludable de las plantas. Además, su fertilidad natural proporciona los nutrientes necesarios para un desarrollo óptimo.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));
//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Bugambilia".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Este mineral es importante para el desarrollo celular y la estructura de las paredes celulares. Un adecuado nivel de calcio ayuda a prevenir problemas como la pudrición apical y favorece la salud general de la planta. La cal también puede ser utilizada para aumentar los niveles de calcio en el suelo.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }
         else if ("Bugambilia".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las bugambilias florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Bugambilia".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Es esencial para el crecimiento vegetativo. Un suelo rico en nitrógeno promoverá un follaje saludable y vigoroso en las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Bugambilia".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal para el crecimiento robusto de las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arcillosa: Rica en nutrientes y buena para retener humedad, pero puede drenar mal. Asegúrate de equilibrar con materia orgánica para mejorar la aireación.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Bugambilia".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Este mineral es importante para el desarrollo celular y la estructura de las paredes celulares. Un adecuado nivel de calcio ayuda a prevenir problemas como la pudrición apical y favorece la salud general de la planta. La cal también puede ser utilizada para aumentar los niveles de calcio en el suelo.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Bugambilia".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las bugambilias florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Bugambilia".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6.0 && PH <= 7.0)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Es esencial para el crecimiento vegetativo. Un suelo rico en nitrógeno promoverá un follaje saludable y vigoroso en las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Bugambilia".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
           String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal para el crecimiento robusto de las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Arenosa: Ofrece un excelente drenaje, pero puede carecer de nutrientes. Es recomendable enmendarla con compost o materia orgánica para mejorar su fertilidad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Bugambilia".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Este mineral es importante para el desarrollo celular y la estructura de las paredes celulares. Un adecuado nivel de calcio ayuda a prevenir problemas como la pudrición apical y favorece la salud general de la planta. La cal también puede ser utilizada para aumentar los niveles de calcio en el suelo.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Limosa Orgánica: Ideal para el cultivo de bugambilias, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        }
         else if ("Bugambilia".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Crucial para el desarrollo de raíces y la floración. Un contenido adecuado de fósforo es vital para que las bugambilias florezcan profusamente. Los suelos arcillosos pueden retener fósforo, pero a veces este mineral no está disponible para las plantas.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Limosa Orgánica: Ideal para el cultivo de bugambilias, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Bugambilia".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6.0 && PH <= 7.0)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Es esencial para el crecimiento vegetativo. Un suelo rico en nitrógeno promoverá un follaje saludable y vigoroso en las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Limosa Orgánica: Ideal para el cultivo de bugambilias, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Bugambilia".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6.0 && PH <= 7.0)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "• Rango Ideal: Las bugambilias prefieren un pH entre 6.0 y 7.0. Este rango permite una buena absorción de nutrientes, incluido el calcio, y un crecimiento saludable.<br>" +
    "• Prueba de pH: Utiliza kits de prueba de pH disponibles en tiendas de jardinería para verificar el nivel de acidez o alcalinidad de tu suelo.<br>" +
    "• Ajustes: Si el pH es demasiado ácido, puedes agregar cal (que también aporta calcio); si es muy alcalino, puedes usar azufre para acidificarlo.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Contribuye a la resistencia de la planta a enfermedades y mejora la calidad de las flores. Un suelo con un nivel moderado de potasio es ideal para el crecimiento robusto de las bugambilias.<br>" +
    "• Análisis de Suelo: Se recomienda realizar un análisis de suelo para determinar los niveles de estos minerales y ajustar con fertilizantes específicos si es necesario.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Las bugambilias son resistentes a la sequía y no requieren un riego excesivo. Es fundamental que el suelo drene bien para evitar el encharcamiento.<br>" +
    "• Frecuencia de Riego: Riega cuando la capa superior del suelo esté seca al tacto. En climas cálidos o durante períodos secos, puede ser necesario regar más frecuentemente.<br>" +
    "• Método de Riego: Es mejor regar en la base de la planta para evitar mojar las hojas, lo que puede fomentar enfermedades fúngicas.<br><br>" +
    "▎4. Salinidad<br>" +
    "• Tolerancia: Las bugambilias son moderadamente tolerantes a la salinidad, pero su crecimiento puede verse afectado en suelos muy salinos.<br>" +
    "• Prevención: Si vives en una zona con agua salina o suelos salinos, considera usar sistemas de riego por goteo para minimizar la exposición al sodio.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "• Tierra Limosa Orgánica: Ideal para el cultivo de bugambilias, ya que combina una buena retención de humedad con un excelente drenaje y nutrientes. Utiliza una mezcla que contenga compost para maximizar la fertilidad.<br><br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Busca un lugar que reciba al menos 5-6 horas de luz solar directa al día. Esto fomentará una floración robusta y un crecimiento saludable.<br>" +
    "• Poda: Realiza podas ligeras después de la floración para eliminar ramas muertas o enfermas y fomentar un crecimiento compacto. Esto también ayuda a prevenir enfermedades.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Frecuencia: Fertiliza cada 4-6 semanas durante la temporada de crecimiento con un fertilizante equilibrado (como 10-10-10) o uno específico para plantas con flores.<br>" +
    "• Tipo de Fertilizante: Un fertilizante líquido diluido es efectivo, así como el compost que también aportará nutrientes lentamente, incluyendo calcio.<br><br>" +
    "Con estos cuidados y condiciones adecuadas, tus bugambilias podrán florecer hermosamente y crecer saludables." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de las Bugambilias", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));
//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }//AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! TULIPANES
        else if ("Tulipanes".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7))  {
                    
                    String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Un nivel adecuado de calcio es esencial para el desarrollo de raíces sanas. Se recomienda un contenido de 1000-2000 mg/kg.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Franco negro: Bueno para el cultivo de tulipanes, ya que retiene humedad sin encharcar.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Tulipanes".equals(planta) && "FrancoNegra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4 && PH <= 8)) {
                
               String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Importante para la formación de raíces y flores. Un nivel de 30-50 mg/kg en el suelo es óptimo.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Franco negro: Bueno para el cultivo de tulipanes, ya que retiene humedad sin encharcar.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Tulipanes".equals(planta) && "FrancoNegra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Necesario para el crecimiento vegetativo. Un nivel moderado de 20-30 mg/kg es ideal; un exceso puede causar un crecimiento excesivo de hojas a expensas de las flores.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Franco negro: Bueno para el cultivo de tulipanes, ya que retiene humedad sin encharcar.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Tulipanes".equals(planta) && "FrancoNegra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Ayuda en la formación de flores y en la resistencia a enfermedades. Un contenido de 30-50 mg/kg es adecuado.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Franco negro: Bueno para el cultivo de tulipanes, ya que retiene humedad sin encharcar.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Tulipanes".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Un nivel adecuado de calcio es esencial para el desarrollo de raíces sanas. Se recomienda un contenido de 1000-2000 mg/kg.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arcilloso: No recomendado, ya que retiene demasiada humedad y puede causar pudrición de bulbos en los tulipanes.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
  
        }
         else if ("Tulipanes".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4 && PH <= 8)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Importante para la formación de raíces y flores. Un nivel de 30-50 mg/kg en el suelo es óptimo.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arcilloso: No recomendado, ya que retiene demasiada humedad y puede causar pudrición de bulbos en los tulipanes.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        } else  if ("Tulipanes".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Necesario para el crecimiento vegetativo. Un nivel moderado de 20-30 mg/kg es ideal; un exceso puede causar un crecimiento excesivo de hojas a expensas de las flores.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arcilloso: No recomendado, ya que retiene demasiada humedad y puede causar pudrición de bulbos tulipanes.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        }else  if ("Tulipanes".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Ayuda en la formación de flores y en la resistencia a enfermedades. Un contenido de 30-50 mg/kg es adecuado.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arcilloso: No recomendado, ya que retiene demasiada humedad y puede causar pudrición de bulbos en los tulipanes.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Tulipanes".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Un nivel adecuado de calcio es esencial para el desarrollo de raíces sanas. Se recomienda un contenido de 1000-2000 mg/kg.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arenoso: Excelente por su drenaje, pero puede requerir riegos más frecuentes debido a su rápida pérdida de humedad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Tulipanes".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4 && PH <= 8)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Importante para la formación de raíces y flores. Un nivel de 30-50 mg/kg en el suelo es óptimo.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arenoso: Excelente por su drenaje, pero puede requerir riegos más frecuentes debido a su rápida pérdida de humedad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);


        } else  if ("Tulipanes".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Necesario para el crecimiento vegetativo. Un nivel moderado de 20-30 mg/kg es ideal; un exceso puede causar un crecimiento excesivo de hojas a expensas de las flores.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arenoso: Excelente por su drenaje, pero puede requerir riegos más frecuentes debido a su rápida pérdida de humedad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Tulipanes".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Ayuda en la formación de flores y en la resistencia a enfermedades. Un contenido de 30-50 mg/kg es adecuado.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Arenoso: Excelente por su drenaje, pero puede requerir riegos más frecuentes debido a su rápida pérdida de humedad.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Tulipanes".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Calcio: Un nivel adecuado de calcio es esencial para el desarrollo de raíces sanas. Se recomienda un contenido de 1000-2000 mg/kg.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Limonoso Orgánico: También adecuado, Suelos enriquecidos con materia orgánica son beneficiosos, mejorando la estructura y la retención de nutrientes. ya que ofrece buena retención de humedad y drenaje.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);


        }
         else if ("Tulipanes".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 4 && PH <= 8)) {
                

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Fósforo: Importante para la formación de raíces y flores. Un nivel de 30-50 mg/kg en el suelo es óptimo.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Limonoso Orgánico: También adecuado, Suelos enriquecidos con materia orgánica son beneficiosos, mejorando la estructura y la retención de nutrientes. ya que ofrece buena retención de humedad y drenaje.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Tulipanes".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 4 && PH <= 8)) {           

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Nitrógeno: Necesario para el crecimiento vegetativo. Un nivel moderado de 20-30 mg/kg es ideal; un exceso puede causar un crecimiento excesivo de hojas a expensas de las flores.<br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Limonoso Orgánico: También adecuado, Suelos enriquecidos con materia orgánica son beneficiosos, mejorando la estructura y la retención de nutrientes. ya que ofrece buena retención de humedad y drenaje.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

 //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Tulipanes".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 4 && PH <= 8)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
    "▎1. pH del Suelo<br>" +
    "El pH óptimo para el cultivo de tulipanes se encuentra entre 6.0 y 7.0. Este rango es ideal porque favorece la disponibilidad de nutrientes esenciales para las plantas. Si el pH es demasiado ácido (por debajo de 6.0) o demasiado alcalino (por encima de 7.0), puede afectar negativamente el crecimiento y la floración.<br><br>" +
    "▎2. Contenido de Minerales<br>" +
    "• Potasio: Ayuda en la formación de flores y en la resistencia a enfermedades. Un contenido de 30-50 mg/kg es adecuado.<br><br>" +
    "▎3. Humedad del Suelo<br>" +
    "• Requerimientos Hídricos: Los tulipanes requieren un suelo que mantenga una humedad moderada. Durante su crecimiento, el suelo debe estar húmedo pero no encharcado.<br>" +
    "• Frecuencia de Riego: Generalmente, se recomienda regar cada 7-10 días, dependiendo de las condiciones climáticas y del tipo de suelo. Es importante ajustar la frecuencia según la lluvia y la temperatura.<br>" +
    "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro uniforme de agua y reduce el riesgo de enfermedades foliares al mantener las hojas secas. También se puede utilizar riego por aspersión, pero asegurándose de no mojar las flores.<br><br>" +
    "▎4. Salinidad<br>" +
    "Los tulipanes son sensibles a la salinidad y pueden sufrir estrés si los niveles son altos. Se recomienda mantener la salinidad del suelo por debajo de 1 dS/m. Para prevenir problemas:<br>" +
    "• Realizar análisis de suelo regularmente.<br>" +
    "• Utilizar agua de riego con baja salinidad.<br>" +
    "• Implementar prácticas de manejo del suelo que eviten la acumulación de sales, como la rotación de cultivos y el uso de enmiendas orgánicas.<br><br>" +
    "▎5. Tipo de Tierra<br>" +
    "Los tulipanes prefieren suelos bien drenados.<br>" +
    "• Limonoso Orgánico: También adecuado, Suelos enriquecidos con materia orgánica son beneficiosos, mejorando la estructura y la retención de nutrientes. ya que ofrece buena retención de humedad y drenaje.<br>" +
    "▎6. Cuidados Generales<br>" +
    "• Ubicación: Los tulipanes requieren pleno sol para florecer adecuadamente. Busca un lugar donde reciban al menos 6 horas de luz solar directa al día.<br>" +
    "• Poda: Después de la floración, se deben cortar las flores marchitas para evitar que la planta gaste energía en la producción de semillas. Sin embargo, es importante dejar el follaje intacto hasta que se haya vuelto amarillo, ya que esto permite que los bulbos almacenen energía para el próximo ciclo.<br><br>" +
    "▎7. Fertilización<br>" +
    "• Antes de Plantar: Incorporar un fertilizante balanceado (como un 10-10-10) al suelo antes de plantar los bulbos para proporcionar nutrientes esenciales.<br>" +
    "• Durante el Crecimiento: Aplicar un fertilizante alto en fósforo (como un 5-10-10) cuando los brotes comienzan a emerger para fomentar una buena floración.<br>" +
    "• Después de la Floración: Se puede aplicar un fertilizante bajo en nitrógeno para ayudar a los bulbos a acumular energía para el próximo ciclo." +
    "</body></html>";

// Mostrar el mensaje en un JOptionPane
JOptionPane.showMessageDialog(null, mensaje,
        "Cuidados de los Tulipanes", JOptionPane.DEFAULT_OPTION,
        new javax.swing.ImageIcon(getClass().getResource(
                "/iconos/ciclo.png")));

//DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! CORONA DE CRISTO
        else if ("Corona de cristo".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5))  {
                   
                    String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La Corona de Cristo tolera bien el calcio, que es importante para la salud general de la planta.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados. Los tipos de tierra recomendados son:<br>" +
                "• Franco negra: Adecuada por su capacidad de retención de nutrientes y agua, siempre que tenga buen drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Corona de cristo".equals(planta) && "Franco Negra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es fundamental para el desarrollo de raíces y flores. Un contenido adecuado en el suelo es necesario, generalmente alrededor de 20-40 mg/kg.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados. Los tipos de tierra recomendados son:<br>" +
                "• Franco negra: Adecuada por su capacidad de retención de nutrientes y agua, siempre que tenga buen drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Corona de cristo".equals(planta) && "Franco Negra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {     

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesario para el crecimiento vegetativo, se recomienda un nivel moderado para evitar un crecimiento excesivo a expensas de las flores.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Franco negra: Adecuada por su capacidad de retención de nutrientes y agua, siempre que tenga buen drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Corona de cristo".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la floración y la resistencia a enfermedades. Un nivel adecuado es crucial para un buen desarrollo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Franco negra: Adecuada por su capacidad de retención de nutrientes y agua, siempre que tenga buen drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Corona de cristo".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La Corona de Cristo tolera bien el calcio, que es importante para la salud general de la planta.<br>" +
                "• Fósforo: Es fundamental para el desarrollo de raíces y flores. Un contenido adecuado en el suelo es necesario, generalmente alrededor de 20-40 mg/kg.<br>" +
                "• Nitrógeno: Necesario para el crecimiento vegetativo, se recomienda un nivel moderado para evitar un crecimiento excesivo a expensas de las flores.<br>" +
                "• Potasio: Importante para la floración y la resistencia a enfermedades. Un nivel adecuado es crucial para un buen desarrollo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable, ya que tiende a retener demasiada humedad, lo que puede causar pudrición de raíces.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }
         else if ("Corona de cristo".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La Corona de Cristo tolera bien el calcio, que es importante para la salud general de la planta.<br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable, ya que tiende a retener demasiada humedad, lo que puede causar pudrición de raíces.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Corona de cristo".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesario para el crecimiento vegetativo, se recomienda un nivel moderado para evitar un crecimiento excesivo a expensas de las flores.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable, ya que tiende a retener demasiada humedad, lo que puede causar pudrición de raíces.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Corona de cristo".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la floración y la resistencia a enfermedades. Un nivel adecuado es crucial para un buen desarrollo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable, ya que tiende a retener demasiada humedad, lo que puede causar pudrición de raíces.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Corona de cristo".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La Corona de Cristo tolera bien el calcio, que es importante para la salud general de la planta.<br><br>" + 
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arenosa: Ideal para un buen drenaje, aunque puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Corona de cristo".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {           
                 String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es fundamental para el desarrollo de raíces y flores. Un contenido adecuado en el suelo es necesario, generalmente alrededor de 20-40 mg/kg.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arenosa: Ideal para un buen drenaje, aunque puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Corona de cristo".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {

             String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesario para el crecimiento vegetativo, se recomienda un nivel moderado para evitar un crecimiento excesivo a expensas de las flores.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arenosa: Ideal para un buen drenaje, aunque puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Corona de cristo".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la floración y la resistencia a enfermedades. Un nivel adecuado es crucial para un buen desarrollo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Arenosa: Ideal para un buen drenaje, aunque puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Corona de cristo".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La Corona de Cristo tolera bien el calcio, que es importante para la salud general de la planta.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Limonosa orgánica: Buena opción por su equilibrio entre retención de agua y drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Corona de cristo".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es fundamental para el desarrollo de raíces y flores. Un contenido adecuado en el suelo es necesario, generalmente alrededor de 20-40 mg/kg.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Limonosa orgánica: Buena opción por su equilibrio entre retención de agua y drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Corona de cristo".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesario para el crecimiento vegetativo, se recomienda un nivel moderado para evitar un crecimiento excesivo a expensas de las flores.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Limonosa orgánica: Buena opción por su equilibrio entre retención de agua y drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Corona de cristo".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal para el cultivo de la Corona de Cristo se sitúa entre 6.0 y 7.5. Prefiere suelos ligeramente ácidos a neutros. Un pH fuera de este rango puede afectar la absorción de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la floración y la resistencia a enfermedades. Un nivel adecuado es crucial para un buen desarrollo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La Corona de Cristo es una planta suculenta que tolera condiciones secas. Prefiere un suelo que se seque entre riegos.<br>" +
                "• Frecuencia de Riego: Riega cada 2-3 semanas en verano y reduce la frecuencia en invierno. Es importante no permitir que el suelo permanezca constantemente húmedo.<br>" +
                "• Método de Riego: Se recomienda el riego por goteo o riego en la base de la planta para evitar mojar las hojas y minimizar el riesgo de enfermedades.<br><br>" +
                "▎4. Salinidad<br>" +
                "La Corona de Cristo tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas relacionados con la salinidad:<br>" +
                "• Utiliza agua de riego con bajo contenido salino.<br>" +
                "• Evita la acumulación de sales en la superficie del suelo mediante un buen drenaje y riegos adecuados.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La Corona de Cristo prospera en suelos bien drenados.<br>" +
                "• Limonosa orgánica: Buena opción por su equilibrio entre retención de agua y drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Prefiere lugares soleados, con al menos 6 horas de luz solar directa al día. Ideal para climas cálidos y secos.<br>" +
                "• Poda: Realiza podas ligeras para eliminar ramas muertas o dañadas y fomentar un crecimiento más compacto. Se pueden podar después de la floración.<br><br>" +
                "▎7. Fertilización<br>" +
                "• Fertilización Inicial: Al momento de plantar, se puede aplicar un fertilizante balanceado (como 10-10-10) para asegurar un buen inicio.<br>" +
                "• Fertilización durante el Crecimiento: Durante la temporada de crecimiento (primavera y verano), se recomienda aplicar un fertilizante bajo en nitrógeno y alto en fósforo y potasio (como 5-10-10) cada 4-6 semanas.<br>" +
                "• Fertilización en Otoño e Invierno: Reduce o detén la fertilización en otoño e invierno, ya que la planta entra en un período de reposo.<br><br>" +
                "Recuerda que la Corona de Cristo es una planta resistente, pero requiere atención adecuada a sus necesidades específicas para prosperar." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Corona de Cristo", JOptionPane.DEFAULT_OPTION,
                new javax.swing.ImageIcon(getClass().getResource(
                        "/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! Ixoras
        else if ("Ixoras".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7))  {
                    
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: Las ixoras requieren un nivel moderado de calcio. Un suelo con buena estructura y drenaje generalmente proporciona suficiente calcio.<br>" +
                "• Fósforo: Es esencial para el crecimiento de las raíces y la floración. Un contenido adecuado de fósforo es importante, con un rango de 30-50 mg/kg en el suelo.<br>" +
                "• Nitrógeno: Necesitan nitrógeno para un crecimiento saludable. Se recomienda un nivel de 50-100 mg/kg en el suelo.<br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica. Los tipos de suelo que son adecuados incluyen:<br>" +
                "• Franco negra: Ideal, ya que retiene humedad y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Ixoras".equals(planta) && "FrancoNegra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el crecimiento de las raíces y la floración. Un contenido adecuado de fósforo es importante, con un rango de 30-50 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica. Los tipos de suelo que son adecuados incluyen:<br>" +
                "• Franco negra: Ideal, ya que retiene humedad y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Ixoras".equals(planta) && "Franco Negra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesitan nitrógeno para un crecimiento saludable. Se recomienda un nivel de 50-100 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica. Los tipos de suelo que son adecuados incluyen:<br>" +
                "• Franco negra: Ideal, ya que retiene humedad y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Ixoras".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica. Los tipos de suelo que son adecuados incluyen:<br>" +
                "• Franco negra: Ideal, ya que retiene humedad y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Ixoras".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: Las ixoras requieren un nivel moderado de calcio. Un suelo con buena estructura y drenaje generalmente proporciona suficiente calcio.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arcillosa: Puede ser utilizada si se mejora con materia orgánica para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Ixoras".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el crecimiento de las raíces y la floración. Un contenido adecuado de fósforo es importante, con un rango de 30-50 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arcillosa: Puede ser utilizada si se mejora con materia orgánica para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Ixoras".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7)) {
           
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesitan nitrógeno para un crecimiento saludable. Se recomienda un nivel de 50-100 mg/kg en el suelo.<br><br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arcillosa: Puede ser utilizada si se mejora con materia orgánica para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Ixoras".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arcillosa: Puede ser utilizada si se mejora con materia orgánica para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Ixoras".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: Las ixoras requieren un nivel moderado de calcio. Un suelo con buena estructura y drenaje generalmente proporciona suficiente calcio.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Adecuada si se mezcla con materia orgánica para mejorar la retención de agua.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Ixoras".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el crecimiento de las raíces y la floración. Un contenido adecuado de fósforo es importante, con un rango de 30-50 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Adecuada si se mezcla con materia orgánica para mejorar la retención de agua.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Ixoras".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Necesitan nitrógeno para un crecimiento saludable. Se recomienda un nivel de 50-100 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Adecuada si se mezcla con materia orgánica para mejorar la retención de agua.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Ixoras".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Adecuada si se mezcla con materia orgánica para mejorar la retención de agua.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Ixoras".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7)) {
            
           String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: Las ixoras requieren un nivel moderado de calcio. Un suelo con buena estructura y drenaje generalmente proporciona suficiente calcio.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: Muy buena opción, ya que proporciona un buen equilibrio entre drenaje y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Ixoras".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7)) {    

                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el crecimiento de las raíces y la floración. Un contenido adecuado de fósforo es importante, con un rango de 30-50 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: Muy buena opción, ya que proporciona un buen equilibrio entre drenaje y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Ixoras".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +       
                "• Nitrógeno: Necesitan nitrógeno para un crecimiento saludable. Se recomienda un nivel de 50-100 mg/kg en el suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: Muy buena opción, ya que proporciona un buen equilibrio entre drenaje y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Ixoras".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "Las ixoras prefieren un pH del suelo ligeramente ácido a neutro, idealmente entre 6.0 y 7.0. Un pH fuera de este rango puede afectar la disponibilidad de nutrientes.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Es fundamental para la floración y resistencia a enfermedades. Un nivel de 100-200 mg/kg es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: Las ixoras requieren un suelo que esté constantemente húmedo pero no encharcado. <br>" +
                "• Frecuencia de riego: Durante los meses cálidos, se recomienda regar una o dos veces por semana, dependiendo de las condiciones climáticas.<br>" +
                "• Método de riego: El riego por goteo es ideal para evitar el encharcamiento y asegurar que las raíces reciban suficiente agua.<br><br>" +
                "▎4. Salinidad<br>" +
                "Las ixoras son sensibles a la salinidad. <br>" +
                "• Tolerancia: No toleran suelos salinos; el exceso de sal puede causar quemaduras en las hojas y afectar el crecimiento.<br>" +
                "• Prevención: Para prevenir problemas de salinidad, es importante evitar el uso excesivo de fertilizantes químicos y asegurarse de que el drenaje sea adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "Las ixoras prefieren suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: Muy buena opción, ya que proporciona un buen equilibrio entre drenaje y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Las ixoras prosperan en lugares soleados, aunque pueden tolerar sombra parcial. Se recomienda al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: Se debe realizar una poda ligera después de la floración para mantener la forma y promover un crecimiento más denso. Eliminar ramas muertas o enfermas es esencial.<br><br>" +
                "▎7. Fertilización<br>" +
                "Se recomienda fertilizar las ixoras cada 4-6 semanas durante la temporada de crecimiento (primavera y verano) con un fertilizante equilibrado (por ejemplo, 10-10-10) o uno específico para plantas con flores. Durante el otoño e invierno, la fertilización puede reducirse o suspenderse.<br><br>" +
                "Con estos cuidados, tus ixoras deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de las Ixoras", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! Amapola rosa
        else if ("Amapola rosa".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5))  {
                    
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La amapola rosa requiere un contenido adecuado de calcio, que ayuda en la formación de estructuras celulares. Un nivel de 1-2% en el suelo es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Franco negra: Ideal por su equilibrio en nutrientes y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Amapola rosa".equals(planta) && "Franco Negra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el desarrollo de raíces y la floración. Se recomienda un contenido de fósforo disponible (P2O5) entre 40-60 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Franco negra: Ideal por su equilibrio en nutrientes y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);     

        } else  if ("Amapola rosa".equals(planta) && "FrancoNegra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de 0.1-0.3% es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Franco negra: Ideal por su equilibrio en nutrientes y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Amapola rosa".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Ayuda en la formación de flores y semillas. Se sugiere un contenido de potasio (K2O) entre 100-200 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Franco negra: Ideal por su equilibrio en nutrientes y retención de humedad.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Amapola rosa".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La amapola rosa requiere un contenido adecuado de calcio, que ayuda en la formación de estructuras celulares. Un nivel de 1-2% en el suelo es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "• Arcillosa: No es la más recomendada debido a su mala drenaje, aunque puede ser mejorada con enmiendas.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Amapola rosa".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el desarrollo de raíces y la floración. Se recomienda un contenido de fósforo disponible (P2O5) entre 40-60 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "• Arcillosa: No es la más recomendada debido a su mala drenaje, aunque puede ser mejorada con enmiendas.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);


        } else  if ("Amapola rosa".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de 0.1-0.3% es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "• Arcillosa: No es la más recomendada debido a su mala drenaje, aunque puede ser mejorada con enmiendas.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);


        }else  if ("Amapola rosa".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() &&(PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Ayuda en la formación de flores y semillas. Se sugiere un contenido de potasio (K2O) entre 100-200 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "• Arcillosa: No es la más recomendada debido a su mala drenaje, aunque puede ser mejorada con enmiendas.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);


        
        }//Desde aqui cambia la tierra.!
        else  if ("Amapola rosa".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La amapola rosa requiere un contenido adecuado de calcio, que ayuda en la formación de estructuras celulares. Un nivel de 1-2% en el suelo es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Buena para el drenaje, pero puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }
         else if ("Amapola rosa".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el desarrollo de raíces y la floración. Se recomienda un contenido de fósforo disponible (P2O5) entre 40-60 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Buena para el drenaje, pero puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Amapola rosa".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de 0.1-0.3% es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Buena para el drenaje, pero puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Amapola rosa".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Ayuda en la formación de flores y semillas. Se sugiere un contenido de potasio (K2O) entre 100-200 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Arenosa: Buena para el drenaje, pero puede requerir más fertilización.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));

        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Amapola rosa".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La amapola rosa requiere un contenido adecuado de calcio, que ayuda en la formación de estructuras celulares. Un nivel de 1-2% en el suelo es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: También adecuada, siempre que tenga buena estructura y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Amapola rosa".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() &&(PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para el desarrollo de raíces y la floración. Se recomienda un contenido de fósforo disponible (P2O5) entre 40-60 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: También adecuada, siempre que tenga buena estructura y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Amapola rosa".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de 0.1-0.3% es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: También adecuada, siempre que tenga buena estructura y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Amapola rosa".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH óptimo del suelo para el cultivo de amapola rosa se encuentra entre 6.0 y 7.5. Un pH dentro de este rango favorece la disponibilidad de nutrientes y el desarrollo radicular adecuado.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Ayuda en la formación de flores y semillas. Se sugiere un contenido de potasio (K2O) entre 100-200 mg/kg de suelo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos Hídricos: La amapola rosa necesita un suministro constante de agua, especialmente durante la germinación y la floración. Se recomienda una humedad del suelo del 60-70%.<br>" +
                "• Frecuencia de Riego: Dependiendo del clima, se puede regar cada 7-14 días, asegurando que el suelo no se seque completamente.<br>" +
                "• Método de Riego: El riego por goteo es ideal, ya que permite un suministro eficiente de agua y reduce la evaporación.<br><br>" +
                "▎4. Salinidad<br>" +
                "La amapola rosa tiene una baja tolerancia a la salinidad. Para prevenir problemas, es importante:<br>" +
                "• Mantener el pH del suelo en niveles adecuados.<br>" +
                "• Realizar análisis de suelo regularmente para monitorear los niveles de sal.<br>" +
                "• Implementar prácticas de manejo que eviten la acumulación de sales, como el drenaje adecuado.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La amapola rosa prefiere suelos bien drenados y ricos en materia orgánica.<br>" +
                "• Limonosa orgánica: También adecuada, siempre que tenga buena estructura y nutrientes.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: Requiere un lugar soleado con al menos 6 horas de luz solar directa al día.<br>" +
                "• Poda: La poda no es común en amapola rosa, pero se pueden eliminar las hojas muertas o dañadas para mejorar la circulación de aire y reducir enfermedades.<br><br>" +
                "▎7. Fertilización<br>" +
                "La fertilización debe ser equilibrada y basada en análisis de suelo. Se recomienda:<br>" +
                "• Aplicar un fertilizante NPK (nitrógeno, fósforo, potasio) antes de la siembra.<br>" +
                "• Considerar fertilizantes orgánicos como compost o estiércol bien descompuesto.<br>" +
                "• Realizar aplicaciones adicionales durante el ciclo de crecimiento, especialmente durante la floración.<br><br>" +
                "Con estos cuidados, tus amapolas rosas deberían crecer sanas y florecer abundantemente. ¡Buena suerte con tu cultivo!" +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Amapola Rosa", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png"))); 
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final
// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        
        }//AQUI VIENE OTRO TIPO DE PLANTA QUE LE SIGUE"! Rosa del desierto
        else if ("Rosa del desierto".equals(planta) && "Franco Negra".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5))  {
                    
                   String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La rosa del desierto se beneficia de un buen nivel de calcio, que ayuda a fortalecer las paredes celulares. Un contenido de 1-2% en el suelo es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Franco negra: Puede ser utilizada, pero debe estar bien drenada.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
 boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

            } else if ("Rosa del desierto".equals(planta) && "Franco Negra".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para la floración y el desarrollo radicular. Se recomienda un contenido de fósforo en el suelo de aproximadamente 15-30 ppm.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Franco negra: Puede ser utilizada, pero debe estar bien drenada.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Rosa del desierto".equals(planta) && "Franco Negra".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de entre 20-40 ppm es óptimo.<br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Franco negra: Puede ser utilizada, pero debe estar bien drenada.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Rosa del desierto".equals(planta) && "Franco Negra".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la formación de flores y resistencia a enfermedades. Un nivel de potasio en el suelo de aproximadamente 100-150 ppm es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Franco negra: Puede ser utilizada, pero debe estar bien drenada.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }  //Desde aqui cambia la tierra.!
        else  if ("Rosa del desierto".equals(planta) && "Arcilla".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La rosa del desierto se beneficia de un buen nivel de calcio, que ayuda a fortalecer las paredes celulares. Un contenido de 1-2% en el suelo es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable a menos que se mejore con enmiendas para aumentar el drenaje.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Rosa del desierto".equals(planta) && "Arcilla".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para la floración y el desarrollo radicular. Se recomienda un contenido de fósforo en el suelo de aproximadamente 15-30 ppm.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable a menos que se mejore con enmiendas para aumentar el drenaje.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Rosa del desierto".equals(planta) && "Arcilla".equals(tierra) && BoxNitrogeno.isSelected() &&(PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de entre 20-40 ppm es óptimo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable a menos que se mejore con enmiendas para aumentar el drenaje.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Rosa del desierto".equals(planta) && "Arcilla".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la formación de flores y resistencia a enfermedades. Un nivel de potasio en el suelo de aproximadamente 100-150 ppm es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arcillosa: No es recomendable a menos que se mejore con enmiendas para aumentar el drenaje.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Rosa del desierto".equals(planta) && "Arena".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La rosa del desierto se beneficia de un buen nivel de calcio, que ayuda a fortalecer las paredes celulares. Un contenido de 1-2% en el suelo es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arenosa: Ideal por su excelente drenaje y aireación.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
    boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        // Si no se encuentra un número, almacenar directamente el número 1
        numberAsString = "1";
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    System.out.println("El modelo no contiene filas."); // Imprimir si no hay filas en el modelo
    // Si no se encuentra un número, almacenar directamente el número 1
        numberAsString = "1";
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

  //AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
    String []info=new String[7];
        info[0] = numberAsString;
        info[1] = fechaString;
        info[2] = planta;
        info[3] = PHString;
        info[4] = tierra;
        info[5] =  stateString;
        info[6] = mensaje;
        modelo.addRow(info);
    
   try {
    // Establecer la conexión a la base de datos
    String url = "jdbc:mysql://localhost/sistema_planta";
    String usuario = "root";
    String contraseña = "";
    Connection cn = DriverManager.getConnection(url, usuario, contraseña);
    
    // Crear la consulta SQL con valores correctamente escapados
    String query = "INSERT INTO historial (ID_Operacion, Fecha, Planta, PH, Tierra, Mineral, Resultado) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement = cn.prepareStatement(query);
    
    // Asignar los valores a los parámetros de la consulta
    statement.setString(1, numberAsString);
    statement.setString(2, fechaString);
    statement.setString(3, cbx_Planta.getSelectedItem().toString());
    statement.setString(4, PHString);
    statement.setString(5, cbx_tierra.getSelectedItem().toString());
    statement.setString(6, stateString);
    statement.setString(7, mensaje);
    
    // Ejecutar la inserción
    statement.executeUpdate();
    
} catch (SQLException e) {
    e.printStackTrace();
}
        }
         else if ("Rosa del desierto".equals(planta) && "Arena".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para la floración y el desarrollo radicular. Se recomienda un contenido de fósforo en el suelo de aproximadamente 15-30 ppm.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Arenosa: Ideal por su excelente drenaje y aireación.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Rosa del desierto".equals(planta) && "Arena".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
             String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de entre 20-40 ppm es óptimo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados. Los tipos de tierra más adecuados son:<br>" +
                "• Arenosa: Ideal por su excelente drenaje y aireación.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Rosa del desierto".equals(planta) && "Arena".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            

             String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la formación de flores y resistencia a enfermedades. Un nivel de potasio en el suelo de aproximadamente 100-150 ppm es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados. Los tipos de tierra más adecuados son:<br>" +
                "• Arenosa: Ideal por su excelente drenaje y aireación.<br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }//Desde aqui cambia la tierra.!
        else  if ("Rosa del desierto".equals(planta) && "Limonosa Organica".equals(tierra) && BoxCalcio.isSelected() && (PH >= 6 && PH <= 7.5)) {

            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Calcio: La rosa del desierto se beneficia de un buen nivel de calcio, que ayuda a fortalecer las paredes celulares. Un contenido de 1-2% en el suelo es adecuado.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Limonosa orgánica: Puede ser adecuada si se mezcla con arena o perlita para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxCalcio.isSelected();
String stateString = isSelected ? "Calcio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);
        
        }
         else if ("Rosa del desierto".equals(planta) && "Limonosa Organica".equals(tierra) && BoxFosforo.isSelected() && (PH >= 6 && PH <= 7.5)) {
                
                String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Fósforo: Es esencial para la floración y el desarrollo radicular. Se recomienda un contenido de fósforo en el suelo de aproximadamente 15-30 ppm.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Limonosa orgánica: Puede ser adecuada si se mezcla con arena o perlita para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxFosforo.isSelected();
String stateString = isSelected ? "Fosforo" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        } else  if ("Rosa del desierto".equals(planta) && "Limonosa Organica".equals(tierra) && BoxNitrogeno.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Nitrógeno: Fundamental para el crecimiento vegetativo. Un nivel de nitrógeno en el suelo de entre 20-40 ppm es óptimo.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Limonosa orgánica: Puede ser adecuada si se mezcla con arena o perlita para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
         //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxNitrogeno.isSelected();
String stateString = isSelected ? "Nitrogeno" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
insertarEnBaseDeDatos(numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje);

        }else  if ("Rosa del desierto".equals(planta) && "Limonosa Organica".equals(tierra) && BoxPotasio.isSelected() && (PH >= 6 && PH <= 7.5)) {
            
            String mensaje = "<html><body style='width: 900px; font-size: 12px;'>" +
                "▎1. pH del Suelo<br>" +
                "El pH ideal del suelo para la rosa del desierto se encuentra entre 6.0 y 7.5. Este rango permite una buena disponibilidad de nutrientes y un crecimiento saludable.<br><br>" +
                "▎2. Contenido de Minerales<br>" +
                "• Potasio: Importante para la formación de flores y resistencia a enfermedades. Un nivel de potasio en el suelo de aproximadamente 100-150 ppm es ideal.<br><br>" +
                "▎3. Humedad del Suelo<br>" +
                "• Requerimientos hídricos: La rosa del desierto es una planta suculenta que requiere un riego moderado. Prefiere que el sustrato se seque entre riegos.<br>" +
                "• Frecuencia de riego: Generalmente, se recomienda regar cada 1-2 semanas durante la temporada de crecimiento (primavera y verano) y reducir la frecuencia en otoño e invierno.<br>" +
                "• Método de riego: El riego por inmersión o riego en la base es ideal, evitando mojar las hojas para prevenir enfermedades fúngicas.<br><br>" +
                "▎4. Salinidad<br>" +
                "La rosa del desierto tiene una tolerancia moderada a la salinidad, pero un exceso puede afectar su crecimiento. Para prevenir problemas:<br>" +
                "• Realizar análisis regulares del suelo.<br>" +
                "• Utilizar agua de riego con bajo contenido salino.<br>" +
                "• Implementar un buen drenaje en las macetas o en el suelo para evitar acumulación de sales.<br><br>" +
                "▎5. Tipo de Tierra<br>" +
                "La rosa del desierto prefiere suelos bien drenados.<br>" +
                "• Limonosa orgánica: Puede ser adecuada si se mezcla con arena o perlita para mejorar el drenaje.<br><br>" +
                "▎6. Cuidados Generales<br>" +
                "• Ubicación: La rosa del desierto prefiere lugares soleados, con al menos 6 horas de luz directa al día. Un lugar cálido y protegido del viento es ideal.<br>" +
                "• Poda: La poda se puede realizar para dar forma a la planta y eliminar ramas muertas o enfermas. Es mejor podar al final del invierno o al comienzo de la primavera.<br><br>" +
                "▎7. Fertilización<br>" +
                "Es importante realizar una fertilización adecuada para asegurar un buen crecimiento:<br>" +
                "• Fertilizantes NPK: Se recomienda aplicar un fertilizante equilibrado (como 10-10-10) cada 4-6 semanas durante la temporada de crecimiento.<br>" +
                "• Fertilizantes específicos para suculentas: También se pueden utilizar fertilizantes formulados específicamente para plantas suculentas, que suelen tener un menor contenido de nitrógeno.<br><br>" +
                "Recuerda que la rosa del desierto es una planta resistente que puede adaptarse a diversas condiciones, pero siempre es mejor seguir estas recomendaciones para asegurar su salud y belleza." +
                "</body></html>";

        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje,
                "Cuidados de la Rosa del Desierto", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/iconos/ciclo.png")));
        
        //DESDE AQUI COMIENZA EL CODIGO PARA EL HISTORIAL.
    //ESTO ES PARA LLEVAR EL MINERAL SELECCIONADO A STRING.
    boolean isSelected = BoxPotasio.isSelected();
String stateString = isSelected ? "Potasio" : "No seleccionado";
    
boolean hasNumber = false;
double maxNumber = 0; // Inicializar con 0
String numberAsString = null; // Variable para almacenar el número como String

if (modelo.getRowCount() > 0) {
    for (int rowIndex = 0; rowIndex < modelo.getRowCount(); rowIndex++) {
        Object value = modelo.getValueAt(rowIndex, 0); // Buscar en la primera columna (índice 0)
        System.out.println("Valor encontrado: " + value); // Imprimir el valor encontrado
        
        if (value instanceof Number || isNumeric(value.toString())) {
            hasNumber = true;
            // Convertir el número a double y verificar si es mayor que el máximo encontrado
            double number = (value instanceof Number) ? ((Number) value).doubleValue() : Double.parseDouble(value.toString());
            
            if (number > maxNumber) {
                maxNumber = number; // Actualizar el máximo encontrado
                System.out.println("Nuevo número máximo: " + maxNumber); // Imprimir el nuevo máximo
            }
        }
    }
    if (hasNumber) {
        maxNumber += 1.0; // Sumar 1 al número mayor
        numberAsString = Double.toString(maxNumber); // Convertir a String
        System.out.println("Número incrementado: " + numberAsString); // Imprimir el número incrementado
    } else {
        numberAsString = "1"; // Asignar 1 si no se encuentra un número
        System.out.println("No se encontraron números, asignando 1"); // Imprimir asignación de 1
    }
} else {
    numberAsString = "1"; // Asignar 1 si no hay filas en el modelo
    System.out.println("El modelo no contiene filas, asignando 1"); // Imprimir asignación de 1
}
System.out.println("Número final como String: " + numberAsString); // Imprimir el número final

// AQUI ES PARA GUARDARLO EN LA TABLA DEL PROGRAMA
String[] info = {numberAsString, fechaString, planta, PHString, tierra, stateString, mensaje};
modelo.addRow(info);

// Método para insertar datos en la base de datos
Conexion con = new Conexion();//lo pones al principio del todo RECUERDA EN EL INICIO DE LAS OPERACIONES DEL HISTORIAL
con.InsertarHistoria( fechaString, planta, PHString, tierra, stateString, mensaje);
        }
            
         }//ESTE ES EL ELSE DE LOS VARIOS MINERALES //Esta llave es del TERCER else

        //2* VERIFICAR LOS DATOS SELECCIONADOS POR EL USUARIO.

        }//Esta llave es del segundo else

        }//Esta llave es del primer else
    }//GEN-LAST:event_RealizarOperacionActionPerformed

    private void cbx_PlantaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_PlantaItemStateChanged
       
try { 
     
    Conexion con = new Conexion();
    
    // Obtener detalles de las plantas
    String plantaSeleccionada = this.cbx_Planta.getSelectedItem().toString();
    ArrayList<Plantas_Get_Set> Fila = con.Planta_Details(plantaSeleccionada);

    // Configurar el modelo de tabla
    DefaultTableModel table = new DefaultTableModel();
    table.addColumn("Nombre");
    table.addColumn("Minerales");
    table.addColumn("Nivel de PH");
    table.addColumn("Humedad");
    table.addColumn("Salinidad");
    table.addColumn("Tipo de Tierra");
    this.tablaP_Details.setModel(table);
    
    // Rellenar la tabla con los datos obtenidos
    for (Plantas_Get_Set fn : Fila) {
        Object[] obj = new Object[6];
        obj[0] = fn.getNombre_planta();
        obj[1] = fn.getContenidoDeMinerales();
        obj[2] = fn.getNivel_ph();
        obj[3] = fn.getHumedad_Suelo();
        obj[4] = fn.getSalinidad();
        obj[5] = fn.getTipo_tierra();

        table.addRow(obj);
    }
}catch (Exception e) {
    e.printStackTrace(); // Manejo general para otras excepciones
}
         // Manejo específico para SQLException
         
        
    }//GEN-LAST:event_cbx_PlantaItemStateChanged

    private void cbx_PlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseClicked
        //System.out.println(this.cbx_Planta.getSelectedItem().toString());
    }//GEN-LAST:event_cbx_PlantaMouseClicked

    private void cbx_PlantaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseEntered
        //
    }//GEN-LAST:event_cbx_PlantaMouseEntered

    private void cbx_PlantaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseExited
        //
    }//GEN-LAST:event_cbx_PlantaMouseExited

    private void cbx_PlantaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMousePressed
        //
    }//GEN-LAST:event_cbx_PlantaMousePressed

    private void cbx_PlantaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_PlantaMouseReleased
        //
    }//GEN-LAST:event_cbx_PlantaMouseReleased

    private void cbx_PlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_PlantaActionPerformed

    }//GEN-LAST:event_cbx_PlantaActionPerformed

    private void cbx_tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tierraActionPerformed

    }//GEN-LAST:event_cbx_tierraActionPerformed

    private void MenuOpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpeActionPerformed
        Imagen1 acceso = new  Imagen1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MenuOpeActionPerformed

    private void EjemploOpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjemploOpeActionPerformed
        Imagen1 acceso = new  Imagen1();
        acceso.setVisible(true);
        acceso.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_EjemploOpeActionPerformed

    private void txtPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHActionPerformed

    private void txtPHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPHMousePressed
        txtPH.setText("");
    }//GEN-LAST:event_txtPHMousePressed

    private void cbx_tierraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tierraItemStateChanged
       // Crear la conexión


// Usar try-with-resources para asegurar el cierre adecuado de la conexión
try { 
    Conexion con = new Conexion();
    // Obtener detalles de la tierra
    ArrayList<TipoTierra_Get_Set> Fila = con.Tierra_Details(this.cbx_tierra.getSelectedItem().toString());

    // Configurar el modelo de tabla
    DefaultTableModel table = new DefaultTableModel();
    table.addColumn("Nombre");
    table.addColumn("Minerales");
    table.addColumn("Nivel de PH");
    table.addColumn("Humedad");
    table.addColumn("Salinidad");
    this.tablaT_Details.setModel(table);

    // Rellenar la tabla con los datos obtenidos
    for (TipoTierra_Get_Set fn : Fila) {
        Object[] obj = new Object[5];
        obj[0] = fn.getNombreTierra();
        obj[1] = fn.getContenidoDeMinerales();
        obj[2] = fn.getNivelPh();
        obj[3] = fn.getHumedadSuelo();
        obj[4] = fn.getSalinidad();

        table.addRow(obj);
    }
}catch (Exception e) {
    e.printStackTrace(); // Manejo general para otras excepciones
}
         

    }//GEN-LAST:event_cbx_tierraItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoxCalcio;
    private javax.swing.JCheckBox BoxFosforo;
    private javax.swing.JCheckBox BoxNitrogeno;
    private javax.swing.JCheckBox BoxPotasio;
    private javax.swing.JMenuItem EjemploOpe;
    private javax.swing.JTable HistorialModelo;
    private javax.swing.JPanel HistorialdeOpe;
    private javax.swing.JMenu MenuOpe;
    private javax.swing.JMenuItem MenuPricipal;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton RealizarOperacion;
    private javax.swing.JPanel SalaOperaciones;
    private javax.swing.JMenuItem SalirPrograma;
    private javax.swing.JComboBox<String> cbx_Planta;
    private javax.swing.JComboBox<String> cbx_tierra;
    private javax.swing.JPanel cont_mnrl;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel lvl_PH;
    private javax.swing.JTable tablaP_Details;
    private javax.swing.JTable tablaT_Details;
    private javax.swing.JPanel tipo_planta;
    private javax.swing.JPanel tipo_tierra;
    private javax.swing.JTextField txtPH;
    // End of variables declaration//GEN-END:variables
}
