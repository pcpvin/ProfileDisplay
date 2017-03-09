package f22.f22assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.card1,R.id.card2,R.id.card3,R.id.linear1,R.id.linear2,R.id.linear3,R.id.linear4,R.id.settings_button,R.id.tab1,R.id.tab2,R.id.tab3,R.id.tab4,R.id.tab5})
     public void onClick(View view)
    {
        switch (view.getId())

        {
            case R.id.card1:
                Toast.makeText(this, "You just clicked card 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.card2:
                Toast.makeText(this, "You just clicked card 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.card3:
                Toast.makeText(this, "You just clicked card 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linear1:
                Toast.makeText(this, "You just clicked linear layout 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linear2:
                Toast.makeText(this, "You just clicked linear layout 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linear3:
                Toast.makeText(this, "You just clicked linear layout 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linear4:
                Toast.makeText(this, "You just clicked linear layout 4", Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings_button:
                Toast.makeText(this, "Voila, You clicked on settings button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab1:
                Intent intent=new Intent(getApplicationContext(),TabActivity.class);
                intent.putExtra("sample_text","Tab 1");
                startActivity(intent);
                break;
            case R.id.tab2:
                Intent intent1=new Intent(getApplicationContext(),TabActivity.class);
                intent1.putExtra("sample_text","Tab 2");
                startActivity(intent1);
                break;
            case R.id.tab3:
                Intent intent2=new Intent(getApplicationContext(),TabActivity.class);
                intent2.putExtra("sample_text","Tab 3");
                startActivity(intent2);
                break;
            case R.id.tab4:
                Intent intent3=new Intent(getApplicationContext(),TabActivity.class);
                intent3.putExtra("sample_text","Tab 4");
                startActivity(intent3);
                break;
            case R.id.tab5:
                Intent intent4=new Intent(getApplicationContext(),TabActivity.class);
                intent4.putExtra("sample_text","Tab 5");
                startActivity(intent4);
                break;

        }

    }
}
