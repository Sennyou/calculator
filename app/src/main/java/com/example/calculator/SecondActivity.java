package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    int whichinputbutton=0;
    int whichoutputbutton=0;
    private EditText editText_1;
    private EditText editText_2;
    private EditText editText_3;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int or;
        or=getResources().getConfiguration().orientation;
        if(or==2){
            Intent intent=new Intent(SecondActivity.this,bigActivity.class);
            startActivity(intent);
        }
        Button cos=(Button)findViewById(R.id.button_cos);
        Button sin=(Button)findViewById(R.id.button_sin);
        Button tan=(Button)findViewById(R.id.button_tan);
        Button kaiguan=(Button)findViewById(R.id.button_kaiguan);
        Button inputtwo=(Button)findViewById(R.id.button_inputtwo);
        Button inputeight=(Button)findViewById(R.id.button_inputeight);
        Button inputten=(Button)findViewById(R.id.button_inputten);
        Button inputsixteen=(Button)findViewById(R.id.button_inputsixteen);
        Button two=(Button)findViewById(R.id.button_two);
        Button eight=(Button)findViewById(R.id.button_eight);
        Button ten=(Button)findViewById(R.id.button_ten);
        Button sixteen=(Button)findViewById(R.id.button_sixteen);
        Button jisuan=(Button)findViewById(R.id.button_kai);
        cos.setOnClickListener(this);
        sin.setOnClickListener(this);
        tan.setOnClickListener(this);
        kaiguan.setOnClickListener(this);
        inputtwo.setOnClickListener(this);
        inputeight.setOnClickListener(this);
        inputten.setOnClickListener(this);
        inputsixteen.setOnClickListener(this);
        two.setOnClickListener(this);
        eight.setOnClickListener(this);
        ten.setOnClickListener(this);
        sixteen.setOnClickListener(this);
        jisuan.setOnClickListener(this);

        textView=(TextView)findViewById(R.id.output);
        editText_1=(EditText)findViewById(R.id.input);
        editText_2=(EditText)findViewById(R.id.danwei);
        editText_3=(EditText)findViewById(R.id.danweioutput);



    }

    public void onClick(View v){
        int id=v.getId();
        Button button=(Button) v.findViewById(id);
        String text=button.getText().toString();
        switch(text){
            case "Cos":
                if(whichinputbutton==1){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色#9C9696
                }
                else {
                    whichinputbutton = 1;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "Sin":
                if(whichinputbutton==2){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichinputbutton = 2;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "tan":
                if(whichinputbutton==3){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichinputbutton = 3;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "单位":
            case "无单位":
                if(whichinputbutton==4){
                    whichinputbutton=0;
                    button.setText("无单位");
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichinputbutton = 4;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                    button.setText("单位");
                }
                break;
            case "2进制输入":
                if(whichinputbutton==5){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else{
                    whichinputbutton=5;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "8进制输入":
                if(whichinputbutton==6){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichinputbutton = 6;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "10进制输入":
                if(whichinputbutton==7){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichinputbutton = 7;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "16进制输入":
                if(whichinputbutton==8){
                    whichinputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else{
                    whichinputbutton=8;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "2":
                if(whichoutputbutton==1){
                    whichoutputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else{
                    whichoutputbutton=1;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "8":
                if(whichoutputbutton==2){
                    whichoutputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else{
                    whichoutputbutton=2;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "10":
                if(whichoutputbutton==3){
                    whichoutputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else{
                    whichoutputbutton=3;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "16":
                if(whichoutputbutton==4){
                    whichoutputbutton=0;
                    button.setBackgroundColor(Color.parseColor("#00000000"));
                    //去色
                }
                else {
                    whichoutputbutton = 4;
                    button.setBackgroundColor(Color.parseColor("#FF9C9696"));
                    editText_2.setText("");
                    editText_3.setText("");
                }
                break;
            case "计算":
                Log.i("tiaoshi","whichinputbutton="+whichinputbutton);
                Log.i("tiaoshi","whichoutputbutton"+whichoutputbutton);
                if(whichinputbutton>0){
                    if(whichinputbutton<=3){    //三角函数
                        switch (whichinputbutton){
                            case 1:{
                                Double a=Math.cos(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b=a.toString();
                                textView.setText(b);
                                break;
                            }
                            case 2: {
                                Double a = Math.sin(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b = a.toString();
                                textView.setText(b);
                                break;
                            }
                            case 3:{
                                Double a=Math.tan(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b=a.toString();
                                textView.setText(b);
                                break;
                            }
                        }
                    }
                    else if (whichinputbutton>4){
                        if(whichoutputbutton>0){
                            switch (whichinputbutton){
                                case 5:
                                    if(whichoutputbutton==1){
                                        textView.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==2){
                                        //2bian8
                                        textView.setText(Integer.toOctalString(Integer.valueOf( editText_1.getText().toString(),2)));
                                    }
                                    else if(whichoutputbutton==3){
                                        //2bian10
                                        textView.setText(Integer.valueOf( editText_1.getText().toString(),2).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //2bian16
                                        textView.setText(Integer.toHexString(Integer.valueOf( editText_1.getText().toString(),2)));
                                    }
                                    break;
                                case 6:
                                    if(whichoutputbutton==1){
                                        //8bian2
                                        textView.setText(Integer.toBinaryString(Integer.valueOf( editText_1.getText().toString(),8)));
                                    }
                                    else if(whichoutputbutton==2){
                                        textView.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==3){
                                        //8bian10
                                        textView.setText(Integer.valueOf( editText_1.getText().toString(),8).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //8bian16
                                        textView.setText(Integer.toHexString(Integer.valueOf( editText_1.getText().toString(),8)));
                                    }
                                    break;
                                case 7:
                                    if(whichoutputbutton==1){
                                        //10bian2
                                        textView.setText(Integer.toBinaryString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    else if(whichoutputbutton==2){
                                        //10bian8
                                        textView.setText(Integer.toOctalString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    else if(whichoutputbutton==3){
                                        textView.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //10bian16
                                        textView.setText(Integer.toHexString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    break;
                                case 8:
                                    if(whichoutputbutton==1){
                                        //16bian2
                                        textView.setText(Integer.toBinaryString(Integer.valueOf( editText_1.getText().toString(),16)));
                                    }
                                    else if(whichoutputbutton==2){
                                        //16bian8
                                        textView.setText(Integer.toOctalString(Integer.valueOf( editText_1.getText().toString(),16)));
                                    }
                                    else if(whichoutputbutton==3){
                                        //16bian10
                                        textView.setText(Integer.valueOf( editText_1.getText().toString(),16).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        textView.setText(editText_1.getText().toString());
                                    }
                                    break;

                            }
                        }
                        else
                            Toast.makeText(SecondActivity.this,"你要转换成几进制？",Toast.LENGTH_SHORT);
                    }//进制转换
                    else if(whichinputbutton==4){
                        if(editText_2.getText().toString().equals("m")||editText_2.getText().toString().equals("M")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*100)).toString());
                                    break;
                                }
                                case "km":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.1)).toString());
                                    break;
                                }
                                case "m":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("cm")||editText_2.getText().toString().equals("CM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "km":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                                case "m":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.01)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("mm")||editText_2.getText().toString().equals("MM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "cm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.1)).toString());
                                    break;
                                }
                                case "km":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.0001)).toString());
                                    break;
                                }
                                case "m":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("km")||editText_2.getText().toString().equals("KM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10000)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000)).toString());
                                    break;
                                }
                                case "km":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString()))).toString());
                                    break;
                                }
                                case "m":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("m3")||editText_2.getText().toString().equals("M3")){
                            switch (editText_3.getText().toString()){
                                case "mm3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000000000)).toString());
                                    break;
                                }
                                case "cm3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000000)).toString());
                                    break;
                                }
                                case "km3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                                case "m3":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("cm3")||editText_2.getText().toString().equals("CM3")){
                            switch (editText_3.getText().toString()){
                                case "mm3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000)).toString());
                                    break;
                                }
                                case "cm3":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "km3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.0000001)).toString());
                                    break;
                                }
                                case "m3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.000001)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("mm3")||editText_2.getText().toString().equals("MM3")){
                            switch (editText_3.getText().toString()){
                                case "mm3":{
                                    textView.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "cm3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                                case "km3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.000000000001)).toString());
                                    break;
                                }
                                case "m3":{
                                    textView.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.000000001)).toString());
                                    break;
                                }
                            }
                        }
                        else
                            Toast.makeText(SecondActivity.this,"输入单位错误",Toast.LENGTH_SHORT).show();
                    }//单位转换
                }
                else
                    Toast.makeText(SecondActivity.this,"？？？",Toast.LENGTH_SHORT).show();

                break;

        }



    }

}
