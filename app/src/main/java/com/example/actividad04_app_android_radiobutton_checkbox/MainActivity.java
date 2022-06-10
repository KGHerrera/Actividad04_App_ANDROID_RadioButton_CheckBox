package com.example.actividad04_app_android_radiobutton_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioDecimal, radioBinario, radioOctal, radioHexadecimal;
    EditText cajaNumero, cajaBinario, cajaOctal, cajaHexadecimal;
    CheckBox checkBinario, checkOctal, checkHexadecimal;

    ConversorNumeros c1 = new ConversorNumeros();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioDecimal = findViewById(R.id.radio_decimal);
        radioBinario = findViewById(R.id.radio_binario);
        radioOctal = findViewById(R.id.radio_octal);
        radioHexadecimal = findViewById(R.id.radio_hexadecimal);

        cajaNumero = findViewById(R.id.caja_numero);
        cajaBinario = findViewById(R.id.caja_binario);
        cajaOctal = findViewById(R.id.caja_octal);
        cajaHexadecimal = findViewById(R.id.caja_hexadecimal);

        checkBinario = findViewById(R.id.check_binario);
        checkOctal = findViewById(R.id.check_octal);
        checkHexadecimal = findViewById(R.id.check_hexadecimal);
    }

    public void cambiarNombreCajas(View v){
        boolean seleccion = ((RadioButton)v).isChecked();

        switch (v.getId()){
            case R.id.radio_decimal:
                checkBinario.setText("binario");
                checkOctal.setText("octal");
                checkHexadecimal.setText("hexadecimal");
                break;

            case R.id.radio_binario:
                checkBinario.setText("decimal");
                checkOctal.setText("octal");
                checkHexadecimal.setText("hexadecimal");
                break;

            case R.id.radio_octal:
                checkBinario.setText("binario");
                checkOctal.setText("decimal");
                checkHexadecimal.setText("hexadecimal");

                break;

            case R.id.radio_hexadecimal:
                checkBinario.setText("binario");
                checkOctal.setText("octal");
                checkHexadecimal.setText("decimal");
                break;
        }

    }

    public void vaciarCaja(View v){
        boolean seleccion = ((CheckBox)v).isChecked();

        switch (v.getId()){
            case R.id.check_binario: if(!seleccion) cajaBinario.setText(""); break;
            case R.id.check_octal: if(!seleccion) cajaOctal.setText(""); break;
            case R.id.check_hexadecimal: if(!seleccion) cajaHexadecimal.setText(""); break;
        }

    }

    public void obtenerResultado(View v){

        if (radioDecimal.isChecked()){

            if(checkBinario.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaBinario.setText(c1.decimalBinario(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkOctal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaOctal.setText(c1.decimalAOctal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkHexadecimal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaHexadecimal.setText(c1.decimalHexadecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }
            }

        } else if(radioBinario.isChecked()){

            if(checkBinario.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaBinario.setText(c1.binarioDecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkOctal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaOctal.setText(c1.binarioOctal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkHexadecimal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaHexadecimal.setText(c1.binarioHexadecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }
            }

        } else if(radioOctal.isChecked()){

            if(checkBinario.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaBinario.setText(c1.octalBinario(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkOctal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaOctal.setText(c1.octalDecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkHexadecimal.isChecked()){
                try{
                    int numero = Integer.parseInt(cajaNumero.getText().toString());
                    cajaHexadecimal.setText(c1.octalHexadecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }
            }

        } else if(radioHexadecimal.isChecked()){

            if(checkBinario.isChecked()){
                try{
                    String numero = cajaNumero.getText().toString();
                    cajaBinario.setText(c1.hexadecimalBinario(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkOctal.isChecked()){
                try{
                    String numero = cajaNumero.getText().toString();
                    cajaOctal.setText(c1.hexadecimalOctal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }

            }

            if(checkHexadecimal.isChecked()){
                try{
                    String numero = cajaNumero.getText().toString();
                    cajaHexadecimal.setText(c1.hexadecimalDecimal(numero));

                } catch (Exception e){
                    Toast.makeText(getBaseContext(), "error de dato", Toast.LENGTH_LONG).show();
                }
            }

        } else{
            Toast.makeText(getBaseContext(), "selecciona un radio", Toast.LENGTH_LONG).show();
        }
    }
}

class ConversorNumeros {

    public String decimalBinario(int decimal){
        return Integer.toBinaryString(decimal);
    }

    public String decimalAOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public String decimalHexadecimal(int decimal){
        return Integer.toHexString(decimal);
    }

    public String binarioDecimal(int binario){
        String stringBinario = String.valueOf(binario);
        int decimal = Integer.parseInt(stringBinario,2);
        return String.valueOf(decimal);
    }

    public String binarioOctal(int binario){
        String stringBinario = String.valueOf(binario);
        int decimal = Integer.parseInt(stringBinario,2);
        return Integer.toOctalString(decimal);
    }

    public String binarioHexadecimal(int binario){
        String stringBinario = String.valueOf(binario);
        int decimal = Integer.parseInt(stringBinario,2);
        return Integer.toHexString(decimal);
    }

    public String octalDecimal(int octal){
        String stringOctal = String.valueOf(octal);
        int decimal = Integer.parseInt(stringOctal,8);
        return String.valueOf(decimal);
    }

    public String octalBinario(int octal){
        String stringOctal = String.valueOf(octal);
        int decimal = Integer.parseInt(stringOctal,8);

        return Integer.toBinaryString(decimal);
    }

    public String octalHexadecimal(int octal){
        String stringOctal = String.valueOf(octal);
        int decimal = Integer.parseInt(stringOctal,8);
        return Integer.toHexString(decimal);
    }

    public String hexadecimalDecimal(String hex){
        int decimal = Integer.parseInt(hex,16);
        return String.valueOf(decimal);
    }

    public String hexadecimalBinario(String hex){
        int decimal = Integer.parseInt(hex,16);
        return Integer.toBinaryString(decimal);
    }

    public String hexadecimalOctal(String hex){
        int decimal = Integer.parseInt(hex,16);
        return Integer.toOctalString(decimal);
    }
}