def call(String aws_acc_id,String region,String ecr_reponame){

    sh """
    docker rmi  ${aws_acc_id}.dkr.ecr.${region}/${ecr_reponame}:latest

    """


}