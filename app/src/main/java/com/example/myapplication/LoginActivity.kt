package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R




class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val forgotPasswordText = findViewById<TextView>(R.id.forgotPasswordText)
        val registerText = findViewById<TextView>(R.id.registerText)

        // Configurar clique no botão de login
        loginButton.setOnClickListener {
            // Verificar credenciais, realizar login, etc.

            // Se o login for bem-sucedido, abrir a HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Opcional: fecha a LoginActivity para que o usuário não possa voltar para ela com o botão de voltar
        }

        // Configurar clique no texto "Esqueci minha senha"
        forgotPasswordText.setOnClickListener {
            // Implemente a lógica para lidar com esquecimento de senha aqui
        }

        // Configurar clique no texto "Registrar-se"
        registerText.setOnClickListener {
            // Implemente a lógica para registro de usuário aqui
        }
    }}
