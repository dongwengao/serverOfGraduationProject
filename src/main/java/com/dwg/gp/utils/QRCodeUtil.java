package com.dwg.gp.utils;

import com.swetake.util.Qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;


public class QRCodeUtil {

    public static byte[] getQrcodeImg(String content) {

        Qrcode qrcode;
        qrcode = new Qrcode();
        qrcode.setQrcodeEncodeMode('B');
        qrcode.setQrcodeErrorCorrect('M');
        qrcode.setQrcodeVersion(15);
        int pixoff = 2;
        int width = 235;
        int height = 235;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D gs = image.createGraphics();
        gs.setBackground(Color.white);
        gs.setColor(Color.black);
        gs.clearRect(0, 0, width, height);
        byte[] codeOut;
        try {
            codeOut = content.getBytes("utf-8");
            if (codeOut.length > 0 && codeOut.length < 120) {
                boolean[][] s = qrcode.calQrcode(codeOut);
                for (int i = 0; i < s.length; i++) {
                    for (int j = 0; j < s.length; j++) {
                        if (s[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        gs.dispose();
        image.flush();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toByteArray();
    }

}
