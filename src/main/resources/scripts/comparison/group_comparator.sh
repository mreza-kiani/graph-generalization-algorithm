#!/bin/bash

for d in data/*/*/Data ; do
    [ -L "${d%/}" ] && continue
    echo "---------------------------Running for $d---------------------------"
    files=($(find "$d" -type f -name "*.java"))
    python3 comparator.py "$d"/../Output "${files[0]}" "${files[1]}" > "$d"/../Output/result
done