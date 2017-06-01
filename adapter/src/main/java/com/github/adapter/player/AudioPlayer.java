package com.github.adapter.player;

/**
 * Created by zhiyong.bao on 2017/6/1.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
//            throw new IllegalArgumentException("Unsupported media type");
            System.out.println("unsupported media type");
        }
    }
}
