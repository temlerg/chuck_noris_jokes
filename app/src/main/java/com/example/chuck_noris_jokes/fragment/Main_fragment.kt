package com.example.chuck_noris_jokes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chuck_noris_jokes.Adapter
import com.example.chuck_noris_jokes.Network.Post
import com.example.chuck_noris_jokes.R
import com.example.chuck_noris_jokes.Network.Repository
import kotlinx.android.synthetic.main.main_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Main_fragment : BaseFragment() {
    private var quantityJoke: Int = 0;
    val repository: Repository = Repository()

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
            R.layout.main_fragment,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        reload_joke.setOnClickListener() {
            quantityJoke = count.text.toString().toInt();

            repository.getJoke(quantityJoke).enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {
                    val ListJok = response.body()!!.value
                    recycle.layoutManager = LinearLayoutManager(context)
                    val adapter = Adapter(ListJok)
                    recycle.adapter = adapter;
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })

        }
        wed_fragment.setOnClickListener() {
            openPage(Web())
        }

    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }

}