package co.herovitamin.scrollingtechniques;

import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import co.herovitamin.scrollingtechniques.adapter.RecyclerViewAdapter;


public class Technique4Activity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    CollapsingToolbarLayout collapsing_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique4);

        toolbar = (Toolbar) findViewById(R.id.technique_four_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.days_list_4);
        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.days_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);
        collapsing_container.setTitle(getResources().getString(R.string.title_activity_technique4));
    }
}
