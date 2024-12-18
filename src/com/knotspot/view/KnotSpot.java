/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;

/**
 *
 * @author eerii
 */
public class KnotSpot extends javax.swing.JFrame {

    private final String absolutePathForImage = "C:/Users/eerii\\OneDrive - islingtoncollege.edu.np\\CWs\\KnotSpot\\src\\com\\knotspot\\resource\\";

    /**
     * Creates new form knotSpotInterface
     */
    public KnotSpot() {
        initComponents();
        startProgress();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminDashboardPnl = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        navigationPnl = new javax.swing.JPanel();
        contentDisplayPnl = new javax.swing.JPanel();
        loadingPagePnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        loadingSymbolLbl = new javax.swing.JLabel();
        loadingValueLbl = new javax.swing.JLabel();
        loadingPrgBar = new javax.swing.JProgressBar();
        loadingCoverImgLbl = new javax.swing.JLabel();

        adminDashboardPnl.setMaximumSize(new java.awt.Dimension(670, 377));
        adminDashboardPnl.setMinimumSize(new java.awt.Dimension(670, 377));
        adminDashboardPnl.setPreferredSize(new java.awt.Dimension(670, 377));

        navigationPnl.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout navigationPnlLayout = new javax.swing.GroupLayout(navigationPnl);
        navigationPnl.setLayout(navigationPnlLayout);
        navigationPnlLayout.setHorizontalGroup(
            navigationPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        navigationPnlLayout.setVerticalGroup(
            navigationPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(navigationPnl);

        contentDisplayPnl.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout contentDisplayPnlLayout = new javax.swing.GroupLayout(contentDisplayPnl);
        contentDisplayPnl.setLayout(contentDisplayPnlLayout);
        contentDisplayPnlLayout.setHorizontalGroup(
            contentDisplayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        contentDisplayPnlLayout.setVerticalGroup(
            contentDisplayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(contentDisplayPnl);

        javax.swing.GroupLayout adminDashboardPnlLayout = new javax.swing.GroupLayout(adminDashboardPnl);
        adminDashboardPnl.setLayout(adminDashboardPnlLayout);
        adminDashboardPnlLayout.setHorizontalGroup(
            adminDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        adminDashboardPnlLayout.setVerticalGroup(
            adminDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("23048598ErikaShrestha");
        setMinimumSize(new java.awt.Dimension(670, 377));

        loadingPagePnl.setMaximumSize(new java.awt.Dimension(670, 377));
        loadingPagePnl.setMinimumSize(new java.awt.Dimension(670, 377));
        loadingPagePnl.setPreferredSize(new java.awt.Dimension(670, 377));
        loadingPagePnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLbl.setText("Knot on the spot! ");
        loadingPagePnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        loadingSymbolLbl.setText("loading.....");
        loadingPagePnl.add(loadingSymbolLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        loadingValueLbl.setText("0%");
        loadingPagePnl.add(loadingValueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));
        loadingPagePnl.add(loadingPrgBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 670, 10));

        loadingCoverImgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/knotspot/resource/picture5.png"))); // NOI18N
        loadingCoverImgLbl.setMaximumSize(new java.awt.Dimension(508, 491));
        loadingCoverImgLbl.setMinimumSize(new java.awt.Dimension(508, 491));
        loadingCoverImgLbl.setPreferredSize(new java.awt.Dimension(508, 491));
        loadingPagePnl.add(loadingCoverImgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 340, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadingPagePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadingPagePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50); // Simulated delay for progress bar
                    loadingValueLbl.setText(i + "%");
                    publish(i); // Publish progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                loadingPrgBar.setValue(progress);
                if (progress == 20) {
                    loadingSymbolLbl.setText("welcome to our system...");
                    ImageIcon icon = new ImageIcon(absolutePathForImage + "picture3.png");
                    loadingCoverImgLbl.setIcon(icon);

                }
                if (progress == 40) {
                    loadingSymbolLbl.setText("10 venues are ready to be booked...");
                    ImageIcon icon = new ImageIcon(absolutePathForImage + "picture6.png");
                    loadingCoverImgLbl.setIcon(icon);

                }
                if (progress == 60) {
                    loadingSymbolLbl.setText("let us join in your new innings...");
                    ImageIcon icon = new ImageIcon(absolutePathForImage + "picture1.png");
                    loadingCoverImgLbl.setIcon(icon);

                }
                if (progress == 80) {
                    loadingSymbolLbl.setText("happy weddings...");
                    ImageIcon icon = new ImageIcon(absolutePathForImage + "picture2.png");
                    loadingCoverImgLbl.setIcon(icon);

                }
                if (progress == 100) {
                    loadingSymbolLbl.setText("Manage stuffs...");
                    ImageIcon icon = new ImageIcon(absolutePathForImage + "picture4.png");
                    loadingCoverImgLbl.setIcon(icon);

                }
            }
        };
        worker.execute(); // Start the worker thread
    }

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
            java.util.logging.Logger.getLogger(KnotSpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnotSpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnotSpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnotSpot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KnotSpot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminDashboardPnl;
    private javax.swing.JPanel contentDisplayPnl;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel loadingCoverImgLbl;
    private javax.swing.JPanel loadingPagePnl;
    private javax.swing.JProgressBar loadingPrgBar;
    private javax.swing.JLabel loadingSymbolLbl;
    private javax.swing.JLabel loadingValueLbl;
    private javax.swing.JPanel navigationPnl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
