package a000webhostapp.sayoor.sayoormain;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 17-Jan-18.
 */

public class GeneralTools extends AppCompatActivity {

    public static boolean isNetworkConnected(Context c) {
        ConnectivityManager conManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conManager.getActiveNetworkInfo();

        return ( netInfo != null && netInfo.isConnected() );
    }
}
