package TryCatch;

import java.util.*;
import java.io.*;
import java.net.*;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Starting at " + new Date());
        String url = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("someVideo.mp4")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finishing at " + new Date());
        }
    }
}
