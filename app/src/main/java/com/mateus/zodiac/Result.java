package com.mateus.zodiac;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle args = getIntent().getBundleExtra("sign");
        if (args != null) {
            Sign sign = (Sign) args.getSerializable("result");
            int imageResource = getResources().getIdentifier(sign.getImage(), null, getPackageName());
            Drawable res = getDrawable(imageResource);
            ImageView image_sign = findViewById(R.id.image_sign);
            image_sign.setImageDrawable(res);
            TextView text_sign = findViewById(R.id.text_sign);
            TextView text_date = findViewById(R.id.text_date);
            text_sign.setText(sign.getDescription());
            text_date.setText(String.valueOf("from " + sign.getFirstMonth() + "/" + sign.getFirstDay() +
                    " to " + sign.getLastMonth() + "/" + sign.getLastDay()));
        }
        Button go_back = findViewById(R.id.btn_go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
