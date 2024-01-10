#!/bin/bash

for d in ../../Mays/*/*/Data ; do
    [ -L "${d%/}" ] && continue
    echo "---------------------------Running for $d---------------------------"
    files=($(find "$d" -type f -name "*.java"))
    python3 comparator.py "$d"/../Output "${files[0]}" "${files[1]}" # > "$d"/../Output/result_v2
done