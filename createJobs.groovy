pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('product-app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/yashar-github/product-app'
                    }
                    branch 'master'
                }
            }
        }
    }
}
