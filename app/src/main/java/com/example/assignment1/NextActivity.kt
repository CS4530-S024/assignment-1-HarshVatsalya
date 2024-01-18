package com.example.assignment1
//Name: Harsh Vatsalya
//Assignment1 (Mobile appDevelopment)
//Next Activity Kotlin file
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Sets the layout for the next Activity
        setContentView(R.layout.activity_next)

        //gets the intent that started this activity
        val truck = intent

        //Extracts the value associated with the sports"key"
        val sportName = truck.getStringExtra("sport")

        //Fins the textView in the layout in IDs
        val resultText: TextView = findViewById(R.id.textView)

        //Gives the text a name
        resultText.text = sportName

        //delaration back button
        val back : Button = findViewById(R.id.back)

        //Sets the onClick Listener to the back button
        back.setOnClickListener {
            onBackButtonClick(it)
        }

    }

    //Function to call the back button
    private fun onBackButtonClick(view: View)
    {
        if(view is Button)
        {
            //creates an intent
            val intent = Intent(this , MainActivity::class.java)

            //Takes back to main activity
            startActivity(intent)
        }
    }
}