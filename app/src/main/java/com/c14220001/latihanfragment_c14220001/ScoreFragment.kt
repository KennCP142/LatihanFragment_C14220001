package com.c14220001.latihanfragment_c14220001

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class ScoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_score, container, false)
        val tvFinalScore = view.findViewById<TextView>(R.id.tvFinalScore)
        val btnPlayAgain = view.findViewById<Button>(R.id.btnPlayAgain)

        val finalScore = arguments?.getInt("finalScore") ?: 0
        tvFinalScore.text = "Final Score: $finalScore"

        // Set onClickListener untuk tombol Play Again
        btnPlayAgain.setOnClickListener {
            (activity as? MainActivity)?.resetGameAndReturnToGameFragment()
        }

        return view
    }
}
