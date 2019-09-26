package moreno.alex.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_activity4.*


class webview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity4)

        //Enlazar
        webview1.settings.javaScriptEnabled
        webview1.loadUrl("https://androidstudiofaqs.com/")

    }
}
