package com.example.kalkulator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String str ="";
    Character operator = 'q';
    float i,num,numtemp;
    EditText showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText)findViewById(R.id.result_id);

    }
    public void Button1(View v){
        angka(1);

    }

    public void Button2(View v){
        angka(2);

    }
    public void Button3(View v){
        angka(3);

    }
    public void Button4(View v){
        angka(4);

    }
    public void Button5(View v){
        angka(5);

    }
    public void Button6(View v){
        angka(6);
    }
    public void Button7(View v){
        angka(7);

    }
    public void Button8(View v){
        angka(8);

    }
    public void Button9(View v){
        angka(9);

    }


    public void ButtonTambah(View v){
        perform();
        operator = '+';

    }

    public void ButtonKurang(View v){
        perform();
        operator = '-';

    }
    public void ButtonBagi(View v){
        perform();
        operator = '/';

    }
    public void ButtonKali(View v){
        perform();
        operator = '*';

    }
    public void ButtonHasil(View v){
        calculate();

    }

    public void ButtonHapus(View v){
        reset();
    }
    private void reset() {
        str ="";
        operator ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void angka(int j) {
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);


    }
    private void perform() {
        str = "";
        calculateNoShow();
        numtemp = num;
    }
    private void calculate() {
        if(operator == '+')
            num = numtemp+num;
        else if(operator == '-')
            num = numtemp-num;
        else if(operator == '/')
            num = numtemp/num;
        else if(operator == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        if(operator == '+')
            num = numtemp+num;
        else if(operator == '-')
            num = numtemp-num;
        else if(operator == '/')
            num = numtemp/num;
        else if(operator == '*')
            num = numtemp*num;

    }
}
