package com.example.marcoaurelio.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClick(R.id.btn_popular_movies, R.string.popular_movies);
        setOnClick(R.id.btn_stock_hawk, R.string.stock_hawk);
        setOnClick(R.id.btn_build_it_bigger, R.string.build_it_bigger);
        setOnClick(R.id.btn_make_your_app_material, R.string.make_your_app_material);
        setOnClick(R.id.btn_go_ubiquitous, R.string.go_ubiquitous);
        setOnClick(R.id.btn_capstone, R.string.capstone);
    }

    private void setOnClick(final int buttonId, final int appTextId ){
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = String.format(getString(R.string.launch_msg), getString(appTextId));
                Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
