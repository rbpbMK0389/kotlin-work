# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Student {
        id: Int
        name: String
        degreeProgramme: String
        levelOfStudy: Int
    }

    class Module {
        moduleCode: String
        title: String
        numCredits: Int
        enrolStudent(student: Student)
        generateTranscript(student: Student)
    }

    Student -- Module: enrols on


```


[mer]: https://mermaid.js.org/
