/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasison;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Burak
 */
public class MuzikMenu {
    JFrame jFrame = new JFrame();
    boolean musicAcikMi = false;
    String filePath1 = "push-the-button.wav";
    String filePath2 = "we will rock you.wav";
    MuzikAc musicObject = new MuzikAc();
    int mGenislik = 400;
    int mYukseklik = 400;
    JLabel jLabelMuzik1 = new JLabel();
    JLabel jLabelMuzik2 = new JLabel();
    JLabel jLabelMuzik3 = new JLabel();
    JLabel jLabelMuzik4 = new JLabel();
    JLabel arkaPlan = new JLabel();
    Image arka = new ImageIcon(OyunAlani.class.getResource("/resources/Disco.jpg")).getImage();

    public void islemMerkezi() {
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLayout(null);
        
        setDimension();
        olustur();
        arkaPlan.setIcon(new ImageIcon(arka));
        arkaPlan.setBounds(0, 0, mGenislik, mYukseklik);
        jFrame.add(arkaPlan);
        
    }

    public void setDimension() {
        
        Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();

        int PosX = 0;
        int PosY = 0;

        if (mGenislik + 100 > Dim.width) {
            mGenislik = Dim.width - 100;
        }
        if (mYukseklik + 100 > Dim.height) {
            mYukseklik = Dim.height - 100;
        }

        PosX = (Dim.width - mGenislik) / 2;
        PosY = (Dim.height - mYukseklik) / 2;

        jFrame.setBounds(PosX, PosY, mGenislik, mYukseklik);

    }

    private void olustur() {
        jLabelMuzik1.setText("Push the Button - Serhat Bedük");
        jLabelMuzik1.setBounds(25, 25, 180, 25);
        jLabelMuzik1.setBackground(Color.YELLOW);
        jLabelMuzik1.setOpaque(true);
        jFrame.add(jLabelMuzik1);
        jLabelMuzik1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (musicAcikMi) {
                    musicObject.musicDurdur();
                } else {
                    
                }
                musicObject.playMusic(filePath1);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        jLabelMuzik2.setText(" We will rock you - Queen");
        jLabelMuzik2.setBounds(25, 75, 180, 25);
        jLabelMuzik2.setBackground(Color.GREEN);
        jLabelMuzik2.setOpaque(true);
        jFrame.add(jLabelMuzik2);
        jLabelMuzik2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (musicAcikMi) {
                    musicObject.musicDurdur();
                } else {
                    
                }
                musicObject.playMusic(filePath2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

}
