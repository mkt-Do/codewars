#!/bin/bash

PRJ_HOME=$(cd "$(dirname "${BASH_SOURCE[0]}")"; pwd)
TEST_HOME="${PRJ_HOME}/test"

run_test() {
  target="$1"
  echo "----- ${target} -----"
  ruby "$target"
}

main() {
  targets=$(find "$TEST_HOME" -type f -regex ".*_test\.rb$")
  for target in ${targets[@]}; do
    run_test $target
  done
}

if [ "$(basename "${BASH_SOURCE[0]}")" = "$(basename "$0")" ]; then
  main
fi
