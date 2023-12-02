#!/usr/bin/env bash
set -euo pipefail
SCRIPT_SOURCE="${BASH_SOURCE[0]}"
SCRIPT_DIR_RELATIVE="$(dirname "$SCRIPT_SOURCE")"
SCRIPT_DIR_ABSOLUTE="$(cd "$SCRIPT_DIR_RELATIVE" && pwd)"
cd "$SCRIPT_DIR_ABSOLUTE"/../

PATH="$(pwd)"/bin:"$(pwd)"/ui/node:"$(pwd)"/ui/node_modules/.bin:$PATH

unameOut="$(uname -a)"
case "${unameOut}" in
Linux*)
  export JAVA_HOME=/usr/lib/jvm/java-21-amazon-corretto/
  ;;
Darwin*)
  export JAVA_HOME=/Library/Java/JavaVirtualMachines/amazon-corretto-21.jdk/Contents/Home
  ;;
*) echo "Unsupported system: ${unameOut}" && exit 1 ;;
esac
