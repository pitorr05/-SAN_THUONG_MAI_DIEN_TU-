
package registerbook.view;

import adminstrator.model.Employee;
import adminstrator.view.AdminFunctionForm;
import adminstrator.view.LoginAdminForm;
import book.Controller.DataBookFuctionImp;
import book.Model.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registerbook.controller.DataRegisterBookimp;
import registerbook.model.OutOfDate;
import registerbook.model.RegisterBook;
import student.controller.DataStudentFunctionImp;
import student.model.Student;

public class HomeRegisterBookForm extends javax.swing.JFrame {

    private ArrayList<RegisterBook> listRb;
    private ArrayList<Book> listB;
    private ArrayList<Student> listSt;
    private ArrayList<OutOfDate> listOOD;
    private DefaultTableModel tableModelRb;
    private DefaultTableModel tableModelOOD;
    private Employee emp;
    private int stt;
    private DataRegisterBookimp drb;
    private int edit;
    private int sumBook;
    private int sumBorrowBook;
    private int sumBookRest;

    public HomeRegisterBookForm() {
        initComponents();
        setLocationRelativeTo(null);
        listRb = new ArrayList<>();
        listB = new ArrayList<>();
        listSt = new ArrayList<>();
        listOOD = new ArrayList<>();
        addButtonGroup();
        tableModelRb = (DefaultTableModel) tableRegisterBook.getModel();
        tableModelOOD = (DefaultTableModel) tableOutOfDate.getModel();
        stt = 1;
        edit = -1;
        sumBook = 0;
        sumBorrowBook = 0;
        sumBookRest = 0;
        drb = new DataRegisterBookimp();
        LabelCheckSTid.setText("");
        LabelCheckBookId.setText("");
        addReadSQL();
        showListRb();
        readOutOfDate();
        setStatistics();
        setSTT();
        tableRegisterBook.setAutoCreateRowSorter(true);
    }

    public HomeRegisterBookForm(Employee e) {
        this();
        this.emp = e;
    }

    public ArrayList<RegisterBook> getListRb() {
        return listRb;
    }

    public void setListRb(ArrayList<RegisterBook> listRb) {
        this.listRb = listRb;
    }

    public ArrayList<Book> getListB() {
        return listB;
    }

    public void setListB(ArrayList<Book> listB) {
        this.listB = listB;
    }

    public ArrayList<Student> getListSt() {
        return listSt;
    }

    public void setListSt(ArrayList<Student> listSt) {
        this.listSt = listSt;
    }

    public DataRegisterBookimp getDrb() {
        return drb;
    }

    public void setDrb(DataRegisterBookimp drb) {
        this.drb = drb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSeach = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnSeachGiveBookBack = new javax.swing.JRadioButton();
        rbtnStudentId = new javax.swing.JRadioButton();
        rbtnBookId = new javax.swing.JRadioButton();
        txtSeachRB = new javax.swing.JTextField();
        btnSeachRb = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LabelStudentId = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        LabelBookId = new javax.swing.JLabel();
        LabelborrowDate = new javax.swing.JLabel();
        btnCheckStudentId = new javax.swing.JButton();
        btnCheckBookId = new javax.swing.JButton();
        txtStudentId = new javax.swing.JTextField();
        txtBookId = new javax.swing.JTextField();
        txtappointDate = new javax.swing.JTextField();
        spinnerAmount = new javax.swing.JSpinner();
        LabelCheckSTid = new javax.swing.JLabel();
        LabelCheckBookId = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegisterBook = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddRegisterBook = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPayBook = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelSumBook = new javax.swing.JLabel();
        labelSumBorrowBook = new javax.swing.JLabel();
        labelRemainingBooks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOutOfDate = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("tìm kiếm"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        rbtnSeachGiveBookBack.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroupSeach.add(rbtnSeachGiveBookBack);
        rbtnSeachGiveBookBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnSeachGiveBookBack.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSeachGiveBookBack.setText("Theo Phiếu Mượn Trả Sách");

        rbtnStudentId.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroupSeach.add(rbtnStudentId);
        rbtnStudentId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnStudentId.setForeground(new java.awt.Color(255, 255, 255));
        rbtnStudentId.setText("Theo Mã Sinh Viên Mượn Sách");

        rbtnBookId.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroupSeach.add(rbtnBookId);
        rbtnBookId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnBookId.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBookId.setText("Theo Mã Sách Được Mượn");

        txtSeachRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSeachRB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSeachRb.setBackground(new java.awt.Color(102, 102, 102));
        btnSeachRb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeachRb.setText("Tìm Kiếm");
        btnSeachRb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeachRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeachRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachRbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbtnStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(rbtnBookId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(txtSeachRB, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSeachRb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtnSeachGiveBookBack, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtnSeachGiveBookBack)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeachRB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeachRb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnBookId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Mượn Sách"));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        LabelStudentId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelStudentId.setForeground(new java.awt.Color(255, 255, 255));
        LabelStudentId.setText("Mã Sinh Viên:");

        labelAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAmount.setForeground(new java.awt.Color(255, 255, 255));
        labelAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAmount.setText("Số Lượng :");

        LabelBookId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelBookId.setForeground(new java.awt.Color(255, 255, 255));
        LabelBookId.setText("Mã Sách:");

        LabelborrowDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelborrowDate.setForeground(new java.awt.Color(255, 255, 255));
        LabelborrowDate.setText("Ngày Hẹn Trả:");

        btnCheckStudentId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckStudentId.setText("Kiểm Tra");
        btnCheckStudentId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckStudentId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStudentIdActionPerformed(evt);
            }
        });

