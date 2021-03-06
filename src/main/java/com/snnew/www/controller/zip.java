import java.io 

.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipOutputStreamDemo {
public static void main(String args[]) throws IOException {
//定义要压缩的文件 也就是说在D盘里有个 demo.txt 的文件(必须要有,否者会有异常,实际应用中可判断);
File file = new File("d:" + File.separator + "demo.txt");
//定义压缩文件的名称
File zipFile = new File("d:" + File.separator + "demo.zip");
//定义输入文件流
InputStream input = new FileInputStream(file);
//定义压缩输出流
ZipOutputStream zipOut = null;
//实例化压缩输出流,并制定压缩文件的输出路径 就是D盘下,名字叫 demo.zip
zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
zipOut.putNextEntry(new ZipEntry(file.getName()));
//设置注释
zipOut.setComment("www.demo.com 

");
