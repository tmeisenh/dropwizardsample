#!/bin/bash
curl -X POST 'http://localhost:8080/echo?str=foo'
echo -e ""
curl -X GET 'http://localhost:8080/version'
echo -e ""
