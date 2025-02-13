job('Python-Unit-Tests') {
    description('Runs Python unit tests using unittest framework')
    
    scm {
        git('https://github.com/oZep/Jenkins-Docker-DSL', 'main')
    }

    triggers {
        commentTrigger('build')
    }

    steps {
        shell('''
        # Install dependencies
        pip install -r requirements.txt
        
        # Run Python unit tests
        python -m unittest discover -s tests
        ''')
    }
}
