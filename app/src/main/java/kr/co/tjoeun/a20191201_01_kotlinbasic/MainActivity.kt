package kr.co.tjoeun.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
        }
        okBtn.
        okBtn.setOnLongClickListener {

            resultTxt.text = "초기상태"
//            onClick무시.,return true
            return@setOnLongClickListener true
        }

    }
}
