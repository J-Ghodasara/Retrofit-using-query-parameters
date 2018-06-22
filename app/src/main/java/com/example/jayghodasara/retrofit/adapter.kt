package com.example.jayghodasara.retrofit
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class adapter(var context: Context, var arrayList: POJO) : RecyclerView.Adapter<adapter.viewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var v: View = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)

        return viewholder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.candidates.size
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        var p: POJO = arrayList

        var name = p.candidates[position]



        holder.name.text = name.name
        holder.state.text=name.formatted_address
        holder.lat.text=name.geometry.location.lat.toString()
        holder.lon.text=name.geometry.location.lng.toString()

    }


    class viewholder(view: View) : RecyclerView.ViewHolder(view) {

      var name=view.findViewById<TextView>(R.id.area)
        var state=view.findViewById<TextView>(R.id.state)
        var lat=view.findViewById<TextView>(R.id.lat)
        var lon=view.findViewById<TextView>(R.id.lon)

    }
}