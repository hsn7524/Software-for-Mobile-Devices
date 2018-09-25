package com.example.hahma.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class singup_relative extends AppCompatActivity
{

   public EditText email_id,pass;
   public RadioButton btn1,btn2;
   public CheckBox c1;
   public String strl,str2,str3,str4,str5;
   public Button b3;
    public void func3()
    {
     email_id=(EditText)findViewById(R.id.email1);
     pass=(EditText)findViewById(R.id.password1);
     btn1=(RadioButton) findViewById(R.id.m11);
     btn2=(RadioButton) findViewById(R.id.f1);
     c1=(CheckBox)findViewById(R.id.checkbox);

     b3=(Button)findViewById(R.id.r1);
     b3.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View v)
         {
             if (c1.isChecked())
             {
                 if(email_id.getText().toString().matches("")&& pass.getText().toString().matches(""))
                 {
                     Toast.makeText(singup_relative.this, "PLEASE DONT LEAVE THE EMAIL AND PASSWORD BOX EMPTY ", Toast.LENGTH_SHORT).show();
                 }
                 else if(pass.getText().toString().matches(""))
                 {
                     Toast.makeText(singup_relative.this, "PLEASE DONT LEAVE THE PASSWORD BOX EMPTY ", Toast.LENGTH_SHORT).show();
                     strl = email_id.getText().toString();
                     Toast.makeText(singup_relative.this, "Email is: " + strl, Toast.LENGTH_SHORT).show();
                 }
                 else if(email_id.getText().toString().matches(""))
                 {
                     Toast.makeText(singup_relative.this, "PLEASE DONT LEAVE THE EMAIL Box EMPTY ", Toast.LENGTH_SHORT).show();
                     str2 = pass.getText().toString();
                     Toast.makeText(singup_relative.this, "password is: " + str2, Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     strl = email_id.getText().toString();
                     Toast.makeText(singup_relative.this, "Email is: " + strl, Toast.LENGTH_SHORT).show();

                     str2 = pass.getText().toString();
                     Toast.makeText(singup_relative.this, "password is: " + str2, Toast.LENGTH_SHORT).show();
                 }
                     if (btn1.isChecked())
                     {
                         str3 = btn1.getText().toString();
                         Toast.makeText(singup_relative.this, "Gender is: " + str3, Toast.LENGTH_SHORT).show();
                     }
                     else if (btn2.isChecked())
                     {
                         str4 = btn2.getText().toString();
                         Toast.makeText(singup_relative.this, "Gender is: " + str4, Toast.LENGTH_SHORT).show();
                     }
                     else
                         {
                         System.out.println("Please enter correct");
                     }
                     if (c1.isChecked()) {
                         str5 = c1.getText().toString();
                         Toast.makeText(singup_relative.this, "Here the check box of " + str5 + " was checked", Toast.LENGTH_SHORT).show();
                     } else {
                         Toast.makeText(singup_relative.this, "PLEASE CHECK THE CHECKBOX INORDER TO CONTINUE ", Toast.LENGTH_SHORT).show();
                     }

             }
              else
             {
                 Toast.makeText(singup_relative.this, "PLEASE CHECK THE CHECKBOX INORDER TO CONTINUE " , Toast.LENGTH_SHORT).show();
             }



         }

     });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_relative);
        func3();
    }
}
