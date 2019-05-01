package com.example.testbeanpostprocessor.wrapper;

import javax.servlet.ServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/28 14:34
 * @Version 1.0
 */
public class HttpHelper {
    public static String getToString(ServletRequest request) throws IOException {
        BufferedReader bufferedReader = null;
        StringBuilder sbp = new StringBuilder();
        try {
            InputStream inputStream = request.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);

            while (true){
                String read = bufferedReader.readLine();
                if(read==null){
                    break;
                }
                sbp.append(read);
            }
        } finally {
            if(bufferedReader!=null){
                bufferedReader.close();
            }
        }
        return sbp.toString();

    }
}
