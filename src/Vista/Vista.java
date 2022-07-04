/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.DefaultListModel;

public class Vista extends javax.swing.JFrame {

   public DefaultListModel<String> Historial = new DefaultListModel<>();
   public DefaultListModel<String> contenidoPila1 = new DefaultListModel<>();
   public DefaultListModel<String> contenidoPila2 = new DefaultListModel<>();

    public Vista() {
        initComponents();
        modelo();
    }

    public void modelo() {

        lstAcciones.setModel(Historial);

        lstPila1.setModel(contenidoPila1);
        lstPila2.setModel(contenidoPila2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnNegrita = new javax.swing.JButton();
        btnItalic = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlLista = new javax.swing.JPanel();
        lblAcciones = new javax.swing.JLabel();
        lblPila1 = new javax.swing.JLabel();
        lblPila2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAcciones = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPila2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstPila1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(0, 51, 51));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 51)));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Etiqueta.jpg"))); // NOI18N
        lblImagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblImagen.setPreferredSize(new java.awt.Dimension(242, 450));

        pnlBotones.setBackground(new java.awt.Color(0, 51, 51));
        pnlBotones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 51)));

        btnNegrita.setBackground(new java.awt.Color(51, 51, 51));
        btnNegrita.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNegrita.setForeground(new java.awt.Color(255, 255, 255));
        btnNegrita.setText("Negrita");

        btnItalic.setBackground(new java.awt.Color(51, 51, 51));
        btnItalic.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        btnItalic.setForeground(new java.awt.Color(255, 255, 255));
        btnItalic.setText("Italic");
        btnItalic.setMaximumSize(new java.awt.Dimension(85, 29));
        btnItalic.setMinimumSize(new java.awt.Dimension(85, 29));
        btnItalic.setPreferredSize(new java.awt.Dimension(85, 29));

        btnColor.setBackground(new java.awt.Color(51, 51, 51));
        btnColor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnColor.setForeground(new java.awt.Color(255, 0, 0));
        btnColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color.png"))); // NOI18N
        btnColor.setMaximumSize(new java.awt.Dimension(85, 29));
        btnColor.setMinimumSize(new java.awt.Dimension(85, 29));
        btnColor.setPreferredSize(new java.awt.Dimension(85, 29));

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMaximumSize(new java.awt.Dimension(85, 29));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(85, 29));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(85, 29));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNegrita)
                .addGap(18, 18, 18)
                .addComponent(btnItalic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnNegrita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnItalic, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlLista.setBackground(new java.awt.Color(0, 51, 51));
        pnlLista.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 51)));

        lblAcciones.setForeground(new java.awt.Color(153, 255, 51));
        lblAcciones.setText("Acciones");

        lblPila1.setForeground(new java.awt.Color(153, 255, 51));
        lblPila1.setText("Pila 1");

        lblPila2.setForeground(new java.awt.Color(153, 255, 51));
        lblPila2.setText("Pila 2");

        lstAcciones.setBackground(new java.awt.Color(51, 51, 51));
        lstAcciones.setForeground(new java.awt.Color(255, 255, 255));
        lstAcciones.setModel(Historial);
        jScrollPane2.setViewportView(lstAcciones);

        lstPila2.setBackground(new java.awt.Color(51, 51, 51));
        lstPila2.setForeground(new java.awt.Color(255, 255, 255));
        lstPila2.setModel(contenidoPila2);
        jScrollPane4.setViewportView(lstPila2);

        lstPila1.setBackground(new java.awt.Color(51, 51, 51));
        lstPila1.setForeground(new java.awt.Color(255, 255, 255));
        lstPila1.setModel(contenidoPila1);
        jScrollPane7.setViewportView(lstPila1);

        javax.swing.GroupLayout pnlListaLayout = new javax.swing.GroupLayout(pnlLista);
        pnlLista.setLayout(pnlListaLayout);
        pnlListaLayout.setHorizontalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcciones)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                        .addComponent(lblPila1)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlListaLayout.createSequentialGroup()
                        .addComponent(lblPila2)
                        .addContainerGap())))
        );
        pnlListaLayout.setVerticalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPila1)
                    .addComponent(lblAcciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlListaLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPila2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        txtArea.setBackground(new java.awt.Color(51, 51, 51));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        txtArea.setText(" Lorem ipsum dolor sit amet, consectetur \nadipisicing elit, sed do eiusmod tempor \nincididunt ut labore et dolore magna aliqua. \n Ut enim ad minim veniam, quis nostrud\nexercitation ullamco laboris nisi ut aliquip \nex ea commodo consequat.\n Duis aute irure dolor in reprehenderit \nin voluptate velit esse cillum dolore eu fugiat \nnulla pariatur. Excepteur sint occaecat \ncupidatat non proident, sunt in culpa qui \nofficia deserunt mollit anim id est laborum.\n");
        txtArea.setMaximumSize(new java.awt.Dimension(277, 294));
        txtArea.setMinimumSize(new java.awt.Dimension(277, 294));
        txtArea.setPreferredSize(new java.awt.Dimension(277, 294));
        jScrollPane3.setViewportView(txtArea);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 51)));

        btnDeshacer.setBackground(new java.awt.Color(0, 51, 51));
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        btnDeshacer.setActionCommand("Deshacer");
        btnDeshacer.setMaximumSize(new java.awt.Dimension(90, 38));
        btnDeshacer.setMinimumSize(new java.awt.Dimension(90, 38));
        btnDeshacer.setPreferredSize(new java.awt.Dimension(90, 38));

        btnRehacer.setBackground(new java.awt.Color(0, 51, 51));
        btnRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rehacer.png"))); // NOI18N
        btnRehacer.setMaximumSize(new java.awt.Dimension(90, 38));
        btnRehacer.setMinimumSize(new java.awt.Dimension(90, 38));
        btnRehacer.setPreferredSize(new java.awt.Dimension(90, 38));

        btnVaciar.setBackground(new java.awt.Color(0, 51, 51));
        btnVaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaciar.png"))); // NOI18N
        btnVaciar.setMaximumSize(new java.awt.Dimension(90, 38));
        btnVaciar.setMinimumSize(new java.awt.Dimension(90, 38));
        btnVaciar.setPreferredSize(new java.awt.Dimension(90, 38));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeshacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRehacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeshacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRehacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnColor;
    public javax.swing.JButton btnDeshacer;
    public javax.swing.JButton btnItalic;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnNegrita;
    public javax.swing.JButton btnRehacer;
    public javax.swing.JButton btnVaciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAcciones;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPila1;
    private javax.swing.JLabel lblPila2;
    public javax.swing.JList<String> lstAcciones;
    public javax.swing.JList<String> lstPila1;
    public javax.swing.JList<String> lstPila2;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlPrincipal;
    public javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
