package kr.hs.emirim.s2019s05.mirimdialogtest3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton dog,cat,bunny,horse;
    RadioGroup animalGroup;
    Button btn_img;
    View imgView;
    TextView animal_name;
    ImageView animal_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        bunny = findViewById(R.id.bunny);
        horse = findViewById(R.id.horse);
        animalGroup = findViewById(R.id.radiogroup);
        btn_img = findViewById(R.id.btn_img);
        btn_img.setOnClickListener(btn_img_listener);
    }
    View.OnClickListener btn_img_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            imgView = View.inflate(MainActivity.this,R.layout.imglayout,null);
            animal_img = imgView.findViewById(R.id.animal_img);
            int selectedID =0;
            String seletedTitle="";
            switch (animalGroup.getCheckedRadioButtonId())
            {
                case R.id.dog:
                    selectedID = R.drawable.icon1;
                    seletedTitle = dog.getText().toString();
                    break;
                case R.id.cat:
                    selectedID = R.drawable.icon2;
                    seletedTitle = cat.getText().toString();
                    break;
                case R.id.bunny:
                    selectedID = R.drawable.icon3;
                    seletedTitle = bunny.getText().toString();
                    break;
                case R.id.horse:
                    selectedID = R.drawable.dog;
                    seletedTitle = horse.getText().toString();
                    break;
            }
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle(seletedTitle);
            animal_img.setImageResource(selectedID);
            dlg.setIcon(R.drawable.ic_launcher_foreground);
            dlg.setView(imgView);
            dlg.setPositiveButton("닫기",null);
            dlg.show();
        }
    };
}