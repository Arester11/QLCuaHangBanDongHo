package DAO;

import DTO.ChiTietBaoHanhDTO;
import DTO.ChiTietPhieuXuatDTO;
import config.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietBaoHanhDAO implements DAOinterface<ChiTietBaoHanhDTO> {

    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM ctbaohanh WHERE mabh=?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM ctphieuxuat";
    
    @Override
    public int insert(ChiTietBaoHanhDTO ct) {
        int result = 0;
        try {
            Connection con = (Connection) JDBC.getConnection();
            String sql = "INSERT INTO `ctbaohanh`(`mabh`, `ngaynhan`, `ngaytra`,`noidung`, `chiphi`) VALUES (?,?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setInt(1, ct.getMabh());
            pst.setDate(2, (java.sql.Date) ct.getNgaynhan());
            pst.setDate(3, (java.sql.Date) ct.getNgaytra());
            pst.setString(4, ct.getNoidung());
            pst.setDouble(5, ct.getChiphi());
            result = pst.executeUpdate();
            JDBC.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    @Override
    public ArrayList<ChiTietBaoHanhDTO> selectAll() {
        // Đổi kiểu của danh sách thành ChiTietBaoHanhDTO
        ArrayList<ChiTietBaoHanhDTO> list = new ArrayList<>();
        try (Connection con = JDBC.getConnection(); PreparedStatement pst = con.prepareStatement(SELECT_ALL_QUERY); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                int mabh = rs.getInt("mabh");
                Date ngaynhan = rs.getDate("ngaynhan");
                Date ngaytra = rs.getDate("ngaytra");
                String noidung = rs.getString("noidung");
                double chiphi = rs.getDouble("chiphi");

                // Tạo đối tượng ChiTietBaoHanhDTO và thêm vào danh sách
                ChiTietBaoHanhDTO ct = new ChiTietBaoHanhDTO(mabh, ngaynhan, ngaytra, noidung, chiphi);
                list.add(ct);  // Không còn lỗi
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;  // Trả về danh sách đúng kiểu
    }
    
    @Override
    public int update(ChiTietBaoHanhDTO t) {
        throw new UnsupportedOperationException("Update method is not supported yet.");
    }

    @Override
    public int delete(ChiTietBaoHanhDTO t) {
        throw new UnsupportedOperationException("Delete method is not supported yet.");
    }

    @Override
    public int getAutoIncrement() {
        throw new UnsupportedOperationException("Get auto increment method is not supported yet.");
    }

    @Override
    public ChiTietBaoHanhDTO selectById(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
