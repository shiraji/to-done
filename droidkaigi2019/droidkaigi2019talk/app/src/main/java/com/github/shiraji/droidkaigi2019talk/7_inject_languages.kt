package com.github.shiraji.droidkaigi2019talk

// JSON書きやすくする
// Alt+Enter language=JSON
// Preferences | Editor | Language Injections | Advanced

fun fooJson() {
    val raws = "{\n  \"name\": \"shiraji\",\n  \"github\": \"@shiraji\",\n  \"age\": 35\n}"
    val json = "{\n  \"name\": \"shiraji\",\n  \"github\": \"@shiraji\",\n  \"age\": 35,\n  \"foo\": \"bar\"\n}"
}

fun fooSQL() {
    """
    workflows:
      version: 2
      build_and_test:
        jobs:
        - build
        - test
    """.trimIndent()
}