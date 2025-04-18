package UI.MainFrameUI.DatPhongUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import DTO.Phong;
import DAO.PhongDAO;

public class DanhSachPhongTrongPanel extends JPanel {
    public DanhSachPhongTrongPanel(DatPhongFrame parent) {
        setLayout(new GridLayout(0, 2, 10, 10));

        List<Phong> phongTrong = PhongDAO.layDanhSachPhongTrong(); 
        if (phongTrong != null) {
            for (Phong phong : phongTrong) {
                PhongItemPanel item = new PhongItemPanel(phong, parent);
                add(item);
            }
        }
        for (Phong phong : phongTrong) {
            PhongItemPanel item = new PhongItemPanel(phong, parent);
            add(item);
        }
    }
}
