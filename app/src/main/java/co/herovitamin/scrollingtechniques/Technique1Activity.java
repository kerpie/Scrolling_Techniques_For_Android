package co.herovitamin.scrollingtechniques;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import co.herovitamin.scrollingtechniques.adapter.RecyclerViewAdapter;


public class Technique1Activity extends AppCompatActivity{

    Toolbar toolbar;
    RecyclerView days_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique1);

        toolbar = (Toolbar) findViewById(R.id.technique_one_toolbar);
        days_list = (RecyclerView) findViewById(R.id.days_list_1);

        days_list.setLayoutManager(new LinearLayoutManager(this));
        days_list.setAdapter(new RecyclerViewAdapter(
                getResources().getStringArray(R.array.days_names)
        ));

        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.title_activity_technique1);
    }

}