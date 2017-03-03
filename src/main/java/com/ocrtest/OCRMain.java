package com.ocrtest;

import com.sun.xml.internal.ws.api.ResourceLoader;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

/**
 * Created by hmanikkothu on 3/2/2017.
 */
public class OCRMain {

    public static void main(String[] args) {
        String root = System.getProperty("user.dir");
        File imageFile = new File(root + "\\src\\main\\resources\\images\\Spanish-1.png");
        if (!imageFile.exists()) {
            System.out.println(root + "Image not found");
        }
        Tesseract instance = new Tesseract();

        try {
            instance.setLanguage("spa");

            String result = instance.doOCR(imageFile);

            System.out.println(result);
        } catch (Exception e) {
            //System.err.println(e.getCause());
        }
    }
}
