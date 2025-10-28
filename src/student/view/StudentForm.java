
package student.view;

import adminstrator.model.Employee;
import adminstrator.view.AdminFunctionForm;
import adminstrator.view.LoginAdminForm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import student.controller.DataStudentFunctionImp;
import student.model.InValidEmailException;
import student.model.InValidPhoneException;
import student.model.Student;

public class StudentForm extends javax.swing.JFrame {

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private ArrayList<Student> listStudent;
    private int stt;
    public int edit;
    private DataStudentFunctionImp dataImplement;
    private DefaultTableModel tableModel;
    private Employee emp;

    public StudentForm() {
        initComponents();
        setLocationRelativeTo(null);
        edit = -1;
        dataImplement = new DataStudentFunctionImp();
        addGroup();
        listStudent = new ArrayList<>();
        tableModel = (DefaultTableModel) tbStudent.getModel();
        dataImplement.readStudentSQL(listStudent);
        stt = listStudent.size() + 1;
        setID();
        showListStudent();
        tbStudent.setAutoCreateRowSorter(true);
    }

    public StudentForm(Employee e) {
        this();
        emp = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSearchST = new javax.swing.ButtonGroup();
        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSeachByNameStudent = new javax.swing.JRadioButton();
        btnSeachByStudentId = new javax.swing.JRadioButton();
        btnSeachByClass = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelBookId = new javax.swing.JLabel();
        LabeBookName = new javax.swing.JLabel();
        LabelCategory = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        LabelProducer = new javax.swing.JLabel();
        LabelPrice = new javax.swing.JLabel();
        LabelCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        comboboxCategory = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        rbtnBoy = new javax.swing.JRadioButton();
        rbtnGirl = new javax.swing.JRadioButton();
        comboboxClass = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnSeachByNameStudent.setBackground(new java.awt.Color(255, 0, 0));
        btnSeachByNameStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeachByNameStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnSeachByNameStudent.setText("Tìm Kiếm Theo Tên Sinh Viên");

        btnSeachByStudentId.setBackground(new java.awt.Color(255, 0, 0));
        btnSeachByStudentId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeachByStudentId.setForeground(new java.awt.Color(255, 255, 255));
        btnSeachByStudentId.setText("Tìm Kiếm Theo Mã Sinh Viên");

        btnSeachByClass.setBackground(new java.awt.Color(255, 0, 0));
        btnSeachByClass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSeachByClass.setForeground(new java.awt.Color(255, 255, 255));
        btnSeachByClass.setText("Tìm Kiếm Theo Lớp");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeachByNameStudent)
                    .addComponent(btnSeachByClass)
                    .addComponent(btnSeachByStudentId))
                .addGap(54, 54, 54)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSeachByNameStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeachByStudentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeachByClass)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sinh Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        LabelBookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelBookId.setForeground(new java.awt.Color(255, 255, 255));
        LabelBookId.setText("Mã SV");

        LabeBookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabeBookName.setForeground(new java.awt.Color(255, 255, 255));
        LabeBookName.setText("Tên SV");

        LabelCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCategory.setForeground(new java.awt.Color(255, 255, 255));
        LabelCategory.setText("Chuyên ngành");

        labelAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAuthor.setForeground(new java.awt.Color(255, 255, 255));
        labelAuthor.setText("Giới tính");

        LabelProducer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelProducer.setForeground(new java.awt.Color(255, 255, 255));
        LabelProducer.setText("Địa chỉ");

        LabelPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPrice.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrice.setText("Lớp");

        LabelCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelCount.setForeground(new java.awt.Color(255, 255, 255));
        LabelCount.setText("Email");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Số ĐT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ngày sinh");

        txtStudentId.setEditable(false);
        txtStudentId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtStudentId.setEnabled(false);

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        comboboxCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "An toàn thông tin", "Điện tử viễn thông", "Khoa học máy tính" }));
        comboboxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCategoryActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtSdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtDob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        rbtnBoy.setBackground(new java.awt.Color(102, 102, 102));
        rbtnBoy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnBoy.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBoy.setText("Nam");
        rbtnBoy.setOpaque(true);

        rbtnGirl.setBackground(new java.awt.Color(102, 102, 102));
        rbtnGirl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnGirl.setForeground(new java.awt.Color(255, 255, 255));
        rbtnGirl.setText("Nữ");
        rbtnGirl.setOpaque(true);

        comboboxClass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboboxClass.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabeBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentId)
                            .addComponent(txtName)
                            .addComponent(comboboxCategory, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtDob)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rbtnBoy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LabelProducer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(LabelCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboboxClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(txtSdt)
                    .addComponent(txtAddress))
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabeBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbtnBoy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbtnGirl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        tbStudent.setBackground(new java.awt.Color(153, 255, 255));
        tbStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SV", "Tên SV", "Giới tính", "Ngày sinh", "Lớp", "Địa chỉ", "Chuyên ngành", "SĐT", "Email", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tbStudent);
        if (tbStudent.getColumnModel().getColumnCount() > 0) {
            tbStudent.getColumnModel().getColumn(3).setMaxWidth(60);
            tbStudent.getColumnModel().getColumn(5).setMaxWidth(60);
            tbStudent.getColumnModel().getColumn(10).setMinWidth(62);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(102, 102, 102));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemove.setText("Xóa");
        btnRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 102, 102));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addGap(36, 36, 36)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnAdd.getAccessibleContext().setAccessibleName("");
        btnUpdate.getAccessibleContext().setAccessibleName("");
        btnRemove.getAccessibleContext().setAccessibleName("");
        btnRefresh.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.setOpaque(true);

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Hệ Thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setOpaque(true);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Thoát");
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateForm() {
        return !txtStudentId.getText().isEmpty() && !txtName.getText().isEmpty()
                && checkGender() && !txtDob.getText().isEmpty()
                && !txtAddress.getText().isEmpty() && comboboxCategory.getSelectedItem() != null
                && !txtEmail.getText().isEmpty() && !txtSdt.getText().isEmpty()
                && comboboxCategory.getSelectedItem() != null;
    }

    private void resetForm() {
        txtStudentId.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtAddress.setText("");
        comboboxClass.setSelectedIndex(-1);
        txtEmail.setText("");
        txtSdt.setText("");
        comboboxCategory.setSelectedIndex(0);
        rbtnBoy.setSelected(false);
        rbtnGirl.setSelected(false);
    }

    private void showListSeachStudent(ArrayList<Student> listSearch) {
        int stt = 1;
        tableModel.setRowCount(0);
        for ( Student e : listSearch) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getName(),
                e.getGender(), df.format(e.getDob()), e.getClassRoon(), e.getAddress(),
                e.getMajor(), e.getPhone(), e.getEmail(), e.getPassword()};
            tableModel.addRow(row);
            tableModel.fireTableDataChanged();
        }
    }

    private void showSearchStudent(Student e) {
        int stt = 1;
        tableModel.setRowCount(0);
        Object[] row = new Object[]{stt++, e.getStudentId(), e.getName(),
            e.getGender(), df.format(e.getDob()), e.getClassRoon(), e.getAddress(),
            e.getMajor(), e.getPhone(), e.getEmail(), e.getPassword()};
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<Student> listSearch = new ArrayList<>();
        if (!(btnSeachByNameStudent.isSelected() 
                || btnSeachByClass.isSelected()
                || btnSeachByStudentId.isSelected() )) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn chức năng tìm kiếm");
            return;
        }
        String search = txtSearch.getText();
        if (search.isEmpty()) {  
            JOptionPane.showMessageDialog(this, "Ô thông tin tìm kiếm đang rỗng!");
            return;
        }
        if (btnSeachByClass.isSelected()) {
            listSearch = dataImplement.searchByClass(listStudent, search);
            if (!listSearch.isEmpty()) {
                showListSeachStudent(listSearch);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tên lớp tương ứng!");
            }
        } else if (btnSeachByStudentId.isSelected()) {
            Student searchStudent = dataImplement.searchStudentById(listStudent, search);
            if (searchStudent != null) {
                showSearchStudent(searchStudent);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã sinh vien tương ứng");
            }
        } else if (btnSeachByNameStudent.isSelected()) {
            listSearch = dataImplement.searchByName(listStudent, search);
            if (!listSearch.isEmpty()) {
                showListSeachStudent(listSearch);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tên sinh viên tương ứng!");
            }
        }
        txtSearch.setText("");
        btnSeachByClass.setSelected(false);
        btnSeachByStudentId.setSelected(false);
        btnSeachByNameStudent.setSelected(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!validateForm()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            return;
        }
        try {
            Date dateNow = new Date();
            Date d = df.parse(txtDob.getText());
            if(d.getTime() < dateNow.getTime()){
            Student s = new Student();
            s.setDob(d);
            s.setStudentId(txtStudentId.getText());
            s.setName(txtName.getText());
            s.setMajor(comboboxCategory.getSelectedItem().toString());
            takeGender(s);
            s.setAddress(txtAddress.getText());
            s.setClassRoon(comboboxClass.getSelectedItem().toString());
            s.setEmail(txtEmail.getText());
            s.setPhone(txtSdt.getText());
            listStudent.add(s);
            Student.ID++;
            dataImplement.insertStudent(s);
            addTableModle(s);
            resetForm();
            JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công");
            }else{

            JOptionPane.showMessageDialog(this, "Ngày sinh phải nhỏ hơn ngày hiện thời!");
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng (vd: 12/12/2002)!");
        } catch (InValidPhoneException | InValidEmailException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        edit = tbStudent.getSelectedRow();
        if (!listStudent.isEmpty()) {
            if (edit != -1) {
                EditStudent editS = new EditStudent(this, true, listStudent.get(edit));
                editS.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên cần sinh sửa");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        edit = tbStudent.getSelectedRow();
        if (!listStudent.isEmpty()) {
            if (edit != -1) {
                int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?");
                if (choic == JOptionPane.YES_OPTION) {
                    dataImplement.delStudent(listStudent.get(edit));
                    listStudent.remove(edit);
                    tableModel.removeRow(edit);
                    tableModel.fireTableDataChanged();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn đã hủy");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn sinh viên cần xóa");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Danh sách rỗng");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showListStudent();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void updateClassComboBox(String major) {
        comboboxClass.removeAllItems();
        comboboxClass.setEnabled(true);
        switch (major) {
            case "Công nghệ thông tin" -> {
                for (int i = 1; i <= 10; i++) {
                    comboboxClass.addItem("CN" + String.format("%02d", i));
                }
            }
            case "Điện tử viễn thông" -> {
                for (int i = 1; i <= 10; i++) {
                    comboboxClass.addItem("DT" + String.format("%02d", i));
                }
            }
            case "An toàn thông tin" -> {
                for (int i = 1; i <= 10; i++) {
                    comboboxClass.addItem("AT" + String.format("%02d", i));
                }
            }
            case "Khoa học máy tính" -> {
                for (int i = 1; i <= 10; i++) {
                    comboboxClass.addItem("KH" + String.format("%02d", i));
                }
            }
            default -> {
            }
        }
    }    
    
    private void comboboxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCategoryActionPerformed
        switch (comboboxCategory.getSelectedIndex()) {
//            0: Công nghệ thông tin
//            1: An toàn thông tin
//            2: Điện tử viễn thông
//            3: Khoa học máy tính
            case 0 -> txtStudentId.setText("CN" + (Student.ID + 1));
            case 1 -> txtStudentId.setText("AT" + (Student.ID + 1));
            case 2 -> txtStudentId.setText("DT" + (Student.ID + 1));
            case 3 -> txtStudentId.setText("KH" + (Student.ID + 1));
            default -> {
            }
        }
        updateClassComboBox((String) comboboxCategory.getSelectedItem());
    }//GEN-LAST:event_comboboxCategoryActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminFunctionForm hf = new AdminFunctionForm(emp);
        hf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginAdminForm laf = new LoginAdminForm();
            laf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void showListStudent() {
        tableModel.setRowCount(0);
        int stt = 1;
        for ( Student e : listStudent) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getName(),
                e.getGender(), df.format(e.getDob()), e.getClassRoon(), e.getAddress(),
                e.getMajor(), e.getPhone(), e.getEmail(), e.getPassword()};
            tableModel.addRow(row);
            tableModel.fireTableDataChanged();
        }
    }

    private void addTableModle(Student e) {
        Object[] row = new Object[]{stt++, e.getStudentId(), e.getName(),
            e.getGender(), df.format(e.getDob()), e.getClassRoon(), e.getAddress(),
            e.getMajor(), e.getPhone(), e.getEmail(), e.getPassword()};
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }

    public void editStudent(Student s) {
        listStudent.set(edit, s);
        dataImplement.updateStudent(s);
        tableModel.removeRow(edit);
        Object[] row = new Object[]{edit + 1, s.getStudentId(), s.getName(),
            s.getGender(), df.format(s.getDob()), s.getClassRoon(), s.getAddress(),
            s.getMajor(), s.getPhone(), s.getEmail(), s.getPassword()};
        tableModel.insertRow(edit, row);
        tableModel.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabeBookName;
    private javax.swing.JLabel LabelBookId;
    private javax.swing.JLabel LabelCategory;
    private javax.swing.JLabel LabelCount;
    private javax.swing.JLabel LabelPrice;
    private javax.swing.JLabel LabelProducer;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JRadioButton btnSeachByClass;
    private javax.swing.JRadioButton btnSeachByNameStudent;
    private javax.swing.JRadioButton btnSeachByStudentId;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.ButtonGroup buttonGroupSearchST;
    private javax.swing.JComboBox<String> comboboxCategory;
    private javax.swing.JComboBox<String> comboboxClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JRadioButton rbtnBoy;
    private javax.swing.JRadioButton rbtnGirl;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

    private void addGroup() {
        buttonGroupSearchST.add(btnSeachByClass);
        buttonGroupSearchST.add(btnSeachByNameStudent);
        buttonGroupSearchST.add(btnSeachByStudentId);
        buttonGroupGender.add(rbtnBoy);
        buttonGroupGender.add(rbtnGirl);
    }

    private void setID() {
        int maxID = 0;
        for ( Student e : listStudent) {
            int id = takeId(e.getStudentId());
            if (maxID < id) {
                maxID = id;
            }
        }
        Student.ID = maxID;

    }

    private int takeId(String studentId) {
        String[] nameId = studentId.split("(CN|AT|DT|KH)");
        int id = Integer.parseInt(nameId[1]);
        return id;
    }

    private boolean checkGender() {
        return rbtnBoy.isSelected() || rbtnGirl.isSelected();
    }

    private void takeGender(Student s) {
        s.setGender(rbtnBoy.isSelected() ? "Nam" : "Nữ");
    }
    
}
