# bisq-api-examples
Example usage of the bisq api

## Generating api sources

To run the code generation script, these prerequisites are needed:
- docker
- curl
- running bisq api instance on http://localhost:8080

Then, you just type:
````/codegen.sh````

## Directory layout

### /docs

=> static html documentation on the api is generated here. This folder is
not a subfolder of /generated because github pages expects the index.html to
be in the /docs folder.

## /generated

=> contains all generated source code, with one subfolder per language.
Currently generated languages:
- python
- php
- java
- golang

## /custom

Custom made examples can be put here, these can depend on the generated api
sources or made totally from scratch.
