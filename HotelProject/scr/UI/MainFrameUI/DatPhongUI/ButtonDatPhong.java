package UI.MainFrameUI.DatPhongUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDatPhong extends JButton{

    public ButtonDatPhong()
    {
        super();
        init();
    }
    private void init()
    {
        ImageIcon datphongicon = new ImageIcon(ButtonDatPhong.class.getResource("/pic/datphongicon.png"));

        setPreferredSize(new Dimension(50,50));;
        setText("Đặt phòng");
        setIcon(datphongicon);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.BOTTOM);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        ChangeColor();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        OnClickDatPhong();
    }
    public void ChangeColor() {
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setContentAreaFilled(true);
                setBackground(new Color(184, 226, 224));
            }
    
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setContentAreaFilled(false);
            }
        });
    }
    private void OnClickDatPhong()
    {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                DatPhongFrame datPhongPanel = new DatPhongFrame();
                datPhongPanel.setVisible(true);
            }
        });
    }
}
