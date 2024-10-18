package BUS;
import DAO.ChiTietSanPhamDAO;
import DTO.ChiTietSanPhamDTO;
import java.util.ArrayList;

public class CTSanPhamBUS {
    
    public final ChiTietSanPhamDAO ctspDAO = new ChiTietSanPhamDAO();
    private ArrayList<ChiTietSanPhamDTO> listCTSP;
    
    public CTSanPhamBUS() {
        listCTSP = ctspDAO.selectAll();
    }
    
    public void loadData() {
        this.listCTSP = ctspDAO.selectAll();
    }
    
    public boolean insertCTSP(ChiTietSanPhamDTO ctsp) {
        if (ctspDAO.insert(ctsp) != 0) {
            return true;
        }
        return false;
    }
    
    public boolean updateCTSP(ChiTietSanPhamDTO ctsp) {
        if (ctspDAO.update(ctsp) != 0) {
            return true;
        }
        return false;
    }
    
    public ChiTietSanPhamDTO getCTSPByID(int masp) {
        loadData();
        for (ChiTietSanPhamDTO ctsp : listCTSP) {
            if (ctsp.getMasp() == masp) {
                return ctsp;
            }
        }
        return null;
    }

    public ArrayList<ChiTietSanPhamDTO> getAll() {
        return this.listCTSP;
    }
}
