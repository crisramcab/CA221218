package apps.course.android.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//se declaran las variables que van a ser usadas para mostrar en el input
    private EditText user, password;
    private Button login;
    private Button register; //declaro una variable para hacer el cambio de actividad
    private  long backPressed;

    private String userTxt = "";
    private String passwordTxt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (Button) findViewById(R.id.register); //un find by id del objeto boton
        register.setOnClickListener(new View.OnClickListener() { //
            @Override
            public void onClick(View view) {
                openActivity2();//se crea una funcion

            }
        });


        init();

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }



    public void openActivity2(){ //esta es la funcion para abrir la otr actividad a traves del boton
        Intent intent = new Intent(this, register_view.class);
        startActivity(intent);
    }



    //se inicializan las variables

    private void init() {

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getDataFromView();

            }
        });

    }


    private void getDataFromView() {
        userTxt = user.getText().toString();
        passwordTxt = password.getText().toString();

        if(validateUserAndPassword(userTxt, passwordTxt)){
            Toast.makeText(this, "Hola " + userTxt + ", tu password es: " + passwordTxt, Toast.LENGTH_LONG).show();
        }
    }

    private boolean validateUserAndPassword(String userTxt, String passwordTxt) {
        if (passwordTxt.length() < 8) {
            Toast.makeText(this, "Tamaño del password incorrecto.", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }




    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
