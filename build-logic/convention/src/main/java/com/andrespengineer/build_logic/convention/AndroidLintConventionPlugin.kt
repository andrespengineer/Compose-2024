import com.android.build.api.dsl.Lint

private fun Lint.configure() {
    xmlReport = true
    checkDependencies = true
}
