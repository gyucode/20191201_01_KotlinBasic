package kr.co.tjoeun.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼(okBtn)이 눌리면
//        EditText (inputEdt)에 적힌 값을 받아서
//        TextVeiw (resultTxt)의 내용으로 반영.

        okBtn.setOnClickListener {
            var inputString = inputEdt.text.toString() //get => 내용물 받아오기
            resultTxt.text = inputString //set => 내용물 설정하기.

//            확인버튼이 눌렸는지 로그
            Log.d("확인", inputString)

//            if(inputString =="Hello"){
//                Toast.makeText(this,"환영인사",Toast.LENGTH_SHORT).show()
//            }
//            else if (inputString =="bye"){
//                Toast.makeText(this,"작별인사",Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this, "기타문장", Toast.LENGTH_SHORT).show()
//            }

            when (inputString){
                "hello" -> {
                    Toast.makeText(this,"환영인사",Toast.LENGTH_SHORT).show()
                    Log.d("when연습","환영인사")
                }
                "bye" -> {Toast.makeText(this,"작별인사",Toast.LENGTH_SHORT).show()}
                else -> {Toast.makeText(this, "기타문장", Toast.LENGTH_SHORT).show() }
            }

//            val year =1988
//            val age = when(year){
//                1988 -> 32
//                in 1991..2000 -> 20
//                else -> -1
//            }

        }


        okBtn.setOnLongClickListener {

            resultTxt.text = "초기상태"
//            onClick무시.,return true
            Log.d("확인버튼 롱클릭", "텍스트뷰초기화")
            return@setOnLongClickListener true
        }

    }
}
