package com.nutritime2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class register extends AppCompatActivity {


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            nome = nome;
        }

        public String getRG() {
            return RG;
        }

        public void setRG(String RG) {
            this.RG = RG;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String nome;
        public String RG;
        public String password;
        public String email;

    int cont =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        register[] mNutri =  new register[10];
        register[] mClientes =  new register[10];



    }

public void registrar(){




}

}
