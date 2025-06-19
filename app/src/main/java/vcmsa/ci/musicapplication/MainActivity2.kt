package vcmsa.ci.musicapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var addbtn: Button
    private lateinit var ratebtn: Button
    private lateinit var exitbtn: Button
    private lateinit var textView2: TextView

    private var editTextText: EditText? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        textView = findViewById(R.id.textView)
        addbtn = findViewById(R.id.addbtn)
        ratebtn = findViewById(R.id.ratebtn)
        exitbtn = findViewById(R.id.exitbtn)
        textView2 = findViewById(R.id.textview2)
        editTextText = findViewById(R.id.editTextText)

        textView2.isEnabled = false
        textView.isEnabled = false



       addbtn.setOnClickListener {
           addToPlayList()
       }
        ratebtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        exitbtn.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }


    }

    private fun addToPlayList() {
        TODO("Not yet implemented")
    }

    private fun addToPlaylist() {
        textView2.isEnabled = true
    }


}