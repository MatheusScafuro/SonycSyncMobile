package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MusicPlayerActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        // Inicialize o MediaPlayer com o arquivo de áudio desejado
        mediaPlayer = MediaPlayer.create(this, R.raw.sample_audio)

        // Inicie a reprodução da música
        mediaPlayer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        // Certifique-se de liberar os recursos do MediaPlayer quando a atividade for destruída
        mediaPlayer.release()
    }
}
