package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.lang.Math;
import java.util.Stack;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    calulator ca = new calulator();
    boolean temp = false,iffu=false;
    String tem;
    int r = 0;
    boolean kuohai_temp=false;
    String kuohao_tem;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("HELP");
        dialog.setMessage("这个界面支持加减乘除计算，可以设置正负号，正负号按钮为+/-，三角函数及进制转换计算请点击->按钮，同时支持横竖屏");
        dialog.setCancelable(false);
        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int or;
        or=getResources().getConfiguration().orientation;
        if(or==2){
            Intent intent=new Intent(MainActivity.this,bigActivity.class);
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
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
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
        Button left=(Button)findViewById(R.id.button_left);
        Button right=(Button)findViewById(R.id.button_right);
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
        left.setOnClickListener(this);
        right.setOnClickListener(this);


    }

    public void onClick(View v) {
        int id = v.getId();
        Button button = (Button) v.findViewById(id);
        String ch = button.getText().toString();
        Log.i("tiaoshi:ch=",ch);
        Toast.makeText(MainActivity.this,ch,Toast.LENGTH_SHORT).show();
        if (ch.length() == 1) {
            if(ch.charAt(0)<='9'&&ch.charAt(0)>='0'&&!kuohai_temp) {
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
            if(ch.charAt(0)=='('||kuohai_temp){
                if(!kuohai_temp) {
                    kuohai_temp = true;
                    kuohao_tem="(";
                    textView.setText(kuohao_tem);
                    return;
                }
                else{
                    kuohao_tem=kuohao_tem+ch;
                    if(ch.equals(")")){

                        for(int i=0;i<kuohao_tem.length();++i){
                            Log.i("tiaoshi","i="+i);
                            ca.evaluate(kuohao_tem.charAt(i));
                            Log.i("tiaoshi","return");
                        }
                        kuohai_temp=false;
                        kuohao_tem="";
                        return;
                    }
                    textView.setText(kuohao_tem);
                    return;
                }
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
                    Log.i("tiaoshi","enter");
                    optr.push(ch);
                    Log.i("tiaoshi","enter2");
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
                if(!opnd.empty())
                    textView.setText(opnd.peek().toString());
            }

        }
        /*if (optr.empty())
                textView.setText(opnd.peek().toString());
            else if (r != 0)        //如果左右括号不等报错
                textView.setText("error");
            else            //如果操作符栈里还有操作符，说明输错了
                    textView.setText("error");*/

    }
}