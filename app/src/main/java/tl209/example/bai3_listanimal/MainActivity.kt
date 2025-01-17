package tl209.example.bai3_listanimal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import tl209.example.bai3_listanimal.adapter.AnimalAdapter
import tl209.example.bai3_listanimal.databinding.ActivityMainBinding
import tl209.example.bai3_listanimal.model.Animal
import tl209.example.bai3_listanimal.viewmodel.AnimalViewModel
import android.graphics.Color
import yuku.ambilwarna.AmbilWarnaDialog
import yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: AnimalViewModel by viewModels()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = AnimalAdapter(
            animals = viewModel.animals.value ?: emptyList(),
            onEdit = { animal -> showColorPickerDialog(animal) },
            onDelete = {animal -> viewModel.deleteAnimal(animal)}
        )

        binding.rvListAnimal.layoutManager = LinearLayoutManager(this)
        binding.rvListAnimal.adapter = adapter

        viewModel.animals.observe(this){
            adapter.notifyDataSetChanged()
        }

        binding.btAdd.setOnClickListener{
            viewModel.addSampleAnimal()
        }

    }

    //Ham hien thi Dialog chon mau
    private fun showColorPickerDialog(animal: Animal) {
        // Tạo một đối tượng AmbilWarnaDialog với màu mặc định từ animal.furColor
        val colorPickerDialog = AmbilWarnaDialog(this, Color.parseColor(animal.furColor), object : OnAmbilWarnaListener {
            override fun onCancel(dialog: AmbilWarnaDialog?) {

            }

            override fun onOk(dialog: AmbilWarnaDialog?, color: Int) {


            }
        }
        )

        // Cấu hình các tùy chọn
        colorPickerDialog.show()
    }
}