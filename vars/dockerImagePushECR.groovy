def call(String aws_acc_id,String region,String ecr_reponame){

    sh """
    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com
    docker push  ${aws_acc_id}.dkr.ecr.${region}/${ecr_reponame}:latest

    """


}