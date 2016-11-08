package icara.realnavbar;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class successful_login extends Activity{


    //This activity is called only when a successful connection to the remote database has been established
    //and the entered credentials are coreect.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.successful_login);
    }
}
