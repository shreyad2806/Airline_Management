
package airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TicketBooking extends javax.swing.JFrame {


    public TicketBooking() {
        initComponents();
        GetPassenger();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        GenTb.setEditable(false);
        
        GetFlights();
        DisplayBooking();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PassIdCb = new javax.swing.JComboBox<>();
        FCodeCb = new javax.swing.JComboBox<>();
        PassNumTb = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BookBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        PassNameTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        NationalityTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        GenTb = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(29, 72, 134));

        jLabel6.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 177, 48));
        jLabel6.setText("Passenger Name");

        jLabel8.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(252, 177, 48));
        jLabel8.setText("Flight Code");

        jLabel9.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 177, 48));
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(252, 177, 48));
        jLabel10.setText("Passport Number");

        jLabel11.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(252, 177, 48));
        jLabel11.setText("Passenger Id");

        PassIdCb.setBackground(new java.awt.Color(29, 72, 134));
        PassIdCb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        PassIdCb.setForeground(new java.awt.Color(252, 177, 48));
        PassIdCb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 177, 48)));
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });

        FCodeCb.setBackground(new java.awt.Color(29, 72, 134));
        FCodeCb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        FCodeCb.setForeground(new java.awt.Color(252, 177, 48));
        FCodeCb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 177, 48)));
        FCodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeCbActionPerformed(evt);
            }
        });

        PassNumTb.setBackground(new java.awt.Color(29, 72, 134));
        PassNumTb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        PassNumTb.setForeground(new java.awt.Color(252, 177, 48));
        PassNumTb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 177, 48), 1, true));

        BackBtn.setBackground(new java.awt.Color(252, 177, 48));
        BackBtn.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(29, 72, 134));
        BackBtn.setText("Back");
        BackBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(252, 177, 48));
        ResetBtn.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(29, 72, 134));
        ResetBtn.setText("Reset");
        ResetBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        BookBtn.setBackground(new java.awt.Color(252, 177, 48));
        BookBtn.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(29, 72, 134));
        BookBtn.setText("Book");
        BookBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Artifakt Element Book", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(252, 177, 48));
        jLabel12.setText("Bookings");

        BookingTable.setBackground(new java.awt.Color(29, 72, 134));
        BookingTable.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        BookingTable.setForeground(new java.awt.Color(252, 177, 48));
        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BookingTable.setRowHeight(25);
        BookingTable.setSelectionBackground(new java.awt.Color(252, 177, 48));
        BookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookingTable);

        PassNameTb.setBackground(new java.awt.Color(29, 72, 134));
        PassNameTb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        PassNameTb.setForeground(new java.awt.Color(252, 177, 48));
        PassNameTb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 177, 48), 1, true));
        PassNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameTbActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(252, 177, 48));
        jLabel13.setText("Amount");

        AmountTb.setBackground(new java.awt.Color(29, 72, 134));
        AmountTb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        AmountTb.setForeground(new java.awt.Color(252, 177, 48));
        AmountTb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 177, 48), 1, true));

        NationalityTb.setBackground(new java.awt.Color(29, 72, 134));
        NationalityTb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        NationalityTb.setForeground(new java.awt.Color(252, 177, 48));
        NationalityTb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 177, 48), 1, true));
        NationalityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityTbActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Artifakt Element Book", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(252, 177, 48));
        jLabel14.setText("Nationality");

        GenTb.setBackground(new java.awt.Color(29, 72, 134));
        GenTb.setFont(new java.awt.Font("Artifakt Element Book", 0, 12)); // NOI18N
        GenTb.setForeground(new java.awt.Color(252, 177, 48));
        GenTb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 177, 48), 1, true));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel3.setFont(new java.awt.Font("Artifakt Element Book", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 72, 134));
        jLabel3.setText("Falcon Airlines");

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 72, 134));
        jLabel7.setText("x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookBtnActionPerformed

    private void PassNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameTbActionPerformed

    private void NationalityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTbActionPerformed

    private void BookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingTableMouseClicked
        
    }//GEN-LAST:event_BookingTableMouseClicked

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1=null;
    Statement St = null, St1=null;
    
    private void GetPassenger()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/airlinedb","root","");
            St = Con.createStatement();
            String Query = "select * from PassengersTbl";
            Rs = St.executeQuery(Query);
            while(Rs.next())
            {
                String PId = String.valueOf(Rs.getInt("PId"));
                PassIdCb.addItem(PId);
            }
        } catch (Exception e){
        }
    }
    
        private void GetFlights()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/airlinedb","root","");
            St = Con.createStatement();
            String Query = "select * from flighttbl";
            Rs = St.executeQuery(Query);
            while(Rs.next())
            {
                String FCode = Rs.getString("FlCode");
                FCodeCb.addItem(FCode);
            }
        } catch (Exception e){
        }
    }
    
    private void GetPassengerData()
    {
        String Query = " select * from PassengersTbl where PId="+PassIdCb.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/airlinedb","root","");
            St = Con.createStatement();
            Rs= St.executeQuery(Query);
            if(Rs.next())
            {
                PassNameTb.setText(Rs.getString("PName"));
                GenTb.setText(Rs.getString("PGen"));
                PassNumTb.setText(Rs.getString("Ppass"));
                NationalityTb.setText(Rs.getString("PNat"));
            }
        }catch(Exception e){
        }
    }
        private void DisplayBooking(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from `booking tbl`");
            BookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch(Exception e){
        }
    }
    int TId = 0;
    private void CountFlights()
    {
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(TicketId) from `booking tbl`");
            Rs1.next();
            TId = Rs1.getInt(1)+1;
        }catch(Exception e){
        }
    }
    
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
        if(PassIdCb.getSelectedIndex()== -1 || FCodeCb.getSelectedIndex() == -1 || AmountTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                CountFlights();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into `booking tbl` values(?,?,?,?,?,?,?)");
                Add.setInt(1,TId);
                Add.setString(2, PassNameTb.getText());
                Add.setString(3, FCodeCb.getSelectedItem().toString());
                Add.setString(4, GenTb.getText());
                Add.setString(5, PassNumTb.getText());
                Add.setInt(6, Integer.valueOf(AmountTb.getText()));
                Add.setString(7, NationalityTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Booked");
                Con.close();
                DisplayBooking();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_BookBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
        
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
        GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
    
    private void Clear(){
        FCodeCb.setSelectedIndex(-1);
        //PassIdCb.setSelectedIndex(-1);
        PassNameTb.setText("");
        PassNumTb.setText("");
        GenTb.setText("");
        NationalityTb.setText("");
        AmountTb.setText("");
    }
    
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void FCodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeCbActionPerformed
        GetFlights();
    }//GEN-LAST:event_FCodeCbActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JComboBox<String> FCodeCb;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
