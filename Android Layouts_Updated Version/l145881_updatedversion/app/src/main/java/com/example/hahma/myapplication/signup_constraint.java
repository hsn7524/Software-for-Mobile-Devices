package com.example.hahma.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class signup_constraint extends AppCompatActivity
{
    public EditText emailid2,password2;
    public RadioButton btn4,btn5;
    public CheckBox chk2;
    public String strl,str2,str3,str4,str5;
    public Button reg1;
    public void func4()
    {
        emailid2=(EditText)findViewById(R.id.email2);
        password2=(EditText)findViewById(R.id.pass2);
        btn4=(RadioButton) findViewById(R.id.m11);
        btn5=(RadioButton) findViewById(R.id.f11);
        chk2=(CheckBox)findViewById(R.id.c2);

        reg1=(Button)findViewById(R.id.reg1);

        reg1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (chk2.isChecked())
                {
                    if(emailid2.getText().toString().matches("")&&password2.getText().toString().matches(""))
                    {
                        Toast.makeText(signup_constraint.this, "PLEASE DONT LEAVE THE EMAIL and PASSWORD BOX EMPTY ", Toast.LENGTH_SHORT).show();
                    }
                    else if(password2.getText().toString().matches(""))
                    {
                        Toast.makeText(signup_constraint.this, "PLEASE DONT LEAVE PASSWORD BOX EMPTY ", Toast.LENGTH_SHORT).show();
                        strl = emailid2.getText().toString();
                        Toast.makeText(signup_constraint.this, "Email is: " + strl, Toast.LENGTH_SHORT).show();
                    }
                    else if(emailid2.getText().toString().matches(""))
                    {
                        Toast.makeText(signup_constraint.this, "PLEASE DONT LEAVE EMAIL BOX EMPTY ", Toast.LENGTH_SHORT).show();
                        str2 = password2.getText().toString();
                        Toast.makeText(signup_constraint.this, "password is: " + str2, Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                        strl = emailid2.getText().toString();
                        Toast.makeText(signup_constraint.this, "Email is: " + strl, Toast.LENGTH_SHORT).show();

                        str2 = password2.getText().toString();
                        Toast.makeText(signup_constraint.this, "password is: " + str2, Toast.LENGTH_SHORT).show();
                    }
                    if (btn4.isChecked())
                    {
                        str3 = btn4.getText().toString();
                        Toast.makeText(signup_constraint.this, "Gender is: " + str3, Toast.LENGTH_SHORT).show();
                    } else if (btn5.isChecked()) {
                        str4 = btn5.getText().toString();
                        Toast.makeText(signup_constraint.this, "Gender is: " + str4, Toast.LENGTH_SHORT).show();
                    } else {
                        System.out.println("Please enter correct");
                    }
                    if (chk2.isChecked())
                    {
                        str5 = chk2.getText().toString();
                        Toast.makeText(signup_constraint.this, "Here the check box of " + str5 +" was checked", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(signup_constraint.this, "PLEASE CHECK THE CHECKBOX INORDER TO CONTINUE " , Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(signup_constraint.this, "PLEASE CHECK THE CHECKBOX INORDER TO CONTINUE " , Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_constraint);
        func4();
    }
}
