package org.test

class ClassA implements Serializable {
    def script = null
    ClassA() {}

    ClassA(script) {
        this.script = script
    }

    def fieldA = "I'm field of A"

    def methodA() {
        if (script) {
            script.sh("echo 'ClassA: $fieldA'")
            script.echo "env = $script.env"
        } else {
            sh("echo 'ClassA: $fieldA'")
            echo "env = $env"
        }
    }
}