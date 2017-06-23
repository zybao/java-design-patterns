package com.github.adapter.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class NioDemo {
    public void channel() {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            FileChannel fileChannel = raf.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(48);
            int bytesRead = fileChannel.read(buf);
            while (bytesRead != -1) {
                System.out.println("Read: " + bytesRead);
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get());
                }

                buf.clear();
                bytesRead = fileChannel.read(buf);
            }
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
