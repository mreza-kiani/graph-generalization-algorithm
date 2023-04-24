#!/bin/bash

for d in Mays/*/*/Data ; do
    [ -L "${d%/}" ] && continue
    echo "-------------------------------------Running for $d-------------------------------------------"
    rm Input/twitter4j.Twitter/*
    rm -rf Mays_Result/twitter4j.Twitter/*
    cp $d/*.java Input/twitter4j.Twitter/
    java -jar ASG.jar examples_dir ./Input out_dir ./Mays_Result k 2
    mkdir -p $d/../Output
    cp Mays_Result/twitter4j.Twitter/Template1/output/AUASTs/FinalAUAST.java $d/../Output/
done