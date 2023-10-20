package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    int a =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding;

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);




        binding.button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

   mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.ssssss);

   mediaPlayer.start();





    }
});



      binding.button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        mediaPlayer=new MediaPlayer();

        try {
            mediaPlayer.setDataSource("https://file-examples.com/storage/fe1207564e65327fe9c8723/2017/11/file_example_MP3_700KB.mp3");


          mediaPlayer.prepare();
            mediaPlayer.start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
});






    }






}