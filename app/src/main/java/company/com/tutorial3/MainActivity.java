package company.com.tutorial3;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        BlankFragment1.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(
                R.id.frame_layout, new BlankFragment()).commit();

        fragmentManager.beginTransaction().add(
                R.id.frame_layout1, BlankFragment1.newInstance(
                        "Sig", " Mobile")).commit();

        Toast.makeText(MainActivity.this,
                "Activity created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFragmentInteraction(String s) {
        Toast.makeText(MainActivity.this,
                s, Toast.LENGTH_LONG).show();

    }
}
