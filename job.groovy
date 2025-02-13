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
        git tag -a -m "Jenkins Build" jenkins-build-$(date +%s)
        python -m unittest something_test.py
        ''')
    }
}