package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText name,admissionno,mobileno,email,password,conformpassword,username;
    Button b1,b2;
    String n,a,m,e,p,c,u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.nam);
        admissionno=(EditText)findViewById(R.id.admn);
        mobileno=(EditText)findViewById(R.id.mbo);
        email=(EditText)findViewById(R.id.em);
        password=(EditText)findViewById(R.id.psw);
        conformpassword=(EditText)findViewById(R.id.cpswd);
        username=(EditText)findViewById(R.id.usn);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.alreg);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               n = name.getText().toString();
               a = admissionno.getText().toString();
               m = mobileno.getText().toString();
               e = email.getText().toString();
               p = password.getText().toString();
               c = conformpassword.getText().toString();
               u = username.getText().toString();
               if (p.equals(c)) {

                   Toast.makeText(getApplicationContext(), n, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), m, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), e, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG).show();
                   Toast.makeText(getApplicationContext(), u, Toast.LENGTH_LONG).show();

               } else {
                   Toast.makeText(getApplicationContext(), "password and conform password are does not match", Toast.LENGTH_LONG).show();
               }
           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(m);
            }
        });
    }
}
