package com.example.learnkotlin.firstapp
/*una App se compone de 2 partes, la visual (XML) y la logica, y ambos unidas son una activity, en una mostramos
lo que ve el user y la otra los que hara el elemnto al interactuar ocn el user
*/
//para import algo, lo importamos con la teclas( Alt + Enter)
//la ruta donde se entuenca los visual (XML), es en la file RES > layout>...

/*COLORES podemos crear nuestra propia paleta de colores y renomabrar cada color, solo tenemos qie ir a la ruta
Res > values > colors.xml
*/

//cambiar el COLOR DE SVG O ICONO agragamos el atributo... android:tint="@color/black"
// colocar una texto en mayuscula todas las letras usar... android:textAllCaps="true"

//podemos crear nuestro propia variables String solo vamos a la ruta.. Res> values > string.xml



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.learnkotlin.R


class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        //creamos una variable y enganchamos el archivo Activity con el boton
        //val btnStart = findViewById<XXXXXXXXXXXXX>(R.id.XXXXXXX)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {
            //aqui guardamos el texto escrito desde la app
            val texto = etName.text.toString()

            //si no esta vacio muestra lo escrito y si esta vacio no muestres nada
            if (texto.isNotEmpty()) {
                //log.i reemplaza al println
                //Log.i("yorvis", "boton clickOn $texto")

                //intent sirven para navegar y pasara pasar informacion
                //en este linea estamos navegando a la pantalla resultactivity
                val intent = Intent(this, ResultActivity::class.java)

                /*aqui estamos pasanso o lanzando la informacion escrita a otra pantalla, debemos escribir
                 como uan clave de identificacion (EXTRA_NAME), PUEDE SER LO QUE QUERAMOS y luego lo que querems pasar (texto)
                 */
                intent.putExtra("EXTRA_TEXTO", texto)
                startActivity(intent)
            }
        }


    }
}