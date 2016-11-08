package icara.realnavbar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class golden_rules extends ActionBarActivity {
    private ListView mListView;
    private String[] strListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_rules);
        mListView = (ListView) findViewById(R.id.ruleslv);
        strListView = getResources().getStringArray(R.array.golden_rules);

        // Locating the List view and populating it with the contents of of the appropriate sting-array located in the values folder of the project

        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(golden_rules.this, android.R.layout.simple_list_item_1, strListView);
        mListView.setAdapter(objAdapter);
    }

}

