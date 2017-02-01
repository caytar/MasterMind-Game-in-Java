/*
 * MainProgram.java
 *
 * Created on January 15, 2007, 9:17 AM
 */

package javaapplication1;

import java.net.*;
import java.io.*;
import java.awt.*;
import javax.swing.JPanel;
import java.util.ArrayList;

public class MainProgram extends javax.swing.JFrame {
    
    static MainProgram penMain ;
    
    public static ArrayList<String> queue;
    public static ArrayList<String> myqueue;

    public static int turn=0;
    public static int players=0;
    
    public static Boolean flag;
    
    public static Boolean acceFlag=false; 
    
    public static Boolean gogo=false;
    
    
    public static int seninNum=0;
    
    public static int seninTah=0;
    
    
   public static int benimNum=0;
    
    public static int benimTah=0;
    
    
    public static Boolean devam = false;
    
    public static Boolean Finish = false;
    
    
    /** Creates new form MainProgram */
    public MainProgram() {
        initComponents();
    }
    

    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        joinPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        playingPanel = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        seNickName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        aboutPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        arkaPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        joinGame = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        exitGame = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        font = new javax.swing.JMenu();
        increaseFont = new javax.swing.JMenuItem();
        decreaseFont = new javax.swing.JMenuItem();
        background = new javax.swing.JMenu();
        gblue = new javax.swing.JMenuItem();
        ggreen = new javax.swing.JMenuItem();
        gyellow = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        gdefault = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        howtoPlay = new javax.swing.JMenuItem();
        aboutGame = new javax.swing.JMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Finding");
        setBackground(new java.awt.Color(100, 100, 100));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("mainWindow");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        getAccessibleContext().setAccessibleName("mainWindow");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Join A Game");

        jLabel2.setText("IP Address of Server :");

        jButton1.setText("Join");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel11.setText("Your 4 digit number :");

        jLabel17.setText("Port :");

        jTextField4.setText("6008");

