job('Jenskins-Docker-DSL') {
    description('Main Build')
    scm {
         git('https://github.com/oZep/Jenkins-Docker-DSL', 'main')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell('''
        git config --global user.name "Jenkins"
        git config --global user.email "jenkins@example.com"
        git tag -a -m "Jenkins Build" jenkins-build-$(date +%s)
        python -m unittest something_test.py
        ''')
    }
}