/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.tela;

import com.itextpdf.text.BadElementException;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author dev
 */
public class JpegToPDF {
    
    public void conversorJPEG(String caminho) throws FileNotFoundException, DocumentException, BadElementException, IOException{
         Document convertJpgToPdf = new Document();
            PdfWriter.getInstance(convertJpgToPdf, new FileOutputStream(caminho+".pdf"));
            convertJpgToPdf.open();
            Image convertJpg = Image.getInstance(caminho);
            convertJpgToPdf.add(convertJpg);
            convertJpgToPdf.close();
            System.out.println("Successfully Converted JPG to PDF in iText");
    }
    
}