        javax.swing.GroupLayout joinPanelLayout = new javax.swing.GroupLayout(joinPanel);
        joinPanel.setLayout(joinPanelLayout);
        joinPanelLayout.setHorizontalGroup(
            joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(joinPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addContainerGap())
                    .addGroup(joinPanelLayout.createSequentialGroup()
                        .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(joinPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addGroup(joinPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(277, Short.MAX_VALUE))))
        );
        joinPanelLayout.setVerticalGroup(
            joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(joinPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)))
                .addGap(21, 21, 21)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(joinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        getContentPane().add(joinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton4.setText("Send");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Your number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("jLabel3");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Your Friend's Gueses");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel23.setForeground(new java.awt.Color(0, 153, 255));
        jLabel23.setText("Make your guess");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel24.setText("Your Guesses");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout playingPanelLayout = new javax.swing.GroupLayout(playingPanel);
        playingPanel.setLayout(playingPanelLayout);
        playingPanelLayout.setHorizontalGroup(
            playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playingPanelLayout.createSequentialGroup()
                        .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(playingPanelLayout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addGap(502, 502, 502))
                    .addGroup(playingPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        playingPanelLayout.setVerticalGroup(
            playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(playingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel23))
                .addContainerGap())
        );
        getContentPane().add(playingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11));
        jLabel4.setText("Connected IP numbers are here.");

        jLabel12.setText("Port Number:");

        jLabel13.setText("Your IP Number is :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setText("0.0.0.0");
        jLabel14.setName("jLabel4");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Please tell this IP Number to your friends to join your game.");

        jButton2.setText("Make connection");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        jLabel18.setText("Your 4 digit number : ");

        jTextField5.setMinimumSize(new java.awt.Dimension(4, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18));

        seNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seNickNameActionPerformed(evt);
            }
        });

        jLabel19.setText("Nickname:");

        jButton3.setText("StartGame");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(createPanelLayout.createSequentialGroup()
                            .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel12))
                            .addGap(12, 12, 12))
                        .addGroup(createPanelLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seNickName)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                .addGap(246, 246, 246))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(seNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(96, 96, 96))
        );
        getContentPane().add(createPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36));
        jLabel5.setText("Number Finding");

        jLabel6.setText("Free to play, free to use any part");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Caytar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Name2");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Anothername");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel10.setText("January, 2007 - Metu CENG 443 Project");

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutPanelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel6))
                    .addGroup(aboutPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))))
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutPanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(249, 249, 249))
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel5)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(47, 47, 47))
        );
        getContentPane().add(aboutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        javax.swing.GroupLayout arkaPanelLayout = new javax.swing.GroupLayout(arkaPanel);
        arkaPanel.setLayout(arkaPanelLayout);
        arkaPanelLayout.setHorizontalGroup(
            arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        arkaPanelLayout.setVerticalGroup(
            arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        getContentPane().add(arkaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18));
        File.setText("File");
        newGame.setText("Create New Game");
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGameMouseReleased(evt);
            }
        });

        File.add(newGame);

        joinGame.setText("Join A Game");
        joinGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                joinGameMouseReleased(evt);
            }
        });

        File.add(joinGame);

        File.add(jSeparator1);

        exitGame.setText("Quit");
        exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitGameMouseReleased(evt);
            }
        });

        File.add(exitGame);

        jMenuBar1.add(File);

        Edit.setText("Edit");
        font.setText("Change Font Size");
        increaseFont.setText("Increase Font Size");
        font.add(increaseFont);

        decreaseFont.setText("Decrease Font Size");
        font.add(decreaseFont);

        Edit.add(font);

        background.setText("Change Background");
        gblue.setText("Google Blue");
        gblue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gblueMouseReleased(evt);
            }
        });

        background.add(gblue);

        ggreen.setText("Google Green");
        ggreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ggreenMouseReleased(evt);
            }
        });

        background.add(ggreen);

        gyellow.setText("Google Yellow");
        gyellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gyellowMouseReleased(evt);
            }
        });

        background.add(gyellow);

        background.add(jSeparator2);

        gdefault.setText("Default");
        gdefault.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gdefaultMouseReleased(evt);
            }
        });

        background.add(gdefault);

        Edit.add(background);

        jMenuBar1.add(Edit);

        Help.setText("Help");
        howtoPlay.setText("How To Play");
        Help.add(howtoPlay);

        aboutGame.setText("About");
        aboutGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutGameMouseReleased(evt);
            }
        });

        Help.add(aboutGame);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased

        MainProgram.devam = true;
        
        String result;
        
        result = MainProgram.penMain.compareNumbers(String.valueOf(MainProgram.seninNum),MainProgram.penMain.jTextField6.getText());
        
        MainProgram.myEnv(MainProgram.penMain.jTextField6.getText() + "    " + result,"",false);
        
        if(result.endsWith("+4 -0"))
        {
            MainProgram.Finish = true;
        
               
            MainProgram.Show("YOU WON!");
        }
        
        
        
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
    
        MainProgram.acceFlag = true;
        
        basla();
        
        myEnv("","",true);
          
    }//GEN-LAST:event_jButton3MouseReleased

    private void seNickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seNickNameActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_seNickNameActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
    
  
    myServer currServer = new myServer(penMain);
    
    currServer.start();
       
    }//GEN-LAST:event_jButton2MouseReleased

    
    private void gdefaultMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gdefaultMouseReleased
    penMain.playingPanel.setBackground(new java.awt.Color(224,223,227));
    penMain.joinPanel.setBackground(new java.awt.Color(224,223,227));
    penMain.createPanel.setBackground(new java.awt.Color(224,223,227));
    penMain.aboutPanel.setBackground(new java.awt.Color(224,223,227));
    penMain.arkaPanel.setBackground(new java.awt.Color(224,223,227));
    


        
    }//GEN-LAST:event_gdefaultMouseReleased

    private void gyellowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gyellowMouseReleased
    penMain.playingPanel.setBackground(new java.awt.Color(255, 244, 194));
    penMain.joinPanel.setBackground(new java.awt.Color(255, 244, 194));
    penMain.createPanel.setBackground(new java.awt.Color(255, 244, 194));
    penMain.aboutPanel.setBackground(new java.awt.Color(255, 244, 194));
    penMain.arkaPanel.setBackground(new java.awt.Color(255, 244, 194));
    

    
    penMain.setFont(new java.awt.Font("Tahoma", 1, 24));

    
    
    }//GEN-LAST:event_gyellowMouseReleased

    private void ggreenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ggreenMouseReleased
                                  
    penMain.playingPanel.setBackground(new java.awt.Color(221, 248, 204));
    penMain.joinPanel.setBackground(new java.awt.Color(221, 248, 204));
    penMain.createPanel.setBackground(new java.awt.Color(221, 248, 204));
    penMain.aboutPanel.setBackground(new java.awt.Color(221, 248, 204));
    penMain.arkaPanel.setBackground(new java.awt.Color(221, 248, 204));
    


    }//GEN-LAST:event_ggreenMouseReleased

    private void exitGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameMouseReleased
    System.exit(0);
    }//GEN-LAST:event_exitGameMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
                penMain.joinPanel.setVisible(false);
                penMain.createPanel.setVisible(false);
                penMain.playingPanel.setVisible(true);
                penMain.aboutPanel.setVisible(false);
                penMain.arkaPanel.setVisible(false);
                
    connectServer(penMain.jTextField1.getText(), penMain.jTextField4.getText());                
                
     System.out.println(compareNumbers("1234",penMain.jTextField2.getText()));
                
    }//GEN-LAST:event_jButton1MouseReleased

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
                penMain.joinPanel.setVisible(false);
                penMain.createPanel.setVisible(true);
                penMain.playingPanel.setVisible(false);
                penMain.aboutPanel.setVisible(false);
                penMain.arkaPanel.setVisible(false);
               
       
                
                
    }//GEN-LAST:event_newGameMouseReleased

    private void joinGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinGameMouseReleased
                penMain.joinPanel.setVisible(true);
                penMain.createPanel.setVisible(false);
                penMain.playingPanel.setVisible(false);
                penMain.aboutPanel.setVisible(false);
                penMain.arkaPanel.setVisible(false);
    }//GEN-LAST:event_joinGameMouseReleased

    private void gblueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gblueMouseReleased
    penMain.playingPanel.setBackground(new java.awt.Color(195, 217, 255));
    penMain.joinPanel.setBackground(new java.awt.Color(195, 217, 255));
    penMain.createPanel.setBackground(new java.awt.Color(195, 217, 255));
    penMain.aboutPanel.setBackground(new java.awt.Color(195, 217, 255));
    penMain.arkaPanel.setBackground(new java.awt.Color(195, 217, 255));
    
    
    }//GEN-LAST:event_gblueMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    penMain.aboutPanel.setVisible(false);
    penMain.arkaPanel.setVisible(true);
    }//GEN-LAST:event_formMouseReleased

    private void aboutGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutGameMouseReleased
    penMain.joinPanel.setVisible(false);
    penMain.createPanel.setVisible(false);
    penMain.playingPanel.setVisible(false);
    penMain.aboutPanel.setVisible(true);
    penMain.arkaPanel.setVisible(false);
    
    }//GEN-LAST:event_aboutGameMouseReleased
    
    /**
     * @param args the command line arguments
     */
    
    
    
