package hagi.silta.akbo

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.AbsListView
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCaller
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

//import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var bitmap:Bitmap
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnPicture:Button=findViewById(R.id.btnPicture)
        val btnFile:Button=findViewById(R.id.btnFile)
        val btnSaved:Button=findViewById(R.id.btnSaved)

        btnPicture.setOnClickListener {
            val intent=Intent(this, pictureActivity::class.java)
            //다음 화면(악보 사진 찍기 pictureActivity)으로 이동하기 위한 intent객체 생성
            startActivity(intent)

            //뭔가 잘 안됨??
//            val intent: Intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            activityResult.launch(intent)
            //뭔가 잘 안 됨??
        }

        btnFile.setOnClickListener {
            val intent=Intent(this, fileActivity::class.java)
            //다음 화면(파일 선택 fileActivity)으로 이동
            startActivity(intent)
        }


        btnSaved.setOnClickListener {
            val intent=Intent(this, savedActivity::class.java)
            //다음 화면(저장 악보 savedActivity)으로 이동
            startActivity(intent)
        }
    }
//    private val activityResult: ActivityResultLauncher<Intent> = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//        if (it.resultCode == RESULT_OK && it.data!=null){
//            val extras = it.data!!.extras //값 담기
//
//            bitmap=extras?.get("data") as Bitmap //Bitmap 타입으로 변경
//
////            imageView.setImageBitmap(bitmap) //화면에 보이기
//        }
//    }
    //위에 코드 (activityResult:~~~)는 카톡 두번째 사진처럼 결과나옴

    //        private fun openGallery(){
//            val intent: Intent=Intent(Intent.ACTION_GET_CONTENT)
//            intent.setType("image/*")
//            startActivityForResult(intent, OPEN_GALLERY)
//        }
}