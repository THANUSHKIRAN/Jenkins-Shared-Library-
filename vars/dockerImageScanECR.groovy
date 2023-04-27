def call(String aws_acc_id,String region,String ecr_reponame){

    sh """
        trivy image ${ecr_reponame}:latest ${aws_acc_id}.dkr.ecr.${region}/${ecr_reponame}:latest > scan.txt
        cat scan.txt

    """
}