job('Python-Unit-Tests') {
    description('Runs Python unit tests using unittest framework')
    
    scm {
        git('https://github.com/oZep/Jenkins-Docker-DSL', 'main')
    }

    triggers {
        scm('H/10 * * * *') // Poll SCM every 5 minutes
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
