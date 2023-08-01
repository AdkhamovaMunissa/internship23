#!/bin/bash 
image=$1
version_id=$2

# Temp solution to disable Azure Cli SSL verification
set AZURE_CLI_DISABLE_CONNECTION_VERIFICATION=1

az acr login --name projectakscr 

docker build -t $image:$version_id .
docker tag $image:$version_id projectakscr.azurecr.io/$image:$version_id
docker push projectakscr.azurecr.io/$image:$version_id
