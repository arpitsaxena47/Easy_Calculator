package com.arpit.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtCalculations;
    private TextView txtOperands;

    private ImageButton img0;
    private ImageButton img1;
    private ImageButton img2;
    private ImageButton img3;
    private ImageButton img4;
    private ImageButton img5;
    private ImageButton img6;
    private ImageButton img7;
    private ImageButton img8;
    private ImageButton img9;
    private ImageButton btnBack;

    private ImageView imgDivide;
    private ImageView imgMultiply;
    private ImageView imgMinus;
    private ImageView imgPlus;

    private Button btnClear;

    private String number="";
    private char character;
    private String numAndOperator = "";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCalculations = findViewById(R.id.txtCalculations);
        txtOperands = findViewById(R.id.txtOperands);

        img0 = findViewById(R.id.img0);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        btnBack = findViewById(R.id.btnBack);

        btnClear = findViewById(R.id.btnClear);

        imgDivide = findViewById(R.id.imgdivide);
        imgMultiply = findViewById(R.id.imgMultiply);
        imgMinus = findViewById(R.id.imgMinus);
        imgPlus = findViewById(R.id.imgPlus);

        img0.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

        imgPlus.setOnClickListener(this);
        imgDivide.setOnClickListener(this);
        imgMinus.setOnClickListener(this);
        imgMultiply.setOnClickListener(this);

        btnClear.setOnClickListener(this);
        btnBack.setOnClickListener(this);

        txtOperands.setText("0");
        txtCalculations.setText("0");







    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.img0:
                character= '0';
                putNumber();

                break;

            case R.id.img1:
                character= '1';
                putNumber();


                break;

            case R.id.img2:
                character= '2';
                putNumber();


                break;

            case R.id.img3:
                character= '3';
                putNumber();


                break;

            case R.id.img4:
                character= '4';
                putNumber();


                break;

            case R.id.img5:
                character= '5';
                putNumber();


                break;

            case R.id.img6:
                character= '6';
                putNumber();


                break;

            case R.id.img7:
                character= '7';
                putNumber();


                break;

            case R.id.img8:
                character= '8';
                putNumber();


                break;

            case R.id.img9:
                character= '9';
                putNumber();


                break;

            case R.id.imgdivide:

                break;

            case R.id.imgMinus:

                break;

            case R.id.imgPlus:

                break;

            case R.id.imgMultiply:

                break;

            case R.id.btnBack:
                if(number.length()>0)
                {
                    back();
                }

                break;

            case R.id.btnClear:
                clear();

                break;
        }


    }

    private void putNumber()
    {
//        txtOperands.setText("");
        if(number.length()<17)
        {
            number +=character;
            txtOperands.setText(number);
        }
    }

    private void clear()
    {
        number = "";
        numAndOperator = "";
        txtOperands.setText("0");
        txtCalculations.setText("0");

    }

    private void back()
    {

        if(number.length() <= 1)
        {
            number = "";
            txtOperands.setText("0");
        }
        else
        {
            number = number.substring(0,number.length()-1);
            txtOperands.setText(number);
        }
    }
    private void putNumAndOperator()
    {
        numAndOperator+=character;
        txtCalculations.setText(numAndOperator);

    }
}