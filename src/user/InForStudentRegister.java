
package user;

import student.view.ChangeStudentPassword;
import student.view.LoginStudentForm;
import book.Controller.DataBookFuctionImp;
import book.Model.Book;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registerbook.controller.DataRegisterBookimp;
import registerbook.model.RegisterBook;
import student.model.Student;

public class InForStudentRegister extends javax.swing.JFrame {

    private Student st;
    private ArrayList<Book> listBook;
    private ArrayList<RegisterBook> listRB;
    private DefaultTableModel tableModelBook;
    private DefaultTableModel tableModeRB;
    private int sttBook;
    private int sttRB;
    private int edit;
    SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat dfAppointDate = new SimpleDateFormat("dd/MM/yyyy");
    private ArrayList<RegisterBook> listThis;

    public InForStudentRegister(Student st) {
        this();
        this.st = st;
        tableModeRB = (DefaultTableModel) tableRegisterBook.getModel();
        tableModelBook = (DefaultTableModel) tableBook.getModel();
        sttRB = 1;
        edit = -1;
        showInforST();
        readList();
        readTableModelBook(listBook);
        readTableModelRB();
        tableBook.setAutoCreateRowSorter(true);
    }

    public InForStudentRegister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Student getSt() {
        return st;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageStudent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JLabel();
        txtFullName = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        txtMajor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRegisterBook = new javax.swing.JTable();
        btnPayBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtseach = new javax.swing.JTextField();
        btnseach = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        imageStudent.setBackground(new java.awt.Color(255, 255, 255));
        imageStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        imageStudent.setOpaque(true);
        imageStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageStudentMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã SV:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ Và Tên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lớp:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chuyên Ngành:");

        txtStudentId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStudentId.setForeground(new java.awt.Color(255, 255, 255));
        txtStudentId.setText("* Mã Sinh Viên");

        txtFullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.setText("* Họ Và Tên");

        txtClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtClass.setForeground(new java.awt.Color(255, 255, 255));
        txtClass.setText("* Lớp");

        txtMajor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMajor.setForeground(new java.awt.Color(255, 255, 255));
        txtMajor.setText("*Chuyên Ngành");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(imageStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Những quyển Sách Đã Mượn"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tableRegisterBook.setBackground(new java.awt.Color(153, 255, 255));
        tableRegisterBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableRegisterBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "mã Sách", "Tên Sách", "Ngày Mượn", "Hẹn Trả", "Ngày Trả", "quá Hạn(ngày)", "Số Lượng", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableRegisterBook);
        if (tableRegisterBook.getColumnModel().getColumnCount() > 0) {
            tableRegisterBook.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnPayBook.setBackground(new java.awt.Color(102, 102, 102));
        btnPayBook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPayBook.setText("Trả Sách");
        btnPayBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tìm Kiếm:");

        txtseach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnseach.setBackground(new java.awt.Color(102, 102, 102));
        btnseach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnseach.setText("Tìm Kiếm");
        btnseach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnseach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnseach, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseach, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        tableBook.setBackground(new java.awt.Color(153, 255, 255));
        tableBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Thể Loại", "Tác giả", "Nhà Sản Xuât", "giá Sách", "Số Lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBook);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Mượn Sách");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Đổi Mật Khẩu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginStudentForm lf = new LoginStudentForm();
            lf.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!this.listBook.isEmpty()) {
            edit = tableBook.getSelectedRow();
            if (edit != -1) {
                String bookId = (String) tableModelBook.getValueAt(edit, 1);
                Book book = checkBookId(bookId);
                 boolean flag = checkBookId(book);
                if (!flag) {
                    BorrowBooks bB = new BorrowBooks(this, true, book);
                    bB.setVisible(true);
                    readTableModelBook(listBook);
                } else {
                    JOptionPane.showMessageDialog(this, "Sách này đã được mượn vui lòng chọn sách khác!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn sách cần mượn!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Thư viện không có sách!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ChangeStudentPassword cpasswd = new ChangeStudentPassword(this, true);
        cpasswd.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBookActionPerformed
        edit = tableRegisterBook.getSelectedRow();
        if (tableModeRB.getRowCount() != 0) {
            int choic = JOptionPane.showConfirmDialog(this, "Bạn chắn chắn muốn trả sách ?");
            if (choic == JOptionPane.YES_OPTION) {
                if (edit != -1) {
                    String giveBackBook = (String) tableModeRB.getValueAt(edit, 8);
                    if (giveBackBook.equalsIgnoreCase("Chưa trả")) {
                        String bookId = (String) tableModeRB.getValueAt(edit, 1);
                        payBook(bookId);
                    } else {
                        JOptionPane.showMessageDialog(this, "Trả sách thất bại vì sách này đã được trả trước đó!)");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn sách muốn trả");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sinh viên chưa mượn sách!");
        }
    }//GEN-LAST:event_btnPayBookActionPerformed

    private void btnseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseachActionPerformed
        String seach = txtseach.getText();
        if (!seach.isEmpty()) {
            ArrayList<Book> listSeachBook = checkSeach(seach);
            if(!listSeachBook.isEmpty()){
                readTableModelBook(listSeachBook);
                txtseach.setText("");
            } else {
                  JOptionPane.showMessageDialog(this, "Không tìm thấy!");
            }
        } else {
            readTableModelBook(listBook);
        }
    }//GEN-LAST:event_btnseachActionPerformed

    private void imageStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageStudentMouseClicked
        ChangeImageForm cif = new ChangeImageForm(this, true);
        cif.setVisible(true);
        imageStudent.setIcon(imgStudent());
    }//GEN-LAST:event_imageStudentMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPayBook;
    private javax.swing.JButton btnseach;
    private javax.swing.JLabel imageStudent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable tableBook;
    private javax.swing.JTable tableRegisterBook;
    private javax.swing.JLabel txtClass;
    private javax.swing.JLabel txtFullName;
    private javax.swing.JLabel txtMajor;
    private javax.swing.JLabel txtStudentId;
    private javax.swing.JTextField txtseach;
    // End of variables declaration//GEN-END:variables

    public ImageIcon imgStudent () {
        convertImage ci = new convertImage();
        String[] extensions = {".png", ".jpg"}; 
        String studentID = st.getStudentId();
        for (String x : extensions) {
            String fileSource = "src/image/account/" + studentID + x;
            File f = new File(fileSource);
            if( f.exists() ) {
                return ci.convertImageFitToLabel(f, imageStudent);
            }
        }
        File f = new File("src/image/account/anonymous.png");
        return ci.convertImageFitToLabel(f, imageStudent);
    }
    
    private void showInforST() {
        txtStudentId.setText(st.getStudentId());
        String fullName = st.getName();
        txtFullName.setText(fullName);
        txtClass.setText(st.getClassRoon());
        txtMajor.setText(st.getMajor());
        imageStudent.setIcon(imgStudent());
    }

    private void readList() {
        this.listBook = new ArrayList<>();
        this.listRB = new ArrayList<>();
        DataBookFuctionImp dFbook = new DataBookFuctionImp();
        dFbook.readBookSQL(listBook);
        DataRegisterBookimp dFRegisterBook = new DataRegisterBookimp();
        dFRegisterBook.readRegisterBookSQL(listRB);
    }

   
    private void readTableModelBook(ArrayList<Book> listBook) {
        sttBook = 1;
        tableModelBook.setRowCount(0);
        for (Book e : listBook) {
            addTableModelBook(e);
        }
    }

    private void readTableModelRB() {
        for (RegisterBook e : listRB) {
            if (e.getStudentId().equalsIgnoreCase(st.getStudentId())) {
                addTableModelRB(e);
            }
        }
    }

    private String takeNameBook(String bookId) {
        for (Book e : listBook) {
            if (e.getBookId().equalsIgnoreCase(bookId)) {
                return e.getName();
            }
        }
        return null;
    }

    private Boolean checkBookId(Book book) {
        int count = tableModeRB.getRowCount();
        for (int i = 0; i < count; i++) {
            if (book.getBookId().equalsIgnoreCase(tableModeRB.getValueAt(i, 1).toString())) {
                return true;
            }
        }
        return false;
    }

    private void addTableModelBook(Book e) {
        Object[] row = new Object[]{sttBook++, e.getBookId(), e.getName(), e.getCategory(),
            e.getAuthor(), e.getProducer(), e.getPrice(), e.getAmount()};
        tableModelBook.addRow(row);
        tableModelBook.fireTableDataChanged();
    }

    private void addTableModelRB(RegisterBook e) {
        String nameBook = takeNameBook(e.getBookId());
        if (e.getPayDate() == null) {
            int outOfDate = handleDate(e.getAppointDate());
            Object[] row = new Object[]{sttRB++, e.getBookId(), nameBook,
                dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
                "", outOfDate, e.getAmountBook(), e.getGiveBookBack()};
            tableModeRB.addRow(row);
        } else {
            int outOfDate = handleDate(e.getAppointDate(), e.getPayDate());
            Object[] row = new Object[]{sttRB++, e.getBookId(), nameBook,
                dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
                dF.format(e.getPayDate()), outOfDate, e.getAmountBook(), e.getGiveBookBack()};
            tableModeRB.addRow(row);
        }
        tableModeRB.fireTableStructureChanged();
    }

    void addRegisterBook(Date appointdate, Book book, int amount) {
        SimpleDateFormat dfnow = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateNow = new Date();
        RegisterBook rb = new RegisterBook(st.getStudentId(), book.getBookId(),
                amount, dfnow.format(dateNow), dfAppointDate.format(appointdate));
        this.listRB.add(rb);
        DataRegisterBookimp dRegisterBook = new DataRegisterBookimp();
        dRegisterBook.writeRegisterBookSQL(rb);
        addTableModelRB(rb);
    }

    void editAmountBook(Book book) {
        tableModelBook.removeRow(edit);
        Object[] row = new Object[]{edit + 1, book.getBookId(), book.getName(), book.getCategory(),
            book.getAuthor(), book.getProducer(), book.getPrice(), book.getAmount()};
        tableModelBook.insertRow(edit, row);
        tableModelBook.fireTableDataChanged();
    }

    private int handleDate(Date appointDate) {
        Date date = new Date();
        int count = (int) ((date.getTime() - appointDate.getTime()) / (1000 * 60 * 60 * 24));
        if (count > 0) {
            return count;
        }
        return 0;
    }

    private int handleDate(Date appointDate, Date payDate) {
        int count = (int) ((payDate.getTime() - appointDate.getTime()) / (1000 * 60 * 60 * 24));
        if (count > 0) {
            return count;
        }
        return 0;
    }

    private void payBook(String bookId) {
        RegisterBook registerBook = null;
        RegisterBook rb = new RegisterBook(st.getStudentId(), bookId);
        for (RegisterBook e : listRB) {
            if (e.equals(rb)) {
                registerBook = e;
            }
        }
        if (registerBook != null) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            registerBook.setGiveBookBack("Đã trả");
            registerBook.setPayDate(df.format(date));
            DataRegisterBookimp dateRb = new DataRegisterBookimp();
            if (dateRb.updateRegisterBookSQL(registerBook,
                    registerBook.getBookId(), registerBook.getStudentId()) != 0) {
                insertTableModelRB(registerBook);
                JOptionPane.showMessageDialog(this, "Trả sách thành công");
            } else {
                System.out.println("Thất bại");
            }
        }
    }

    private void insertTableModelRB(RegisterBook e) {
        String nameBook = takeNameBook(e.getBookId());
        tableModeRB.removeRow(edit);
        int outOfDate = handleDate(e.getAppointDate(), e.getPayDate());
        Object[] row = new Object[]{sttRB++, e.getBookId(), nameBook,
            dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
            dF.format(e.getPayDate()), outOfDate, e.getAmountBook(), e.getGiveBookBack()};
        tableModeRB.insertRow(edit, row);
    }

    private ArrayList<Book> checkSeach(String seach) {
        ArrayList<Book> listSeachBook = new ArrayList<>();
        for (Book e : listBook) {
            String[] fullAuthor = e.getAuthor().split("\\s+");
            if (e.getBookId().equalsIgnoreCase(seach) 
                    || e.getName().equalsIgnoreCase(seach)
                    || fullAuthor[fullAuthor.length-1].equalsIgnoreCase(seach) 
                    || e.getCategory().equalsIgnoreCase(seach)) 
            {
                listSeachBook.add(e);
            }
        }
        return listSeachBook;
    }

    private Book checkBookId(String bookId) {
        for(Book e : listBook){
            if(e.getBookId().equalsIgnoreCase(bookId)){
                    return e;
            }      
        }
        return null;
    }
    
}
