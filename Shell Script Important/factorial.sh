#!/bin/bash

echo "Enter a Number"
read num
f=1
for ((i=2;i<=num;i++))
        {
                f=$((f*i))
        }
echo $f

