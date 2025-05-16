package com.example.assigntwo

import android.app.ApplicationExitInfo
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class ScoreScreen : AppCompatActivity() {

    lateinit var scoreText: Text
    lateinit var reviewButton: Button
    lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screen)

        scoreText = findViewById(R.id.totlscorvw)
        reviewButton = findViewById(R.id.rvwbtn)
        exitButton = findViewById(R.id.extbtn)

        reviewButton.setOnClickListener {
            scoreText.replaceWholeText("Question1 - Before colonization, South Africa was home to various indigenous groups like the Khoisan,Nguni and Sotho people?" +
                    "Answer - True"+
                "Question2 - Obama was the second black president of the U.S?"+
                    "Answer - False"+
                "Question3 - World War II ended in 1945?"+
                    "True"+
                "Question4- The Roman Empire was located in South America."+
                    "False"+
                "Question5-  South African Freedom Charter was a landmark document adopted in 1955?"+
                 "True")
        }


        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}