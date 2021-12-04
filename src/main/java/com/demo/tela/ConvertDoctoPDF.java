/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.tela;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author dev
 */
public class ConvertDoctoPDF {
    
    public void convertDocInPDF(String caminho){
        try {
            InputStream docFile = new FileInputStream(new File(caminho));
            XWPFDocument doc = new XWPFDocument(docFile);
            PdfOptions pdfOptions = PdfOptions.create();
            OutputStream out = new FileOutputStream(new File(FilenameUtils.removeExtension(caminho)+".pdf"));
            PdfConverter.getInstance().convert(doc, out, pdfOptions);
            doc.close();
            out.close();
            System.out.println("Done");
            JOptionPane.showMessageDialog(null, "Arquivo convertido com sucesso");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
}
