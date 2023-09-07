#!/bin/bash

for d in /home/mamareza/UofC/Thesis/new-approach/src/main/resources/Mays/*/*/Data; do
    [ -L "${d%/}" ] && continue
    echo "---------------------------Running for $d---------------------------"
    files=($(find "$d" -type f -name "*.java"))
    diffsitter -c ~/diffsitter-config.json "${files[0]}" "${files[1]}" > "$d"/../Output/DiffSitter.json
done