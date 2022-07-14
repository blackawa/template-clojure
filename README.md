# Clojureを一緒に書こう

[Clojure](https://clojure.org/)を先輩とペアプロして入門するための学習用リポジトリです。GitPodのShare機能を利用することを想定しています。

## 始めてみよう

下のボタンをクリックして、新しいGitPodワークスペースを作成しましょう:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/blackawa/write-clojure-with-your-menty)

# 開発

## コードを書く

### 1. サーバーを起動する

1. コマンドパレットを開き `Calva: Start a Project REPL and Connect (aka Jack-in)` (`Ctrl+Alt+C > Ctrl+Alt+J`) を選択する.
1. `deps.edn` --> `:dev` を選ぶ。すると `output.calva-repl` というファイルが開き、 `clj:user:>` というREPLセッションが開く。
1. `(dev)` を実行する。
1. `(start-backend!)` を実行する。
1. (初回のみ)  `(migration/create-tasks-table system)` を実行する。
1. Open http://localhost:3000/app/

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
