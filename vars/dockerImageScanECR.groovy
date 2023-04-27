def call(String aws_acc_id,String region,String ecr_reponame){

    sh """
        trivy image ${aws_acc_id}.dkr.ecr.${region}/${ecr_reponame}:latest > scan.txt
        cat scan.txt

    """
}