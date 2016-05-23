package all;

import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    Client client;
    Server server;

    DefaultTableModel model;
    Loggui logGUI;

    HashMap moveMap;
    HashMap pressedMap;

    String pressedTwoKeys;
    String pressedOneKey;
    String previouseMove;

    // boolean ShiftKeyPressed = false;
    public GUI(String ip, int vehiclePort, int remotePort) {
        initComponents();
        setLocationRelativeTo(null);

        client = new Client(ip, vehiclePort);
        server = new Server(remotePort, lblmsg);

        logGUI = new Loggui();
        logGUI.setLocation(this.getLocation().x + this.getWidth(), this.getLocation().y);

        model = logGUI.getTableModel();

        try {
            lblRemoteIP.setText(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            lblRemoteIP.setText("Couldn't find");
        }
        lblVehicleIP.setText(ip);
        lblVehiclePort.setText(Integer.toString(vehiclePort));
        lblRemotePort.setText(Integer.toString(remotePort));

        setMap();
    }

    void setMap() {
        moveMap = new HashMap();
        pressedMap = new HashMap();

        String[] directions = {"F", "B", "R", "L", "Shift"};
        boolean[] pressed = {false, false, false, false, false};
        int[] keyCodes = {38, 40, 39, 37, 16};

        for (int i = 0; i < keyCodes.length; i++) {
            moveMap.put(keyCodes[i], directions[i]);
            pressedMap.put(keyCodes[i], pressed[i]);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        up = new javax.swing.JButton();
        right = new javax.swing.JButton();
        left = new javax.swing.JButton();
        down = new javax.swing.JButton();
        btnConnect = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        lblVehiclePort = new javax.swing.JLabel();
        lblVehicleIP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlabel12 = new javax.swing.JLabel();
        lblRemoteIP = new javax.swing.JLabel();
        lblRemotePort = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblmsg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        up.setText("up");
        up.setFocusable(false);
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upMouseReleased(evt);
            }
        });
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                upKeyReleased(evt);
            }
        });

        right.setText("right");
        right.setFocusable(false);
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rightMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rightMouseReleased(evt);
            }
        });
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        right.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rightKeyReleased(evt);
            }
        });

        left.setText("left");
        left.setFocusable(false);
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leftMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leftMouseReleased(evt);
            }
        });
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        left.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leftKeyReleased(evt);
            }
        });

        down.setText("down");
        down.setFocusable(false);
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                downMouseReleased(evt);
            }
        });
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        down.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                downKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                downKeyReleased(evt);
            }
        });

        btnConnect.setBackground(new java.awt.Color(255, 51, 51));
        btnConnect.setToolTipText("Connect");
        btnConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConnectMouseClicked(evt);
            }
        });
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        btnConnect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConnectKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnConnectKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );

        jToggleButton1.setText("log");
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblVehiclePort.setText("port");
        lblVehiclePort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVehicleIP.setText("Vehicle ip");
        lblVehicleIP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Vehicle ip");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVehicleIP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVehiclePort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVehicleIP)
                        .addComponent(lblVehiclePort))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlabel12.setText("My ip");

        lblRemoteIP.setText("My ip");
        lblRemoteIP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRemotePort.setText("port");
        lblRemotePort.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRemoteIP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRemotePort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblRemoteIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRemotePort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblmsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Message from the vehicle");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("High");
        jRadioButton1.setFocusable(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Low");
        jRadioButton2.setFocusable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setText("Help");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed

    }//GEN-LAST:event_btnConnectActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void upKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upKeyPressed

    }//GEN-LAST:event_upKeyPressed

    private void rightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightKeyPressed

    }//GEN-LAST:event_rightKeyPressed

    private void downKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_downKeyPressed

    }//GEN-LAST:event_downKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("form key pressed");
    }//GEN-LAST:event_formKeyPressed

    private void rightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightKeyReleased

    }//GEN-LAST:event_rightKeyReleased

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed

    }//GEN-LAST:event_leftActionPerformed

    private void leftKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftKeyPressed

    }//GEN-LAST:event_leftKeyPressed

    private void downKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_downKeyReleased

    }//GEN-LAST:event_downKeyReleased

    private void leftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftKeyReleased

    }//GEN-LAST:event_leftKeyReleased

    private void upKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upKeyReleased

    }//GEN-LAST:event_upKeyReleased

    private void upMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMousePressed
        press(38);
    }//GEN-LAST:event_upMousePressed

    private void rightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMousePressed
        press(39);
    }//GEN-LAST:event_rightMousePressed

    private void downMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMousePressed
        press(40);
    }//GEN-LAST:event_downMousePressed

    private void leftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMousePressed
        press(37);
    }//GEN-LAST:event_leftMousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

    }//GEN-LAST:event_jPanel1MouseReleased

    private void rightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseReleased
        release(39);
    }//GEN-LAST:event_rightMouseReleased

    private void downMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseReleased
        release(40);
    }//GEN-LAST:event_downMouseReleased

    private void leftMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseReleased
        release(37);
    }//GEN-LAST:event_leftMouseReleased

    private void upMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseReleased
        release(38);
    }//GEN-LAST:event_upMouseReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        System.out.println("form key typed");
    }//GEN-LAST:event_formKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (logGUI.isVisible()) {
            logGUI.setVisible(false);
        } else {
            logGUI.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConnectMouseClicked
        //connectToClientAndListenToServer();
    }//GEN-LAST:event_btnConnectMouseClicked

    private void btnConnectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConnectKeyPressed
        press(evt.getKeyCode());
    }//GEN-LAST:event_btnConnectKeyPressed

    private void btnConnectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConnectKeyReleased
        release(evt.getKeyCode());
    }//GEN-LAST:event_btnConnectKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Help(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    void press(int keyCode) {

        if (keyCode == 16) {
            jRadioButton1.setSelected(true);
        }

        if (pressedMap.containsKey(keyCode)) {

            if (!(boolean) pressedMap.get(keyCode)) {

                pressedMap.replace(keyCode, true);

                String direction = null;

                if (check_Two_Keys_Pressed()) {
                    direction = pressedTwoKeys;
                } else if (check_One_Key_Pressed()) {
                    direction = pressedOneKey;
                }

                if (direction != null) {
                    if ((boolean) pressedMap.get(16)) {
                        direction = direction.toLowerCase();
                    }

                    //client.write(direction);
                    System.out.println(direction);
                    model.addRow(new Object[]{model.getRowCount() + 1, direction});
                    previouseMove = direction;
                }
            }
        }

    }

    void release(int keyCode) {

        if (keyCode == 16) {
            jRadioButton2.setSelected(true);
        }

        pressedMap.replace(keyCode, false);

        String direction;

        if (check_Two_Keys_Pressed()) {
            direction = pressedTwoKeys;
        } else if (check_One_Key_Pressed()) {
            direction = pressedOneKey;
        } else {
            direction = "S";
            if (previouseMove.equals("S")) {
                return;
            }
        }

        if ((boolean) pressedMap.get(16)) {
            if (!direction.equals("S")) {
                direction = direction.toLowerCase();
            }
        }

        //client.write(direction);
        System.out.println(direction);
        model.addRow(new Object[]{model.getRowCount() + 1, direction});

        previouseMove = direction;
    }

    boolean check_Two_Keys_Pressed() {
        if ((boolean) pressedMap.get(38) && (boolean) pressedMap.get(37)) {
            pressedTwoKeys = "FL";
            return true;
        } else if ((boolean) pressedMap.get(38) && (boolean) pressedMap.get(39)) {
            pressedTwoKeys = "FR";
            return true;
        } else if ((boolean) pressedMap.get(40) && (boolean) pressedMap.get(39)) {
            pressedTwoKeys = "BR";
            return true;
        } else if ((boolean) pressedMap.get(40) && (boolean) pressedMap.get(37)) {
            pressedTwoKeys = "BL";
            return true;
        } else {
            return false;
        }
    }

    boolean check_One_Key_Pressed() {

        if (!check_Two_Keys_Pressed()) {
            if ((boolean) pressedMap.get(38)) {
                pressedOneKey = "F";
                return true;
            } else if ((boolean) pressedMap.get(37)) {
                pressedOneKey = "L";
                return true;
            } else if ((boolean) pressedMap.get(39)) {
                pressedOneKey = "R";
                return true;
            } else if ((boolean) pressedMap.get(40)) {
                pressedOneKey = "B";
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("You have released one key. but it says that two keys are being pressed at the moment.");
            return false;
        }
    }

    void connectToClientAndListenToServer() {
        if (client.connectToServer()) {
            btnConnect.setEnabled(false);
            btnConnect.setToolTipText("Connected");
            server.startListening();
            System.out.println("Server is listening");
        } else {
            btnConnect.setToolTipText("Try again");
            btnConnect.setBackground(Color.red);
        }
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton down;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel lblRemoteIP;
    private javax.swing.JLabel lblRemotePort;
    private javax.swing.JLabel lblVehicleIP;
    private javax.swing.JLabel lblVehiclePort;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JButton left;
    private javax.swing.JButton right;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

}