public String compareNumbers(String number1, String number2) {
        
    int i,j;
    Integer artilar=0, eksiler=0;
    String result="+";
    
    for (i=0;i<4;i++) {
        for (j=0;j<4;j++) { 
            if (number1.charAt(i)==number2.charAt(j)) {
                if (i==j) artilar++;
                else eksiler++;
            }
                
        }
    }
    
    result = result + artilar.toString() + " " + "-" + eksiler.toString();
    return result;
    }
    
    public static void changer(String t) {
        
        
            String   temp = penMain.jLabel16.getText();
            
            //System.out.println(penMain.jLabel16.getText()+"$$$$$$$$$$$$");
            
            //MainProgram.jLabel16.setText(temp + "\n" + "-----------" + yourIP);
        
            penMain.jLabel16.setText(temp + "\n" + t);
    }
    
    
    public static void enme(Boolean b) {
        
        if(b)
            penMain.jButton4.setEnabled(true);
        else
            penMain.jButton4.setEnabled(false);
        
    }
    
     public static void basla() {
     
         penMain.createPanel.setVisible(false);
         penMain.playingPanel.setVisible(true);
         
     }
     
     
     public static void Show(String te) {
     
         penMain.jLabel22.setText(te);
     
     }
     
     
    public static void myEnv(String my, String your, Boolean f ){
     
         penMain.jLabel3.setText(String.valueOf(benimNum));
         
         String t1,t2;
         
         t1 = penMain.jTextArea1.getText();
         t2 = penMain.jTextArea2.getText();
         
         System.out.println(t1 + t2);
         
         penMain.jTextArea1.setText(t1 + "\n" + my);
         
         if(f)
         {
            penMain.jTextArea2.setText(t2 + "\n" + your);
         }

         
     }
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                penMain = new MainProgram();
                penMain.setVisible(true);
                penMain.joinPanel.setVisible(false);
                penMain.createPanel.setVisible(false);
                penMain.playingPanel.setVisible(false);
                penMain.aboutPanel.setVisible(false);
                penMain.arkaPanel.setVisible(true);
                
                penMain.jTextField3.setText("6010");
                penMain.jTextField5.setText("1234");
                
                penMain.seNickName.setText("Zeynal");
                
                /***************************************/
                flag = false;

                queue = new ArrayList<String>();
                myqueue = new ArrayList<String>();
                
                turn = 0;
                /***************************************/

            }
            

        });
    }
    
    
    
    public void connectServer(String hostname, String thePort) {
    Socket theSocket;
    DataInputStream theInputStream;
    PrintStream theOutputStream;
    String theLine;
    int i;
    
    theLine="Emre";

    try {
        theSocket = new Socket(hostname, Integer.parseInt(thePort));
        theInputStream = new DataInputStream(theSocket.getInputStream());
        theOutputStream = new PrintStream(theSocket.getOutputStream());
      
        InputThread it = new InputThread(theSocket.getInputStream(), penMain);
        it.start();

        for (i=0;i<3;i++) {
            theOutputStream.println(theLine);
            //System.out.println(theLine);
        }
    }
    catch (IOException e) {
      System.err.println(e);
    }  
        
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Edit;
    public javax.swing.JMenu File;
    public javax.swing.JMenu Help;
    public javax.swing.JMenuItem aboutGame;
    public javax.swing.JPanel aboutPanel;
    public javax.swing.JPanel arkaPanel;
    public javax.swing.JMenu background;
    public javax.swing.JPanel createPanel;
    public javax.swing.JMenuItem decreaseFont;
    public javax.swing.JMenuItem exitGame;
    public javax.swing.JMenu font;
    public javax.swing.JMenuItem gblue;
    public javax.swing.JMenuItem gdefault;
    public javax.swing.JMenuItem ggreen;
    public javax.swing.JMenuItem gyellow;
    public javax.swing.JMenuItem howtoPlay;
    public javax.swing.JMenuItem increaseFont;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JMenuItem joinGame;
    public javax.swing.JPanel joinPanel;
    public javax.swing.JMenuItem newGame;
    public javax.swing.JPanel playingPanel;
    public javax.swing.JTextField seNickName;
    // End of variables declaration//GEN-END:variables
    
}




