/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.tela;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.io.FilenameUtils;
//import org.apache.poi.hwpf.HWPFDocument;
//import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author dev
 */
public class ConverteWordemPDF {
    
//    public static String readDocFile(String fileName) {
//        String output = "";
//        try {
//            File file = new File(fileName);
//            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
//            HWPFDocument doc = new HWPFDocument(fis);
//            WordExtractor we = new WordExtractor(doc);
//            String[] paragraphs = we.getParagraphText();
//            for (String para : paragraphs) {
//                output = output + "\n" + para.toString() + "\n";
//            }
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return output;
//    }
//    
//    public static String readDocxFile(String fileName) {
//        String output = "";
//        try {
//            File file = new File(fileName);
//            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
//            XWPFDocument document = new XWPFDocument(fis);
//            List<XWPFParagraph> paragraphs = document.getParagraphs();
//            for (XWPFParagraph para : paragraphs) {
//                output = output + "\n" + para.getText() + "\n";
//            }
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return output;
//    }
//    
//    public static void writePdfFile(String output, String caminho) throws FileNotFoundException, DocumentException {
//      
//        File file = new File(caminho+".pdf");
//        FileOutputStream fileout = new FileOutputStream(file);
//        Document document = new Document() {};
//        PdfWriter.getInstance((com.itextpdf.text.Document) document, fileout);
//        document.addAuthor("");
//        document.addTitle("");
//        document.open();
//        String[] splitter = output.split("\\n");
//        for (int i = 0; i < splitter.length; i++) {
//            Chunk chunk = new Chunk(splitter[i]);
//            Font font = new Font();
//            font.setStyle(Font.UNDERLINE);
//            font.setStyle(Font.NORMAL);
//            chunk.setFont(font);
//            document.add(chunk);
//            Paragraph paragraph = new Paragraph();
//            paragraph.add("");
//            document.add(paragraph);
//        }
//        document.close();
//
//    }
//    public void convert(String campo) throws FileNotFoundException, DocumentException{
//       
//        String ext = FilenameUtils.getExtension(campo);
//        
//        String output = "";
//        if ("docx".equalsIgnoreCase(ext)) {
//            output = readDocxFile(campo); //"D:\\Test.docx"
//        } else if ("doc".equalsIgnoreCase(ext)) {
//            output = readDocFile(campo); //"D:\\Test.doc"
//        } else {
//            System.out.println("INVALID FILE TYPE. ONLY .doc and .docx are permitted.");
//            JOptionPane.showMessageDialog(null, "TIPO DE ARQUIVO INVÁLIDO. SOMENTE .PDF e .docx são permitidos.");
//        }
//        writePdfFile(output, campo);
//        JOptionPane.showMessageDialog(null, "Arquivo convertido com sucesso");
//       
//    
//    }
//    
}
