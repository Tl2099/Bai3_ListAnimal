//package tl209.example.bai3_listanimal.viewmodel
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import tl209.example.bai3_listanimal.R
//import tl209.example.bai3_listanimal.model.Animal
//
//class AnimalViewModel: ViewModel() {
//    private val _animals = MutableLiveData<MutableList<Animal>>(mutableListOf())
//    val animals: LiveData<MutableList<Animal>> get() = _animals
//
//    fun addSampleAnimal() {
//        val newAnimal = Animal(
//            id = System.currentTimeMillis().toInt(),
//            species = "Dog",
//            name = "Lucky",
//            furColor = "#FF5733",
//            icon = R.drawable.ic_cat
//        )
//        //Note: Cần nhớ sự khác biệt giữa apply và let
//        //apply trả về chính đối tượng mà bạn gọi nó trên đó, và this trong apply là đối tượng đó.
//        //apply thường được dùng khi bạn cần thay đổi các thuộc tính của đối tượng trong khối lệnh và không cần phải trả về giá trị từ hàm.
//        //apply làm việc tốt khi bạn cần thay đổi trạng thái của đối tượng mà không cần trả về giá trị từ hàm.
//        //let
//        //let trả về kết quả của khối lệnh bên trong, và it là đối tượng mà bạn gọi let trên đó.
//        //let thường được sử dụng khi bạn muốn thao tác với đối tượng và trả về giá trị từ khối lệnh (hoặc chỉ đơn giản là làm gì đó với đối tượng mà không thay đổi chính nó).
//        //let rất hữu ích khi bạn muốn thực hiện một thao tác nào đó trên đối tượng và sử dụng giá trị của đối tượng sau đó.
//        //_animals.value?.let {
//        //    it.add(newAnimal)
//        //    _animals.value = it
//        //}
//
//        _animals.value?.apply {
//            add(newAnimal)
//            _animals.value = this
//        }
//    }
//    fun deleteAnimal(animal: Animal) {
//        _animals.value?.apply {
//            remove(animal)
//            _animals.value = this
//        }
//    }
//
//    fun updataAnimal(animal: Animal) {
//        _animals.value?.apply {
//            val index = indexOfFirst { it.id == animal.id }
//            if (index != -1) {
//                set(index, animal)
//                _animals.value = this
//            }
//        }
//    }
//}