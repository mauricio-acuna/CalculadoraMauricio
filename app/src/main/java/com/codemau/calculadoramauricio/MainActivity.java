package com.codemau.calculadoramauricio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tvResultado;

    double numero = 0.0;
    double numero1 = 0.0;
    double numero2 = 0.0;

    double result = 0.0;

    char operacion = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
    }

    public void escribirOcho(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void escribirNueve(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void escribirSiete(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void escribirSeis(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void escribirCinco(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void escribirCuatro(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void escribirTres(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void escribirDos(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void escribirUno(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void escribirCero(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void escribirPunto(View view) {

        numero = Double.parseDouble(tvResultado.getText().toString());
        if(numero == 0.0 ){
            tvResultado.setText(".");
        }else{
            tvResultado.setText(tvResultado.getText() + ".");
        }
    }

    public void escribirAC(View view) {

        numero = 0.0;
        numero1 = 0.0;
        numero2 = 0.0;
        operacion = ' ';
        tvResultado.setText("0.0");

    }

    public void escribirResultado(View view) {

        numero2 = Double.parseDouble(tvResultado.getText().toString());
        if(operacion == '/'){
            if(numero2 == 0.0 ){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACIÒN NO VÁLIDA ", Toast.LENGTH_SHORT).show();
            }    else{
                result = numero1 / numero2;
                tvResultado.setText(result+"");
            }
        }

        if(operacion == 'X'){
            if(numero2 == 0.0 ){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACIÒN NO VÁLIDA ", Toast.LENGTH_SHORT).show();
            }    else{
                result = numero1 * numero2;
                tvResultado.setText(result+"");
            }
        }

        if(operacion == '+'){
            if(numero2 == 0.0 ){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACIÒN NO VÁLIDA ", Toast.LENGTH_SHORT).show();
            }    else{
                result = numero1 + numero2;
                tvResultado.setText(result+"");
            }
        }

        if(operacion == '-'){
            if(numero2 == 0.0 ){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACIÒN NO VÁLIDA ", Toast.LENGTH_SHORT).show();
            }    else{
                result = numero1 - numero2;
                tvResultado.setText(result+"");
            }
        }

    }

    public void operacionDividir(View view) {
        numero1 = Double.parseDouble(tvResultado.getText().toString());
        operacion = '/';
        tvResultado.setText("0");
    }

    public void operacionMultiplicar(View view) {
        numero1 = Double.parseDouble(tvResultado.getText().toString());
        operacion = 'X';
        tvResultado.setText("0");
    }

    public void operacionRestar(View view) {
        numero1 = Double.parseDouble(tvResultado.getText().toString());
        operacion = '-';
        tvResultado.setText("0");
    }

    public void operacionSumar(View view) {
        numero1 = Double.parseDouble(tvResultado.getText().toString());
        operacion = '+';
        tvResultado.setText("0");
    }


    public void escribirCambioSigno(View view) {
        numero = Double.parseDouble(tvResultado.getText().toString());
        numero = numero * -1;
        tvResultado.setText(numero+"");
    }
}