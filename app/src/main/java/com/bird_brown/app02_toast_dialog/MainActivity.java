package com.bird_brown.app02_toast_dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText e = (EditText)findViewById(R.id.editText1);
        CharSequence moji = e.getText();

        if (moji.length() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("警告");
            builder.setMessage("文字が入力されていません。");
            builder.show();
            return;
        }

        Toast t = Toast.makeText(this,moji,Toast.LENGTH_SHORT);     //５秒間表示
        t.show();
    }
}
