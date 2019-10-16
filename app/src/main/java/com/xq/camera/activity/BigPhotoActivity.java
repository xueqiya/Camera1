package com.xq.camera.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.xq.camera.R;

public class BigPhotoActivity extends AppCompatActivity {
    private ImageView iv_photo;
    private String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigphoto);
        iv_photo = findViewById(R.id.iv_photo);
        path = getIntent().getStringExtra("imagePhoto");
        Glide.with(this).load(path).apply(RequestOptions.noTransformation()
                .override(iv_photo.getWidth(),iv_photo.getHeight())
                .error(R.drawable.default_person_icon))
                .into(iv_photo);
    }
}
