#!/bin/sh

set -e -x
pwd
source s3-deployment-info/deployment-info.conf
export SAMPLE_APP_URL
env

git clone git-selenium-tests selenium-output-dir
cd selenium-output-dir
mvn compile test-compile surefire:test
ls screenshots
