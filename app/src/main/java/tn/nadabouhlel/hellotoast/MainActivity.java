package tn.nadabouhlel.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

class MainActivity extends AppCompatActivity {
    private int mcount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }
    public void showToast(View view) {
    Toast toast =Toast.makeText(this, R.string.hello_toast_msg, Toast.LENGTH_SHORT);
    toast.show();
    }

    public void countUp(View view) {
        mcount++;
        if (mShowCount !=null)
            mShowCount.setText(Integer.toString(mcount));
    }
}