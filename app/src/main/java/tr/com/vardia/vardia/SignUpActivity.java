package tr.com.vardia.vardia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUpActivity extends AppCompatActivity {

    EditText usernameText, passwordText, emailText, phoneText, nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);


        usernameText = findViewById(R.id.SignUp_Ac_UnameText);
        passwordText = findViewById(R.id.SignUp_Ac_PasText);
        emailText = findViewById(R.id.SignUp_Ac_MailText);
        phoneText = findViewById(R.id.SignUp_Ac_PhoneText);
        nameText = findViewById(R.id.SignUp_Ac_NameText);


    }




    public void signUp (View view){

        ParseUser kullanici = new ParseUser();
        kullanici.setUsername(usernameText.getText().toString());
        kullanici.setPassword(passwordText.getText().toString());
        kullanici.setEmail(emailText.getText().toString());
        kullanici.put("Adi_",nameText.getText().toString());
        kullanici.put("Telefon",phoneText.getText().toString());


        kullanici.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Kayıt Başarılı!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
                    startActivity(intent);
                }
            }
        });



    }


}