class myServer extends Thread {

    MainProgram m;
   
    String temp;
    
 public myServer(MainProgram m)
 {
    this.m = m;
    
 }

 public void run()  {
      
    int thePort;
    ServerSocket ss;
    Socket theConnection;      
    
    try {
        InetAddress thisComputer = InetAddress.getLocalHost();
        byte[] address = thisComputer.getAddress();
        String myIP="";
        for (int i = 0; i < address.length; i++)
            {
            int unsignedByte = address[i] < 0 ? address[i] + 256 : address[i];
            myIP=myIP + unsignedByte + ".";
            }
        
        myIP = myIP.substring(0,myIP.length() - 1);
        
        m.jLabel14.setText(myIP);
        System.out.print("This is my IP: " + myIP);
        
        System.out.println();
    }
    catch (UnknownHostException e) {
        System.out.println("IP numarasi bulunamadi...");
    }   
       

    try {
        thePort = Integer.parseInt(m.jTextField3.getText());
        System.out.println(m.jTextField3.getText());
    }  
    catch (Exception e) {
        thePort = 0;
    }


    try {
        ss = new ServerSocket(thePort);
        System.out.println("Listening for connections on port " + ss.getLocalPort());
        while (true) {
            

            System.out.print("Bekliyor...\n");
            theConnection = ss.accept();
            System.out.print("Baglandi\n");
            
                   
            String yourIP = theConnection.getRemoteSocketAddress().toString();
            
            yourIP = yourIP.substring(1);
            
            m.queue.add(yourIP);
                     
            MainProgram.benimNum = Integer.parseInt( MainProgram.penMain.jTextField5.getText() );
                     
            MainProgram.changer(yourIP);
            
            MainProgram.myqueue.add(yourIP);
                        
            System.out.println("Connected IP is : " + yourIP);
            
            System.out.println("Connection established with " + theConnection);
            InputThread it = new InputThread(theConnection.getInputStream(), m);
            it.start();
            OutputThread ot = new OutputThread(theConnection.getOutputStream(), it,m);
            ot.start();
        }
    }
    catch (IOException e){
    }

     
	   
 }

}



