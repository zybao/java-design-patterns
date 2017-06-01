package com.github.adapter.player;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file, name: " + fileName);
    }
}
