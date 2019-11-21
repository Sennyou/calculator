package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class bigActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    bigActivity.calulator ca = new bigActivity.calulator();
    boolean temp = false,iffu=false;
    String tem;
    int r = 0;

    int whichinputbutton=0;
    int whichoutputbutton=0;
    private EditText editText_1;
    private EditText editText_2;
    private EditText editText_3;
    private TextView textView_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big);
        int or;
        or=getResources().getConfiguration().orientation;
        if(or==1){
            Intent intent=new Intent(bigActivity.this,MainActivity.class);
            startActivity(intent);
        }
        textView = (TextView) findViewById(R.id.Text1);
        Button AC = (Button) findViewById(R.id.button_ac);
        Button zhengfu = (Button) findViewById(R.id.button_zhengfu);
        Button baifen = (Button) findViewById(R.id.button_bai);
        Button chu = (Button) findViewById(R.id.button_chu);
        Button cheng = (Button) findViewById(R.id.button_cheng);
        Button add = (Button) findViewById(R.id.button_add);
        Button jian = (Button) findViewById(R.id.button_jian);
        Button eq = (Button) findViewById(R.id.button_eq);
        AC.setOnClickListener(this);
        zhengfu.setOnClickListener(this);
        baifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.calculator.SecondActivity");
                startActivity(intent);
            }
        });
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        add.setOnClickListener(this);
        jian.setOnClickListener(this);
        eq.setOnClickListener(this);


        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_0 = (Button) findViewById(R.id.button_0);
        Button dian = (Button) findViewById(R.id.button_dian);
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        dian.setOnClickListener(this);

    }
    public void onClick(View v) {
        int id = v.getId();
        Button button = (Button) v.findViewById(id);
        String ch = button.getText().toString();
        String text=ch;
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
                return;
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
                return;
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
                return;
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
                return;
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
                return;
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
                return;
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
                return;
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
                return;
            case "2进制输出":
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
                return;
            case "8进制输出":
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
                return;
            case "10进制输出":
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
                return;
            case "16进制输出":
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
                return;
            case "计算":
                Log.i("tiaoshi","whichinputbutton="+whichinputbutton);
                Log.i("tiaoshi","whichoutputbutton"+whichoutputbutton);
                if(whichinputbutton>0){
                    if(whichinputbutton<=3){    //三角函数
                        switch (whichinputbutton){
                            case 1:{
                                Double a=Math.cos(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b=a.toString();
                                textView_2.setText(b);
                                break;
                            }
                            case 2: {
                                Double a = Math.sin(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b = a.toString();
                                textView_2.setText(b);
                                break;
                            }
                            case 3:{
                                Double a=Math.tan(Double.valueOf(editText_1.getText().toString())*Math.PI/180);
                                String b=a.toString();
                                textView_2.setText(b);
                                break;
                            }
                        }
                    }
                    else if (whichinputbutton>4){
                        if(whichoutputbutton>0){
                            switch (whichinputbutton){
                                case 5:
                                    if(whichoutputbutton==1){
                                        textView_2.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==2){
                                        //2bian8
                                        textView_2.setText(Integer.toOctalString(Integer.valueOf( editText_1.getText().toString(),2)));
                                    }
                                    else if(whichoutputbutton==3){
                                        //2bian10
                                        textView_2.setText(Integer.valueOf( editText_1.getText().toString(),2).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //2bian16
                                        textView_2.setText(Integer.toHexString(Integer.valueOf( editText_1.getText().toString(),2)));
                                    }
                                    break;
                                case 6:
                                    if(whichoutputbutton==1){
                                        //8bian2
                                        textView_2.setText(Integer.toBinaryString(Integer.valueOf( editText_1.getText().toString(),8)));
                                    }
                                    else if(whichoutputbutton==2){
                                        textView_2.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==3){
                                        //8bian10
                                        textView_2.setText(Integer.valueOf( editText_1.getText().toString(),8).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //8bian16
                                        textView_2.setText(Integer.toHexString(Integer.valueOf( editText_1.getText().toString(),8)));
                                    }
                                    break;
                                case 7:
                                    if(whichoutputbutton==1){
                                        //10bian2
                                        textView_2.setText(Integer.toBinaryString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    else if(whichoutputbutton==2){
                                        //10bian8
                                        textView_2.setText(Integer.toOctalString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    else if(whichoutputbutton==3){
                                        textView_2.setText(editText_1.getText().toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        //10bian16
                                        textView_2.setText(Integer.toHexString(Integer.parseInt(editText_1.getText().toString())));
                                    }
                                    break;
                                case 8:
                                    if(whichoutputbutton==1){
                                        //16bian2
                                        textView_2.setText(Integer.toBinaryString(Integer.valueOf( editText_1.getText().toString(),16)));
                                    }
                                    else if(whichoutputbutton==2){
                                        //16bian8
                                        textView_2.setText(Integer.toOctalString(Integer.valueOf( editText_1.getText().toString(),16)));
                                    }
                                    else if(whichoutputbutton==3){
                                        //16bian10
                                        textView_2.setText(Integer.valueOf( editText_1.getText().toString(),8).toString());
                                    }
                                    else if(whichoutputbutton==4){
                                        textView_2.setText(editText_1.getText().toString());
                                    }
                                    break;

                            }
                        }
                        else
                            Toast.makeText(bigActivity.this,"你要转换成几进制？",Toast.LENGTH_SHORT);
                    }//进制转换
                    else if(whichinputbutton==4){
                        if(editText_2.getText().toString().equals("m")||editText_2.getText().toString().equals("M")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*100)).toString());
                                    break;
                                }
                                case "km":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.1)).toString());
                                    break;
                                }
                                case "m":{
                                    textView_2.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("cm")||editText_2.getText().toString().equals("CM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView_2.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "km":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                                case "m":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.01)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("mm")||editText_2.getText().toString().equals("MM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView_2.setText(((Double)Double.parseDouble(editText_1.getText().toString())).toString());
                                    break;
                                }
                                case "cm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.1)).toString());
                                    break;
                                }
                                case "km":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.0001)).toString());
                                    break;
                                }
                                case "m":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*0.001)).toString());
                                    break;
                                }
                            }
                        }
                        else if(editText_2.getText().toString().equals("km")||editText_2.getText().toString().equals("KM")){
                            switch (editText_3.getText().toString()){
                                case "mm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10000)).toString());
                                    break;
                                }
                                case "cm":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*1000)).toString());
                                    break;
                                }
                                case "km":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString()))).toString());
                                    break;
                                }
                                case "m":{
                                    textView_2.setText(((Double)(Double.parseDouble(editText_1.getText().toString())*10)).toString());
                                    break;
                                }
                            }
                        }
                        else
                            Toast.makeText(bigActivity.this,"输入单位错误",Toast.LENGTH_SHORT).show();
                    }//单位转换
                }
                else
                    Toast.makeText(bigActivity.this,"？？？",Toast.LENGTH_SHORT).show();

                return;

        }
        Toast.makeText(bigActivity.this,ch,Toast.LENGTH_SHORT).show();
        if (ch.length() == 1) {
            if(ch.charAt(0)<='9'&&ch.charAt(0)>='0') {
                Log.i("tiaoshi","temp="+temp);
                if(temp) {
                    temp=false;
                    Log.i("tiaoshi","tem="+tem);
                    if (tem == "0.") {
                        ca.evaluate('0');
                        ca.evaluate('.');
                        ca.evaluate(ch.charAt(0));
                        Log.i("tiaoshi","this ok");
                        return;
                    }
                    if(tem=="."&&ch.charAt(0)=='.'){
                        //qu yan se
                        return;
                    }
                    switch (tem.charAt(0)) {
                        case '*':
                            ca.evaluate('*');
                            ca.evaluate(ch.charAt(0));
                            return;
                        case '/':
                            ca.evaluate('/');
                            ca.evaluate(ch.charAt(0));
                            return;
                        case '+':
                            ca.evaluate('+');
                            ca.evaluate(ch.charAt(0));
                            return;
                        case '-':
                            ca.evaluate('-');
                            ca.evaluate(ch.charAt(0));
                            return;
                        case '.':
                            ca.evaluate('.');
                            ca.evaluate(ch.charAt(0));
                            return;
                    }
                }
                else {
                    Log.i("tiaoshi:","ch="+ch.charAt(0));
                    ca.evaluate(ch.charAt(0));
                    return;
                }
            }

            if (ch.equals('(')) {        //左括号永远大于等于右括号
                r++;
            }
            if (ch.equals(')')) {
                r--;
            }
            if (r < 0) {
                return;
            }
            Log.i("tiaoshi","val="+ca.val);
            if (ca.val == 0 && ch.equals(".")) {
                textView.setText("0.");
                temp = true;
                tem = "0.";
                return;
            }
            iffu=false;
            switch (ch.charAt(0))
            {
                case '*':
                    temp=true;
                    tem="*";
                    return;
                case '/':
                    temp=true;
                    tem="/";
                    return;
                case '+':
                    temp=true;
                    tem="+";
                    return;
                case '-':
                    temp=true;
                    tem="-";
                    return;
                case '.':
                    temp=true;
                    tem=".";
                    //jia yanse
                    return;
                case '=':
                    ca.evaluate('#');
                    if (r != 0)        //如果左右括号不等报错
                        textView.setText("error");
                    else
                        textView.setText(ca.opnd.peek().toString());
                    return;
            }

        }
        else{
            if(ch.equals("AC")){
                temp = false;
                r = 0;
                ca.optr.clear();
                ca.optr.push('#');
                ca.opnd.clear();
                textView.setText("0");
                ca.lav=0;
                ca.val=0;
                ca.ch = '0';
                ca.op = '#';
            }
            if(ch.equals("+/-")) {
                if(temp&&tem.charAt(0)!='.'){
                    temp=false;
                    Log.i("tiaoshi","enter");
                    switch (tem.charAt(0)) {
                        case '*':
                            ca.evaluate('*');
                            break;
                        case '/':
                            ca.evaluate('/');
                            break;
                        case '+':
                            ca.evaluate('+');
                            break;
                        case '-':
                            ca.evaluate('-');
                            break;
                        case '.':
                            ca.evaluate('.');
                            break;
                    }
                }
                if(iffu){
                    iffu=false;
                    if(ca.val!=0||ca.lav!=0){
                        Log.i("tiaoshi","optr="+ca.optr.peek());
                        ca.opnd.push(-ca.opnd.pop());
                        textView.setText(ca.opnd.peek().toString());
                    }
                    else
                        textView.setText("");
                    Log.i("tiaoshi","optr="+ca.optr.peek());
                }
                else{
                    iffu=true;
                    if(ca.val!=0||ca.lav!=0){
                        ca.opnd.push(-ca.opnd.pop());
                        textView.setText(ca.opnd.peek().toString());
                    }
                    else
                        textView.setText("-");
                }
            }
        }
    }
    public class calulator {
        double val = 0, lav = 0;
        char ch, op;
        Stack<Character> optr = new Stack<>();
        Stack<Double> opnd = new Stack<>();

        public calulator() {
            optr.push('#');
            ch = '0';
            op = '#';
        }

        private int lp(char a) {
            switch (a) {
                case '+':
                    return 3;
                case '-':
                    return 3;
                case '*':
                    return 5;
                case '/':
                    return 5;
                case '(':
                    return 1;
                case ')':
                    return 6;
                case '#':
                    return 0;
                default:
                    break;
            }
            return 0;
        }

        private int rp(char a) {
            switch (a) {
                case '+':
                    return 2;
                case '-':
                    return 2;
                case '*':
                    return 4;
                case '/':
                    return 4;
                case '(':
                    return 6;
                case ')':
                    return 1;
                case '#':
                    return 0;
                default:
                    break;
            }
            return 0;
        }

        private double operate(char a, double b, double c) {
            if (a == '+')
                return c + b;
            else if (a == '-')
                return b - c;
            else if (a == '*')
                return b * c;
            else if (a == '/')
                return b / c;
            else
                return 0.0;
        }

        void evaluate(char c)            //扫描输入和各种判断
        {
            char theta;
            double a, b;
            ch = c;
            if ((ch != '#') || (op != '#')) {            //逐个输入边输入编录入和判断
                Log.i("tiaoshi","c="+c);
                //Log.i("tiaoshi","optr="+optr.peek());
                //cin >> ch;
                if (ch <= '9' && ch >= '0' || ch == '.') {
                    if (ch == '.')        //val是记有几位数，在输入。的时候让他为0
                        ca.val = 0;
                    if (ca.val != 0)        //如果val不是0且有输入了一个数字说明这是多位数
                    {
                        if(iffu)
                            ca.opnd.push(ca.opnd.pop() * Math.pow(10, (int) ca.val) + (ch - '0'));
                        else
                            ca.opnd.push(ca.opnd.pop() * Math.pow(10, (int) ca.val) + (ch - '0'));
                    }
                    else if (ca.lav != 0)        //同理对小数
                    {
                        if(iffu)
                            ca.opnd.push(ca.opnd.pop() + (-(ch - '0') / Math.pow(10, ca.lav)));
                        else
                            ca.opnd.push(ca.opnd.pop() + (ch - '0') / Math.pow(10, ca.lav));
                        ca.lav++;
                    }

                    else if (ch <= '9' && ch >= '0') {
                        if(iffu)
                            opnd.push((double) (-(ch - '0')));
                        else
                            opnd.push((double) (ch - '0'));
                        val = 1;
                    }
                    else {
                        val = 0;
                        lav = 1;

                    }
                    Log.i("tiaoshi","opnd="+opnd.peek().toString());
                    if(lav==1)
                        textView.setText(opnd.peek().toString()+".");
                    else
                        textView.setText(opnd.peek().toString());

                }

                else if (lp(op) < rp(ch))        //如果左小于右，把这个操作符放进栈中
                {
                    optr.push(ch);
                    val = 0;
                    lav = 0;
                }
                else {
                    val = 0;
                    lav = 0;
                    if (lp(optr.peek()) > rp(ch)) {
                        while (lp(optr.peek()) > rp(ch))        //用while循环是为了应对像是1+5/3<-#这种输入#后要进行两次计算的时候
                        {
                            theta = optr.pop();
                            b = opnd.pop();
                            a = opnd.pop();
                            opnd.push(operate(theta, a, b));
                            Log.i("tiaoshi","jieguo="+opnd.peek().toString());
                            if (lp(optr.peek()) == rp(ch) && optr.peek() != '#')        //消（
                            {
                                optr.pop();
                                break;
                            }
                        }
                        if (ch == ')')        //如果是输入的是），算完就不录入栈了
                        {
                            op = optr.peek();
                        }
                        if (ch == '#' && optr.peek() == '#')        //判断结束
                        {
                            return;
                        }
                        else
                            optr.push(ch);
                    }
                    else
                        optr.push(ch);
                }
                op = optr.peek();
                textView.setText(opnd.peek().toString());
            }

        }
    }
}
