package info.blogbasbas.counterscore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import info.blogbasbas.counterscore.R.id.text
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.edit_team_a.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //anko
        btn_add_score_a.onClick {

            var currentScoreA = score_a.text.toString().toInt()
            var newScoreA : Int = currentScoreA + 1
            score_a.text = newScoreA.toString()
              }

        btn_add_score_b.onClick {
            var currentScoreB = score_b.text.toString().toInt()
            var newScoreB : Int = currentScoreB + 1
            score_b.text = newScoreB.toString()

        }

        //event klik team a
        team_a.onClick {

                var newTeamNameA: EditText ? = null
            var currenteamNameA = team_a.text.toString()

                // TODO 1 : tampilkan Alert DIalog
                alert {
                    title = "Edit Team Name"
                    customView {
                        // Buat EditText
                        newTeamNameA = editText(currenteamNameA) {
                            hint = "Enter your Team name"
                        }
                    }
                    // Positive Button
                    yesButton {
                        // Set Nilai ke widget text view
                        team_a.text = newTeamNameA?.text.toString()
                    }
                }.show()

        }
        team_b.onClick {

                var newTeamNameB: EditText ? = null
            var currenteamNameB = team_b.text.toString()

                // TODO 1 : tampilkan Alert DIalog
                alert {
                    title = "Edit Team Name"
                    customView {
                        // Buat EditText
                        newTeamNameB = editText(currenteamNameB) {
                            hint = "Enter your Team name"
                        }
                    }
                    // Positive Button
                    yesButton {
                        // Set Nilai ke widget text view
                        team_a.text = newTeamNameB?.text.toString()
                    }
                }.show()

        }

        btn_finish.onClick {
            var team_a_name = team_a.text.toString()
            var team_b_name = team_b.text.toString()

            var team_a_score = score_a.text.toString()
            var team_b_score = score_b.text.toString()
            //send data
            Log.d("","hasil :$team_a_name, $team_a_score"+team_a_name)
            startActivity(intentFor<ResultActivity>("NAME_A" to team_a_name,
                                                        "NAME_B" to team_b_name,
                                                        "SCORE_A" to team_a_score,
                                                        "SCORE_B" to team_b_score))

        }
    }
}
