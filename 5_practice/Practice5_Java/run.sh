#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
mkdir -p out
javac -encoding UTF-8 -d out src/generics/*.java src/stacks/*.java src/cloning/*.java
java -cp out generics.GenericTasks
printf 'one two three four five\n' | java -cp out stacks.StackTasks
printf 'one two three four five\n' | java -cp out cloning.CloningTasks
