package com.example.haritha.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button zero;
    private Button add;
    private Button mul;
    private Button div;
    private Button sub;
    private Button point;
    private Button del;
    private Button add_to_memory;
    private Button sub_from_memory;
    private Button recall_memory;
    private Button clear_memory;
    private Button equal;
    private Button clear;
    private Button power;
    private Button toggle;
    private String operator;
    private double input_for_memory;

    private TextView input_text;
    private TextView output_text;

    private double operand1 = Double.NaN;
    private double operand2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        point = findViewById(R.id.dec_point);
        add_to_memory = findViewById(R.id.add_to_memory);
        sub_from_memory = findViewById(R.id.sub_from_memory);
        recall_memory = findViewById(R.id.recall_memory);
        clear_memory = findViewById(R.id.clear_memory);
        equal = findViewById(R.id.equal);
        del = findViewById(R.id.del);
        clear = findViewById(R.id.clear);
        power = findViewById(R.id.power);
        toggle = findViewById(R.id.toggle);
        input_text = findViewById(R.id.input_text);
        output_text = findViewById(R.id.output_text);



        set_zero();

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (check_input_length())

                if (input_text.getText().toString().equals("0"))
                    input_text.setText("1");

                else
                    input_text.setText(input_text.getText().toString() + "1");

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (check_input_length())

                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("2");

                    else
                        input_text.setText(input_text.getText().toString() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())

                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("3");

                    else
                        input_text.setText(input_text.getText().toString() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("4");

                    else
                        input_text.setText(input_text.getText().toString() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("5");

                    else
                        input_text.setText(input_text.getText().toString() + "5");
                }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("6");

                    else
                        input_text.setText(input_text.getText().toString() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("7");

                    else
                        input_text.setText(input_text.getText().toString() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("8");

                    else
                        input_text.setText(input_text.getText().toString() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("9");

                    else
                        input_text.setText(input_text.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check_input_length())
                    if (input_text.getText().toString().equals("0"))
                        input_text.setText("0");

                    else
                        input_text.setText(input_text.getText().toString() + "0");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                calculator();
                operator = "add";
                output_text.setText(String.valueOf(operand1) + "+");
                input_text.setText(null);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator();
                operator = "sub";
                output_text.setText(String.valueOf(operand1) + "-");
                input_text.setText(null);

            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator();
                operator = "div";
                output_text.setText(String.valueOf(operand1) + "/");
                input_text.setText(null);

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator();
                operator = "mul";
                output_text.setText(String.valueOf(operand1) + "X");
                input_text.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculator();
                operator = "equal";

                if(Double.toString(operand1) != "Infinity" && Double.toString(operand1) != "NaN")  // to handle divide by zero error
                    output_text.setText(String.valueOf(operand1));
                else
                    output_text.setText("Not a valid operation");
                input_text.setText(null);
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    if(!input_text.getText().toString().contains("."))   //restricts adding more than one decimal point
                        input_text.setText(input_text.getText().toString() + ".");


                }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input_text.getText() != null && input_text.getText().toString().length() > 0)
                {
                    CharSequence text = input_text.getText().toString();
                    input_text.setText(text.subSequence(0, text.length() - 1));

                }
                else
                    {

                    operand1 = Double.NaN;
                    operand2 = Double.NaN;
                    input_text.setText(null);
                    output_text.setText(null);
                }
            }
        });

        add_to_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(input_text.getText() != null && input_text.getText().toString().length() > 0) {
                   input_for_memory += Double.parseDouble(input_text.getText().toString());
                   input_text.setText(null);
                   output_text.setText(null);
               }

               else
               {
                   input_for_memory += operand1;
                   input_text.setText(null);
                   output_text.setText(null);
               }
            }
        });

        sub_from_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input_text.getText() != null && input_text.getText().toString().length() > 0)
                {
                    input_for_memory -= Double.parseDouble(input_text.getText().toString());
                    input_text.setText(null);
                    output_text.setText(null);

            }

                else
                {
                    input_for_memory -= operand1;
                    input_text.setText(null);
                    output_text.setText(null);
                }
        }});

        recall_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!Double.isNaN(input_for_memory))
                    input_text.setText(Double.toString(input_for_memory));


            }
        });

        clear_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!Double.isNaN(input_for_memory)) {
                    input_for_memory = 0;
                    input_text.setText(null);
                    output_text.setText(null);
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operand1 = Double.NaN;
                operand2 = Double.NaN;
                input_text.setText(null);
                output_text.setText(null);
                set_zero();
            }
        });

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input_text.getText() != null && input_text.getText().toString().length() > 0)
                {
                    Double a = Double.parseDouble(input_text.getText().toString());
                        a *= -1;
                        input_text.setText(a.toString());

                }

                else
                {
                        operand1 *= -1;
                        output_text.setText(Double.toString(operand1));

                }

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    calculator();
                    operator = "power";
                    output_text.setText(String.valueOf(operand1) + "^");
                    input_text.setText(null);

            }
        });
    }


        private void calculator() //performs the arithmetic operation
        {

            if(!Double.isNaN(operand1))
            {
                if(input_text.getText() != null && input_text.getText().length() > 0) {

                    operand2 = Double.parseDouble(input_text.getText().toString());

                    switch (operator)
                    {

                        case "add":

                            operand1 = operand1 + operand2;
                            break;

                        case "sub":

                            operand1 = operand1 - operand2;
                            break;

                        case "mul":

                            operand1 = operand1 * operand2;
                            break;

                        case "div":

                            operand1 = operand1 / operand2;
                            break;

                        case "equal":

                            break;

                        case "power":

                           double b = operand1;

                            if(operand2 == 0)
                                operand1=1;
                            else if(operand2 == 1)
                                operand1=operand1;
                            else

                                for(int i=1; i<operand2; i++ )
                                    {
                                        operand1 = operand1 * b;
                                    }

                            break;

                    }
                }


            }

            else {

                if(input_text.getText() != null && input_text.getText().length() > 0)
                {
                    operand1 = Double.parseDouble(input_text.getText().toString());

                }

            }

        }

        private void set_zero()  // to set initial display as 0
        {

            input_text.setText("0");
        }


        private Boolean check_input_length()  //does not allow input value with more than 10 digits including decimal values and numbers with negative sign
        {
            if(input_text.getText().length() > 0 && input_text.getText() != null) {


                if (input_text.getText().toString().contains("-")) {
                    if (input_text.getText().toString().contains(".") && input_text.getText().length() <= 11)
                        return true;
                    else if (!input_text.getText().toString().contains(".") && input_text.getText().length() <= 10)
                        return true;
                } else {
                    if (input_text.getText().toString().contains(".") && input_text.getText().length() <= 10)
                        return true;
                    else if (!input_text.getText().toString().contains(".") && input_text.getText().length() <= 9)
                        return true;
                }
            }
            else
            {
                return true;

            }

            return false;
        }

}
