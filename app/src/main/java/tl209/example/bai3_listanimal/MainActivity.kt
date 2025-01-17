package tl209.example.bai3_listanimal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import tl209.example.bai3_listanimal.databinding.ActivityMainBinding
import tl209.example.bai3_listanimal.model.Animal
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import yuku.ambilwarna.AmbilWarnaDialog
import yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener

class MainActivity : AppCompatActivity() {

    private lateinit var colorPreviewContainer: View
    private lateinit var selectColorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test4)

        colorPreviewContainer = findViewById(R.id.colorPreviewContainer)
        selectColorButton = findViewById(R.id.selectColorButton)

        colorPreviewContainer.setOnClickListener {
            // Mở hộp thoại chọn màu AmbilWarnaDialog
            val colorPickerDialog = AmbilWarnaDialog(
                this,
                android.graphics.Color.BLACK, // Màu mặc định
                object : OnAmbilWarnaListener {
                    override fun onOk(dialog: AmbilWarnaDialog?, color: Int) {
                        colorPreviewContainer.setBackgroundColor(color)
                        Toast.makeText(this@MainActivity, "Đã chọn màu", Toast.LENGTH_SHORT).show()

                    }
                    override fun onCancel(dialog: AmbilWarnaDialog?) {
                        Toast.makeText(this@MainActivity, "Đã hủy chọn màu", Toast.LENGTH_SHORT).show()

                    }
                })
            colorPickerDialog.show()
        }
    }
}