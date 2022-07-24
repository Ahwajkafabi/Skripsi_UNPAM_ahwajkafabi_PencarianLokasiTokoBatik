package com.ahwajkafabi.tokobatikpekalongan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahwajkafabi.tokobatikpekalongan.www.listmovierecyclerview.network.InitRetrofit
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_wiki.view.*
import org.jetbrains.anko.startActivity

class MainAdapter3(val ctx: Context, val data: List<DataItem?>): RecyclerView.Adapter<MainAdapter3.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(ctx).inflate(R.layout.item_list_wiki3, parent, false))
    }
    //Menentukan jumlah item yang ditampilkan
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Jika ini item terakhir, sembunyikan garis separator
        if ((position + 1) == data.size){
            holder.itemView.viewLineSeparator.visibility = View.GONE
        }
        holder.bind(data.get(position))
        //TODO: Bawa data ketika berpindah activity
        holder.itemView.setOnClickListener {
            ctx.startActivity<DetailActivity3>("TITLE" to data.get(position)?.title,
                    "POST_CONTENT" to data.get(position)?.postContent,
                    "WRITTER" to data.get(position)?.writer,
                    "POSTER_URL" to InitRetrofit.BASE_URL_IMAGE + data.get(position)?.poster)
        }
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(article: DataItem?) {
            //TODO: Set data ke Widget
            itemView.tvWikiTitle.text = article?.title
            itemView.tvWikiWritter.text = article?.writer
            Picasso.get()
                    .load(InitRetrofit.BASE_URL_IMAGE + article?.poster)
                    .into(itemView.ivWikiPoster
                    )
        }
    }
}
