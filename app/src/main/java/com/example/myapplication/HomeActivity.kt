
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MusicPlayerActivity
import com.example.myapplication.R
import com.example.myapplication.SettingsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.music_player -> {
                    val intent = Intent(this, MusicPlayerActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.settings -> {
                    val intent = Intent(this, SettingsActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        val playMusicButton: Button = findViewById(R.id.playMusicButton)
        playMusicButton.setOnClickListener {
            // Iniciar a MusicPlayerActivity quando o botão "Reproduzir Músicas" for pressionado
            val intent = Intent(this, MusicPlayerActivity::class.java)
            startActivity(intent)
        }
    }
}
