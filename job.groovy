job('Jenskins-Docker-DSL') {
    description('Main Build')
    scm {
         git('https://github.com/oZep/Jenkins-Docker-DSL', 'main')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell('''python -m unittest something_test.py''')
    }
}