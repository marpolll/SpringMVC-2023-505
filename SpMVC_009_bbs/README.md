# Spring MVC + Spring Security 프로젝트

- 이 프로젝트에서는 dependencies 의 버전 관리를 BOM(Bill Of Materials) 를 사용하여 dependencidesManagement 를 통해서 실행한다.

- pam.xml 에 다음 항목을 설정한다.

```xml

<dependencyManagement>
	<dependencies>
		
	</dependencies>
</dependencyManagement>


```

- Management 항목에 Spring Framework BOM 과 Spring Security BOM 을 추가한다.

- 완성된 xml

```xml
<dependencyManagement>

		<dependencies>

			<!-- https://mvnrepository.com/artifact/org.springframework/spring-framework-bom -->
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-framework-bom</artifactId>
				<version>${org.springframework-version}</version>
				<type>pom</type>
				<scope>improt</scope>
			</dependency>

			<!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-bom -->
			<dependency>
				<groupId>org.springframework.security</groupId>
				<artifactId>spring-security-bom</artifactId>
				<version>5.3.13.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>

		</dependencies>

	</dependencyManagement>


```

## spring Security Dependencies 설정

- `spring-security-config`, `spring-security-core`, 
`spring-security-web`, `spring-security-taglibs`

## Spring Security 현재 version 을 원활하게 사용하기 위하여 Servlet 관련 dependencies 를 변경하자



## Spring Data-JPA 초기화 정책

- Spring-Data 프로젝트는 SQL 을 가급적 사용하지 않고, java의 DataClass(Dto,VO) 와 연동하여 object-Relation-Mapping 형태로 DBMS의 CRUD를 구현하는 프로젝트
- `<prop key="hibernate.hbm2ddl.auto">create</prop>`
- `create` : 프로젝트가 시작될때 기존의 Table 을 모두 Drop하고 새로운 Table 을 Create 하는 정책
- `create-drop` : 프로젝트가 시작될때 기존의 Table 을 모두 Drop 하고 Table 을 Create, 그리고 프로젝트가 종료될때 또 한번 Table 을 Drop
- `Update` : Alter Table 을 실행하여 기존 Table Schema 구조를 변경한다.
- `none` : Table 과 관련하여 아무런 정책도 수행하지 않기
- `validate` : 기존의 Table 과 새로운 Data Class 를 비교하여 차이가 있으면 프로젝트에서 Excoption 을 발생하고 진행 중





