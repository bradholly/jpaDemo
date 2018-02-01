#!/bin/bash

export TERM=${TERM:-dumb}
cd app_sources
./gradlew --no-daemon build