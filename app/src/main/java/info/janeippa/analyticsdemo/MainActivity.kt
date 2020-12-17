package info.janeippa.analyticsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.logEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val sendEventHelper by lazy { SendEventHelper(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        initLayout()
    }

    private fun initLayout() {
        initClick()
    }

    private fun initClick() {
        button0.setOnClickListener {
            sendEventHelper.sendSignUpEvent("mail")
        }
        button1.setOnClickListener {
            sendEventHelper.sendLoginEvent("twitter")
        }
        button2.setOnClickListener {
            sendEventHelper.sendShareEvent("Twitter")
        }
        button3.setOnClickListener {
            sendEventHelper.sendShareEvent("Facebook")
        }
        button4.setOnClickListener {
            sendEventHelper.sendShareEvent("Instagram")
        }
        button5.setOnClickListener {
            sendEventHelper.sendSelectItem(1, "live", "text")
        }
        button6.setOnClickListener {
            sendEventHelper.sendSelectItem(2, "archive", "image")
        }
        button7.setOnClickListener {
            sendEventHelper.sendClickEvent("Logout")
        }
        button8.setOnClickListener {
            sendEventHelper.sendDefaultEvent(Bundle().apply {
                putString("level_name", "Caverns01")
                putInt("level_difficulty", 4)
            })
        }
    }
}