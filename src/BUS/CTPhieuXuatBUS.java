
package BUS;
import DAO.ChiTietPhieuXuatDAO;
import DTO.ChiTietPhieuXuatDTO;
import java.util.ArrayList;
/**
 *
 * @author Bao Phan
 */
public class CTPhieuXuatBUS {
     public final ChiTietPhieuXuatDAO ctpxDAO = new ChiTietPhieuXuatDAO();
    private ArrayList<ChiTietPhieuXuatDTO> listctpx = new ArrayList<ChiTietPhieuXuatDTO>();

    public CTPhieuXuatBUS() {
        listctpx = ctpxDAO.selectAll();
    }

    public ArrayList<ChiTietPhieuXuatDTO> getAll() {
        return this.listctpx;
    }

    public ChiTietPhieuXuatDTO getByIndex(int index) {
        return this.listctpx.get(index);
    }
    private int getIndexByMaPX(int maphieuxuat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
