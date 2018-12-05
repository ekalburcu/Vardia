package tr.com.vardia.vardia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnaEkran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }


   public void girisbuton (View view){

       Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
       startActivity(intent);

   }


   public void kayitbuton (View view){

       Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
       startActivity(intent);

   }


}
