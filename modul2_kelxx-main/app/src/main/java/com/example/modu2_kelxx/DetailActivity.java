package com.example.modu2_kelxx;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;

import com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity {

    private TextView tvNama;
    private TextView tvEmail;
    private ImageView tvAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvEmail = findViewById(R.id.tv_email);
        tvAvatar = (ImageView) findViewById(R.id.tv_avatar);


        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText(nama);

            String email = getIntent().getStringExtra("email");
            tvEmail.setText(email);

            String avatar = getIntent().getStringExtra("avatar");
            Glide.with(this).load(avatar).into(tvAvatar);

        }


    }
    public void Lanjut(View view){
        Intent intent = new Intent(DetailActivity.this, activity_baru.class);
        startActivity(intent);
    }


}
