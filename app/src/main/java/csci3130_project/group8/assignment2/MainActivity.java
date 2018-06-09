package csci3130_project.group8.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         final  EditText pass = findViewById(R.id.pass);
         Button button = findViewById(R.id.button);
        final TextView output = findViewById(R.id.Output);
        final Validator validator = new Validator();
         button.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 String s = pass.getText().toString();
                 boolean b = validator.validate(s);
                 if(b)
                     output.setText("Strong");
                 else
                     output.setText("Not strong!");
             }
         });
    }
}
