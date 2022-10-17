package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class FinishActivity : AppCompatActivity() {

    lateinit var tvMain : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val executorService: ExecutorService = Executors.newSingleThreadExecutor()
        val series =2


        /*tvMain.text = executorService.submit(Callable {
            httpRequest("http://anecdotica.ru/series/${series}/getRAndItemP")
        }).get()*/
    }

    @Throws(IOException::class)
    fun httpRequest(urlString: String):String {
        /*Созддание экземпляра URL*/
        val url = URL(urlString)
        /*Создание экзепляра класса для соедниения по протоколу HTTP*/
        val connection = url.openConnection() as HttpURLConnection
        /*Установка метода запроса*/
        connection.requestMethod = "GET"
        /*Отправка запроса и чтение полученых данных*/
        var data: Int = connection.inputStream.read()
        var str = ""
        while (data != -1){
            str += data.toChar()
            data = connection.inputStream.read()
        }
        Log.d("API_QWE", str)
        return str
    }

}