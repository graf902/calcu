package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainActivity extends AppCompatActivity {
    TextView ans;
    EditText exp;
    Button num;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button plus;
    Button minus;
    Button mul;
    Button div;
    Button cln;
    Button eql;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans = findViewById(R.id.ans);
        exp = findViewById(R.id.etNumber);
        num = findViewById(R.id.button);
        num2 = findViewById(R.id.button2);
        num3 = findViewById(R.id.button3);
        num4 = findViewById(R.id.button4);
        num5 = findViewById(R.id.button5);
        num6 = findViewById(R.id.button6);
        num7 = findViewById(R.id.button7);
        num8 = findViewById(R.id.button8);
        num9 = findViewById(R.id.button9);
        num0 = findViewById(R.id.button0);
        plus = findViewById(R.id.button12);
        mul = findViewById(R.id.button14);
        minus = findViewById(R.id.button13);
        div = findViewById(R.id.button15);
        cln = findViewById(R.id.button16);
        eql = findViewById(R.id.button11);


        num.setOnClickListener(numberClickListener);
        num2.setOnClickListener(numberClickListener);
        num3.setOnClickListener(numberClickListener);
        num4.setOnClickListener(numberClickListener);
        num5.setOnClickListener(numberClickListener);
        num6.setOnClickListener(numberClickListener);
        num7.setOnClickListener(numberClickListener);
        num8.setOnClickListener(numberClickListener);
        num9.setOnClickListener(numberClickListener);
        num0.setOnClickListener(numberClickListener);
        plus.setOnClickListener(numberClickListener);
        mul.setOnClickListener(numberClickListener);
        minus.setOnClickListener(numberClickListener);
        div.setOnClickListener(numberClickListener);
        cln.setOnClickListener(numberClickListener);
        eql.setOnClickListener(numberClickListener);

    }

    View.OnClickListener numberClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.button:
                    String str = num.getText().toString();
                    exp.append(str);
                    break;

                case R.id.button2:
                    String str2 = num2.getText().toString();
                    exp.append(str2);
                    break;

                case R.id.button3:
                    String str3 = num3.getText().toString();
                    exp.append(str3);
                    break;

                case R.id.button4:
                    String str4 = num4.getText().toString();
                    exp.append(str4);
                    break;

                case R.id.button5:
                    String str5 = num5.getText().toString();
                    exp.append(str5);
                    break;

                case R.id.button6:
                    String str6 = num6.getText().toString();
                    exp.append(str6);
                    break;

                case R.id.button7:
                    String str7 = num7.getText().toString();
                    exp.append(str7);
                    break;

                case R.id.button8:
                    String str8 = num8.getText().toString();
                    exp.append(str8);
                    break;

                case R.id.button9:
                    String str9 = num9.getText().toString();
                    exp.append(str9);
                    break;

                case R.id.button0:
                    String str0 = num0.getText().toString();
                    exp.append(str0);
                    break;

                case R.id.button12:
                    String str12 = plus.getText().toString();
                    exp.append(str12);
                    break;

                case R.id.button14:
                    String str14 = mul.getText().toString();
                    exp.append(str14);
                    break;

                case R.id.button13:
                    String str13 = minus.getText().toString();
                    exp.append(str13);
                    break;

                case R.id.button15:
                    String str15 = div.getText().toString();
                    exp.append(str15);
                    break;

                case R.id.button16:
                   exp.setText("");
                    break;

                case R.id.button11:

                    Parser myParser = new Parser();

                            try {
                                String str17 = exp.getText().toString();
                                if(str17.equals(""))
                                    break;
                                double result = myParser.evaluate(str17);

                                DecimalFormatSymbols s = new DecimalFormatSymbols();
                                s.setDecimalSeparator('.');
                                DecimalFormat f = new DecimalFormat("#,###.00", s);

                                ans.setText(f.format(result));

                            } catch (Exception e) {
                                exp.setText(e.getMessage());
                            }
                            break;
            }
        }
    };

}