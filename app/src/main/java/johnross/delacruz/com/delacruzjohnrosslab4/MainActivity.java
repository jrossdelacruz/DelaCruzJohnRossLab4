package johnross.delacruz.com.delacruzjohnrosslab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button backButton, nextButton;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LIFECYCLE", "Lab4 app was opened");

        backButton = (Button) findViewById(R.id.buttonToast);
        nextButton = (Button) findViewById(R.id.buttonSnackbar);

        backButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "YEET", Toast.LENGTH_SHORT).show();

                Log.d("LIFECYCLE", "BACK button was pressed");
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "No more layouts.", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

                Log.d("LIFECYCLE", "NEXT button was pressed");
            }

        });
    }
}