package com.example.modul2_kel13;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel13.R;

public class DetailActivity extends AppCompatActivity {

    TextView tvNama, tvLastname, tvEmail;
    ImageView imgPhotoUser, Foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvLastname = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);
        Foto = findViewById(R.id.img_Photo_User);


        setData();

        if (getIntent().hasExtra("name") && (getIntent().hasExtra("imgPhotoUser"))) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText(nama);
            String lastname = getIntent().getStringExtra("tvLastName");
            tvLastname.setText(lastname);
            String Email = getIntent().getStringExtra("tvEmail");
            tvEmail.setText(Email);
            String imgPhotoUser = getIntent().getStringExtra("imgPhotoUser");
            Glide.with(this)
                    .asBitmap()
                    .load(imgPhotoUser)
                    .into(Foto);




        }
    }

    private void setData() {
    }
}

