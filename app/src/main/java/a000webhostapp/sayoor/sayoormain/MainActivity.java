package a000webhostapp.sayoor.sayoormain;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    // For Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu manu){
        getMenuInflater().inflate(R.menu.main, manu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.id_profile){
            // Write own logic
            Toast.makeText(getApplicationContext(), "Selected Profile", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.id_set){

            //Write own logic
            Toast.makeText(getApplicationContext(), "Selected id set?", Toast.LENGTH_SHORT).show();
            return true;
        }
        return  true;
    }
}
