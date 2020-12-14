package com.example.chuck_noris_jokes.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chuck_noris_jokes.Activity.MainActivity

open class BaseFragment : Fragment() {
    protected lateinit var Activity: MainActivity
    protected var TAG = this::class.java.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Activity = context as MainActivity
    }
}