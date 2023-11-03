package com.example.a4_photo_1_word;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.a4_photo_1_word.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initImage();

        binding.btnGame.setOnClickListener(view -> {
            initNav();
        });
    }

    private void initNav() {
        Intent intent = new Intent(this, GameOneActivity.class);
        startActivity(intent);
        finish();
    }

    private void initImage() {
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").into(binding.imageOne);
        Glide.with(this).load("https://rangerrick.org/wp-content/uploads/2016/08/RR-Red-Panda-Aug-2016-Katherine-Feng.jpg").into(binding.imageTwo);
        Glide.with(this).load("https://images.pexels.com/photos/208087/pexels-photo-208087.jpeg?cs=srgb&dl=pexels-pixabay-208087.jpg&fm=jpg").into(binding.imageThree);
        Glide.with(this).load("https://t3.ftcdn.net/jpg/02/22/85/16/360_F_222851624_jfoMGbJxwRi5AWGdPgXKSABMnzCQo9RN.jpg").into(binding.imageFour);
    }
}