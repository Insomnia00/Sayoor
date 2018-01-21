package a000webhostapp.sayoor.sayoormain;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ryan on 17-Jan-18.
 * This class is specifically for static methods usage.
 */

public class GeneralTools extends AppCompatActivity {

    /**
     * Check whether current activity is connected to a wifi / mobile data. Does not check if internet is present.
     * @param c Current Activity context, can be called by the function getApplicationContext()
     * @return a boolean , true if network is connected else false.
     */
    public static boolean isNetworkConnected(Context c) {
        ConnectivityManager conManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conManager.getActiveNetworkInfo();
        return ( netInfo != null && netInfo.isConnected() );
    }
}
