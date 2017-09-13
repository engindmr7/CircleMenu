package com.example.engindemir.circlemenu;

import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String ArrayName[]={"Facebook",
                         "Twitter",
                          "YouTube","İnstagram","Skype"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu =(CircleMenu)findViewById(R.id.circlemenu);

         circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.cancel)
                               .addSubMenu(Color.parseColor("#26C6DA"),R.drawable.facebook)
                                .addSubMenu(Color.parseColor("#5C6BC0"),R.drawable.twitter)
                                .addSubMenu(Color.parseColor("#E0E0E0"),R.drawable.youtube)
                                .addSubMenu(Color.parseColor("#BCAAA4"),R.drawable.instagram)
                                .addSubMenu(Color.parseColor("#FFCA28"),R.drawable.skype)

                                 .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                                     @Override
                                     public void onMenuSelected(int i) {

                                         Toast.makeText(MainActivity.this,"Seçiminiz :"+ArrayName[i],Toast.LENGTH_LONG).show();

                                     }
                                 }) ;




    }
}
