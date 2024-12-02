package com.kh.pack2.pre4;

import java.io.*;

public class HappyLunchRead {

    public void readTxt(String path, String fileName) {
        try {
            FileReader fr = new FileReader(path + fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found." + e.getMessage());
        } catch (IOException e) {
            System.out.println("다른 문제들 발생." + e.getMessage());
        }
    }
}
