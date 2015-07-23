package com.mercury.mercury_tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Boolean isPlayerO = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBtnClicked(View view) {
        switch (view.getId()) {
            case R.id.button1 :
                ButtonUpdateResult((Button) view.findViewById(R.id.button1));
                break;
            case R.id.button2 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button2));
                break;
            case R.id.button3 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button3));
                break;
            case R.id.button4 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button4));
                break;
            case R.id.button5 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button5));
                break;
            case R.id.button6 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button6));
                break;
            case R.id.button7 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button7));
                break;
            case R.id.button8 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button8));
                break;
            case R.id.button9 :
                ButtonUpdateResult((Button)view.findViewById(R.id.button9));
                break;
        }
    }

    private void ButtonUpdateResult(Button currentButton) {
        if(currentButton.getText().length() == 0) {
            if (isPlayerO == true) {
                currentButton.setText("O");
                isPlayerO = false;
            } else {
                currentButton.setText("X");
                isPlayerO = true;
            }
        }
    }

    private void VerifyWins() {

    }

    public void ResetAllButton(View view) {
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setText("");

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setText("");

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setText("");

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setText("");

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setText("");

        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setText("");

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setText("");

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setText("");

        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setText("");
    }
}