        btnCheckBookId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckBookId.setText("Kiểm Tra");
        btnCheckBookId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckBookId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBookIdActionPerformed(evt);
            }
        });

        txtStudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtBookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtappointDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        spinnerAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));

        LabelCheckSTid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelCheckSTid.setForeground(new java.awt.Color(255, 255, 255));
        LabelCheckSTid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCheckSTid.setText("* Tên Sinh Viên");

        LabelCheckBookId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelCheckBookId.setForeground(new java.awt.Color(255, 255, 255));
        LabelCheckBookId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelCheckBookId.setText("*Tên Sách");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelborrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(LabelBookId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtappointDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelCheckBookId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(LabelCheckSTid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCheckSTid)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCheckBookId)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtappointDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelborrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        LabelStudentId.getAccessibleContext().setAccessibleName("");
        labelAmount.getAccessibleContext().setAccessibleName("");
        LabelBookId.getAccessibleContext().setAccessibleName("");
        LabelborrowDate.getAccessibleContext().setAccessibleName("");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tableRegisterBook.setBackground(new java.awt.Color(153, 255, 255));
        tableRegisterBook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableRegisterBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh Viên", "Mã Sách", "Số  Lượng Sách", "Ngày Mượn", "Ngày hẹn Trả", "Ngày Trả", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tableRegisterBook);
        if (tableRegisterBook.getColumnModel().getColumnCount() > 0) {
            tableRegisterBook.getColumnModel().getColumn(0).setMinWidth(40);
            tableRegisterBook.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnAddRegisterBook.setBackground(new java.awt.Color(102, 102, 102));
        btnAddRegisterBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddRegisterBook.setText("Mượn Sách");
        btnAddRegisterBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddRegisterBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRegisterBookActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Sửa Thông Tin");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPayBook.setBackground(new java.awt.Color(102, 102, 102));
        btnPayBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPayBook.setText("Trả Sách");
        btnPayBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBookActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 102, 102));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setText("Làm Mới");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate1.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate1.setText("Xóa");
        btnUpdate1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAddRegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Mượn Trả", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tổng Số Lượng Sách:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tổng Số Lượng Sách Đang mượn:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tổng Số Lượng Sách còn trong Kho:");

        labelSumBook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelSumBook.setForeground(new java.awt.Color(255, 255, 255));
        labelSumBook.setText("*Tổng số Sách");

        labelSumBorrowBook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelSumBorrowBook.setForeground(new java.awt.Color(255, 255, 255));
        labelSumBorrowBook.setText("*Tổng Số Sách Đang Mượn");

        labelRemainingBooks.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelRemainingBooks.setForeground(new java.awt.Color(255, 255, 255));
        labelRemainingBooks.setText("*Tổng Số Sách còn trong kho");

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống kê");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSumBook, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSumBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRemainingBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSumBook)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSumBorrowBook)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemainingBooks)
                    .addComponent(jLabel6))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "danh sách quá hạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        tableOutOfDate.setBackground(new java.awt.Color(153, 255, 255));
        tableOutOfDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableOutOfDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh Viên", "Tên Sinh Viên", "Mã Sách", "Tên Sách", "Số Lượng", "Số Ngày quá Hạn", "Trạng Thái(Sách)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOutOfDate.setGridColor(new java.awt.Color(204, 255, 255));
        tableOutOfDate.setShowGrid(true);
        jScrollPane2.setViewportView(tableOutOfDate);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel8.getAccessibleContext().setAccessibleName("Danh sách quá hạn");

        jTabbedPane1.addTab("Danh Sách Quá Hạn && Thống Kê", jPanel5);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginAdminForm laf = new LoginAdminForm();
            laf.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminFunctionForm hForm = new AdminFunctionForm(emp);
        hForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        edit = tableRegisterBook.getSelectedRow();
        if (!listRb.isEmpty()) {
            if (edit != -1) {
                RegisterBook e = listRb.get(edit);
                if (e.getGiveBookBack().equalsIgnoreCase("đã trả")) {
                    int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa!");
                    if (choic == JOptionPane.YES_OPTION) {
                        DataRegisterBookimp dataRegisterBookimp = new DataRegisterBookimp();
                        dataRegisterBookimp.deleteRegisterBookSQL(e);
                        listRb.remove(edit);
                        tableModelRb.removeRow(edit);
                        JOptionPane.showMessageDialog(this, "Xóa sinh viên thành công");
                        showListRb();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Sinh viên chưa trả sách không thể xóa!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn bảng ghi cần xóa!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showRefreshListRb();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBookActionPerformed
        if (listRb.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
            return;
        }
        edit = tableRegisterBook.getSelectedRow();
        if (edit == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn số hàng để trả sách");
            return;
        }
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn trả sách?");
        if (choic == JOptionPane.YES_OPTION) {
            RegisterBook rb = listRb.get(edit);
            if (rb.getGiveBookBack().equalsIgnoreCase("đã trả")) {
                JOptionPane.showMessageDialog(this, "Trả sách thất bạn vì sinh viên mã:" + rb.getStudentId() + "đã trả sách trước đó!");
                return;
            }
            Date dateNow = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            rb.setPayDate(df.format(dateNow));
            rb.setGiveBookBack("đã trả");
            drb.updateRegisterBookSQL(rb, rb.getBookId(), rb.getStudentId());
            Book book = checkBookId(rb.getBookId());
            int amount = book.getAmount() + rb.getAmountBook();
            book.setAmount(amount);
            DataBookFuctionImp dfbook = new DataBookFuctionImp();
            dfbook.updateBookSQL(book);
            editTableModelRB(rb);
            sumBorrowBook -= rb.getAmountBook();
            labelSumBorrowBook.setText(sumBorrowBook + "");
            sumBookRest += rb.getAmountBook();
            labelRemainingBooks.setText(sumBookRest + "");
            int countDate
            = (int) ((rb.getPayDate().getTime() - rb.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
            if (countDate > 0) {
                updateTableOutOfDate(rb);
            }
            edit = -1;
            JOptionPane.showMessageDialog(this, "Trả thành công");
        }

    }//GEN-LAST:event_btnPayBookActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!listRb.isEmpty()) {
            edit = tableRegisterBook.getSelectedRow();
            if (edit != -1) {
                RegisterBook rb = this.listRb.get(edit);
                int amountOld = rb.getAmountBook();
                EditRegisterBook eRB = new EditRegisterBook(this, true, rb);
                eRB.setVisible(true);
                int amountNew = rb.getAmountBook();
                if (amountNew != amountOld) {
                    sumBorrowBook -= amountOld;
                    sumBorrowBook += amountNew;
                    sumBookRest += amountOld;
                    sumBookRest -= amountNew;
                    labelSumBorrowBook.setText(sumBorrowBook + "");
                    labelRemainingBooks.setText(sumBookRest + "");
                }
                edit = -1;
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn số hàng để sửa thông tin");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRegisterBookActionPerformed
        if (listRb.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách mượn trả rỗng!");
            return;
        }
        String studentId = txtStudentId.getText();
        String bookId = txtBookId.getText();
        int amount = (int) spinnerAmount.getValue();
        String appointDateText = txtappointDate.getText();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dfbd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if ( studentId.isEmpty() || bookId.isEmpty() || amount <= 0
            || appointDateText.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống thông tin mượn sách!");
            return;
        }
        Student st = checkSt(studentId);
        Book book = checkBookId(bookId);
        if (st == null) {
            JOptionPane.showMessageDialog(this, "Mã sinh viên không tồn tại");
            return;
        }
        if (book == null) {
            JOptionPane.showMessageDialog(this, "Mã sách không tồn tại");
            return;
        }
        if (amount > book.getAmount()) {
            JOptionPane.showMessageDialog(this, "Số lượng sách trong thư viên không đủ cho "
                + "bạn mượn(số sách còn lại là: " + book.getAmount() + ")" );
            return;
        }
        if (amount > 3) {
            JOptionPane.showMessageDialog(this, " Chỉ được phép mượn tối đa 3 quyển");
            return;
        }
        Date dateNow = new Date();
        Date appointDate;
        try {
            appointDate = df.parse(appointDateText);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng (vd: 22/12/2022)!");
            return;
        }
        if (appointDate.getTime() <= dateNow.getTime()) {
            JOptionPane.showMessageDialog(this, "Ngày hẹn trả phải lớn hơn ngày hiện tại.");
            return;
        }
        RegisterBook rb = new RegisterBook(st.getStudentId(), book.getBookId());
        if (!listRb.contains(rb)) {
            int amountRestBook = book.getAmount() - amount;
            book.setAmount(amountRestBook);
            DataBookFuctionImp dbf = new DataBookFuctionImp();
            dbf.updateBookSQL(book);
            RegisterBook addrb = new RegisterBook(st.getStudentId(), book.getBookId(),
                amount, dfbd.format(dateNow), df.format(appointDate));
            listRb.add(addrb);
            drb.writeRegisterBookSQL(addrb);
            addtableModelRb(addrb);
            sumBorrowBook += amount;
            labelSumBorrowBook.setText(sumBorrowBook + " ");
            sumBookRest -= amount;
            labelRemainingBooks.setText(sumBookRest + " ");
            txtStudentId.setText("");
            txtBookId.setText("");
            spinnerAmount.setValue(0);
            txtappointDate.setText("");
            LabelCheckSTid.setText("");
            LabelCheckBookId.setText("");
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Mã sinh viên: " + st.getStudentId()
                + " đã mượn sách với mã sách:" + book.getBookId());
        }
    }//GEN-LAST:event_btnAddRegisterBookActionPerformed

    private void btnCheckBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBookIdActionPerformed
        if (!listB.isEmpty()) {
            String bookId = txtBookId.getText();
            if (!bookId.isEmpty()) {
                Book b = checkBookId(bookId);
                if (b != null) {
                    LabelCheckBookId.setText(b.getName() + ",Tác giả: " + b.getAuthor());
                } else {
                    LabelCheckBookId.setText("Mã sách không tồn tại");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ô mã sách đang rỗng!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách quản lý sách rỗng!");
        }

    }//GEN-LAST:event_btnCheckBookIdActionPerformed

    private void btnCheckStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStudentIdActionPerformed
        if (!listSt.isEmpty()) {
            String studentId = txtStudentId.getText();
            if (!studentId.isEmpty()) {
                Student st = checkSt(studentId);
                if (st != null) {
                    String fullName = st.getName();
                    LabelCheckSTid.setText(fullName + ", " + st.getAddress());
                } else {
                    LabelCheckSTid.setText("mã sinh viên không tồn tại");
                    txtStudentId.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ô mã sinh viên đang rỗng!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách sinh viên rỗng");
        }

    }//GEN-LAST:event_btnCheckStudentIdActionPerformed
                                         
    private void btnSeachRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachRbActionPerformed
        ArrayList<RegisterBook> listSeachRb = new ArrayList<>();
        String seach = txtSeachRB.getText();
        if (seach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô tìm kiếm đang rỗng!");
            return;
        }
        if (rbtnBookId.isSelected()) {
            listSeachRb = drb.seachByBookId(listRb, seach);
            if (listSeachRb.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã sách!");
            } else {
                showListRb(listSeachRb);
            }
        } else if (rbtnStudentId.isSelected()) {
            listSeachRb = drb.seachByStudentId(listRb, seach);
            if (listSeachRb.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã sinh viên");
            } else {
                showListRb(listSeachRb);
            }
        } else if (rbtnSeachGiveBookBack.isSelected()) {
            listSeachRb = drb.seachByGiveBookBack(this.listRb, seach);
            if (listSeachRb.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phiếu mượn nào!");
            } else {
                showListRb(listSeachRb);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn các chức năng");
        }
        txtSeachRB.setText("");
    }//GEN-LAST:event_btnSeachRbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBookId;
    private javax.swing.JLabel LabelCheckBookId;
    private javax.swing.JLabel LabelCheckSTid;
    private javax.swing.JLabel LabelStudentId;
    private javax.swing.JLabel LabelborrowDate;
    private javax.swing.JButton btnAddRegisterBook;
    private javax.swing.JButton btnCheckBookId;
    private javax.swing.JButton btnCheckStudentId;
    private javax.swing.JButton btnPayBook;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSeachRb;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroupSeach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelRemainingBooks;
    private javax.swing.JLabel labelSumBook;
    private javax.swing.JLabel labelSumBorrowBook;
    private javax.swing.JRadioButton rbtnBookId;
    private javax.swing.JRadioButton rbtnSeachGiveBookBack;
    private javax.swing.JRadioButton rbtnStudentId;
    private javax.swing.JSpinner spinnerAmount;
    private javax.swing.JTable tableOutOfDate;
    private javax.swing.JTable tableRegisterBook;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtSeachRB;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtappointDate;
    // End of variables declaration//GEN-END:variables

    private void addReadSQL() {
        DataBookFuctionImp dfbook = new DataBookFuctionImp();
        dfbook.readBookSQL(listB);
        DataStudentFunctionImp dfStudent = new DataStudentFunctionImp();
        dfStudent.readStudentSQL(listSt);
        drb.readRegisterBookSQL(listRb);
    }

    private void showListRb() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
        int stt = 1;
        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listRb) {
            if (e.getPayDate() == null) {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()),
                    dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
                tableModelRb.addRow(row);
            } else {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                    df.format(e.getPayDate()), e.getGiveBookBack()};
                tableModelRb.addRow(row);
            }
        }
        tableModelRb.fireTableDataChanged();
    }

    private void addtableModelRb(RegisterBook e) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
        if (e.getPayDate() == null) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()),
                dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
            tableModelRb.addRow(row);
        } else {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                df.format(e.getPayDate()), e.getGiveBookBack()};
            tableModelRb.addRow(row);
        }
        tableModelRb.fireTableDataChanged();
    }

    private Student checkSt(String studentId) {
        for ( Student e : listSt) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;
            }
        }
        return null;
    }

    private Book checkBookId(String bookId) {
        for ( Book e : listB) {
            if (e.getBookId().equalsIgnoreCase(bookId)) {
                return e;
            }
        }
        return null;
    }

    public void editTableModelRB(RegisterBook e) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
        tableModelRb.removeRow(edit);
        if (e.getPayDate() == null) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()),
                dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
            tableModelRb.insertRow(edit, row);
        } else {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                df.format(e.getPayDate()), e.getGiveBookBack()};
            tableModelRb.insertRow(edit, row);
        }
        tableModelRb.fireTableDataChanged();

    }

    private void addButtonGroup() {
        buttonGroupSeach.add(rbtnSeachGiveBookBack);
        buttonGroupSeach.add(rbtnStudentId);
        buttonGroupSeach.add(rbtnBookId);
    }

    private void showListRb(ArrayList<RegisterBook> listSeachRb) {
        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listSeachRb) {
            addtableModelRb(e);
        }
    }

    private String checkNameST(String studentId) {
        String fullNameST = "";
        for ( Student e : listSt) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                fullNameST = e.getName();
            }
        }
        return fullNameST;
    }

    private String checkNameBook(String bookId) {
        String nameBook = "";
        for ( Book e : listB) {
            if (e.getBookId().equalsIgnoreCase(bookId)) {
                nameBook = e.getName();
            }
        }
        return nameBook;
    }

    private void showListOOP() {
        int sttOOP = 1;
        tableModelOOD.setRowCount(0);
        if (!listOOD.isEmpty()) {
            for ( OutOfDate e : listOOD) {
                Object[] row = new Object[]{sttOOP++, e.getStudentId(), e.getFullName(), e.getBookId(),
                    e.getNameBook(), e.getAmount(), e.getCountDate(), e.getGiveBackBook()};
                tableModelOOD.addRow(row);
            }
            tableModelRb.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(this, "Không có sinh viên nào trả sách muộn!");
        }
    }

    private void showRefreshListRb() {
        int stt = 1;
        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listRb) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
            if (e.getPayDate() == null) {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()),
                    dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
                tableModelRb.addRow(row);
            } else {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                    df.format(e.getPayDate()), e.getGiveBookBack()};
                tableModelRb.addRow(row);
            }
        }
        tableModelRb.fireTableDataChanged();
    }

    private void setStatistics() {
        int countBookRest = 0;
        for ( Book e : listB) {
            countBookRest += e.getAmount();
        }
        for ( RegisterBook e : listRb) {
            if (e.getGiveBookBack().equalsIgnoreCase("Chưa trả")) {
                sumBorrowBook += e.getAmountBook();
            }

        }
        sumBook = countBookRest + sumBorrowBook;
        labelSumBook.setText(sumBook + "");
        labelSumBorrowBook.setText(sumBorrowBook + "");
        sumBookRest = sumBook - sumBorrowBook;
        labelRemainingBooks.setText(sumBookRest + "");
    }

    private void readOutOfDate() {
        int countDate;
        if (listRb.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách phiếu mượn rỗng");
            return;
        }
        for ( RegisterBook e : listRb) {
            if (e.getPayDate() == null) {
                Date dateNow = new Date();
                countDate = (int) ((dateNow.getTime() - e.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
                if (countDate > 0) {
                    String fullNameST = checkNameST(e.getStudentId());
                    String nameBook = checkNameBook(e.getBookId());
                    OutOfDate oOD = new OutOfDate(e.getStudentId(), fullNameST,
                            e.getBookId(), nameBook, e.getAmountBook(), countDate, e.getGiveBookBack());
                    listOOD.add(oOD);
                }
            } else {
                countDate = (int) ((e.getPayDate().getTime() - e.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
                if (countDate > 0) {
                    String fullNameST = checkNameST(e.getStudentId());
                    String nameBook = checkNameBook(e.getBookId());
                    OutOfDate oOD = new OutOfDate(e.getStudentId(), fullNameST,
                            e.getBookId(), nameBook, e.getAmountBook(), countDate, e.getGiveBookBack());
                    listOOD.add(oOD);
                }
            }
        }
        showListOOP();
    }

    private void updateTableOutOfDate(RegisterBook rb) {
        for (int i = 0; i < tableOutOfDate.getRowCount(); i++) {
            if (rb.getBookId().equalsIgnoreCase((String) tableOutOfDate.getValueAt(i, 3))
                    && rb.getStudentId().equalsIgnoreCase((String) tableOutOfDate.getValueAt(i, 1))) {
                tableOutOfDate.setValueAt("Đã Trả", i, 7);
                break;
            }
        }
        tableModelRb.fireTableDataChanged();
    }

    private void setSTT() {
        if (!listRb.isEmpty()) {
            stt = listRb.size() + 1;
        }
    }

}
