package icara.realnavbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class starting_game extends ActionBarActivity {
    private ListView mListView;
    private String[] strListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_rules);
        mListView = (ListView) findViewById(R.id.ruleslv);
        strListView = getResources().getStringArray(R.array.starting_the_game);
        // Locating the List view and populating it with the contents of of the appropriate sting-array located in the values folder of the project

        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(starting_game.this, android.R.layout.simple_list_item_1, strListView);
        mListView.setAdapter(objAdapter);
    }

}