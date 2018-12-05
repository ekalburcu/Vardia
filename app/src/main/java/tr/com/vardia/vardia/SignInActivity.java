package tr.com.vardia.vardia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class SignInActivity extends AppCompatActivity {

    EditText usernameText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        usernameText = findViewById(R.id.SignUp_Ac_UnameText);
        passwordText = findViewById(R.id.SignUp_Ac_PasText);
    }


    public void signIn (View view){


        ParseUser.logInInBackground(usernameText.getText().toString(), passwordText.getText().toString(), new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Hoşgeldin: "+user.getUsername(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),LocationsActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
