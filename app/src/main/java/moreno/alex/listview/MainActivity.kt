package moreno.alex.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val opciones = arrayOf("Botones", "Imagenes", "WebView", "Switch")
       val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones)

        myListView.adapter = adaptador

        myListView.setOnItemClickListener { adapterView, view, i, l ->
            //Toast.makeText(this,"$i", Toast.LENGTH_SHORT).show()
            var intent = Intent()
            when(i){
                0 -> intent = Intent(this, botones::class.java)
                1 -> intent = Intent(this, imagenes::class.java)
                2 -> intent = Intent(this, webview::class.java)
                3 -> intent = Intent(this, switch::class.java)
            }
            startActivity(intent)
        }

    }
}
