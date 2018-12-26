package zhangman.github.snake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button startbutton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      startbutton=(Button)findViewById(R.id.start_btn);
      startbutton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent();
              intent.setClass(MainActivity.this,Main2Activity.class);
              startActivity(intent);
          }
      });
  }
}
