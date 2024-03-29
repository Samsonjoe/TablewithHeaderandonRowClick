package com.example.tablewithheaderandonrowclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
 private boolean table_flg = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void collapseTable(View view){
        TableLayout table = findViewById(R.id.table);
        Button switch1= findViewById(R.id.switchbutton);

        //setColumnscollapsed(int columnIndex, boolean isCollapsed)
        table.setColumnCollapsed(1,table_flg);
        table.setColumnCollapsed(2,table_flg);
        table.setColumnCollapsed(3,table_flg);

        if(table_flg){
            //close
            table_flg = false;
            switch1.setText("Show Details");
        }else{
            table_flg = true;
            switch1.setText("Hide Details");
        }
    }
}
