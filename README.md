# Диплом(API)
<a target="_blank" href="https://dummyapi.io">dummyapi.io</a>

## :pushpin: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#Реализованные-проверки)
- [Jenkins job](#-Jenkins-job)
- [Allure отчет](#-Allure-отчет)
- [Allure testOps](#-Allure-testOps)
- [Jira](#-Jira)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://rest-assured.io/"><img src="images/Rest-Assured.svg" width="50" height="50"  alt="Rest-Assured"/></a>
<a href="https://qameta.io/"><img src="images/Allure_EE.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/Jira.svg" width="50" height="50"  alt="Jira"/></a>
</p>

## Реализованные проверки

- ✓ Проверка даты регистрации.
- ✓ Проверка комментариев.
- ✓ Проверка постов юзеров.
- ✓ Проверка создания нового юзера
- ✓ Проверка существование юзеров

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/apiTests/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/apiTests/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

## :computer: Запуск тестов из терминала

Локальный и удаленный запуск:
```bash
gradle clean test
```


## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Allure отчет

<a target="_blank" href="https://jenkins.autotests.cloud/job/apiTests/4/allure">Аллюр</a>

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>


## <img src="images/Allure_EE.svg" width="25" height="25"  alt="Allure TestOps"/></a> Allure testOps

<a target="_blank" href="https://allure.autotests.cloud/project/1205/test-cases?treeId=0">Аллюр EE</a>
<p align="center">
<img title="Allure TestOps" src="images/allureTestOps.png">
</p>



### <img src="images/Jira.svg" width="25" height="25"  alt="Jira"/></a> Jira
<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-365">Таск в Jira</a>
<p align="center">
<img title="Jira Issue" src="images/JiraIssue.png"> 
</p>
