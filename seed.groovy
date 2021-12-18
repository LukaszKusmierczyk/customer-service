listView("customer-service-app") {
    description('Framework for modern CI/CD')
    filterBuildQueue()
    filterExecutors()
    jobs {
        name("customer-service-job")
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
job('customer-service-job') {
    description("This is my first DSL job created on: ${new Date()}. Repository: https://github.com/LukaszKusmierczyk/customer-service")
    scm {
        git("https://github.com/LukaszKusmierczyk/customer-service.git", "main")
    }
    steps {
        gradle() {
            useWrapper()
            tasks('clean')
            tasks('build')
        }
    }
}