class InputThread extends Thread {

InputStream is;

MainProgram m;

String gelen;

 public InputThread(InputStream is, MainProgram m) {
    this.is = is;
    this.m = m;
    this.gelen = "";
 }

 public void run()  {
    try {
        while (true) {
            int i = is.read();
	    if (i == -1)
                break;
            else
            {
                char c = (char) i;
                //System.out.print(c);

                if(c!='\n')
                    gelen += Character.toString(c);
                else
                {
                    System.out.println(gelen);
                    if(gelen.charAt(gelen.length()-2) == '#')
                    {
                        
                        MainProgram.players++;
                         
                        String [] sarr = null;

                        System.out.println("");

                        sarr = gelen.split("=");
                                               
                        MainProgram.seninNum = Integer.parseInt(sarr[1]);
                                               
                        MainProgram.gogo = true;
                                              
                        for(int j=0;j<sarr.length;j++)
                        {
                            System.out.println(sarr[j]);
                            System.out.println("======");
                        }
                    }
                    else
                        if(gelen.charAt(0) == 'F')
                        {                       
                            MainProgram.Show("YOU LOST!");
                        }
                    else
                    {
                        System.out.println(gelen);
                        
                        
                        
                        if(gelen.charAt(gelen.length()-2) == 'T')
                        {
                            
                            String sendenGelen = gelen;
                            
                            String result;
                            
                            sendenGelen = sendenGelen.substring(0,4);                            
                            
                            result = MainProgram.penMain.compareNumbers(String.valueOf(MainProgram.benimNum),sendenGelen);
                            
                            if(result == "+4 -4")
                            {
                                MainProgram.Show("YOU LOST");
                            }
                            
                            MainProgram.myEnv("",sendenGelen,true);
                            MainProgram.enme(true);
                        }
                    }

                    
                gelen = "";
                }
            
            }
	}
    }
    catch (IOException e) {
        System.err.println(e);
    }
		   
 }

}

class OutputThread extends Thread {

PrintStream ps;
DataInputStream is;
InputThread it;
InputStream input;

MainProgram m;
Integer lock;  
 public OutputThread(OutputStream os, InputThread it, MainProgram m) {
    ps = new PrintStream(os);
    this.it = it;
    is = new DataInputStream(System.in);
   
    this.m = m;
    lock = 0;
 }

 
 public synchronized  void run() {
    String line = "";
    
    while(true) {

        synchronized(lock) {
        if(m.acceFlag)
        {
            ps.println("XZ"+MainProgram.benimNum);
            System.out.println("Baglandiniz yazisi gonderildi...");
            m.acceFlag = false;
        }
        
         
        if(MainProgram.gogo)
        {
            System.out.println(MainProgram.seninNum + "   " + MainProgram.benimNum);
            
            MainProgram.gogo = false;
        }
        
        
        if(MainProgram.devam)
        {
            System.out.println("Tahmin ettiginiz sayi gonderildi...");
            
            ps.println(MainProgram.penMain.jTextField6.getText()+"T"+ MainProgram.benimNum + "D");
         
            MainProgram.enme(false);
            
            MainProgram.devam = false;
        }
        
        if(MainProgram.Finish)
        {
            ps.println("F");
            
            MainProgram.Finish = false;
        }
        
        
        }
    }

 }
 
 
}
