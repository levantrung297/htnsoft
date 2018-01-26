package com.htnsoft.htnsoft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btnlogin;
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnlogin = (Button) findViewById(R.id.btn_login);
        txtKetQua =(TextView) findViewById(R.id.txtketqua);

        // Nhận kết quả từ intent

        Intent intent;
        String[] MangMonHoc;
        intent = getIntent();
        MangMonHoc = intent.getStringArrayExtra("Mangmonhoc");
        String NoiDung = intent.getStringExtra("txtKetQua");
        Student hs = (Student) intent.getSerializableExtra("hocsinh");
        txtKetQua.setText(hs.getHoten()+" "+hs.getNgaysinh());
    }

    public SecondActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA","onDestroy");
    }

}
