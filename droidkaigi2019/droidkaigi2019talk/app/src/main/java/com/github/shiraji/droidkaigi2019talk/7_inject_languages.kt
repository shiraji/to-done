package com.github.shiraji.droidkaigi2019talk

// JSON書きやすくする
// Alt+Enter language=JSON

fun fooJson() {
    """
    {
      "name": "shiraji",
      "github": "@shiraji",
      "age": 35
    }
    """.trimIndent()
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