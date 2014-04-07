package com.torealpeople.siphone.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {
    private Button Llamar [] = new Button[10];
    private Button Clear;
    private TextView number;
    private static final String TAG ="Debug-siphone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (TextView)findViewById(R.id.Numero);
        Clear = (Button)findViewById(R.id.Clear_B);
        Clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                number.setText("");
                return true;
            }
        });


        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = number.getText().toString();
                number.setText(method(temp));
            }
        });
        Llamar[0] = (Button)findViewById(R.id.Boton0);
        Llamar[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText( number.getText()+"0");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }


        });

        Llamar[1] = (Button)findViewById(R.id.Boton1);
        Llamar[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "1");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[2] = (Button)findViewById(R.id.Boton2);
        Llamar[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "2");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });
        Llamar[3] = (Button)findViewById(R.id.Boton3);
        Llamar[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "3");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[4] = (Button)findViewById(R.id.Boton4);
        Llamar[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "4");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[5] = (Button)findViewById(R.id.Boton5);
        Llamar[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "5");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[6] = (Button)findViewById(R.id.Boton6);
        Llamar[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "6");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[7] = (Button)findViewById(R.id.Boton7);
        Llamar[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "7");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[8] = (Button)findViewById(R.id.Boton8);
        Llamar[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "8");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

        Llamar[9] = (Button)findViewById(R.id.Boton9);
        Llamar[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "9");
                String temp = number.getText().toString();
                number.setText(methodStart(temp));
            }
        });

    }
    public String method(String str) {
        if (str.length() > 0) {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public String methodStart(String str) {
        if (str.length() > 15) {
            str = str.substring(1, str.length());
        }
        return str;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
