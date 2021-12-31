package com.example.temp2.ui.calendar

import android.app.AlertDialog
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.temp2.R
import com.example.temp2.databinding.FragmentCalendarBinding



class CalendarFragment : Fragment() {

    private var _binding: FragmentCalendarBinding? = null
    private lateinit var mediaPlayer: MediaPlayer

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private fun showModal(
        inflater: LayoutInflater,
        day: Int
    ) {
        val view = inflater.inflate(R.layout.modal_popup, null)
        val modalTv: TextView = view.findViewById(R.id.modalContent)
        val modalIv: ImageView = view.findViewById(R.id.modalImage)


        when(day) {
            1 -> {
                modalIv.setImageResource(R.drawable.day1)
                modalTv.text = "“인류의 모든 성과는 시행착오로부터 이루어졌다.” \n\n - 장병규 의장님"
            }

            2 -> {
                modalIv.setImageResource(R.drawable.day2)
                modalTv.text = "\n20211202는\n거꾸로해도\n20211202입니다.\n"
            }

            3 -> {
                modalIv.setImageResource(R.drawable.day3)
                modalTv.text = "\n3분반 정희종의 생일은\n 12월 3일로 포항공대의\n개교기념일과 같습니다.\n"
            }

            4 -> {
                modalIv.setImageResource(R.drawable.day4)
                modalTv.text = "“부디 내 말을 믿어보세요.\n아무리 현실이 답답하더라도 내일은 오늘보다 멋진 날이 되리라, 하고요.” \n\n - 나미야 잡화점의 기적 中"
            }

            5 -> {
                modalIv.setImageResource(R.drawable.day5)
                modalTv.text = "넌센스 퀴-즈!\nQ. 뽑으면 우는 식물은?\n\nA. 우엉~~ 우엉엉"
            }

            6 -> {
                modalIv.setImageResource(R.drawable.day6)
                modalTv.text = "쩝쩝박사 김민희 선정\n12월에 꼭 먹어야 할 음식 BEST 5 \n 동치미, 설렁탕, 귤,\n 딸기, 시루떡"
            }

            7 -> {
                modalIv.setImageResource(R.drawable.day7)
                modalTv.text = "알고 계셨나요?\n눅눅해진 김을 전자레인지에 살짝만 돌려주면 다시\n바삭바삭해진답니다!"
            }

            8 -> {
                modalIv.setImageResource(R.drawable.day8)
                modalTv.text = "\n\n어쩔티비~\n\n"
            }

            9 -> {
                modalIv.setImageResource(R.drawable.day9)
                modalTv.text = "\n오늘의 운세 \n\n행운이 찾아온다.\n"
            }

            10 -> {
                modalIv.setImageResource(R.drawable.day10)
                modalTv.text = "12월 10일은\n 세계 인권의 날입니다.\n1948년 12월 10일 제3차\n국제연합총회에서\n세계 인권 선언을\n선포했습니다."
            }

            11 -> {
                modalIv.setImageResource(R.drawable.day11)
                modalTv.text = "알고 계셨나요?\n몰입캠프는 학생들이 자율적으로 집중개발을 경험하는\n프로그래밍 캠프입니다."
            }

            12 -> {
                modalIv.setImageResource(R.drawable.day12)
                modalTv.text = "\n\n\n12가 두 개?!\n\n\n"
            }

            13 -> {
                modalIv.setImageResource(R.drawable.day13)
                modalTv.text = "\n“제 이름은 외자예요.\n외자여서 외로움을\n많이 타죠.\n하지만 걱정하지 말아요. 사랑에는 공격적이니까”\n"
            }

            14 -> {
                modalIv.setImageResource(R.drawable.day14)
                modalTv.text = "빙-빙- 돌아가는\n회전목마처럼~\n영원히 계속될 것처럼~\n빙-빙- 돌아온\n우리의 시간처럼~↗\n인생은 회전목마~"
            }

            15 -> {
                modalIv.setImageResource(R.drawable.day15)
                modalTv.text = "“꿈을 이루고자 하는\n용기만 있다면\n모든 꿈을\n이룰 수 있다.” \n\n- 월트 디즈니"
            }

            16 -> {
                modalIv.setImageResource(R.drawable.day16)
                modalTv.text = "\n\n저쩔가스레인지~\n\n"
            }

            17 -> {
                modalIv.setImageResource(R.drawable.day17)
                modalTv.text = "\n알고 계셨나요? \n타조의 안구는 뇌보다\n크다고 합니다!\n\n띠용~\n"
            }

            18 -> {
                modalIv.setImageResource(R.drawable.day18)
                modalTv.text = "\n짐이 주차를 하면 무엇이냐!\n\n파킹이옵니다 즈언하~\n"
            }

            19 -> {
                modalIv.setImageResource(R.drawable.day19)
                modalTv.text = "\n오늘의 운세\n\n급하다고 하여 조급하게\n 서두르거나 당황하면\n 손해를 본다.\n"
            }

            20 -> {
                modalIv.setImageResource(R.drawable.day20)
                modalTv.text = "\n알고 계셨나요?\nTV 동물농장은\n2020년 12월 20일로\n1000회를 맞았습니다.\n"
            }

            21 -> {
                modalIv.setImageResource(R.drawable.day21)
                modalTv.text = "“건전한 열등감이란 타인과 비교해서 생기는 것이 아니라 ‘이상적인 나’와 비교해서 생기는 것이라네.”\n\n- 미움받을용기 中"
            }

            22 -> {
                modalIv.setImageResource(R.drawable.day22)
                modalTv.text = "1977년 12월 22일은\n‘수출 100억불의 날’로,\n대한민국 수출액이\n100억 달러를\n돌파함과 동시에\nGDP 1,000달러를\n돌파했습니다."
            }

            23 -> {
                modalIv.setImageResource(R.drawable.day23)
                modalTv.text = "\n“잘자요. 꼬마 아가씨. 오늘은 좋은 꿈 꾸기로 약속!”\n"
            }

            24 -> {
                modalIv.setImageResource(R.drawable.day24)
                modalTv.text = "\n\n\nHappy christmas eve!\n\n\n"
            }

            else -> null
        }

        val alertDialog = AlertDialog.Builder(context).setTitle("Day " + day.toString()).setPositiveButton("선물열기") { _, _ ->
            Toast.makeText(context, "짜잔!", Toast.LENGTH_SHORT).show()

            when(day) {
                1 -> binding.decoButton1.setImageResource(R.drawable.deco_open_1)
                2 -> binding.decoButton2.setImageResource(R.drawable.deco_open_2)
                3 -> binding.decoButton3.setImageResource(R.drawable.deco_open_3)
                4 -> binding.decoButton4.setImageResource(R.drawable.deco_open_4)
                5 -> binding.decoButton5.setImageResource(R.drawable.deco_open_5)
                6 -> binding.decoButton6.setImageResource(R.drawable.deco_open_6)
                7 -> binding.decoButton7.setImageResource(R.drawable.deco_open_7)
                8 -> binding.decoButton8.setImageResource(R.drawable.deco_open_8)
                9 -> binding.decoButton9.setImageResource(R.drawable.deco_open_9)
                10 -> binding.decoButton10.setImageResource(R.drawable.deco_open_10)
                11 -> binding.decoButton11.setImageResource(R.drawable.deco_open_11)
                12 -> binding.decoButton12.setImageResource(R.drawable.deco_open_12)
                13 -> binding.decoButton13.setImageResource(R.drawable.deco_open_13)
                14 -> binding.decoButton14.setImageResource(R.drawable.deco_open_14)
                15 -> binding.decoButton15.setImageResource(R.drawable.deco_open_15)
                16 -> binding.decoButton16.setImageResource(R.drawable.deco_open_16)
                17 -> binding.decoButton17.setImageResource(R.drawable.deco_open_17)
                18 -> binding.decoButton18.setImageResource(R.drawable.deco_open_18)
                19 -> binding.decoButton19.setImageResource(R.drawable.deco_open_19)
                20 -> binding.decoButton20.setImageResource(R.drawable.deco_open_20)
                21 -> binding.decoButton21.setImageResource(R.drawable.deco_open_21)
                22 -> binding.decoButton22.setImageResource(R.drawable.deco_open_22)
                23 -> binding.decoButton23.setImageResource(R.drawable.deco_open_23)
                24 -> binding.decoButton24.setImageResource(R.drawable.deco_open_24)
                else -> null
            }
        }.setNegativeButton("열지않기", null).create()

        alertDialog.setView(view)
        alertDialog.show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCalendarBinding.inflate(inflater, container, false)
        val root: View = binding.root
        mediaPlayer = MediaPlayer.create(context, R.raw.bgm)
        mediaPlayer.isLooping = true
        mediaPlayer.start()

        binding.decoButton24.setOnClickListener {
            showModal(inflater, 24)
        }
        binding.decoButton23.setOnClickListener {
            showModal(inflater, 23)
        }
        binding.decoButton22.setOnClickListener {
            showModal(inflater, 22)
        }
        binding.decoButton21.setOnClickListener {
            showModal(inflater, 21)
        }
        binding.decoButton20.setOnClickListener {
            showModal(inflater, 20)
        }
        binding.decoButton19.setOnClickListener {
            showModal(inflater, 19)
        }
        binding.decoButton18.setOnClickListener {
            showModal(inflater, 18)
        }
        binding.decoButton17.setOnClickListener {
            showModal(inflater, 17)
        }
        binding.decoButton16.setOnClickListener {
            showModal(inflater, 16)
        }
        binding.decoButton15.setOnClickListener {
            showModal(inflater, 15)
        }
        binding.decoButton14.setOnClickListener {
            showModal(inflater, 14)
        }
        binding.decoButton13.setOnClickListener {
            showModal(inflater, 13)
        }
        binding.decoButton12.setOnClickListener {
            showModal(inflater, 12)
        }
        binding.decoButton11.setOnClickListener {
            showModal(inflater, 11)
        }
        binding.decoButton10.setOnClickListener {
            showModal(inflater, 10)
        }
        binding.decoButton9.setOnClickListener {
            showModal(inflater, 9)
        }
        binding.decoButton8.setOnClickListener {
            showModal(inflater, 8)
        }
        binding.decoButton7.setOnClickListener {
            showModal(inflater, 7)
        }
        binding.decoButton6.setOnClickListener {
            showModal(inflater, 6)
        }
        binding.decoButton5.setOnClickListener {
            showModal(inflater, 5)
        }
        binding.decoButton4.setOnClickListener {
            showModal(inflater, 4)
        }
        binding.decoButton3.setOnClickListener {
            showModal(inflater, 3)
        }
        binding.decoButton2.setOnClickListener {
            showModal(inflater, 2)
        }
        binding.decoButton1.setOnClickListener {
            showModal(inflater, 1)
        }

        return root
    }

    override fun onDestroyView() {
        mediaPlayer.stop()
        super.onDestroyView()
        _binding = null
    }
}