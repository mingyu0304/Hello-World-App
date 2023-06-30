package com.example.fcamp_jun_29

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fcamp_jun_29.databinding.MainLayoutBinding
import com.example.fcamp_jun_29.ui.theme.Fcamp_Jun_29Theme
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val binding: MainLayoutBinding by lazy { MainLayoutBinding.inflate(layoutInflater)}

    private val tabTextList = listOf("Contact", "Photos", "My Health")
    private val tabIconList = listOf(R.drawable.phone, R.drawable.phone, R.drawable.phone)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.viewPager01.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(binding.tabLayout01, binding.viewPager01){
            tab, pos ->
            tab.text = tabTextList[pos]
            tab.setIcon(tabIconList[pos])
        }.attach()
    }
}