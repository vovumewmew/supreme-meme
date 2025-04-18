package UI.MainFrameUI.DatPhongUI;
import javax.swing.*;
import java.awt.*;


import DTO.Phong;

public class ChiTietPhongPanel extends JPanel {
    private JLabel lblGia, lblDichVu;

    public ChiTietPhongPanel() {
        setLayout(new GridLayout(2, 1));
        lblGia = new JLabel("Giá: ");
        lblDichVu = new JLabel("Dịch vụ: ");
        add(lblGia);
        add(lblDichVu);
    }

    public void hienThiThongTin(Phong phong) {
        lblGia.setText("Giá: " + phong.getGia() + " VNĐ");
        lblDichVu.setText("Dịch vụ: " + phong.getDichVu());
    }
}
