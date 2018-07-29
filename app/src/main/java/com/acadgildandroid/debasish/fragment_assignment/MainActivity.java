package com.acadgildandroid.debasish.fragment_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private EditText nameTxt;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        //INITIALIZE VIEWS
        nameTxt = (EditText) findViewById(R.id.nameEditTxt);
        submitBtn=(Button)findViewById(R.id.btn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }
    /*
    SEND DATA TO FRAGMENT
     */
    private void sendData() {
        //PACK DATA IN A BUNDLE
        Bundle bundle = new Bundle();
        bundle.putString("VALUE_KEY", nameTxt.getText().toString());


        //PASS OVER THE BUNDLE TO OUR FRAGMENT
        SimpleAdditionFragment myFragment = new SimpleAdditionFragment();
        myFragment.setArguments(bundle);

        nameTxt.setText("");

        //THEN NOW SHOW OUR FRAGMENT
        getSupportFragmentManager().beginTransaction().replace(R.id.container,myFragment).commit();
    }

}
