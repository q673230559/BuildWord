package tech.rundeep;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/3.
 * reference: http://blog.csdn.net/tuzongxun/article/details/51992704
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        readAndWriterTest4();
    }

    public static void readAndWriterTest4() throws IOException {
        File file = new File("D:\\02 项目需求规格文档模板.docx");
        String str = "";
        try {
            FileInputStream fis = new FileInputStream(file);
            XWPFDocument xdoc = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
            String doc1 = extractor.getText();
            System.out.println(doc1);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
