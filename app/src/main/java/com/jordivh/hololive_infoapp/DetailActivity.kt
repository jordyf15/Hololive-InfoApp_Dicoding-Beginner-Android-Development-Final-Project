package com.jordivh.hololive_infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {
    private lateinit var rvNicknames:RecyclerView

    companion object {
        const val EXTRA_NAME="extra_name"
        const val EXTRA_ORIGINAL_NAME="extra_original_name"
        const val EXTRA_NICKNAME="extra_nickname"
        const val EXTRA_DEBUT_DATE="extra_debut_date"
        const val EXTRA_IMG_DETAIL="extra_img_detail"
        const val EXTRA_CHANNEL_NAME="extra_channel_name"
        const val EXTRA_CHANNEL_URL="extra_channel_url"
        const val EXTRA_GENDER="extra_gender"
        const val EXTRA_AGE="extra_age"
        const val EXTRA_BIRTHDAY="extra_birthday"
        const val EXTRA_HEIGHT="extra_height"
        const val EXTRA_QUOTE="extra_quote"
        const val EXTRA_BACKGROUND_STORY="extra_background_story"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvOriginalName:TextView=findViewById(R.id.original_name)
        val tvDebutDate: TextView =findViewById(R.id.debut_date)
        val ivImgDetail: ImageView =findViewById(R.id.img_detail)
        val tvChannelName:TextView=findViewById(R.id.channel_name)
        val tvGender:TextView=findViewById(R.id.gender)
        val tvAge:TextView=findViewById(R.id.age)
        val tvBirthday:TextView=findViewById(R.id.birthday)
        val tvHeight:TextView=findViewById(R.id.height)
        val tvQuote:TextView=findViewById(R.id.quote)
        val tvBackgroundStory:TextView=findViewById(R.id.background_story)
        rvNicknames=findViewById(R.id.rv_nicknames)
        rvNicknames.setHasFixedSize(true)

        val name=intent.getStringExtra(EXTRA_NAME)
        val originalName=intent.getStringExtra(EXTRA_ORIGINAL_NAME)
        val nicknames=intent.getStringArrayListExtra(EXTRA_NICKNAME)
        val debutDate=intent.getStringExtra(EXTRA_DEBUT_DATE)
        val imgDetail=intent.getIntExtra(EXTRA_IMG_DETAIL,0)
        val channelName=intent.getStringExtra(EXTRA_CHANNEL_NAME)
        val channelUrl=intent.getStringExtra(EXTRA_CHANNEL_URL)
        val gender=intent.getStringExtra(EXTRA_GENDER)
        val age=intent.getStringExtra(EXTRA_AGE)
        val birthday=intent.getStringExtra(EXTRA_BIRTHDAY)
        val height=intent.getStringExtra(EXTRA_HEIGHT)
        val quote=intent.getStringExtra(EXTRA_QUOTE)
        val backgroundStory=intent.getStringExtra(EXTRA_BACKGROUND_STORY)

        tvOriginalName.text=originalName
        tvDebutDate.text=debutDate
        ivImgDetail.setImageResource(imgDetail)
        tvChannelName.text=channelName
        tvGender.text=gender
        tvAge.text=age
        tvBirthday.text=birthday
        tvHeight.text=height
        tvQuote.text="\"$quote\""
        tvBackgroundStory.text=backgroundStory
        if (nicknames != null) {
            showRecyclerList(nicknames)
        }
    }

    private fun showRecyclerList(nicknames: ArrayList<String>){
        rvNicknames.layoutManager=LinearLayoutManager(this)
        val listNicknameAdapter=ListNicknameAdapter(nicknames)
        rvNicknames.adapter=listNicknameAdapter
    }
}