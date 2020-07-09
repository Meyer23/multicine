
package paqueteprincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author Robert
 */
public class ventanaprincipal extends javax.swing.JFrame {
    
    SalaCine central;
    SalaCine vo;


    public ventanaprincipal() {
        initComponents();
        central = new SalaCine();
        vo = new SalaCine();
        
        central.setAforo(500);
        central.setEntrada(8.00);
        
        vo.setAforo(80);
        vo.setEntrada(6.00);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        nombreSala = new javax.swing.JLabel();
        etiCentralPelicula = new javax.swing.JLabel();
        pelicula = new javax.swing.JLabel();
        btnCentralCambiar = new javax.swing.JButton();
        btnCentralNueva = new javax.swing.JButton();
        btnCentralOcupacion = new javax.swing.JButton();
        btnCentralVaciar = new javax.swing.JButton();
        btnCentralIngresos = new javax.swing.JButton();
        panelOriginal = new javax.swing.JPanel();
        nombreSala2 = new javax.swing.JLabel();
        nombrePelicula2 = new javax.swing.JLabel();
        etiOriginalPelicula = new javax.swing.JLabel();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngresos = new javax.swing.JButton();
        btnOriginalCambiar = new javax.swing.JButton();
        btnIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCentral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nombreSala.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreSala.setText("SALA CENTRAL");

        etiCentralPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pelicula.setText("Película");

        btnCentralCambiar.setText("Cambiar");
        btnCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralCambiarActionPerformed(evt);
            }
        });

        btnCentralNueva.setText("Nueva venta");
        btnCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralNuevaActionPerformed(evt);
            }
        });

        btnCentralOcupacion.setText("% Ocupación");
        btnCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralOcupacionActionPerformed(evt);
            }
        });

        btnCentralVaciar.setText("Vaciar");
        btnCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralVaciarActionPerformed(evt);
            }
        });

        btnCentralIngresos.setText("Ingresos");
        btnCentralIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreSala)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCentralCambiar))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnCentralNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentralIngresos)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreSala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addComponent(etiCentralPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCentralCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentralNueva)
                    .addComponent(btnCentralOcupacion)
                    .addComponent(btnCentralVaciar)
                    .addComponent(btnCentralIngresos))
                .addGap(22, 22, 22))
        );

        panelOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombreSala2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreSala2.setText("SALA VERSION ORIGINAL");

        nombrePelicula2.setText("Película");

        etiOriginalPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOriginalNueva.setText("Nueva venta");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setText("% Ocupación");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setText("Vaciar");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngresos.setText("Ingresos");
        btnOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresosActionPerformed(evt);
            }
        });

        btnOriginalCambiar.setText("Cambiar");
        btnOriginalCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOriginalLayout = new javax.swing.GroupLayout(panelOriginal);
        panelOriginal.setLayout(panelOriginalLayout);
        panelOriginalLayout.setHorizontalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addComponent(nombrePelicula2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalCambiar))
                    .addComponent(nombreSala2)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addComponent(btnOriginalNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOriginalIngresos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOriginalLayout.setVerticalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreSala2)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombrePelicula2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOriginalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnOriginalCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOriginalNueva)
                    .addComponent(btnOriginalOcupacion)
                    .addComponent(btnOriginalVaciar)
                    .addComponent(btnOriginalIngresos))
                .addGap(24, 24, 24))
        );

        btnIngresosTotales.setText("Ingresos Totales");
        btnIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresosTotales)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresosTotales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralCambiarActionPerformed
        String titulo;
        titulo = JOptionPane.showInputDialog(null, "Introduce el título de la película");
        central.setPelicula(titulo);
        etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCentralCambiarActionPerformed

    private void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralNuevaActionPerformed
        central.entraUno();
    }//GEN-LAST:event_btnCentralNuevaActionPerformed

    private void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralOcupacionActionPerformed
        String info; 
        info = "Sala Central\n"; 
        info = info + "Película: "+central.getPelicula()+"\n";
        info = info + "Aforo: "+central.getAforo()+"\n";
        info = info + "Ocupadas: "+central.getOcupadas()+"\n";
        info = info + "Libres: "+central.getLibres()+"\n";
        info = info + "Porcentaje Ocupación: "+central.getPorcentaje()+"\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralOcupacionActionPerformed

    private void btnCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralVaciarActionPerformed
        central.Vaciar();
        etiCentralPelicula.setText("");
    }//GEN-LAST:event_btnCentralVaciarActionPerformed

    private void btnCentralIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralIngresosActionPerformed
        String info; 
        info = "Ingresos de la sala: "+central.getIngresos()+" euros";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralIngresosActionPerformed

    private void btnOriginalCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalCambiarActionPerformed
        String titulo;
        titulo = JOptionPane.showInputDialog(null, "Introduce el título de la película");
        vo.setPelicula(titulo);
        etiOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_btnOriginalCambiarActionPerformed

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
        vo.entraUno();
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
        String info; 
        info = "Sala Original\n"; 
        info = info + "Película: "+vo.getPelicula()+"\n";
        info = info + "Aforo: "+vo.getAforo()+"\n";
        info = info + "Ocupadas: "+vo.getOcupadas()+"\n";
        info = info + "Libres: "+vo.getLibres()+"\n";
        info = info + "Porcentaje Ocupación: "+vo.getPorcentaje()+"\n";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
        vo.Vaciar();
        etiOriginalPelicula.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    private void btnOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresosActionPerformed
        String info; 
        info = "Ingresos de la sala: "+vo.getIngresos()+" euros";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalIngresosActionPerformed

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
       String info; 
       double ingresovo = vo.getIngresos();
       double ingresocentral = central.getIngresos();
       double result = ingresovo + ingresocentral;
       info = "Ingresos totales: "+result+" euros";
       JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralCambiar;
    private javax.swing.JButton btnCentralIngresos;
    private javax.swing.JButton btnCentralNueva;
    private javax.swing.JButton btnCentralOcupacion;
    private javax.swing.JButton btnCentralVaciar;
    private javax.swing.JButton btnIngresosTotales;
    private javax.swing.JButton btnOriginalCambiar;
    private javax.swing.JButton btnOriginalIngresos;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiOriginalPelicula;
    private javax.swing.JLabel nombrePelicula2;
    private javax.swing.JLabel nombreSala;
    private javax.swing.JLabel nombreSala2;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelOriginal;
    private javax.swing.JLabel pelicula;
    // End of variables declaration//GEN-END:variables
}
