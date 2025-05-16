package com.example.assigntwo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.color.utilities.Score.score
import org.w3c.dom.Text
import kotlin.system.exitProcess


private fun ScoreScreenn.calculateTotalScore(): TextView {
    TODO("Not yet implemented")
}

class ScoreScreenn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screenn)

        lateinit var totalscoreText: TextView
        var reviewText: TextView
        lateinit var reviewButton: Button
        lateinit var exitButton: Button


            totalscoreText = findViewById(R.id.toalscorevw)
            reviewText = findViewById(R.id.revwtext)
            reviewButton = findViewById(R.id.reviewbtn)
            exitButton = findViewById(R.id.exitbtn)

        val totalScore = intent.getIntExtra("TOTAL_SCORE", 0)
        totalscoreText.text = "Your total score is: $totalScore"



        exitButton.setOnClickListener {
            finish()

        }
            reviewButton.setOnClickListener {
                reviewText.text = """Question1 - Before colonization, South Africa was home to various indigenous groups like the Khoisan,Nguni and Sotho people?
                        "Answer - True"

                        "Question2 - Obama was the second black president of the U.S?"
                        "Answer - False

                        "Question3 - World War II ended in 1945?
                        "Answer - True

                        "Question4 - The Roman Empire was located in South America?
                        "Answer - False

                        "Question5 -  South African Freedom Charter was a landmark document adopted in 1955?
                        "Answer True""".trimIndent()

        }
    }
}