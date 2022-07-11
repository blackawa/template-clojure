# Write Clojure with your menty

This is a [Clojure](https://clojure.org/) getting started guide to build web service with your menty.

## Next Steps

Click the button below to start a new development environment:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/blackawa/write-clojure-with-your-menty)

# Development

## To code

### 1. Start API Server

1. Open command pallet and select `Calva: Start a Project REPL and Connect (aka Jack-in)` (`Ctrl+Alt+C > Ctrl+Alt+J`).
1. Choose `deps.edn` --> `:dev`. You now have a REPL session file.
1. Open `dev/src/user.clj`.
1. Open command pallet and select `Calva: Load/Evaluate Current file and its Requires/Dependencies` (`Ctrl+Alt+C > Enter`) .

To start compiling ClojureScript, run

    npm run dev

## To lint

    # Run linter
    clj -M:lint
    # Run formatter(and fix automatically)
    clj -M:format
