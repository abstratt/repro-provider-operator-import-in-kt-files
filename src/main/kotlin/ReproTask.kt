import org.gradle.api.tasks.JavaExec

// this can be added via quick fix
//import org.gradle.kotlin.dsl.get

// this must be added manually
//import org.gradle.kotlin.dsl.set

// this can be added via quick fix
//import org.gradle.kotlin.dsl.assign

abstract class ReproTask : JavaExec() {
    init {
        // requires org.gradle.kotlin.dsl.get
        val previous: String = environment["FOO"].toString()
        // requires org.gradle.kotlin.dsl.set
        environment["FOO"] = previous.uppercase()
        // requires org.gradle.kotlin.dsl.assign
        mainClass = "Main"
    }
}
