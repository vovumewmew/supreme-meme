package UI.MainFrameUI.DatPhongUI;

import javax.swing.*;

import DTO.Phong;
import UI.LoginUI.LoginUI;

import java.awt.*;

public class DatPhongFrame extends JFrame{
    private JComboBox<String> cbLoaiDatPhong;
    private DanhSachPhongTrongPanel danhSachPhong;
    private ChiTietPhongPanel chiTietPhong;
    public DatPhongFrame()
    {
        super("Cửa sổ đặt phòng");
        init();
    }
    private void init()
    {
        setSize(600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(false);
        setLayout(null);

        ImageIcon backgroundIcon = new ImageIcon(LoginUI.class.getResource("/pic/dpb.jpg")); 
        JLabel background = new JLabel(backgroundIcon);
        background.setBounds(0, 0, 600,400);
        background.setLayout(null);
        setContentPane(background);

        setLayout(new BorderLayout());

        cbLoaiDatPhong = new JComboBox<>(new String[]{"Giữ chỗ", "Trực tiếp", "Online"});
        add(cbLoaiDatPhong, BorderLayout.NORTH);

        danhSachPhong = new DanhSachPhongTrongPanel(this);
        JScrollPane scroll = new JScrollPane(danhSachPhong);
        add(scroll, BorderLayout.CENTER);

        chiTietPhong = new ChiTietPhongPanel();
        add(chiTietPhong, BorderLayout.SOUTH);

        
    }
    public void hienChiTietPhong(Phong phong) {
        chiTietPhong.hienThiThongTin(phong);
    }

    public String getLoaiDatPhong() {
        return cbLoaiDatPhong.getSelectedItem().toString();
    }
}
