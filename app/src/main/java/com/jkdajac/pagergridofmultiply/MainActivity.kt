package com.jkdajac.pagergridofmultiply

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pages = arrayListOf<Page>(

        Page(resources.getString(R.string.one), resources.getString(R.string.TableOne),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

            Page(resources.getString(R.string.two), resources.getString(R.string.TableTwo),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

       Page(resources.getString(R.string.three), resources.getString(R.string.TableThree),
           BitmapFactory.decodeResource(resources, R.drawable.tablica)),

      Page(resources.getString(R.string.four), resources.getString(R.string.TableFour),
          BitmapFactory.decodeResource(resources, R.drawable.tablica)),

       Page(resources.getString(R.string.five), resources.getString(R.string.TableFive),
           BitmapFactory.decodeResource(resources, R.drawable.tablica)),

        Page(resources.getString(R.string.six), resources.getString(R.string.TableSix),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

      Page(resources.getString(R.string.seven), resources.getString(R.string.TableSeven),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

       Page(resources.getString(R.string.eight), resources.getString(R.string.TableEight),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

        Page(resources.getString(R.string.nine), resources.getString(R.string.TableNine),
            BitmapFactory.decodeResource(resources, R.drawable.tablica)),

       Page(resources.getString(R.string.ten), resources.getString(R.string.TableTen),
            BitmapFactory.decodeResource(resources, R.drawable.tablica))
        )

        vpViewPager.adapter = PagesAdapter(pages,supportFragmentManager)
    }

}