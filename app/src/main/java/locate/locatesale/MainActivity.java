package locate.locatesale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSetting(View view)
    {
        Intent intent = new Intent(this, SettingActivity.class);
        intent.putExtra("key",value);
        this.startActivity(intent);

    }
}
