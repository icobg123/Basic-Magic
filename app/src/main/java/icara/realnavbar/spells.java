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


public class spells  extends ActionBarActivity {
    private ListView mListView;
    private String[] strListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_concepts);
        mListView = (ListView)findViewById(R.id.ruleslv);
        strListView = getResources().getStringArray(R.array.spells);
        // Locating the List view and populating it with the contents of of the appropriate sting-array located in the values folder of the project
        // When An item from the list view is selected a new activity is called and dispalyed.
        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(spells.this, android.R.layout.simple_list_item_1, strListView);
        mListView.setAdapter(objAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(spells.this, general_rules.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(spells.this, golden_rules.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(spells.this, player_rules.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(spells.this, starting_game.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(spells.this, ending_game.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(spells.this, colors.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(spells.this, mana.class);
                        startActivity(intent);
                        break;
                    default:
                }
            }
        });
    }
}