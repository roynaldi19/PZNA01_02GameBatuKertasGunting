package com.roynaldi19.pzna01_02gamebatukertasgunting

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var cpuImgV: ImageView
    lateinit var batuImgB: ImageButton
    lateinit var guntingImgB: ImageButton
    lateinit var kertasImgB: ImageButton
    lateinit var resultImgV: ImageView

    private fun initComponent() {
        cpuImgV = findViewById(R.id.cpu_img)
        batuImgB = findViewById(R.id.batu_ib)
        guntingImgB = findViewById(R.id.gunting_ib)
        kertasImgB = findViewById(R.id.kertas_ib)
        resultImgV = findViewById(R.id.result_img)
    }

    private fun initListener() {
        batuImgB.setOnClickListener { startGame("ROCK") }
        guntingImgB.setOnClickListener { startGame("SCISSORS") }
        kertasImgB.setOnClickListener { startGame("PAPER") }
    }

    private fun startGame(option: String) {

        val cpuOption = Game.pickRandomOption()
        cpuImgV.setImageResource(Game.pickDrawable(cpuOption))

        when{
            Game.isDraw(option, cpuOption) -> resultImgV.setImageResource(R.drawable.coba)
            Game.isWin(option, cpuOption) -> resultImgV.setImageResource(R.drawable.win)
            else -> resultImgV.setImageResource(R.drawable.lose)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()
        initListener()
    }
}