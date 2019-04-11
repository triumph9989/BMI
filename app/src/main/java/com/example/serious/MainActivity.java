package com.example.serious;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ed1,ed2,ed3;
    private TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=15; //sp

    public void response(View v){

        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        txv = findViewById(R.id.textView);

        float height = Float.parseFloat(ed3.getText().toString());
        float weight = Float.parseFloat(ed2.getText().toString());
        float BMI1= calculateBMI(height,weight);
        String BMI2=String.valueOf(BMI1); //轉String

        txv.setTextSize(size);
        txv.setText(ed1.getText().toString() + " "+ getResources().getText(R.string.BMI)
                +",\n"+"your BMI is"+BMI2);
    }

    private float calculateBMI(float ht,float wt){
        float BMI=(float)(wt / Math.pow((ht / 100),2));
        return BMI;
    }
    private String standardBMI(double st){
        String alert=" ";

        if(st>25){
            alert=String.valueOf(getResources().getText(R.string.));
            getWindow().setBackgroundDrawableResource(R.drawable.fat_cat);
        }
        if(st<18.5){
            alert=String.valueOf(getResources().getText(R.string.));
            getWindow().setBackgroundDrawableResource(R.drawable.slim_cat);
        }
        else{
            alert=String.valueOf(getResources().getText(R.string.));
            getWindow().setBackgroundDrawableResource(R.drawable.cat);
        }
        return alert;
    }

}
