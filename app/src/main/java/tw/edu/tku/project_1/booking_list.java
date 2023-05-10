package tw.edu.tku.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class booking_list extends AppCompatActivity {
    private Button mbutton1,mbutton2,mbutton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_list);
        mbutton1=findViewById(R.id.button3);
        mbutton2=findViewById(R.id.button9);
        mbutton3=findViewById(R.id.button5);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(booking_list.this, booking_listview.class);
                startActivity(intent1);
            }
        });
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(booking_list.this, booking_listview.class);
                startActivity(intent2);
            }
        });
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(booking_list.this, booking_listview.class);
                startActivity(intent3);
            }
        });
    }
    }

