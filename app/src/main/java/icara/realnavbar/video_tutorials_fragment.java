package icara.realnavbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Icara on 09/03/2015.
 */
public class video_tutorials_fragment extends Fragment {
    View rootVew;

    private ListView mListView;
    private String[] strListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootVew = inflater.inflate(R.layout.mtg_tutorials_list, container, false);
        mListView = (ListView) rootVew.findViewById(R.id.mtg_tut_list);
        strListView = getResources().getStringArray(R.array.mtg_tutorials);
        // Locating the List view and populating it with the contents of of the appropriate sting-array located in the values folder of the project
        // When An item from the list view is selected a new activity is called and dispalyed.
        ArrayAdapter<String> objAdapter = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_list_item_1, strListView);
        mListView.setAdapter(objAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getActivity(), youtube_tut1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getActivity(), youtube_tut2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getActivity(), youtube_tut3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getActivity(), youtube_tut4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getActivity(), youtube_tut5.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getActivity(), youtube_tut6.class);
                        startActivity(intent);
                        break;

                    default:

                }
            }
        });
        return rootVew;
    }
}
