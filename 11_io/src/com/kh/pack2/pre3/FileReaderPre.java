package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    /*
    @param path = 파일경로
    @param fileName = 파일 네임
     */
    public void readTxt(String path, String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path + fileName));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String line = null;
    }
}
