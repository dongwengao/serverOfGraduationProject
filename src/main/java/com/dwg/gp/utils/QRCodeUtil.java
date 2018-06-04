package com.dwg.gp.utils;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.QRCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.util.Hashtable;

import javax.imageio.ImageIO;


public class QRCodeUtil {

    public static byte[] getQrcodeImg(String content) {

        int width=100;
        int height=100;
        String format="png";
        Hashtable hints=new Hashtable();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hints.put(EncodeHintType.MARGIN, 2);

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BitMatrix bitMatrix= null;
        try {
            bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hints);
            image=MatrixToImageWriter.toBufferedImage(bitMatrix);

        } catch (WriterException e) {
            e.printStackTrace();
        }

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
