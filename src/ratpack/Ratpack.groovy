import org.example.SpringBootConfig
import org.slf4j.LoggerFactory
import ratpack.groovy.template.MarkupTemplateModule
import ratpack.spring.Spring

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

System.setProperty("spring.config.name", "my-micro-service")
logger = LoggerFactory.getLogger("my-micro-service")

ratpack {
  bindings {
    module MarkupTemplateModule
  }

  handlers {
    register(Spring.spring(SpringBootConfig))

    get('info') {
      render '{ "COMPONENT" : "MY-MICRO-SERVICE" }'
    }

    get {
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
    }

    files { dir "public" }
  }
}
