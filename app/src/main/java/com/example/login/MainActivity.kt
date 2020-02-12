package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USUARIO_REGISTRADO = "geovanni"
    val PASS = "hola123"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar.setOnClickListener {

            val usuario = editTextUsuario.text.toString()
            val pass = editTextContraseña.text.toString()

            if(!cadenaVacia(usuario) and !cadenaVacia(pass)){
                if(verificarDatos(usuario, pass)){
                    mensaje("Bienvenido")
                }else{
                    mensaje("Datos incorrectos")
                }
            }else{
                mensaje("Datos vacíos")
            }
        }
    }

    fun verificarDatos(usuario:String, pass:String):Boolean{
        var resultado = false
        return usuario.equals(USUARIO_REGISTRADO) and pass.equals(PASS)
    }

    fun mensaje(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }

}
