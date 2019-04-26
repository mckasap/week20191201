package org.kasapbasi.week20191201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.actionbar_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

Button btn;
    public boolean onOptionsItemSelected(MenuItem item) {


      switch (item.getItemId())
      {
          case R.id.Help:
              Toast.makeText(getApplicationContext()," HELP CLICK",Toast.LENGTH_LONG).show(); break;
          case R.id.Settting:    Toast.makeText(getApplicationContext()," SETTİNGS CLICK",Toast.LENGTH_LONG).show();

              setContentView(R.layout.newlayout);
              btn=(Button) findViewById(R.id.button);
              btn.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                      Toast.makeText(getApplicationContext()," Button CLICK",Toast.LENGTH_LONG).show();
                  }
              });

          break;
          case R.id.item1 :   Toast.makeText(getApplicationContext()," ITEM1 CLICK",Toast.LENGTH_LONG).show(); break;
          case R.id.item2 :     Toast.makeText(getApplicationContext()," ITEM2 CLICK",Toast.LENGTH_LONG).show(); break;
          default:

      }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
