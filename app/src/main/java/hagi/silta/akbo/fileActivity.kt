package hagi.silta.akbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide

class fileActivity : AppCompatActivity() {

    private val OPEN_GALLERY=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)

        val btnGallery: Button =findViewById(R.id.btnGallery)

        btnGallery.setOnClickListener{

//            //뭔가 이상
//            val intent: Intent =Intent(Intent.ACTION_GET_CONTENT)
//            intent.setType("image/*")
//            startActivityForResult(intent, OPEN_GALLERY)
//            //갤러리로 이동?(@@세로방향으로>>가로 방향으로 바꿔야 함)
//            //권한 묻기
//            //일단 이미지뷰에 보여주는 건가 잘 모르ㅔㄱㅆ다

            //갤러리 호출
            val intent=Intent(Intent.ACTION_PICK)
            intent.type="image/*"
            activityResult.launch(intent)

            //갤러리에 사진이 없다~~!! 카메라도 먼저 해야할 듯...
        }
    }
//    private val activityResult: ActivityResultLauncher<intent>=registerForActivityResult(){4
//    }
    private val activityResult: ActivityResultLauncher<Intent> = registerForActivityResult(
    ActivityResultContracts.StartActivityForResult()){

        if (it.resultCode == RESULT_OK && it.data!=null){
            //값 담기
            val akboo = it.data!!.extras

            //화면에 보여주기
            Glide.with(this)
                .load(akboo) //이미지
                .into(findViewById(R.id.ivAkboGallery))
//            bitmap=extras?.get("data") as Bitmap //Bitmap 타입으로 변경

//            imageView.setImageBitmap(bitmap) //화면에 보이기
        }
    }

}