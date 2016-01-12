package megaminds.findmedicine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import megaminds.findmedicine.search.SearchBarMediaActivity;

public class MainActivity extends AppCompatActivity {

    private Button abt,src;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        src = (Button) findViewById(R.id.src);
        src.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SearchBarMediaActivity.class);
                MainActivity.this.startActivity(intent);


            }

        });


        abt = (Button) findViewById(R.id.abt);

        abt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Aboutus.class);
                MainActivity.this.startActivity(intent);


            }

        });




    }
}
