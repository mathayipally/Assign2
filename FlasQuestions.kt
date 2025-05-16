package com.example.assigntwo

import android.content.Intent
import android.icu.text.AlphabeticIndex
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.reflect.Array
import java.util.Arrays


class FlasQuestions : AppCompatActivity() {

//Variables declared
    lateinit var questionText: TextView
    lateinit var answerText: TextView
    lateinit var scoreText: TextView
    lateinit var trueButton: Button
    lateinit var falseButton: Button
    lateinit var nextQuestion: Button

//array of questions
    val questions = arrayOf(
        "Question1 - Before colonization, South Africa was home to various indigenous groups like the Khoisan,Nguni and Sotho people?",
        "Question2 - Obama was the second black president of the U.S?",
        "Question3 - World War II ended in 1945?",
        "Question4- The Roman Empire was located in South America.",
        "Question5-  South African Freedom Charter was a landmark document adopted in 1955?"
    )

//boolean array answers
    val answers = booleanArrayOf(
        true,
        false,
        true,
        false,
        true
    )
//array index
    var score = 0
    var currentQuestionIndex = 0

    var answered = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flas_questions)

        //Attribute IDs
        questionText = findViewById(R.id.textquest)
        answerText = findViewById(R.id.txtanswr)
        scoreText = findViewById(R.id.textscor)
        trueButton = findViewById(R.id.btntru)
        falseButton = findViewById(R.id.btnfls)
        nextQuestion = findViewById(R.id.btnnxt)

//Question and score textview functionalities created
        questionText.text = questions[currentQuestionIndex]
        scoreText.text = "Score: $score"

//true button function enabled to check user answer
        trueButton.setOnClickListener {
           checkAnswer(true)
        }

// false button function enabled to check user answer
        falseButton.setOnClickListener {
            checkAnswer(false)
        }

  //next question button is enabled to display question index and user score
        nextQuestion.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                questionText.text = questions[currentQuestionIndex]
                questionText.isEnabled = false

            } else {
                // The end of the quiz handle enabled
                questionText.text = "You have reached the end of the Quiz! Your earned score is: $score"
                trueButton.isEnabled = false
                falseButton.isEnabled = false
                nextQuestion.isEnabled = false
            }
        val intent1= Intent (this, ScoreScreenn::class.java)
            startActivity(intent1)
        }
    }
    //checking if user Answer is correct or in correct
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]
        if (userAnswer == correctAnswer) {
            score++
            questionText.text = "Correct!Well done player!You have scored a point "

        } else {
            questionText.text = "Incorrect!Try again player.Make sure you select the correct answer this time around"
//score textview displays earned score
        }
        scoreText.text = "Score: $score"
                }
            }

 fun FlasQuestions.pcheck(bool: Boolean) {

 }




