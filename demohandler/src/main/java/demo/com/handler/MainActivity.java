package demo.com.handler;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressbar_id);
        button = (Button) findViewById(R.id.button_id);


        class ButtonListener implements View.OnClickListener{


            @Override
            public void onClick(View view) {
                    progressBar.setVisibility(View.VISIBLE);

            }
        }


         final Handler updateHandler=new Handler(){

            @Override
            public void handleMessage(Message msg) {


                super.handleMessage(msg);
            }
        };



        Runnable updateThread=new Runnable() {
            @Override
            public void run() {





            }
        };

    }
}
