package kr.hs.emirim.s2019s05.mirimdialogtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton dog,cat,bunny,horse;
    RadioGroup animalGroup;
    Button btn_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        bunny = findViewById(R.id.bunny);
        horse = findViewById(R.id.horse);
    }
}