package com.example.hahma.bonus;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity
{

    private static final String FILE_NAME="example.txt";

    EditText text1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
    }

    public void save(View v)
    {
        String text= text1.getText().toString();
        FileOutputStream fos=null;

        try
        {
            fos=openFileOutput(FILE_NAME,MODE_PRIVATE);
            fos.write(text.getBytes());
            text1.getText().clear();
            Toast.makeText(this,"Saved to "+getFilesDir()+"/"+FILE_NAME,Toast.LENGTH_LONG).show();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if(fos!=null)
            {
                try
                {
                    fos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

  public void load(View v)
  {
      FileInputStream fis=null;
          try {
              fis = openFileInput(FILE_NAME);
              InputStreamReader isr = new InputStreamReader(fis);
              BufferedReader br = new BufferedReader(isr);
              StringBuilder sb = new StringBuilder();
              String text;

              while ((text = br.readLine()) != null) {
                  sb.append(text).append("\n");
              }
              text1.setText(sb.toString());
          } catch (FileNotFoundException e)
          {
              e.printStackTrace();
          } catch (IOException e)
          {
              e.printStackTrace();
          } finally
          {
              if (fis != null) {
                  try
                  {
                      fis.close();
                  } catch (IOException e)
                  {
                      e.printStackTrace();
                  }
              }
          }


  }

  public void writeExternalStorage()
  {

      String state;
      state= Environment.getExternalStorageState();


      if(Environment.MEDIA_MOUNTED.equals(state))
      {
          File Root=Environment.getExternalStorageDirectory();
          File Dir=new File(Root.getAbsolutePath()+"/MyAppFile");
          if(!Dir.exists())
          {
              Dir.mkdir();
          }
          File file=new File(Dir,"MyMessage.txt");
          String Message=text1.getText().toString();
          try
          {
              FileOutputStream fileOutputStream=new FileOutputStream(file);
              fileOutputStream.write(Message.getBytes());
              fileOutputStream.close();
              text1.setText("");
              Toast.makeText(getApplicationContext(),"file saved on sd card",Toast.LENGTH_LONG).show();
          }
          catch (FileNotFoundException e)
          {
              e.printStackTrace();
          } catch (IOException e)
          {
              e.printStackTrace();
          }


      }
      else
      {
          Toast.makeText(getApplicationContext(),"SD CARD NOT FOUND",Toast.LENGTH_LONG).show();
      }

  }

}
