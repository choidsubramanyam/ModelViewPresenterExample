package com.example.subramanyam.mvc_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    EditText name;
    EditText email;
    Button button;
    TextView textView;
    MainViewPresenter mainViewPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText);
        email=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        mainViewPresenter=new MainViewPresenter(this);
        button.setOnClickListener(this);
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mainViewPresenter.updateEmail(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mainViewPresenter.updateName(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void updateTextView(String text) {
        textView.setText(text);
    }

    @Override
    public void onClick(View view) {
        mainViewPresenter.updateText();
    }
}
