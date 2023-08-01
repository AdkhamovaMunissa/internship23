#!/bin/bash
image=$1
version_id=$2
app=$3

cp deployment.yaml deployment.yaml.bak

sed -i "s/APP_NAME/$app/g" deployment.yaml

sed -i "s/IMAGE_NAME/$image/g" deployment.yaml

sed -i "s/VERSION/$version_id/g" deployment.yaml

az aks get-credentials --resource-group project_aks_acr --name aks

kubectl create -f deployment.yaml

cp deployment.yaml.bak deployment.yaml
