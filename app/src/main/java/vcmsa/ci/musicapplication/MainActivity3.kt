package vcmsa.ci.musicapplication

import android.icu.util.Output
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    private var textview3: TextView? = null
    private var textview4: TextView? = null
    private var textview5: TextView? = null
    private var textview6: TextView? = null
    private lateinit var avgbtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        textview3 = findViewById(R.id.textView3)
        textview4 = findViewById(R.id.textView4)
        textview5 = findViewById(R.id.textView5)
        textview6 = findViewById(R.id.textView6)
        avgbtn = findViewById(R.id.avgbtn)

        avgbtn.setOnClickListener {
            average(
                list = TODO()
            )
        }

    }

    private fun calculateAverage(numbers:list<Double>): {
        if (numbers.isEmpty()) return 0.0
        return numbers.size
    }

    private fun calculateAvrageFromInputs(vararg
    input: EditText): Double {
        val numbers = inputs.mapNotNull
    }
}