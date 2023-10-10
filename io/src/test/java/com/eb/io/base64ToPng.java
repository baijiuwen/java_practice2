package com.eb.io;


import java.io.*;
import java.net.URLDecoder;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import java.awt.image.BufferedImage;

import com.eb.io.base64.Base64;

/**
 * @author:
 * @date: 2023/9/12
 */
public class base64ToPng {
    public static String convertToPng(String base64Data) throws IOException {
//        byte[] imageData = Base64.getDecoder().decode(base64Data);
//        BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageData));
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(img, "png", baos);
//        byte[] pngData = baos.toByteArray();
//        return Base64.getEncoder().encodeToString(pngData);
        return null;
    }

    public static void main(String[] args) {
            try {
                int read = 0;
                FileInputStream fileInputStream = null;
                StringBuffer base64Image = new StringBuffer();
                try {
                    fileInputStream = new FileInputStream(new File("d:\\file\\base64.txt"));
                    while((read=fileInputStream.read()) != -1){
//                        System.out.print((char)read);
                        base64Image.append((char)read);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//                System.out.println(base64Image.toString().replace("\r\n", ""));
//                byte[] imageBytes = Base64.getDecoder().decode(URLDecoder.decode(base64Image.toString().replaceAll(" +","+")));
//                byte[] imageBytes = Base64.getDecoder().decode(base64Image.toString());

                byte[] imageBytes = Base64.decode(base64Image.toString().replaceAll("%0A",""));
//                System.out.println(imageBytes);
//                byte[] imageBytes = DatatypeConverter.parseBase64Binary(base64Image.toString());
//                BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
//                OutputStream out = new FileOutputStream("D:\\tmp.png");
//                ImageIO.write(image, "png", out);

/*
                //构建字节数组输入流
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                //通过ImageIO把字节数组输入流转为BufferedImage
                BufferedImage bufferedImage = ImageIO.read(bais);
                //构建文件
                File imageFile = new File("D:\\tmpImageIo.png");
                //写入生成文件
                ImageIO.write(bufferedImage, "png", imageFile);
*/

                File file = new File("D:\\tmp.png");
                OutputStream out = new FileOutputStream("D:\\tmp.png");
                FileOutputStream fos = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                bos.write(imageBytes);
                bos.flush();
                out.close();
                bos.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
