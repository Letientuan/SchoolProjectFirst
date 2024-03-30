/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import ServiceImpl.HoaDonServiceImpl;
import entity.entities.HoaDonAn;
import entity.entities.HoaDonChiTietAn;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.HoaDonService;

/**
 *
 * @author thong
 */
public class HoaDonView extends javax.swing.JPanel {

    /**
     * Creates new form HoaDonView
     */
    private HoaDonServiceImpl hoaDonServiceImpl = new HoaDonService();
    DefaultTableModel tblModel = new DefaultTableModel();
    private List<HoaDonAn> list = hoaDonServiceImpl.getListHD();

    public HoaDonView() {
        initComponents();
        load(list);
    }
    

    public void load(List<HoaDonAn> hoaDons) {
        tblModel = (DefaultTableModel) tblHoaDon.getModel();
        tblModel.setRowCount(0);
        for (HoaDonAn x : hoaDons) {
            
            Object row[] = new Object[]{
                x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(),new BigDecimal(x.getTongTien()).toPlainString() ,
                new BigDecimal(x.getThanhToan()).toPlainString(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                x.gettrangthaiHD(x.getTinhTrang()), x.getGhiChu()
            };
            tblModel.addRow(row);
        }
        list = hoaDons;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        JDCNgayEnd = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JDCNgayStart1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Mã hóa đơn:");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel5.setText("Trạng thái:");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đã thanh toán", "Chờ thanh toán", "Đã Hủy" }));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });
        cboTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrangThaiActionPerformed(evt);
            }
        });

        jLabel6.setText("Ngày bắt đầu:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày kết thúc:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(JDCNgayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(JDCNgayStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JDCNgayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)
                        .addComponent(JDCNgayStart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã NV", "Tên NV", "Mã KH", "Tên KH", "Tổng tiền", "Thanh Toán", "Ngày tạo", "Hình thức thanh toán", "Ngày thanh toán", "Trạng thái", "Ghi Chú", "Chiết Khấu"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        jLabel3.setText("Lọc hóa đơn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn chi tiết", "Mã Hóa Đơn", "Mã sản phẩm", "Tên Sản Phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHDCT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Hóa Đơn Chi Tiết");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Hóa Đơn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        try {
            if (txtSearch.getText().isEmpty()) {
                load(list);
            } else {
                List<HoaDonAn> listHD = hoaDonServiceImpl.searchListHD(Long.parseLong(txtSearch.getText()));
                tblModel = (DefaultTableModel) tblHoaDon.getModel();
                tblModel.setRowCount(0);
                for (HoaDonAn x : listHD) {
                    Object row[] = new Object[]{
                        x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(), new BigDecimal(x.getTongTien()).toPlainString() ,
                         new BigDecimal(x.getThanhToan()).toPlainString(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                        x.getTinhTrang() == 1 ? "Đã thanh toán" : "Chờ thanh toán", x.getGhiChu()
                    };
                    tblModel.addRow(row);
                    txtSearch.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTrangThaiActionPerformed

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        if ("Đã thanh toán".equalsIgnoreCase(cboTrangThai.getSelectedItem().toString())) {
            List<HoaDonAn> listHD = hoaDonServiceImpl.searchTinhTrang(1);
            tblModel = (DefaultTableModel) tblHoaDon.getModel();
            tblModel.setRowCount(0);
            for (HoaDonAn x : listHD) {
                Object row[] = new Object[]{
                    x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(), new BigDecimal(x.getTongTien()).toPlainString() ,
                     new BigDecimal(x.getThanhToan()).toPlainString(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                    x.getTinhTrang() == 1 ? "Đã thanh toán" : "Chờ thanh toán", x.getGhiChu()
                };
                tblModel.addRow(row);
            }
        } else if ("Chờ thanh toán".equalsIgnoreCase(cboTrangThai.getSelectedItem().toString())) {
            List<HoaDonAn> listHD = hoaDonServiceImpl.searchTinhTrang(0);
            tblModel = (DefaultTableModel) tblHoaDon.getModel();
            tblModel.setRowCount(0);
            for (HoaDonAn x : listHD) {
                Object row[] = new Object[]{
                    x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(), new BigDecimal(x.getTongTien()).toPlainString() ,
                    new BigDecimal(x.getThanhToan()).toPlainString(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                    x.getTinhTrang() == 1 ? "Đã thanh toán" : "Chờ thanh toán", x.getGhiChu()
                };
                tblModel.addRow(row);
            }
        } else if ("Tất cả".equalsIgnoreCase(cboTrangThai.getSelectedItem().toString())) {
            load(list);
        }
        else if("Đã Hủy".equalsIgnoreCase(cboTrangThai.getSelectedItem().toString())){
             List<HoaDonAn> listHD = hoaDonServiceImpl.searchTinhTrang(2);
            tblModel = (DefaultTableModel) tblHoaDon.getModel();
            tblModel.setRowCount(0);
            for (HoaDonAn x : listHD) {
                Object row[] = new Object[]{
                    x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(), new BigDecimal(x.getTongTien()).toPlainString() ,
                     new BigDecimal(x.getThanhToan()).toPlainString(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                    x.gettrangthaiHD(x.getTinhTrang()), x.getGhiChu()
                };
                tblModel.addRow(row);
            }
        }
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHDCTMouseClicked

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int index = tblHoaDon.getSelectedRow();
        Long ma = (Long) tblHoaDon.getValueAt(index, 0);
        List<HoaDonChiTietAn> list = hoaDonServiceImpl.listHDCTGetHD(ma);
        tblModel = (DefaultTableModel) tblHDCT.getModel();
        tblModel.setRowCount(0);
        for (HoaDonChiTietAn x : list) {
            Object row[] = new Object[]{
                x.getMaHDCTTT(), x.getMaHD().getMaHD(), x.getMaSP().getMaSP(), x.getTenSP(), x.getSoLuong(), x.getDonGia(),  new BigDecimal(x.getThanhtien()).toPlainString()
            };
            tblModel.addRow(row);
        }

    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (JDCNgayStart1.getDate()== null|| JDCNgayEnd.getDate()== null) {
            load(list);
            JOptionPane.showMessageDialog(this, "Chưa chọn ngày!");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStart = sdf.format(JDCNgayStart1.getDate());
            String dateEnd = sdf.format(JDCNgayEnd.getDate());
            List<HoaDonAn> listHD1 = hoaDonServiceImpl.searchNgay(dateStart, dateEnd);
            tblModel = (DefaultTableModel) tblHoaDon.getModel();
            tblModel.setRowCount(0);
            for (HoaDonAn x : listHD1) {
                Object row[] = new Object[]{
                    x.getMaHD(), x.getManhanVien().getMaNV(), x.getManhanVien().getTenNV(), x.getMakhachHang().getMaKH(), x.getMakhachHang().getTenKH(), x.getTongTien(),
                    x.getThanhToan(), x.getNgayTao(), x.getPhuongThucThanhToan(), x.getNgayThanhToan(),
                    x.getTinhTrang() == 1 ? "Đã thanh toán" : "Chờ thanh toán", x.getGhiChu(), x.getChietKhau()
                };
                tblModel.addRow(row);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDCNgayEnd;
    private com.toedter.calendar.JDateChooser JDCNgayStart1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
