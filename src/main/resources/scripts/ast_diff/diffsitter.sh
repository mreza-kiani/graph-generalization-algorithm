#!/bin/bash

#for d in /home/mamareza/UofC/Thesis/new-approach/src/main/resources/Mays/*/*/Data; do
for d in /home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/CodeSearchNetMine/*/*/Data; do
    [ -L "${d%/}" ] && continue
    echo "---------------------------Running for $d---------------------------"
    files=($(find "$d" -type f -name "*.java"))
    if [ ! -d "$d"/../Output ]; then
        mkdir "$d"/../Output
    fi
    diffsitter -c ~/diffsitter-config.json "${files[0]}" "${files[1]}" > "$d"/../Output/DiffSitter.json
done