package a000webhostapp.sayoor.sayoormain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import a000webhostapp.sayoor.sayoormain.dummy.DummyContent;

public class SettingsActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener, PlusOneFragment.OnFragmentInteractionListener, ShopFragment.OnFragmentInteractionListener {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent obj = new Intent(SettingsActivity.this, HomeActivity.class);
                    startActivity(obj);
                    return true;
                case R.id.navigation_cart:
                    return true;
                case R.id.navigation_settings:
                    return true;
                case R.id.navigation_account:
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mTextMessage = (TextView) findViewById(R.id.message);
        mTextMessage.setText("");
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_settings);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
