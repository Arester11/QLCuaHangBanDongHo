package DAO;

import DTO.ChiTietSanPhamDTO;
import config.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChiTietSanPhamDAO implements DAOinterface<ChiTietSanPhamDTO> {
    
    public static ChiTietSanPhamDAO getInstance() {
        return new ChiTietSanPhamDAO();
    }
    
    @Override
    public int insert(ChiTietSanPhamDTO ctsp) {
        int result = 0;
        try {
            Connection con = (Connection) JDBC.getConnection();
            String sql = "INSERT INTO `ctsanpham`(`masp`, `duongkinh`, `dochiunuoc`,`chatlieumat`, `sizeday`, `chatlieuday`, `chatlieuvo`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setInt(1, ctsp.getMasp());
            pst.setString(2, ctsp.getDuongKinh());
            pst.setString(3, ctsp.getDoChiuNuoc());
            pst.setString(4, ctsp.getChatLieuMat());
            pst.setString(5, ctsp.getSizeDay());
            pst.setString(6, ctsp.getChatLieuDay());
            pst.setString(7, ctsp.getChatLieuVo());
            result = pst.executeUpdate();
            JDBC.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhieuNhapDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }
    
    
    @Override
    public int update(ChiTietSanPhamDTO ctsp) {
        int ketQua = 0;
        try {
            java.sql.Connection con = JDBC.getConnection();
            String sql = "UPDATE ctsanpham SET  duongkinh=?, dochiunuoc=?, chatlieumat=?, sizeday=?, chatlieuday=?, chatlieuvo=? WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ctsp.getDuongKinh());
            pst.setString(2, ctsp.getDoChiuNuoc());
            pst.setString(3, ctsp.getChatLieuMat());
            pst.setString(4, ctsp.getSizeDay());
            pst.setString(5, ctsp.getChatLieuDay());
            pst.setString(6, ctsp.getChatLieuVo());
            pst.setInt(7, ctsp.getMasp());
            ketQua = pst.executeUpdate();
            JDBC.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }
    
    @Override
    public ArrayList<ChiTietSanPhamDTO> selectAll() {
        ArrayList<ChiTietSanPhamDTO> ketQua = new ArrayList<>();
        try (Connection con = JDBC.getConnection(); Statement s = con.createStatement(); ResultSet rs = s.executeQuery("""
                                                                                                                       SELECT ct.masp, ct.duongkinh, ct.dochiunuoc, ct.chatlieumat, ct.sizeday, ct.chatlieuday, ct.chatlieuvo
                                                                                                                       FROM ctsanpham ct
                                                                                                                       INNER JOIN sanpham sp ON ct.masp = sp.masp;""")) {

            while (rs.next()) {
                ChiTietSanPhamDTO ct = new ChiTietSanPhamDTO();
                ct.setMasp(rs.getInt("masp"));
                ct.setDuongKinh(rs.getString("duongkinh"));
                ct.setDoChiuNuoc(rs.getString("dochiunuoc"));
                ct.setChatLieuMat(rs.getString("chatlieumat"));
                ct.setSizeDay(rs.getString("sizeday"));
                ct.setChatLieuDay(rs.getString("chatlieuday"));
                ct.setChatLieuVo(rs.getString("chatlieuvo"));
                ketQua.add(ct);
            }
        } catch (SQLException e) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public ChiTietSanPhamDTO selectById(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getAutoIncrement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(ChiTietSanPhamDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
