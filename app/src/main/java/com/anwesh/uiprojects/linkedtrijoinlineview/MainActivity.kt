package com.anwesh.uiprojects.linkedtrijoinlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.trijoinlineview.TriJoinLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TriJoinLineView.create(this)
    }
}
