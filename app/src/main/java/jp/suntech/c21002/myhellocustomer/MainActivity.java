package jp.suntech.c21002.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);

        HelloListener listener = new HelloListener();

        btClick.setOnClickListener(listener);

        Button adClear = findViewById(R.id.adClear);
        Button nmClear = findViewById(R.id.nmClear);
        adClear.setOnClickListener(listener);
        nmClear.setOnClickListener(listener);


    }
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.etAddress);
            TextView output = findViewById(R.id.tvOutput);
            EditText input2 = findViewById(R.id.etName);
            TextView output2 = findViewById(R.id.tvOutput);
            int id = view.getId();
            switch(id){
                case R.id.btClick:
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                output.setText(inputStr + "にお住まいの" +inputStr2 + "さん、こんにちは！");
                break;

                case R.id.adClear:
                    input.setText("");

                    output.setText("");
                    break;
                case R.id.nmClear:
                    input2.setText("");

                    output2.setText("");
                    break;
            }




        }






    }



}