package UI.MainFrameUI.DatPhongUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import DTO.Phong;

public class PhongItemPanel extends JPanel {
    public PhongItemPanel(Phong phong, DatPhongFrame parent) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JLabel lbl = new JLabel(phong.getTenPhong());
        lbl.setHorizontalAlignment(JLabel.CENTER);
        add(lbl, BorderLayout.CENTER);

        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBackground(new Color(245, 250, 255));

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                parent.hienChiTietPhong(phong);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(220, 240, 255));
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(245, 250, 255));
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                parent.hienChiTietPhong(phong);
            }
        });
    }
}
