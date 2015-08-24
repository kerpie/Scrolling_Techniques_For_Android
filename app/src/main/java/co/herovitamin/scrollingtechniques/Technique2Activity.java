package co.herovitamin.scrollingtechniques;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import co.herovitamin.scrollingtechniques.adapter.RecyclerViewAdapter;

public class Technique2Activity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique2);

        toolbar = (Toolbar) findViewById(R.id.technique_two_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.days_list_2);
        tab_layout = (TabLayout) findViewById(R.id.tabs);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.days_names));
        planets_list.setAdapter(adapter);

        //Try this for scrollable tabs, like in Google Play Store
//        tab_layout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        for(int i=0; i<10; i++)
//            tab_layout.addTab(tab_layout.newTab().setText("Tab " + (i + 1)));

        //Try this implementation for fixed tabs
        tab_layout.setTabMode(TabLayout.MODE_FIXED);
        tab_layout.addTab(tab_layout.newTab().setText("Tab 1"));
        tab_layout.addTab(tab_layout.newTab().setText("Tab 2"));
        tab_layout.addTab(tab_layout.newTab().setText("Tab 3"));


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_technique2);
    }

}