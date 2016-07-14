#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export BBPATH="$DIR"
export PATH="$DIR/bitbake/bin:$PATH"
