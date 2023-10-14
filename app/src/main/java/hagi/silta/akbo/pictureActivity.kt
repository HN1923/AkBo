package hagi.silta.akbo

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class pictureActivity : AppCompatActivity() {

    lateinit var bitmap:Bitmap
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

//        val intent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        activityResult.launch(intent)
    }

//    private val activityResult: ActivityResultLauncher<Intent> = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()){
//        if (it.resultCode == RESULT_OK && it.data!=null){
//            val extras = it.data!!.extras //값 담기
//
//            bitmap=extras?.get("data") as Bitmap //Bitmap 타입으로 변경
//
////            imageView.setImageBitmap(bitmap) //화면에 보이기
//        }
//    }
}