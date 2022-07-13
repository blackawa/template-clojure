# Write Clojure with your menty

This is a [Clojure](https://clojure.org/) getting started guide to build web service with your menty.

## Next Steps

Click the button below to start a new development environment:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/blackawa/write-clojure-with-your-menty)

# Development

## To code

### 1. Start server

1. Open command pallet and select `Calva: Start a Project REPL and Connect (aka Jack-in)` (`Ctrl+Alt+C > Ctrl+Alt+J`).
1. Choose `deps.edn` --> `:dev`. You now have a REPL session file.
1. Run `(dev)`.
1. Run `(refresh)`.
1. Run `(reset-system)`.
1. Open http://localhost:3000/app/

### 2. Start CLJS build

    user=> (start-cljs!)

## To lint

    # Run linter
    clj -M:lint
    # Run formatter(and fix automatically)
    clj -M:format
