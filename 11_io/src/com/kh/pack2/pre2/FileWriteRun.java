package com.kh.pack2.pre2;

public class FileWriteRun {
    public static void main(String[] args) {
        FileWritePre fwp = new FileWritePre();
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "user.txt";
        fwp.createTxt(path, fileName);
        fwp.writeTxt(path, fileName);
        // writeTxt(path, fileName)
        // 이름 성함 연락처 작성하고
    }
}
