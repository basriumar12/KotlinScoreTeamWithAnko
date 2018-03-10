package info.blogbasbas.counterscore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    var  teamA : String? = null
    var  teamB : String? = null
    var  scoreA : String? = null
    var  scoreB :String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        teamA = intent.getStringExtra("NAME_A")
        teamB = intent.getStringExtra("NAME_B")
        scoreA = intent.getStringExtra("SCORE_A")
        scoreB = intent.getStringExtra("SCORE_B")

        Log.d("","hasil : $scoreB"+teamA)
        ///cari pemenang
        if (scoreA!!.toInt() > scoreB!!.toInt()){
            winner_team.text = teamA
        } else if (scoreA!!.toInt() < scoreB!!.toInt()){
            winner_team.text = teamB
        } else{
            winner_team.text = "Draw !! "
        }

        team_a.text = "hasil Team A : $scoreA"
        team_b.text = "hasil Team B : $scoreB"

    }
}
