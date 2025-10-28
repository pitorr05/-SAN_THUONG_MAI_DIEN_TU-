
package book.view;

import adminstrator.model.Employee;
import adminstrator.view.AdminFunctionForm;
import adminstrator.view.LoginAdminForm;
import book.Controller.DataBookFuctionImp;
import book.Controller.InValidAuthorException;
import book.Controller.InValidPriceException;
import book.Model.Book;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registerbook.controller.DataRegisterBookimp;
import registerbook.model.RegisterBook;

public class BookForm extends javax.swing.JFrame {

    private ArrayList<Book> listBook;
    private ArrayList<RegisterBook> listRB;
    private int stt;
    public int edit;
    private DataBookFuctionImp dataimplement;
    private DataRegisterBookimp dataRb;
    private DefaultTableModel tableModel;
    private Employee emp;

    public BookForm() {
        initComponents();
        setLocationRelativeTo(null);
        edit = -1;
        dataimplement = new DataBookFuctionImp();
        dataRb = new DataRegisterBookimp();
        listBook = new ArrayList<>();
        listRB = new ArrayList<>();
        tableModel = (DefaultTableModel) tableBook.getModel();
        dataimplement.readBookSQL(listBook);
        dataRb.readRegisterBookSQL(listRB);
        stt = listBook.size() + 1;
        showListBook();
        setTxtBookID(listBook);
        tableBook.setAutoCreateRowSorter(true);
        
    }

