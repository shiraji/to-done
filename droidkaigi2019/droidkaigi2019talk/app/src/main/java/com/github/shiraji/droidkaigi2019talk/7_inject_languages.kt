package com.github.shiraji.droidkaigi2019talk

// JSON書きやすくする
// Alt+Enter language=JSON
// Preferences | Editor | Language Injections | Advanced

fun fooJson(): String {
    return "{\n  \"name\": \"shiraji\",\n  \"github\": \"@shiraji\",\n  \"age\": 35\n}"
}

fun fooSQL() {
    //language=yaml
    """
    workflows:
      version: 2
      build_and_test:
        jobs:
        - build
        - test
    """.trimIndent()
}