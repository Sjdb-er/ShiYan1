package com.er.sjdb.shiyan1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button0, button_add, button_sub, button_mul, button_div, button_point, button,
            button_del, button_left, button_right, button_ac;
    TextView textView1, textView2;


    int bracket = 0;
    boolean pointTest = true;
    public static Map pro = new HashMap();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the key
        button = (Button) findViewById(R.id.button);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_point = (Button) findViewById(R.id.button_point);
        button_add = (Button) findViewById(R.id.button_add);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_div = (Button) findViewById(R.id.button_div);
        button_del = (Button) findViewById(R.id.button_del);
        button_left = (Button) findViewById(R.id.buttonleft);
        button_right = (Button) findViewById(R.id.buttonright);
        button_ac = (Button) findViewById(R.id.button_ac);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        //use the key


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')') {
                    if (check(equation)) {
                        equation += '0';
                    } else {
                        equation = "0";
                    }
                }
                textView2.setText(equation);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '1';
                    } else {
                        equation = "1";
                    }
                textView2.setText(equation);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '2';
                    } else {
                        equation = "2";
                    }
                textView2.setText(equation);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '3';
                    } else {
                        equation = "3";
                    }
                textView2.setText(equation);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '4';
                    } else {
                        equation = "4";
                    }
                textView2.setText(equation);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '5';
                    } else {
                        equation = "5";
                    }
                textView2.setText(equation);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '6';
                    } else {
                        equation = "6";
                    }
                textView2.setText(equation);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '7';
                    } else {
                        equation = "7";
                    }
                textView2.setText(equation);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '8';
                    } else {
                        equation = "8";
                    }
                textView2.setText(equation);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != ')')
                    if (check(equation)) {
                        equation += '9';
                    } else {
                        equation = "9";
                    }
                textView2.setText(equation);
            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
                        || c == '8' || c == '9' || c == ')') && equation.length() > 0) {
                    equation += '+';
                    pointTest = true;
                    textView2.setText(equation);
                }
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
                        || c == '8' || c == '9' || c == ')') && equation.length() > 0) {
                    {
                        equation += '-';
                        pointTest = true;
                        textView2.setText(equation);
                    }
                }

                textView2.setText(equation);
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
                        || c == '8' || c == '9' || c == ')') && equation.length() > 0) {
                    equation += '*';
                    pointTest = true;
                    textView2.setText(equation);
                }
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
                        || c == '8' || c == '9' || c == ')') && equation.length() > 0) {
                    equation += '/';
                    pointTest = true;
                    textView2.setText(equation);
                }
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' ||
                        c == '8' || c == '9') && pointTest) {
                    equation += ".";
                    pointTest = false;
                }

                textView2.setText(equation);
            }
        });

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (check(equation)) {
                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(') {
                        equation += '(';
                        bracket++;
                    } else if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' ||
                            c == '8' || c == '9') {
                        equation += "*(";
                        bracket++;
                    }
                } else {
                    equation = "(";
                    bracket++;
                }

                textView2.setText(equation);
            }
        });
        button_right.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (bracket > 0 && (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' ||
                        c == '8' || c == '9' || c == '(' || c == ')')) {
                    equation += ')';
                    bracket--;
                }

                textView2.setText(equation);
            }
        });
        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = "0";
                textView2.setText(equation);
                bracket = 0;
                pointTest = true;
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (equation.length() > 1) {

                    equation = equation.substring(0, equation.length() - 1);
                    if (c == '.') {
                        pointTest = true;
                    }
                    if (c == '(') {
                        bracket--;
                    }
                    if (c == ')') {
                        bracket++;
                    }
                } else {
                    equation = "0";
                }


                textView2.setText(equation);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //整理式子，不对报error
                //正确返回式子
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                double result = 0.0;
                if ((c != '.' && c != '+' && c != '-' && c != '*' && c != '/') && bracket == 0) {
                    //根据式子输出答案
                    result = fun2(equation);
                    textView1.setText(Double.toString(result));

                } else if (c == '.' || c == '+' || c == '-' || c == '*' || c == '/') {
                    textView1.setText("式子未完成");
                } else if (bracket != 0) {
                    textView1.setText("括号不平衡：" + Integer.toString(bracket));
                }

            }
        });
    }

    //function

    public boolean check(String str) {
        if (str.length() == 1) {
            if (str == "(" || str == "-") {
                return true;
            } else {
                int z = Integer.parseInt(str);
                if (z == 0)
                    return false;
            }
        }
        return true;
    }

    public char getLastChar(String equation) {
        String i = "";
        char c;
        if (equation.length() <= 1)
            i = equation;
        else
            i = equation.substring(equation.length() - 1, equation.length());
        c = i.charAt(0);
        return c;
    }

    public static void init() {
        pro.put('+', 1);
        pro.put('-', 1);
        pro.put('*', 2);
        pro.put('/', 2);
    }

    public static int getIndex(String str) {
        int index1 = (str.indexOf('+') == -1 ? str.length() : str.indexOf('+'));
        int index2 = (str.indexOf('-') == -1 ? str.length() : str.indexOf('-'));
        int index3 = (str.indexOf('*') == -1 ? str.length() : str.indexOf('*'));
        int index4 = (str.indexOf('/') == -1 ? str.length() : str.indexOf('/'));
        int index = index1 < index2 ? index1 : index2;
        index = index < index3 ? index : index3;
        index = index < index4 ? index : index4;
        return index;
    }

    public static double cal(char op, double num1, double num2) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return num1 / num2;
        }
    }

    public static double fun1(String str) {
        init();
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        int fop = 0;
        while (str.length() > 0) {
            int index = getIndex(str);
            st1.push(Double.parseDouble(str.substring(0, index)));
            if (index != str.length()) {
                char op = str.charAt(index);
                str = str.substring(index + 1);
                while (true) {
                    if ((int) pro.get(op) > fop) {
                        st2.push(op);
                        fop = (int) pro.get(op);
                        break;
                    } else {
                        double num2 = (double) st1.pop();
                        double num1 = (double) st1.pop();
                        double result = cal((char) st2.pop(), num1, num2);
                        st1.push(result);
                        if (st2.size() == 0) {
                            st2.push(op);
                            fop = (int) pro.get(op);
                            break;
                        }
                        char cop = (char) st2.pop();
                        fop = (int) pro.get(cop);
                        st2.push(cop);
                    }
                }
            } else {
                break;
            }
        }
        while (st2.size() != 0) {
            double num2 = (double) st1.pop();
            double num1 = (double) st1.pop();
            char op = (char) st2.pop();
            st1.push(cal(op, num1, num2));
        }
        double result = (double) st1.pop();
        return result;
    }

    public static double fun2(String str) {
        while (str.indexOf('(') != -1) {
            int left = 0;
            int right = str.length();
            char op;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    left = i;
                }
                if (str.charAt(i) == ')') {
                    right = i;
                    break;
                }
            }
            str = str.substring(0, left) + fun1(str.substring(left + 1, right)) + str.substring(right + 1);
        }
        return fun1(str);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this,"设置",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.action_more)
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
