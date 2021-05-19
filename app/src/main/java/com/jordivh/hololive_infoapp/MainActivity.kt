package com.jordivh.hololive_infoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvVtuber:RecyclerView
    private var list: ArrayList<Vtuber> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvVtuber=findViewById(R.id.rv_vtubers)
        rvVtuber.setHasFixedSize(true)

        list.addAll(VtuberData.vtuberDatas)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu):Boolean{
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode:Int){
        when (selectedMode){
            R.id.about_button->{
                val aboutIntent=Intent(this@MainActivity,AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }
    private fun showRecyclerList(){
        rvVtuber.layoutManager= LinearLayoutManager(this)
        val listVtuberAdapter=ListVtuberAdapter(list)
        rvVtuber.adapter=listVtuberAdapter

        listVtuberAdapter.setOnItemClickCallback(object:ListVtuberAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Vtuber){
                showSelectedVtuber(data)
            }
        })
    }

    private fun showSelectedVtuber(vtuber:Vtuber){
        val detailIntent= Intent(this@MainActivity,DetailActivity::class.java)
        detailIntent.putExtra(DetailActivity.EXTRA_NAME,vtuber.name)
        detailIntent.putExtra(DetailActivity.EXTRA_ORIGINAL_NAME,vtuber.originalName)
        detailIntent.putExtra(DetailActivity.EXTRA_NICKNAME,vtuber.nickNames)
        detailIntent.putExtra(DetailActivity.EXTRA_DEBUT_DATE,vtuber.debutDate)
        detailIntent.putExtra(DetailActivity.EXTRA_IMG_DETAIL,vtuber.detailPhoto)
        detailIntent.putExtra(DetailActivity.EXTRA_CHANNEL_NAME,vtuber.channelName)
        detailIntent.putExtra(DetailActivity.EXTRA_CHANNEL_URL,vtuber.channelUrl)
        detailIntent.putExtra(DetailActivity.EXTRA_GENDER,vtuber.gender)
        detailIntent.putExtra(DetailActivity.EXTRA_AGE,vtuber.age)
        detailIntent.putExtra(DetailActivity.EXTRA_BIRTHDAY,vtuber.birthDay)
        detailIntent.putExtra(DetailActivity.EXTRA_HEIGHT,vtuber.height)
        detailIntent.putExtra(DetailActivity.EXTRA_QUOTE,vtuber.quote)
        detailIntent.putExtra(DetailActivity.EXTRA_BACKGROUND_STORY,vtuber.backgroundStory)
        startActivity(detailIntent)
    }
}

