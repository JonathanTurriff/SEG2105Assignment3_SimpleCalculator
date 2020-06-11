package com.example.simple_calculator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonDiv, buttonMul, button10, buttonC, buttonEqual;
    TextView edttxt;
    float val_one, val_two;
    boolean add, sub, div, mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting all buttons
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonMul = (Button) findViewById(R.id.btnMul);
        button10 = (Button) findViewById(R.id.btnDot);
        buttonC = (Button) findViewById(R.id.btnC);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        //Setting text field
        edttxt = (TextView) findViewById(R.id.Screen);
        //Setting actions
        button1.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"1");
        });
        button2.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"2");
        });
        button3.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"3");
        });
        button4.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"4");
        });
        button5.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"5");
        });
        button6.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"6");
        });
        button7.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"7");
        });
        button8.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"8");
        });
        button9.setOnClickListener((v) ->{
            edttxt.setText(edttxt.getText() +"9");
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //ran into issues with pressing button without pressing button
                if(edttxt.getText() == null){
                    edttxt.setText("");
                }
                val_one = Float.parseFloat(edttxt.getText().toString());
                add = true;
                edttxt.setText(null);
            }

        });
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText() == null){
                    edttxt.setText("");
                }
                val_one = Float.parseFloat(edttxt.getText().toString());
                sub = true;
                edttxt.setText(null);
            }

        });
        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText() == null){
                    edttxt.setText("");
                }
                val_one = Float.parseFloat(edttxt.getText().toString());
                mul= true;
                edttxt.setText(null);
            }

        });
        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText() == null){
                    edttxt.setText("");
                }
                val_one = Float.parseFloat(edttxt.getText().toString());
                div = true;
                edttxt.setText(null);
            }

        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttxt.setText("");
            }

        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                val_two = Float.parseFloat(edttxt.getText().toString());
                float result;
                if(add){
                    result = val_one +val_two;
                    edttxt.setText(result +"");
                    add = false;
                }

                if(sub){
                    result = val_one -val_two;
                    edttxt.setText(result +"");
                    sub = false;
                }

                if(mul){
                    result = val_one *val_two;
                    edttxt.setText(result +"");
                    mul = false;
                }

                if(div){
                    result = val_one /val_two;
                    edttxt.setText(result +"");
                    div = false;
                }
            }

        });

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String dot1 = ".";
                char dot = dot1.charAt(0);
                for(int i = 0; i < edttxt.getText().length(); i++){
                    if(edttxt.getText().charAt(i) == dot){
                        return;
                    }
                }
                edttxt.setText(edttxt.getText() +".");
            }

        });



    }
}