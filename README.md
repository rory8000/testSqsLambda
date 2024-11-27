# testSqsLambda

# Pre requisites
serverless plugin install -n serverless-deployment-bucket
serverless plugin install -n serverless-plugin-optimize

# Local
npm install serverless-offline --save-dev
npm install @serverless/utils --save-dev
npm install serverless-offline-sqs --save-dev


# Deploy
mvn clean package

serverless deploy --aws-profile default --verbose


# Offline

serverless offline --config serverless-local.yml

