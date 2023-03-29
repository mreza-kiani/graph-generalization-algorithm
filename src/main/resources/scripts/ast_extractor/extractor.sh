#!/bin/bash

FILES_PATH=$1
DEST_PATH=$2

for line in $(ls $FILES_PATH); do
  FILE_NAME=$(echo "$line" | awk '{gsub(/.*[/]|[.].*/, "", $0)} 1')
  cp "$1/$line" "$DEST_PATH"
  cat "$1/$line" > ./Test.java
  python3 ast_extractor.py > "$DEST_PATH/$FILE_NAME.txt"
done
