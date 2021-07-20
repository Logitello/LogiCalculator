package com.logitello.logicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    private String str1 = "0", str2 = "0";
    private TextView textViewNumber;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnAC, btnDiv, btnX, btnSub, btnAdd, btnEq, btnComa, btnOff;
    boolean isPressedDiv = false, isPressedX = false, isPressedSub = false, isPressedAdd = false, isPressedComa = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textViewNumber = findViewById(R.id.textViewNumber);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnAC = findViewById(R.id.btnAC);
        btnDiv = findViewById(R.id.btnDiv);
        btnX = findViewById(R.id.btnX);
        btnSub = findViewById(R.id.btnSub);
        btnAdd = findViewById(R.id.btnAdd);
        btnEq = findViewById(R.id.btnEq);
        btnComa = findViewById(R.id.btnComa);
        btnOff = findViewById(R.id.btnOff);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("0");
                        str1 = "0";
                    } else {
                        textViewNumber.setText(str1 += 0);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("0");
                        str2 = "0";
                    } else {
                        textViewNumber.setText(str2 += 0);
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("1");
                        str1 = "1";
                    } else {
                        textViewNumber.setText(str1 += 1);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("1");
                        str2 = "1";
                    } else {
                        textViewNumber.setText(str2 += 1);
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("2");
                        str1 = "2";
                    } else {
                        textViewNumber.setText(str1 += 2);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("2");
                        str2 = "2";
                    } else {
                        textViewNumber.setText(str2 += 2);
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("3");
                        str1 = "3";
                    } else {
                        textViewNumber.setText(str1 += 3);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("3");
                        str2 = "3";
                    } else {
                        textViewNumber.setText(str2 += 3);
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("4");
                        str1 = "4";
                    } else {
                        textViewNumber.setText(str1 += 4);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("4");
                        str2 = "4";
                    } else {
                        textViewNumber.setText(str2 += 4);
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("5");
                        str1 = "5";
                    } else {
                        textViewNumber.setText(str1 += 5);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("5");
                        str2 = "5";
                    } else {
                        textViewNumber.setText(str2 += 5);
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("6");
                        str1 = "6";
                    } else {
                        textViewNumber.setText(str1 += 6);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("6");
                        str2 = "6";
                    } else {
                        textViewNumber.setText(str2 += 6);
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("7");
                        str1 = "7";
                    } else {
                        textViewNumber.setText(str1 += 7);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("7");
                        str2 = "7";
                    } else {
                        textViewNumber.setText(str2 += 7);
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("8");
                        str1 = "8";
                    } else {
                        textViewNumber.setText(str1 += 8);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("8");
                        str2 = "8";
                    } else {
                        textViewNumber.setText(str2 += 8);
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    if(!isPressedComa && str1.equals("0")) {
                        textViewNumber.setText("9");
                        str1 = "9";
                    } else {
                        textViewNumber.setText(str1 += 9);
                    }
                } else {
                    if(!isPressedComa && str2.equals("0")) {
                        textViewNumber.setText("9");
                        str2 = "9";
                    } else {
                        textViewNumber.setText(str2 += 9);
                    }
                }
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewNumber.setText("0");
                str1 = "0";
                str2 = "0";
                isPressedComa = false;
                isPressedAdd = false;
                isPressedSub = false;
                isPressedX = false;
                isPressedDiv = false;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPressedDiv = true;
                isPressedX = false;
                isPressedSub = false;
                isPressedAdd = false;
                isPressedComa = false;
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPressedX = true;
                isPressedSub = false;
                isPressedAdd = false;
                isPressedDiv = false;
                isPressedComa = false;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPressedSub = true;
                isPressedAdd = false;
                isPressedDiv = false;
                isPressedX = false;
                isPressedComa = false;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPressedAdd = true;
                isPressedDiv = false;
                isPressedX = false;
                isPressedSub = false;
                isPressedComa = false;
            }
        });



        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sum1 = Double.parseDouble(str1);
                double sum2 = Double.parseDouble(str2);
                double sumDouble = 0.0;
                String sum;

                if(isPressedAdd) {
                    sumDouble = sum1 + sum2;
                    sumDouble = round(sumDouble, 2);
                    if((sumDouble % 1) == 0) {
                        sum = String.valueOf((int) sumDouble);
                    } else {
                        sum = String.valueOf(sumDouble);
                    }
                    Toast.makeText(MainActivity.this, sum, Toast.LENGTH_SHORT).show();
                    textViewNumber.setText(sum);
                    isPressedAdd = false;
                    str1 = "0";
                    str2 = "0";
                } else if(isPressedSub) {
                    sumDouble = sum1 - sum2;
                    sumDouble = round(sumDouble, 2);
                    if((sumDouble % 1) == 0) {
                        sum = String.valueOf((int) sumDouble);
                    } else {
                        sum = String.valueOf(sumDouble);
                    }
                    textViewNumber.setText(sum);
                    isPressedSub = false;
                    str1 = "0";
                    str2 = "0";
                } else if(isPressedX) {
                    sumDouble = sum1 * sum2;
                    sumDouble = round(sumDouble, 2);
                    if((sumDouble % 1) == 0) {
                        sum = String.valueOf((int) sumDouble);
                    } else {
                        sum = String.valueOf(sumDouble);
                    }
                    textViewNumber.setText(sum);
                    isPressedX = false;
                    str1 = "0";
                    str2 = "0";
                } else if(isPressedDiv) {
                    sumDouble = sum1 / sum2;
                    sumDouble = round(sumDouble, 2);
                    if((sumDouble % 1) == 0) {
                        sum = String.valueOf((int) sumDouble);
                    } else {
                        sum = String.valueOf(sumDouble);
                    }
                    textViewNumber.setText(sum);
                    isPressedDiv = false;
                    str1 = "0";
                    str2 = "0";
                }
                isPressedComa = false;
            }
        });

        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPressedAdd && !isPressedDiv && !isPressedSub && !isPressedX) {
                    str1 = str1.concat(".");
                    textViewNumber.setText(str1);
                } else {
                    str2 = str2.concat(".");
                    textViewNumber.setText(str2);
                }
                isPressedComa = true;
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }

    // for some reason some equations were wrong instead 10.4 was 10.39999 for example. This method fixes it
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }



}