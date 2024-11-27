# testSqsLambda

# Pre requisites
serverless plugin install -n serverless-offline
serverless plugin install -n serverless-offline
serverless plugin install -n serverless-offline

# Local
npm install serverless-offline-sqs --save-dev

serverless offline

# Deploy
mvn clean package

serverless deploy --aws-profile default --verbose


# Offline

serverless offline --config serverless-local.yml

