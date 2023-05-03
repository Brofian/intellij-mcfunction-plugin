#!/usr/bin/env bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

# the grammar-kit intelliJ plugin does not contain the most recent (and required) jflex version
# so the jar is installed here and can be used by executing this script or the command below directly

java -Xmx512m -Dfile.encoding=UTF-8 \
  -jar "${SCRIPT_DIR}/jflex-1.9.1.jar" -skel idea-flex.skeleton \
  -d src/main/gen/de/fabianholzwarth/brofian/mcfunction_lang \
  src/main/java/de/fabianholzwarth/brofian/mcfunction_lang/McFunction.flex