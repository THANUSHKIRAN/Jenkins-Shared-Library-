def call(String aws_acc_id,String region,String ecr_reponame){

    sh """
    docker build -t ${ecr_reponame} .
    docker tag ${ecr_reponame}:latest ${aws_acc_id}.dkr.ecr.${region}/${ecr_reponame}:latest

    """


}