package com.ameen.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int result = 0;

    CheckBox q2CheckboxPhp, q2CheckboxJava, q2CheckboxKotlin, q2CheckboxHtml;
    RadioGroup q1RadioGroup, q3RadioGroup;
    EditText q4EditText;
    Button resultBtn, resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1RadioGroup = findViewById(R.id.q1Radiogroup);

        q3RadioGroup = findViewById(R.id.q3Radiogroup);

        q2CheckboxHtml = findViewById(R.id.checkboxHtml);
        q2CheckboxJava = findViewById(R.id.checkboxJava);
        q2CheckboxKotlin = findViewById(R.id.checkboxKotlin);
        q2CheckboxPhp = findViewById(R.id.checkboxPhp);

        q4EditText = findViewById(R.id.q4EditText);

        resultBtn = findViewById(R.id.resultBtn);
        resultBtn.setOnClickListener(this);

        resetBtn = findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.resultBtn:
                if (isTrueQ1()) result++;
                if (isTrueQ2()) result++;
                if (isTrueQ3()) result++;
                if (isTrueQ4()) result++;

                Toast.makeText(this, "Your score is " + result + "/4", Toast.LENGTH_LONG).show();
                break;


            case R.id.resetBtn:
                reset();
                break;
        }
    }

    private boolean isTrueQ1() {
        return (q2CheckboxJava.isChecked() && q2CheckboxKotlin.isChecked());
    }

    private boolean isTrueQ2() {
        return q1RadioGroup.getCheckedRadioButtonId() == R.id.q1RadiobuttonSql;
    }

    private boolean isTrueQ3() {
        return q3RadioGroup.getCheckedRadioButtonId() == R.id.q3RadiobuttonLog;
    }

    private boolean isTrueQ4() {
        return q4EditText.getText().toString().toLowerCase().equals("true");
    }

    private void reset() {
        q1RadioGroup.clearCheck();

        q2CheckboxKotlin.setChecked(false);
        q2CheckboxJava.setChecked(false);
        q2CheckboxPhp.setChecked(false);
        q2CheckboxHtml.setChecked(false);

        q3RadioGroup.clearCheck();

        q4EditText.setText("");

        result = 0;
    }
}
