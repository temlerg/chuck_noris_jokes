package com.example.chuck_noris_jokes.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chuck_noris_jokes.R

import kotlinx.android.synthetic.main.card.joke
import kotlinx.android.synthetic.main.web.*


class Web : BaseFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.web,
            container,
            false
        )
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        joke_fragment.setOnClickListener {
            openPage(Main_fragment())
        }

        web_v.getSettings().setJavaScriptEnabled(true)
        web_v.settings.javaScriptCanOpenWindowsAutomatically
        web_v.loadUrl("http://www.icndb.com/api/")

    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }

}