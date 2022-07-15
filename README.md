# Clojureを一緒に書こう

[Clojure](https://clojure.org/)を先輩とペアプロして入門するための学習用リポジトリです。GitPodのShare機能を利用することを想定しています。

## 始めてみよう

下のボタンをクリックして、新しいGitPodワークスペースを作成しましょう:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/blackawa/write-clojure-with-menty)

# 開発

## コードを書く

### 1. バックエンドサーバーを起動する

1. コマンドパレットを開き `Calva: Start a Project REPL and Connect (aka Jack-in)` (`Ctrl+Alt+C > Ctrl+Alt+J`) を選択する.
1. `deps.edn` --> `:dev` を選ぶ。すると `output.calva-repl` というファイルが開き、 `clj:user:>` という文字列が表示される。
1. `(dev)` を実行する。
1. `(reset)` を実行する。

### 2. （初回のみ）マイグレーションを実行する

1. `output.calva-repl` ファイルで `(migration/create-tasks-table system)` を実行する。

### 2. コードを変更する

コードを変更したら、ファイルをREPLにロードします。
コマンドパレットを開き、 `Calva: Load/Evaluate Current File and its Requires/Dependencies` ( `Ctrl+Alt+C > Enter` ) を選択します。

## 静的解析をかける

    # リンターを実行する
    $ clj -M:lint
    # フォーマッターを実行する
    $ clj -M:format

# TODO

下記の課題を、先輩と一緒に解いてみましょう。

- [ ] タスクを登録できる
- [ ] タスクを一覧できる
- [ ] タスクを更新できる
- [ ] タスクを削除できる
- [ ] JSON文字列に加工する処理をMiddlewareにまとめる
- [ ] [tonsky/rum](https://github.com/tonsky/rum)を使ってReactアプリを起動する
- [ ] Reactアプリでタスクを一覧できる
- [ ] Reactアプリでタスクを登録できる
- [ ] Reactアプリでタスクを変更できる
- [ ] Reactアプリでタスクを削除できる

# 今後の改善点

- [ ] 単体テストを書く。
- [ ] REPLに慣れるための `Fire Up Clojure REPL` を使った練習問題を入れる。かつ、REPLとテキストに差分があることを表現する説明を入れる。
- [ ] integrantを使ったコードに変換する。
- [ ] cljcに書いたspecをAPIインターフェースとして利用する。
