package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Java_Exceptions {
    public static void main(String[] args) {
        example2();
    }

    public static void example1() {
        try {
            String s = processFile("C:\\test.txt");
            // ok:
        } catch (FileNotFoundException e) {
            // file not found:
        } catch (SecurityException e) {
            // no read permission:
        } catch (IOException e) {
            // io error:
        } catch (Exception e) {
            // other error:
        }

    }

    private static String processFile(String s) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(s))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
        }
        return contentBuilder.toString().trim();
    }

    public static void example2()  {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    //    static byte[] toGBK(String s) {
//        try {
//            // 用指定编码转换String为byte[]:
//            return s.getBytes("GBK");
//        } catch (UnsupportedEncodingException e) {
//            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
//            System.out.println(e); // 打印异常信息
//            return s.getBytes(); // 尝试使用默认编码
//        }
//    }
//    static byte[] toGBK(String s) throws UnsupportedEncodingException {
//        return s.getBytes("GBK");
//    }
    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 先记下来再说:
            e.printStackTrace();
        }
        return null;
    }

}
