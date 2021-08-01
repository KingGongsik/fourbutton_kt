package com.example.fourbutton_kt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fourbutton_kt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()

{

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 바인딩이랑 콘텐트뷰가 순서가 바뀌면 절대 안됨!!


        binding.btnnaver.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
            // var url = "http://www.naver.com"
            // val i = Intent(Intent.ACTION_VIEW_
            // i.data = Uri.parse(url)
            //startActivirty(i)
        }

        binding.btncall.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/0100000000"))
            startActivity(intent)
        }

        binding.btnphoto.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }

        binding.btnend.setOnClickListener{
            finish()
        }

    }
}