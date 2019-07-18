package com.example.demo.practice.second;

;
import com.lowagie.text.*;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfEncodings;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/18 09:18
 * @Description: 获取本地图片导出pdf
 */
@Component
public class PicLoader {
    public void getFileList(String path, String pdfPath) throws IOException, DocumentException {
        File file = new File(path);
//        String srcPath = file.getAbsolutePath();//获得源路径
        String imagePath = null;
        File[] str = file.listFiles();//获取所有文件
        for (File file0 : str) {
            if (file0.isDirectory()) {
                String picPath = path + "\\" + file0.getName();
                File f = new File(picPath);
                File[] files = f.listFiles();
                String outPath = pdfPath + file0.getName() + ".pdf";

                FileOutputStream fos = new FileOutputStream(outPath);
                Document doc = new Document(PageSize.A4.rotate());
                doc.setMargins(0, 0, 0, 0);
                PdfWriter.getInstance(doc, fos);
                // 读取图片流
                BufferedImage img = null;
                // 实例化图片
                Image image = null;

                BaseFont base = BaseFont.createFont("C:/Windows/Fonts/SIMYOU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

                Font font = new Font(base);
//        font.setSize(10);
                Paragraph p = new Paragraph();
                p.setFont(font);

                p.setAlignment(Element.ALIGN_CENTER);

                for (File file1 : files) {
                    if (file1.getName().endsWith(".png")
                            || file1.getName().endsWith(".jpg")
                            || file1.getName().endsWith(".gif")
                            || file1.getName().endsWith(".jpeg")
                            || file1.getName().endsWith(".tif")) {
                        imagePath = picPath + "\\" + file1.getName();
                        String name = file1.getName().substring(0, file1.getName().indexOf("."));
//                System.out.println(name);
                        img = ImageIO.read(new File(imagePath));
                        // 根据图片大小设置文档大小
//                System.out.println(img.getWidth());
//                System.out.println(img.getHeight());
                        doc.setPageSize(new Rectangle(img.getWidth(), img
                                .getHeight() + 45));
                        // 实例化图片
                        image = Image.getInstance(imagePath);
                        // 添加图片到文档
                        doc.open();
                        p.add(name);
                        doc.add(image);
                        doc.add(p);
                        p.clear();
                    }
                }
                doc.close();

            }
        }

    }
}
