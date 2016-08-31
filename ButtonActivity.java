package io.nantels.demo.nantels;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/8/24.
 */

public class ButtonActivity extends Activity {
    Button[] btn = new Button[5];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_list);
        btn[0] = (Button) findViewById(R.id.button1);
        btn[1] = (Button) findViewById(R.id.button2);
        btn[2] = (Button) findViewById(R.id.button3);
        btn[3] = (Button) findViewById(R.id.button4);
        btn[4] = (Button) findViewById(R.id.button5);
        myButton();
    }
    public void myButton(){
        for (int i = 0;i<3;i++){
            btn[i].setVisibility(View.VISIBLE);
        }

    }
}
