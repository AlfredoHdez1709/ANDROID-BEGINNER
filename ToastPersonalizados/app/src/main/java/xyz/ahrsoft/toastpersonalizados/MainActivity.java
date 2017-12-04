package xyz.ahrsoft.toastpersonalizados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btntoast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View toast = MainActivity.this.getLayoutInflater().inflate(R.layout.toastperso, null);

                Toast a = new Toast(getApplicationContext());
                a.setView(toast);
                a.setDuration(Toast.LENGTH_LONG);
                a.show();
            }
        });

    }
}
