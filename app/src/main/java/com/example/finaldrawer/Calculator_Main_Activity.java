package com.example.finaldrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator_Main_Activity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnClear,btnResult,btnAdd,btnMul,btnSub,btnDiv,btnDot;
    EditText ed1;
    boolean add,sub,mul,div;
    Double Res1,Res2,temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator__main_);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDivision);
        btnResult=(Button)findViewById(R.id.btnResult);
        btnClear=(Button)findViewById(R.id.btnClear);
        ed1=(EditText)findViewById(R.id.resultShow);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Res1=Double.parseDouble(ed1.getText() + "");
                    add=true;
                    ed1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Res1=Double.parseDouble(ed1.getText()+ "");
                    sub=true;
                    ed1.setText("");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Res1=Double.parseDouble(ed1.getText() + "");
                    mul=true;
                    ed1.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null)
                {
                    ed1.setText("");
                }
                else {
                    Res1=Double.parseDouble(ed1.getText()+ "");
                    div=true;
                    ed1.setText("");
                }
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res2=Double.parseDouble(ed1.getText()+ "");
                if (add==true)
                {
                    temp=Res1+Res2;
                    ed1.setText(Res1 + "+" + Res2 + "=" + temp);
                    add=false;
                }
                if (mul==true)
                {
                    ed1.setText(Res1 + "*" + Res2 + "=" + Res1*Res2);
                    mul=false;
                }
                if (sub==true)
                {
                    temp=Res1-Res2;
                    ed1.setText(Res1 + "-" + Res2 + "=" + temp);
                    sub=false;
                }
                if (div==true)
                {
                    if(Res2==0)
                    {
                        ed1.setText("Division by zero is not Possible");
                    }
                    else{
                        ed1.setText(Res1 + "/" + Res2 + "=" + Res1/Res2);
                        div=false;
                    }

                }

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
            }
        });
    }

}
