// By default the fucntion name within the groovy file should be call(). If any other function name is specified, the pipeline will fail

def call() {

    // By default all code within a shared library must be executed within the node block
    node {
        sh '''
        git version
        java -version
        mvn -version
        '''
    }
}