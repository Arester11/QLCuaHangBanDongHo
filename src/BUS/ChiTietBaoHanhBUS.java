package BUS;

import DAO.ChiTietBaoHanhDAO;
import DTO.ChiTietBaoHanhDTO;
import java.util.ArrayList;

public class ChiTietBaoHanhBUS {
    private ChiTietBaoHanhDAO ctDAO;
    private ArrayList<ChiTietBaoHanhDTO> list;
    
    public ChiTietBaoHanhBUS() {
        ctDAO = new ChiTietBaoHanhDAO();
        loadData();
    }
    
    public void loadData() {
        this.list = ctDAO.selectAll();
    }
    
    public ArrayList<ChiTietBaoHanhDTO> getDSCTBH() {
        loadData();
        return list;
    }
    
    public ChiTietBaoHanhDTO getCTBHById(int mabh) {
        loadData();
        for(ChiTietBaoHanhDTO i : list) {
            if(i.getMabh() == mabh) {
                return i;
            }
        }
        return null;
    }
    
    public boolean insert(ChiTietBaoHanhDTO ct) {
        if (ctDAO.insert(ct) != 0) {
            return true;
        }
        return false;
    }
    
}