    public BookForm(Employee e) {
        this();
        this.emp = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSeachBook = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnSeachNameBook = new javax.swing.JRadioButton();
        rbtnSeachBookId = new javax.swing.JRadioButton();
        rbtnSeachAuthorName = new javax.swing.JRadioButton();
        txtSeach = new javax.swing.JTextField();
        btnSeach = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelBookId = new javax.swing.JLabel();
        LabeBookName = new javax.swing.JLabel();
        LabelCategory = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        LabelProducer = new javax.swing.JLabel();
        LabelPrice = new javax.swing.JLabel();
        LabelCount = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtProDucer = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        comboboxCategory = new javax.swing.JComboBox<>();
        spinnerCount = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemBack = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sách");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        rbtnSeachNameBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnSeachNameBook.setText("Tìm Kiếm Theo Tên Sách");

        rbtnSeachBookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnSeachBookId.setText("Tìm Kiếm Theo Mã Sách");

        rbtnSeachAuthorName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnSeachAuthorName.setText("Tìm Kiếm Theo Tên Tác giả");

        txtSeach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSeach.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSeach.setBackground(new java.awt.Color(102, 102, 102));
        btnSeach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeach.setText("Tìm Kiếm");
        btnSeach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSeachNameBook)
                    .addComponent(rbtnSeachAuthorName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnSeachBookId)
                        .addGap(29, 29, 29)
                        .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rbtnSeachNameBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSeachBookId)
                    .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnSeachAuthorName)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        LabelBookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelBookId.setForeground(new java.awt.Color(255, 255, 255));
        LabelBookId.setText("Mã Sách:");

        LabeBookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabeBookName.setForeground(new java.awt.Color(255, 255, 255));
        LabeBookName.setText("Tên Sách:");

        LabelCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCategory.setForeground(new java.awt.Color(255, 255, 255));
        LabelCategory.setText("Thể Loại:");

        labelAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAuthor.setForeground(new java.awt.Color(255, 255, 255));
        labelAuthor.setText("Tác giả:");

        LabelProducer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelProducer.setForeground(new java.awt.Color(255, 255, 255));
        LabelProducer.setText("Nhà Sản Xuất:");

        LabelPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPrice.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrice.setText("Giá sách");

        LabelCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCount.setForeground(new java.awt.Color(255, 255, 255));
        LabelCount.setText("Số Lượng");

        txtBookId.setEditable(false);
        txtBookId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBookId.setEnabled(false);
        txtBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIdActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtProDucer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        comboboxCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "An toàn thông tin", "Điện tử viễn thông", "Khoa học máy tính" }));

        spinnerCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spinnerCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerCount.setFocusable(false);
        spinnerCount.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabeBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboboxCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                                    .addComponent(txtName))
                                .addGap(88, 88, 88)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProDucer)
                    .addComponent(txtPrice)
                    .addComponent(spinnerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProDucer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabeBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(102, 102, 102));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRemove.setText("Xóa");
        btnRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 102, 102));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setText("Làm Mới");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        tableBook.setBackground(new java.awt.Color(153, 255, 255));
        tableBook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Thể Loại", "Tác giả", "Nhà Sản Xuất", "Giá Sách", "Số Lượng"
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Hệ Thống");

        MenuItemBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuItemBack.setText("Thoát");
        MenuItemBack.setOpaque(true);
        MenuItemBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBackActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemBack);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        jMenu1.add(jSeparator1);

        MenuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuItemLogout.setText("Đăng Xuất");
        MenuItemLogout.setOpaque(true);
        MenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isValidBookForm() {
        return !txtBookId.getText().isEmpty() && !txtName.getText().isEmpty() && 
                !txtAuthor.getText().isEmpty() && !txtProDucer.getText().isEmpty() && 
                !txtPrice.getText().isEmpty() && (int) spinnerCount.getValue() > 0;
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if ( !isValidBookForm() ) {
             JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
             return;
        }
        String bookId = txtBookId.getText();
        String nameBook = txtName.getText();
        String category = comboboxCategory.getSelectedItem().toString();
        String author = txtAuthor.getText();
        String proDucer = txtProDucer.getText();
        String price = txtPrice.getText();
        int count = (int) spinnerCount.getValue();
        try {
            Book book = new Book(bookId, nameBook, category, author, proDucer, price, count);

            if (listBook.contains(book)) {
                JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại");
            } else {
                listBook.add(book);
                dataimplement.writeBookSQL(book);
                addTableModle(book);
                txtBookId.setText("PTIT" + (++Book.ID));
                txtName.setText("");
                comboboxCategory.setSelectedIndex(0);
                txtAuthor.setText("");
                txtProDucer.setText("");
                spinnerCount.setValue(0);
                txtPrice.setText("");
                JOptionPane.showMessageDialog(this, "Thêm sách thành công");
            }
        } catch (InValidPriceException | InValidAuthorException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        edit = tableBook.getSelectedRow();
        if (listBook.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");  
            return;
        }
        if (edit != -1) {
            EditBookDialog ebf = new EditBookDialog(this, true, listBook.get(edit));
            ebf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên cần sinh sửa");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        edit = tableBook.getSelectedRow();
        if (listBook.isEmpty()) {
            JOptionPane.showMessageDialog(this, "danh sách rỗng");
            return;
        }
        if (edit == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên cần sinh sửa.");
            return;
        }
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?");
        if (choic == JOptionPane.YES_OPTION) {
            boolean flag = checkDelBook(listBook.get(edit));
            if (flag) {
                dataimplement.delBookSQL(listBook.get(edit));
                listBook.remove(edit);
                tableModel.removeRow(edit);
                tableModel.fireTableDataChanged();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Sách không thể xóa vì có sinh viên đang mượn");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã hủy");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showListBook();
    }//GEN-LAST:event_btnRefreshActionPerformed
    
    public boolean selectedButtonSearch() {
        return rbtnSeachAuthorName.isSelected() || 
                rbtnSeachBookId.isSelected() || 
                rbtnSeachNameBook.isSelected();
    }
        
    private void btnSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachActionPerformed
        if (!selectedButtonSearch()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn chức năng tìm kiếm");
            return;
        }
        ArrayList<Book> listSeach = new ArrayList<>();
        String seach = txtSeach.getText();
        if (seach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô thông tin tìm kiếm đang rỗng!");
            return;
        }
        if (rbtnSeachAuthorName.isSelected()) {
            listSeach = dataimplement.seachByAuthor(listBook, seach);
            if (!listSeach.isEmpty()) {
                showListSeachBook(listSeach);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tên tác giả!");
            }
        } else if (rbtnSeachBookId.isSelected()) {
            Book seachBook = dataimplement.seachBookId(listBook, seach);
            if (seachBook != null) {
                showSeachBook(seachBook);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã sách");
            }
        } else if (rbtnSeachNameBook.isSelected()) {
            listSeach = dataimplement.seachByNameBook(listBook, seach);
            if (!listSeach.isEmpty()) {
                showListSeachBook(listSeach);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tên sách!");
            }
        }
        txtSeach.setText("");
        rbtnSeachAuthorName.setSelected(false);
        rbtnSeachBookId.setSelected(false);
        rbtnSeachNameBook.setSelected(false);

    }//GEN-LAST:event_btnSeachActionPerformed

    private void MenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLogoutActionPerformed
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginAdminForm laf = new LoginAdminForm();
            laf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MenuItemLogoutActionPerformed

    private void MenuItemBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBackActionPerformed
        AdminFunctionForm Hform = new AdminFunctionForm(emp);
        Hform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItemBackActionPerformed

    private void txtBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabeBookName;
    private javax.swing.JLabel LabelBookId;
    private javax.swing.JLabel LabelCategory;
    private javax.swing.JLabel LabelCount;
    private javax.swing.JLabel LabelPrice;
    private javax.swing.JLabel LabelProducer;
    private javax.swing.JMenuItem MenuItemBack;
    private javax.swing.JMenuItem MenuItemLogout;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSeach;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupSeachBook;
    private javax.swing.JComboBox<String> comboboxCategory;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JRadioButton rbtnSeachAuthorName;
    private javax.swing.JRadioButton rbtnSeachBookId;
    private javax.swing.JRadioButton rbtnSeachNameBook;
    private javax.swing.JSpinner spinnerCount;
    private javax.swing.JTable tableBook;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProDucer;
    private javax.swing.JTextField txtSeach;
    // End of variables declaration//GEN-END:variables

    private void showListBook() {
        tableModel.setRowCount(0);
        int stt = 1;
        for (Book e : listBook) {
            Object[] row = new Object[]{stt++, e.getBookId(), e.getName(), e.getCategory(), 
                e.getAuthor(), e.getProducer(), e.getPrice(), e.getAmount()};
            tableModel.addRow(row);
        }
        tableModel.fireTableDataChanged();
    }

    private void addTableModle(Book b) {
        Object[] row = new Object[]{stt++, b.getBookId(), b.getName(), b.getCategory(),
            b.getAuthor(), b.getProducer(), b.getPrice(), b.getAmount()};
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();

    }

    void editBook(Book b) {
        listBook.set(edit, b);
        dataimplement.updateBookSQL(b);
        tableModel.removeRow(edit);
        Object[] row = new Object[]{edit + 1, b.getBookId(), b.getName(), b.getCategory(),
            b.getAuthor(), b.getProducer(), b.getPrice(), b.getAmount()};
        tableModel.insertRow(edit, row);
        tableModel.fireTableDataChanged();
    }

    private void setTxtBookID(ArrayList<Book> listBook) {
        String max = listBook.get(0).getBookId();
        if (listBook.isEmpty()) {
            txtBookId.setText("PTIT" + (++Book.ID));
        } else {
            for (int i = 1; i < listBook.size(); i++) {
                if (max.compareTo(listBook.get(i).getBookId()) < 0) {
                    max = listBook.get(i).getBookId();
                }
                String[] string = max.split("PTIT");
                Book.ID = Integer.parseInt(string[1]);
                txtBookId.setText("PTIT" + (++Book.ID));
            }
        }
    }

    private void showListSeachBook(ArrayList<Book> listSeach) {
        int stt = 1;
        tableModel.setRowCount(0);
        for (Book e : listSeach) {
            Object[] row = new Object[]{stt++, e.getBookId(), e.getName(),
                e.getCategory(), e.getAuthor(), e.getProducer(), e.getPrice(),
                e.getAmount()};
            tableModel.addRow(row);
        }
        tableModel.fireTableDataChanged();
    }

    private void showSeachBook(Book b) {
        int stt = 1;
        tableModel.setRowCount(0);
        Object[] row = new Object[]{stt++, b.getBookId(), b.getName(), b.getCategory(),
            b.getAuthor(), b.getProducer(), b.getPrice(), b.getAmount()};
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }

    private boolean checkDelBook(Book b) {
        for (RegisterBook e : listRB) {
            if (e.getBookId().equalsIgnoreCase(b.getBookId())) {
                return false;
            }
        }
        return true;
    }

}
