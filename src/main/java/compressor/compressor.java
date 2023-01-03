/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author user
 */

//main agenda is that we will give a file to our project
//and it will give us a zip file/compressed file
//I will get a file in my input i will take that file and i will read the content
//read the content and then write the content into compressed file i will also be taking ccare no 
//data islost and we arenot suffering from data loss while we are doing the operation
//closing th file is also necessary if we don't do it we might faced difficulty
public class compressor {
    public static void method(File file)throws IOException{
        
        String filedirectory =file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        
        FileOutputStream fos=new FileOutputStream(filedirectory+"/Compressedfile.gz");
        
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte[] buffer =new byte[1024];
        int len;
        
        while((len=fis.read(buffer)) != -1){
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
    }
     public static void main(String[] args) throws IOException{
        File path=new File("/Users/Downloads/Compressor/compressordecompressor/Testfile");
        method(path);
    }
}
//D:\java\Compressor-decompressor\src\test