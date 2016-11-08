package icara.realnavbar;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Icara on 09/03/2015.
 */
public class life_coutner_fragment extends Fragment implements View.OnClickListener {
    View rootVew;
    Button add1p1;
    Button add5p1;
    Button sub1p1;
    Button sub5p1;
    Button add1p2;
    Button add5p2;
    Button sub1p2;
    Button sub5p2;
    Button reset;
    TextView textTitle;
    EditText player1Lifetxt;
    EditText player2Lifetxt;
    int player1Life = 20;
    int player2Life = 20;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootVew = inflater.inflate(R.layout.life_counter, container, false);

        assert rootVew != null;
        add1p1 = (Button) rootVew.findViewById(R.id.add1P1Button);
        add5p1 = (Button) rootVew.findViewById(R.id.add5p1Button);
        add1p2 = (Button) rootVew.findViewById(R.id.add1p2Button);
        add5p2 = (Button) rootVew.findViewById(R.id.add5p2Button);
        sub1p1 = (Button) rootVew.findViewById(R.id.sub1p1Button);
        sub5p1 = (Button) rootVew.findViewById(R.id.sub5p1Button);
        sub1p2 = (Button) rootVew.findViewById(R.id.sub1p2Button);
        sub5p2 = (Button) rootVew.findViewById(R.id.sub5p2Button);
        reset = (Button) rootVew.findViewById(R.id.resetButton);
        player1Lifetxt = (EditText) rootVew.findViewById(R.id.player1Text);
        player2Lifetxt = (EditText) rootVew.findViewById(R.id.player2Text);
        textTitle = (TextView) rootVew.findViewById(R.id.player1);

        //---set on click listeners on the buttons-----
        add1p1.setOnClickListener(this);
        add5p1.setOnClickListener(this);
        add1p2.setOnClickListener(this);
        add5p2.setOnClickListener(this);
        sub1p1.setOnClickListener(this);
        sub5p1.setOnClickListener(this);
        sub1p2.setOnClickListener(this);
        sub5p2.setOnClickListener(this);
        reset.setOnClickListener(this);

        return rootVew;

    }
    //change the life totals of each player by the appropriate amount when a button is pressed
    //When a player loses life their life total becomes red, when they gain life its becomes green
    @Override
    public void onClick(View v) {
        if (v == add1p1) {
            player1Life++;
            player1Lifetxt.setText(Integer.toString(player1Life));
            player1Lifetxt.setBackgroundColor(Color.GREEN);
        }
        if (v == add1p2) {
            player2Life++;
            player2Lifetxt.setText(Integer.toString(player2Life));
            player2Lifetxt.setBackgroundColor(Color.GREEN);
        }
        if (v == add5p1) {
            player1Life = player1Life + 5;
            player1Lifetxt.setText(Integer.toString(player1Life));
            player1Lifetxt.setBackgroundColor(Color.GREEN);
        }
        if (v == add5p2) {
            player2Life = player2Life + 5;
            player2Lifetxt.setText(Integer.toString(player2Life));
            player2Lifetxt.setBackgroundColor(Color.GREEN);
        }
        if (v == sub1p1) {
            player1Life--;
            player1Lifetxt.setText(Integer.toString(player1Life));
            player1Lifetxt.setBackgroundColor(Color.RED);
        }
        if (v == sub1p2) {
            player2Life--;
            player2Lifetxt.setText(Integer.toString(player2Life));
            player2Lifetxt.setBackgroundColor(Color.RED);
        }
        if (v == sub5p1) {
            player1Life = player1Life - 5;
            player1Lifetxt.setText(Integer.toString(player1Life));
            player1Lifetxt.setBackgroundColor(Color.RED);
        }
        if (v == sub5p2) {
            player2Life = player2Life - 5;
            player2Lifetxt.setText(Integer.toString(player2Life));
            player2Lifetxt.setBackgroundColor(Color.RED);
        }

        //reset the life totals to 20 and the background to white
        if (v == reset) {
            player1Life = 20;
            player2Life = 20;
            player1Lifetxt.setText(Integer.toString(player1Life));
            player2Lifetxt.setText(Integer.toString(player2Life));
            player1Lifetxt.setBackgroundColor(Color.WHITE);
            player2Lifetxt.setBackgroundColor(Color.WHITE);
        }
    }
}
