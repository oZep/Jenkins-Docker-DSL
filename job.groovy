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
        python3 -m unittest something_test.py
        ''')
    }
}