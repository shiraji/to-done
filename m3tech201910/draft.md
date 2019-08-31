GraphQL + KotlinでN+1問題を対応する

自己紹介

GraphQL + Kotlin(Kotlin Festのスライド紹介)(ここまでで1分)

N+1問題の紹介(ざっくり - 2,3分)

Kotlin(graphql-java-starter)でどう解消するか？

1:1の時 DataLoaderを使う

Dataloaderの使い方

1:多は？

公式ではこんな感じのコード

MappedDataLoader
  key, valueで返せるため、順番は気にしなくて良い
  自分の場合、1:多のあとにさらにクエリを発行して取得する必要があった
  データを取得し、一つずつ真心込めて、紐づけていく
  クエリを複数回発行する必要がある場合、紐づけ処理も同じ回数実施する必要がある。
    -> ここまじで誰か教えてけろー！

ちなみにこのKeyはclassname::class.qualifiedNameにしてる
サンプルコードの場合dataloader単体でテストするのが難しい
classに書き出しテストする
共通のコンスタントを作るより、クラス名にしちゃえば、IDEでも見やすい