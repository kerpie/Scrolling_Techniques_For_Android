package co.herovitamin.scrollingtechniques;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import co.herovitamin.scrollingtechniques.adapter.RecyclerViewAdapter;


public class Technique5Activity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    CollapsingToolbarLayout collapsing_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique5);

        toolbar = (Toolbar) findViewById(R.id.technique_five_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.days_list_5);
        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.days_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);

        TextView text = new TextView(this);
        text.setText(R.string.title_activity_technique5);
        text.setTextAppearance(this, android.R.style.TextAppearance_Material_Widget_ActionBar_Title_Inverse);

        toolbar.addView(text);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
