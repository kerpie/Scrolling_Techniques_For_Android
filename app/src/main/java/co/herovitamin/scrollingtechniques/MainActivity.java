package co.herovitamin.scrollingtechniques;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar main_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(main_toolbar);

    }

    public void on_click(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn_technique_one:
                intent = new Intent(this, Technique1Activity.class);
                break;
            case R.id.btn_technique_two:
                intent = new Intent(this, Technique2Activity.class);
                break;
            case R.id.btn_technique_three:
                intent = new Intent(this, Technique3Activity.class);
                break;
            case R.id.btn_technique_four:
                intent = new Intent(this, Technique4Activity.class);
                break;
            case R.id.btn_technique_five:
                intent = new Intent(this, Technique5Activity.class);
                break;
            default:
                intent = new Intent(this, InitialActivity.class);
                break;
        }
        startActivity(intent);
    }

}
