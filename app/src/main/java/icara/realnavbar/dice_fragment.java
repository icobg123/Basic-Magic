package icara.realnavbar;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.Random;


public class dice_fragment extends Fragment implements ViewSwitcher.ViewFactory {
    View rootVew;
    Random mRandom;
    TextSwitcher dieOutput;


    private int mLastNumber = -1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootVew = inflater.inflate(R.layout.dice, container, false);

        mRandom = new Random();
        dieOutput = (TextSwitcher) rootVew.findViewById(R.id.die_output);
        dieOutput.setInAnimation(AnimationUtils.loadAnimation(this.getActivity(), android.R.anim.slide_in_left));
        dieOutput.setOutAnimation(AnimationUtils.loadAnimation(this.getActivity(), android.R.anim.slide_out_right));
        dieOutput.setFactory(this);
        ImageView d2 = (ImageView) rootVew.findViewById(R.id.d2);
        ImageView d6 = (ImageView) rootVew.findViewById(R.id.d6);
        ImageView d20 = (ImageView) rootVew.findViewById(R.id.d20);


        if (d2 != null) {
            d2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    flipCoin();
                }
            });
        }
        if (d6 != null) {
            d6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    rollDie(6);
                }
            });
        }
        if (d20 != null) {
            d20.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    rollDie(20);
                }
            });
        }
        return rootVew;
    }

    void flipCoin() {
        if (dieOutput
                != null) {
            String output;
            switch (mRandom.nextInt(2)) {
                case 0:
                    output = getString(R.string.dice_heads);
                    break;
                default:
                    output = getString(R.string.dice_tails);
                    break;
            }
            dieOutput.setText(output);
        }
    }

    void rollDie(int dieFaces) {
        if (dieOutput != null) {
            dieOutput.setText("" + (mRandom.nextInt(dieFaces) + 1));
        }
    }

    public View makeView() {
        TextView view = new TextView(getActivity());
        view.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 80);
        view.setGravity(Gravity.CENTER);
        return view;
    }
}
