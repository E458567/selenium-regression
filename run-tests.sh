#!/bin/sh

set -e -x
pwd
source s3-deployment-output/deployment-info.conf
export SAMPLE_APP_URL
env

git clone git-qa-regression selenium-output-dir
cd selenium-output-dir
mvn compile test-compile surefire:test
ls screenshots
tar -czvf selenium-test-results.tar.gz screenshots
