package com.example.fetchinggithubapi.views

//import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.example.fetchinggithubapi.R
import com.example.fetchinggithubapi.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        //val constraintLayout = binding.android.support.constraint.ConstraintLayout
        //binding.constraintLayout
        setContentView(R.layout.activity_detail)

        val i = getIntent()
        val avatar = i.getStringExtra("avatar")
        val username = i.getStringExtra("username")
        val githublink = i.getStringExtra("githublink")
        val layout = findViewById<ConstraintLayout>(R.id.layout)

        val targetImageView = findViewById<View>(R.id.imageView) as ImageView
        val internetUrl = "http://i.imgur.com/DvpvklR.png"

        Glide
            .with(targetImageView)
            .load(internetUrl)
            .into(targetImageView)
        //layout?.get(avatar)

        val ava: ImageView = findViewById(R.id.iv_avatar_detail)
        val uname: TextView = findViewById(R.id.tv_user_detail)
        val link: TextView = findViewById(R.id.tv_link_detail)
        //val log: TextView = findViewById(R.id.)

        Picasso.get().load(avatar).into(ava)
        uname.text = username;
        link.text = githublink

        /*
        Picasso.get().load(avatar).into(iv_avatar_detail)
        tv_user_detail.text = username
        tv_link_detail.text = githublink*/

    }

}