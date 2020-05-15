#!/bin/bash

echo "start sentinel-dashboard"

java -Dserver.port=8080 \
    -Dcsp.sentinel.dashboard.server=localhost:8080 \
    -Dproject.name=sentinel-dashboard  \
    -jar /Users/bjhl/workspace/java/zhengzhixiong/sentinel-demo/sentinel-dashboard/sentinel-dashboard-1.7.1.jar
