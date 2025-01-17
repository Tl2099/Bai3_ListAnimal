package tl209.example.bai3_listanimal.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tl209.example.bai3_listanimal.databinding.ItemAnimalBinding
import tl209.example.bai3_listanimal.model.Animal

class AnimalAdapter(
    private val animals: List<Animal>,
    private val onEdit: (Animal) -> Unit,
    private val onDelete: (Animal) -> Unit
): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(binding)
    }

    override fun getItemCount() = animals.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animals[position], onEdit, onDelete)
    }

    class AnimalViewHolder(private val binding: ItemAnimalBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(animal: Animal, onEdit: (Animal) -> Unit, onDelete: (Animal) -> Unit){
            binding.tvName.text = animal.name
            binding.tvSpecies.text = animal.species
            binding.ivIcon.setImageResource(animal.icon)

            binding.btUpdate.setOnClickListener{onEdit(animal)}
            binding.btDelete.setOnClickListener{onDelete(animal)}
            binding.vFurColor.setBackgroundColor(Color.parseColor(animal.furColor))
        }
    }
}