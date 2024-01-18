package com.example.assignment1
//Name: Harsh Vatsalya
//Assignment1 (Mobile appDevelopment)
//Main Activity kotlin file
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //Declaration of all the buttons
        val footballBtn : Button = findViewById(R.id.football)
        val fooseballBtn : Button = findViewById(R.id.fooseball)
        val basketballBtn : Button = findViewById(R.id.basketball)
        val cricketBtn : Button = findViewById(R.id.cricket)
        val hockeyBtn : Button = findViewById(R.id.hockey)

        //Setting the onClickListener for each other
        footballBtn.setOnClickListener {
            onButtonClick(it)
        }

        fooseballBtn.setOnClickListener {
            onButtonClick(it)
        }

        basketballBtn.setOnClickListener {
            onButtonClick(it)
        }

        cricketBtn.setOnClickListener {
            onButtonClick(it)
        }

        hockeyBtn.setOnClickListener {
            onButtonClick(it)
        }
    }
//Function to handle buttonClicks
    private fun onButtonClick(view: View)
    {
        //if view is a button
        if(view is Button)
        {
            //intent to get to the next activity
            val intent = Intent(this , NextActivity::class.java)

            //put the choosen sport as an extra in intent
            intent.putExtra("sport", view.text as String)

            //Start the next Activity
            startActivity(intent)
        }
    }
}